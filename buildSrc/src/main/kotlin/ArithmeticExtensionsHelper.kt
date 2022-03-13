import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.converter.BiConverter
import net.imglib2.type.Type
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub

fun makeArithmeticBiConverters(fileName: String): String {
    val kotlinFile = FileSpec
        .builder(packageName, fileName)
        .makeArithmeticBiConverters()
        .makeArithmeticConverterObject()
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

private fun FileSpec.Builder.makeArithmeticConverterObject(): FileSpec.Builder {
    val genericAndBounded = "T".genericAndBounded(NumericType::class)
    val codeBlock = CodeBlock
        .builder()
        .addStatement("return·when·(operator.toLowerCase())·{")
        .indent()
        .addStatement("%S·->·${"plus".converterName}.instance<%T>()", "plus", genericAndBounded.first)
        .addStatement("%S·->·${"minus".converterName}.instance<%T>()", "minus", genericAndBounded.first)
        .addStatement("%S·->·${"times".converterName}.instance<%T>()", "times", genericAndBounded.first)
        .addStatement("%S·->·${"div".converterName}.instance<%T>()", "div", genericAndBounded.first)
        .addStatement("else·->·error(\"Operator not supported: \$operator\")")
        .unindent()
        .addStatement("}")
    val obj = TypeSpec
        .objectBuilder("ArithmeticConverters")
        .addFunction(FunSpec
            .builder("get")
            .addAnnotation(JvmStatic::class)
            .addModifiers(KModifier.OPERATOR)
            .addTypeVariable(genericAndBounded.second)
            .addParameter("operator", String::class)
            .returns(BiConverter::class.asTypeName().parameterizedBy(List(3) { genericAndBounded.first }))
            .addCode(codeBlock.build())
            .build())
        .addFunction(FunSpec
            .builder("get")
            .addAnnotation(JvmStatic::class)
            .addModifiers(KModifier.OPERATOR)
            .addTypeVariable(genericAndBounded.second)
            .addParameter("operator", String::class)
            .addParameter("type", genericAndBounded.first)
            .returns(BiConverter::class.asTypeName().parameterizedBy(List(3) { genericAndBounded.first }))
            .addStatement("return get(operator)")
            .build())
    return this.addType(obj.build())
}

private fun FileSpec.Builder.makeArithmeticBiConverters(): FileSpec.Builder = arithmetics.Operator.values().fold(this) { acc, operator ->
    acc.makeArithmeticBiConverter(operator)
}

private fun FileSpec.Builder.makeArithmeticBiConverter(operator: arithmetics.Operator): FileSpec.Builder {
    val genericAndBounded = operatorGenericAndBoundedMapping[operator.operation]!!
    val companion = TypeSpec
        .companionObjectBuilder()
            // TODO is it possible to make an instance of a type with two wildcard parameters?
//        .addProperty(PropertySpec
//            .builder("instance", operator.converterClassNameStarProducer, KModifier.PRIVATE)
//            .initializer("%T()", operator.converterClassName)
//            .build())
        .addFunction(FunSpec
            .builder("instance")
            .addAnnotation(JvmStatic::class)
            .addTypeVariable(genericAndBounded.second)
            .addStatement("return·${operator.converterName}<T>()")
            .returns(operator.converterClassName.parameterizedBy(genericAndBounded.first))
            .build())
    val convert = FunSpec
        .builder("convert")
        .addModifiers(KModifier.OVERRIDE)
        .addParameters(listOf("s1", "s2", "t").map { ParameterSpec(it, genericAndBounded.first) })
        .addStatement("t.set(s1)")
        .addStatement("t·${operator.operatorName}=·s2")
    val tSpec = TypeSpec
        .classBuilder(operator.converterName)
        .addTypeVariable(genericAndBounded.second)
        .addSuperinterface(BiConverter::class.asTypeName().parameterizedBy(List(3) { genericAndBounded.first }))
        .addType(companion.build())
        .addFunction(convert.build())
    return this.addType(tSpec.build())
}

val operatorInterfaceMapping = mapOf(
    "plus" to Add::class,
    "minus" to Sub::class,
    "times" to Mul::class,
    "div" to Div::class
)
private val operatorGenericAndBoundedMapping = operatorInterfaceMapping.mapValues { "T".genericAndBounded(it.value, Type::class) }
private val operatorStarMapping = operatorInterfaceMapping.mapValues { WildcardTypeName.producerOf(it.value.asTypeName().parameterizedBy(STAR)) }

private val String.converterName get() = "BiConverter${capitalize()}"
private val arithmetics.Operator.converterName get() = operation.converterName
private val arithmetics.Operator.converterClassName get() = ClassName(packageName, converterName)
private val arithmetics.Operator.converterClassNameStarProducer get() = operatorStarMapping[name.toLowerCase()]!!
