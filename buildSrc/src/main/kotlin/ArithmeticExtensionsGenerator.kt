import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.RandomAccessible
import net.imglib2.type.Type
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.integer.ByteType
import net.imglib2.type.numeric.integer.IntType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub
import kotlin.reflect.KClass

private val numericTypePairs = arrayOf(
//        Triple(ComplexDoubleType::class, ComplexFloatType::class, ComplexDoubleType::class),
//        Triple(ComplexDoubleType::class, RealType::class, ComplexDoubleType::class),
//        Triple(ComplexFloatType::class, RealType::class, ComplexDoubleType::class),
        Triple(DoubleType::class, FloatType::class, DoubleType::class),
        Triple(DoubleType::class, IntType::class, DoubleType::class)
//        Triple(FloatType::class, IntegerType::class, FloatType::class),
//        Triple(LongType::class, IntegerType::class, LongType::class)
)

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

            for ((t1, t2, o) in numericTypePairs) {
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