package net.imglib2.imklib

import com.squareup.kotlinpoet.*
import net.imglib2.RandomAccessible
import kotlin.reflect.KClass
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.RandomAccessibleInterval
import net.imglib2.RealRandomAccessible
import net.imglib2.type.numeric.ARGBType
import net.imglib2.type.numeric.ComplexType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.complex.ComplexDoubleType
import net.imglib2.type.numeric.complex.ComplexFloatType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType


fun main() {

    val kotlinFile = FileSpec.builder("net.imglib2.imklib", "ArithmeticExtensions")

    for (container in containers) {
        for ((name, operator) in names) {
            var index = 0
            for (type in numericTypes)
                kotlinFile.addFunction(generatePlusSameGenericTypes(name = name, operator = operator, container = container, t = type, jvmName = "${name}_${++index}"))

            for ((t1, t2, o) in numericTypePairs) {
                kotlinFile.addFunction(generatePlusConverting(name, operator, container, t1, t2, o, false, jvmName = "${name}_${++index}"))
                kotlinFile.addFunction(generatePlusConverting(name, operator, container, t2, t1, o, true, jvmName = "${name}_${++index}"))
            }
        }
    }

    kotlinFile.build().writeTo(System.out)
}

private val numericTypes = arrayOf(
//        ARGBType::class,
        ByteType::class,
//        ShortType::class,
//        IntType::class,
//        LongType::class,
//        UnsignedByteType::class,
//        UnsignedShortType::class,
//        UnsignedIntType::class,
//        UnsignedLongType::class,
        FloatType::class,
        DoubleType::class
//        ComplexFloatType::class,
//        ComplexDoubleType::class
)

private val numericTypePairs = arrayOf(
//        Triple(ComplexDoubleType::class, ComplexFloatType::class, ComplexDoubleType::class),
//        Triple(ComplexDoubleType::class, RealType::class, ComplexDoubleType::class),
//        Triple(ComplexFloatType::class, RealType::class, ComplexDoubleType::class),
        Triple(DoubleType::class, FloatType::class, DoubleType::class)
//        Triple(DoubleType::class, IntegerType::class, DoubleType::class),
//        Triple(FloatType::class, IntegerType::class, FloatType::class),
//        Triple(LongType::class, IntegerType::class, LongType::class)
)

private val names = arrayOf("plus" to "+", "minus" to "-", "times" to "*", "div" to "/")

private val containers = arrayOf(RandomAccessible::class) //, RandomAccessibleInterval::class, RealRandomAccessible::class)


private fun generatePlusSameGenericTypes(name: String, operator: String, container: KClass<*>, t: KClass<*>, jvmName: String): FunSpec {

    return FunSpec
            .builder(name)
            .addAnnotation(AnnotationSpec.builder(JvmName::class).addMember("name = %S", jvmName).build())
            .addModifiers(KModifier.OPERATOR)
            .receiver(container.asTypeName().parameterizedBy(t.asTypeName()))
            .addParameter("that", container.asTypeName().parameterizedBy(t.asTypeName()))
            .returns(container.asTypeName().parameterizedBy(t.asTypeName()))
            .addStatement("return convert(that, ${t.simpleName}()) { t, u, v -> v.set(t); v ${operator}= u }")
            .build()
    //.receiver(accessible::class.asTypeName().tag(t1::class))
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
            .also { if (isReverse) it.addStatement("return that $operator this") else it.addStatement("return asType(${t1.simpleName}()) $operator that.asType(${t1.simpleName}())")}
            .build()
            //.receiver(accessible::class.asTypeName().tag(t1::class))
}