import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.RandomAccessible
import net.imglib2.type.Type
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub
import java.lang.Integer.max
import kotlin.reflect.KClass

private object identifiers {
    const val complex = "complex"
    const val real = "real"
    const val signedInteger = "signedInteger"
    const val unsignedInteger = "unsignedInteger"
}

private val arithmeticTypes = with (identifiers) {
    arrayOf<Pair<KClass<*>, String>>(
            // TOOD complex types not implemented yet
//            ComplexDoubleType::class to complex,
//            ComplexFloatType::class to complex,
            DoubleType::class to real,
            FloatType::class to real,
            LongType::class to signedInteger,
            IntType::class to signedInteger,
            ShortType::class to signedInteger,
            ByteType::class to signedInteger,
            UnsignedLongType::class to unsignedInteger,
            UnsignedIntType::class to unsignedInteger,
            UnsignedShortType::class to unsignedInteger,
            UnsignedByteType::class to unsignedInteger
    )
}

private val signedIntegers = arithmeticTypes.filter { it.second == identifiers.signedInteger }.map { it.first }
private val unsignedIntegers = arithmeticTypes.filter { it.second == identifiers.unsignedInteger }.map { it.first }

private val arithmeticTypeCombinations = mutableListOf<Triple<KClass<*>, KClass<*>, KClass<*>>>().also {
    for (i in arithmeticTypes.indices) {
        val (kc1, c1) = arithmeticTypes[i]
        for (k in i + 1 until arithmeticTypes.size) {
            val (kc2, c2) = arithmeticTypes[k]
            val o = if (c1 == identifiers.signedInteger && c2 == identifiers.unsignedInteger) {
                val idx1 = signedIntegers.indexOf(kc1)
                val idx2 = unsignedIntegers.indexOf(kc2)
                if (idx1 < idx2) signedIntegers[idx1] else signedIntegers[max(idx2 - 1, 0)]
            } else
                kc1
            it += Triple(kc1, kc2, o)
        }
    }
}

private data class ON(val name: String, val operatorName: String, val type: KClass<*>)

//private val names = arrayOf("plus" to "+", "minus" to "-", "times" to "*", "div" to "/")
private val names = arrayOf(
        ON("plus", "+", Add::class),
        ON("minus", "-", Sub::class),
        ON("times", "*", Mul::class),
        ON("div", "/", Div::class))

private val containers = arrayOf(RandomAccessible::class) //, RandomAccessibleInterval::class, RealRandomAccessible::class)



fun generateSource(outputName: String): String {
    val kotlinFile =  FileSpec.builder("net.imglib2.imklib", outputName)
    for (container in containers) {
        for ((name, operatorName, type) in names) {
            var index = 0
            kotlinFile.addFunction(generatePlusSameGenericTypes(name = name, operator = operatorName, container = container, t = type, jvmName = "${name}_${++index}"))

            for ((t1, t2, o) in arithmeticTypeCombinations) {
                kotlinFile.addFunction(generatePlusConverting(name, operatorName, container, t1, t2, o, false, jvmName = "${name}_${++index}"))
                kotlinFile.addFunction(generatePlusConverting(name, operatorName, container, t2, t1, o, true, jvmName = "${name}_${++index}"))
            }
        }
    }
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

private fun generatePlusSameGenericTypes(name: String, operator: String, container: KClass<*>, t: KClass<*>, jvmName: String): FunSpec {

    // very helpful GitHub issue: https://github.com/square/kotlinpoet/issues/812
    val genericT = TypeVariableName("T")
    val typeOfT = Type::class.asTypeName().parameterizedBy(genericT)
    val tOfT = t.asTypeName().parameterizedBy(genericT)
    val boundedT = TypeVariableName("T", typeOfT, tOfT)
    val parameterizedContainer = container.asClassName().parameterizedBy(genericT)

    return FunSpec
            .builder(name)
            .addAnnotation(AnnotationSpec.builder(JvmName::class).addMember("name = %S", jvmName).build())
            .addModifiers(KModifier.OPERATOR)
            .addTypeVariable(boundedT)
            .receiver(parameterizedContainer)
            .addParameter("that", parameterizedContainer)
            .returns(parameterizedContainer)
            .addStatement("return convert(that, type) { t, u, v -> v.set(t); v ${operator}= u }")
            .build()
}

private fun generatePlusConverting(name: String, operator: String, container: KClass<*>, t1: KClass<*>, t2: KClass<*>, o: KClass<*>, isReverse: Boolean, jvmName: String): FunSpec {
    val p1 = TypeVariableName.invoke(t1.simpleName!!)
    val builder = TypeSpec.classBuilder(container.asClassName()).addTypeVariable(p1)

    return FunSpec
            .builder(name)
            .addAnnotation(AnnotationSpec.builder(JvmName::class).addMember("name = %S", jvmName).build())
            .addModifiers(KModifier.OPERATOR)
            .receiver(container.asTypeName().parameterizedBy(t1.asTypeName()))
            .addParameter("that", container.asTypeName().parameterizedBy(t2.asTypeName()))
            .returns(container.asTypeName().parameterizedBy(o.asTypeName()))
            .addStatement("return this.asType(${o.simpleName}()) $operator that.asType(${o.simpleName}())")
            .build()
    //.receiver(accessible::class.asTypeName().tag(t1::class))
}