import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.type.Type
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import kotlin.reflect.KClass




fun generateArithmeticExtensions(`as`: String, fileName: String): String {
    val kotlinFile = FileSpec
        .builder(packageName, fileName)
        .addAnnotation(AnnotationSpec.builder(Suppress::class).addMember("%S", "UNCHECKED_CAST").build())
    val container = containers[`as`] ?: error("Key `$`as`' not present in $containers")
    kotlinFile.addAliasedImport(container, `as`)
	for (operator in arithmetics.Operator.values()) {
		kotlinFile.addUnaryPlusMinus(container, operator.operation)
		val (name, operatorName, type) = operator
		kotlinFile.addFunction(generatePlusSameGenericTypes(name = name, container = container, t = type))
		kotlinFile.generateArithmeticOperatorStarProjections(name = name, operator = operatorName, container = container)
	}
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

private fun generatePlusSameGenericTypes(name: String, container: ClassName, t: KClass<*>): FunSpec {

    // very helpful GitHub issue: https://github.com/square/kotlinpoet/issues/812
    val genericT = TypeVariableName("T")
    val typeOfT = Type::class.asTypeName().parameterizedBy(genericT)
    val tOfT = t.asTypeName().parameterizedBy(genericT)
    val boundedT = TypeVariableName("T", typeOfT, tOfT)
    val parameterizedContainer = container.parameterizedBy(genericT)

    return FunSpec
        .builder(name)
        .addAnnotation(AnnotationSpec.builder(JvmName::class).addMember("name = %S", "${name}Generic").build())
        .addModifiers(KModifier.OPERATOR)
        .addTypeVariable(boundedT)
        .receiver(parameterizedContainer)
        .addParameter("that", parameterizedContainer)
        .returns(parameterizedContainer)
            .addStatement("return·${extensionsJavaName(name, container)}.${name}Generic(this,·that)")
            .build()
}

private fun extensionsJavaName(name: String, container: ClassName) =
    "${container.simpleName}Arithmetic${name.capitalize()}ExtensionsJava"

private fun FileSpec.Builder.generateArithmeticOperatorStarProjections(name: String, operator: String, container: ClassName): FileSpec.Builder {
	val classes = listOf(
//		"Complex" to ComplexType::class, TODO
		"Integer" to IntegerType::class,
//		"Numeric" to NumericType::class, TODO
		"Real" to RealType::class
	)
	return classes.fold(this) { b, (identifier, bound) -> b.addFunction(generateArithmeticOperatorStarProjection(name, operator, container, bound, identifier)) }
}

private fun generateArithmeticOperatorStarProjection(name: String, operator: String, container: ClassName, bound: KClass<*>, identifier: String): FunSpec {
    val rt = bound.asTypeName().parameterizedBy(STAR)
	val ort = WildcardTypeName.producerOf(rt)
    val crt = container.parameterizedBy(ort)
    val error = "error(\"Arithmetic·operator·$operator·($name)·not·supported·for·combination·of·types·${'$'}{this.type::class}·and·${'$'}{that.type::class}.·Use·any·pairwise·combination·of·${'$'}{types.realTypes.map·{·it::class·}}.\")\n"
    val cb = CodeBlock
        .builder()
        .add("return ${extensionsJavaName(name, container)}.$name$identifier(this, that) as? %T ?: $error", crt)
        .build()

    return typedFuncSpecBuilder(name, crt)
        .addAnnotation(AnnotationSpec.builder(JvmName::class).addMember("name = %S", "$name${identifier}Wildcard").build())
        .addModifiers(KModifier.OPERATOR)
        .addParameter("that", crt)
        .returns(crt)
        .addCode(cb)
        .build()
}

private fun FileSpec.Builder.addUnaryPlusMinus(container: ClassName, operatorName: String): FileSpec.Builder {
    val genericT = TypeVariableName("T")
    val typeOfT = NumericType::class.asTypeName().parameterizedBy(genericT)
    val boundedT = TypeVariableName("T", typeOfT)
    val parameterizedContainer = container.parameterizedBy(genericT)
    val unaryPlus = FunSpec
            .builder("unaryPlus")
            .addModifiers(KModifier.OPERATOR)
            .addTypeVariable(boundedT)
            .receiver(parameterizedContainer)
            .addStatement("return this")
            .build()
    val unaryMinus = FunSpec
            .builder("unaryMinus")
            .addModifiers(KModifier.OPERATOR)
            .addTypeVariable(boundedT)
            .receiver(parameterizedContainer)
            .addStatement("return convert(type)·{·s,·t ->·t.set(s);·t.mul(-1.0) }")
            .build()
    return when (operatorName) {
        "plus" -> this.addFunction(unaryPlus)
        "minus" -> this.addFunction(unaryMinus)
        else -> this
    }
}