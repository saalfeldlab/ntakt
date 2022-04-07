import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.type.Type
import net.imglib2.type.numeric.ComplexType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import kotlin.reflect.KClass

private val typesForWildcardBounds = listOf(
    "Complex" to ComplexType::class,
    "Integer" to IntegerType::class,
    "Real" to RealType::class
)


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
        kotlinFile.addFunction(generatePlusSameGenericTypesSpecifyBounds(name = name, container = container, NumericType::class))
        // Extension functions with wildcard bounds take precedence if the type is more specific than the
        // corresponding generic method, e.g. RA<out RealType<*>>.plus(RA<out RealType<*>) will take precedence
        // over T: NumericType<T> RA<T>.plus(RA<T>) for RA<DoubleType> if T: NumericType<T> RA<T>.plus(RA<T>)
        // (or more specific) is not defined. We need to define the same bounds for both wildcard/star projection
        // and generic overloads to make sure to use generics whenever possible.
        typesForWildcardBounds.forEach { (_, t) ->
            kotlinFile.addFunction(generatePlusSameGenericTypesSpecifyBounds(name = name, container = container, t))
        }
        kotlinFile.generateArithmeticOperatorStarProjections(name = name, operator = operatorName, container = container)
    }
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

private fun generatePlusSameGenericTypes(name: String, container: ClassName, t: KClass<*>): FunSpec =
    generatePlusSameGenericTypesSpecifyBounds(name, container, Type::class, t)

private fun generatePlusSameGenericTypesSpecifyBounds(name: String, container: ClassName, vararg ts: KClass<*>): FunSpec {

    // very helpful GitHub issue: https://github.com/square/kotlinpoet/issues/812
    val genericT = TypeVariableName("T")
    val boundedT = TypeVariableName("T", *ts.map { it.asTypeName().parameterizedBy(genericT) }.toTypedArray())
    val parameterizedContainer = container.parameterizedBy(genericT)
    val nameExtensions = ts.mapNotNull { it.java.simpleName }.joinToString(separator = "_")

    return FunSpec
        .builder(name)
        .addAnnotation(AnnotationSpec.builder(JvmName::class).addMember("name = %S", "${name}Generic_$nameExtensions").build())
        .addModifiers(KModifier.OPERATOR)
        .addTypeVariable(boundedT)
        .receiver(parameterizedContainer)
        .addParameter("that", parameterizedContainer)
        .returns(parameterizedContainer)
            .addStatement("return·${extensionsJavaName(container)}.${name}Generic(this,·that)")
            .build()
}

private fun extensionsJavaName(container: ClassName) =
    "${container.simpleName}ArithmeticExtensionsJava"

private fun FileSpec.Builder.generateArithmeticOperatorStarProjections(name: String, operator: String, container: ClassName): FileSpec.Builder {
    return typesForWildcardBounds.fold(this) { b, (identifier, bound) ->
        b.addFunction(generateArithmeticOperatorStarProjection(name, operator, container, bound, identifier))
    }
}

private fun generateArithmeticOperatorStarProjection(name: String, operator: String, container: ClassName, bound: KClass<*>, identifier: String): FunSpec {
    val rt = bound.asTypeName().parameterizedBy(STAR)
    val ort = WildcardTypeName.producerOf(rt)
    val crt = container.parameterizedBy(ort)
    val cst = container.parameterizedBy(STAR)
    // need to cast that to cst to avoid warning: Type mismatch: inferred type is RealType<*>! but CapturedType(out RealType<*>) was expected
    val error = "error(\"Arithmetic·operator·$operator·($name)·not·supported·for·combination·of·types·${'$'}{type::class}·and·${'$'}{(that·as·%T).type::class}.·Use·any·pairwise·combination·of·${'$'}{types.realTypes.map·{·it::class·}}.\")\n"
    val cb = CodeBlock
        .builder()
        .add("return ${extensionsJavaName(container)}.$name$identifier(this, that) as? %T ?: $error", crt, cst)
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