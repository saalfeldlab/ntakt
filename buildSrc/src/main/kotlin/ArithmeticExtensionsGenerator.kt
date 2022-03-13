import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.type.Type
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import kotlin.reflect.KClass




fun generateArithmeticExtensions(`as`: String, fileName: String, operator: arithmetics.Operator): String {
    val kotlinFile = FileSpec
        .builder(packageName, fileName)
        .addAnnotation(AnnotationSpec.builder(Suppress::class).addMember("%S", "UNCHECKED_CAST").build())
    val container = containers[`as`] ?: error("Key `$`as`' not present in $containers")
    kotlinFile.addAliasedImport(container, `as`)
    kotlinFile.addUnaryPlusMinus(container, operator.operation)
    val (name, operatorName, type) = operator
    var index = 0
    kotlinFile.addFunction(generatePlusSameGenericTypes(name = name, operator = operatorName, container = container, t = type, jvmName = "${name}_${++index}"))
    kotlinFile.addFunction(generateArithmeticOperatorStarProjection(name, operatorName, container, jvmName = "${name}_${++index}"))
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

private fun generatePlusSameGenericTypes(name: String, operator: String, container: ClassName, t: KClass<*>, jvmName: String): FunSpec {

    // very helpful GitHub issue: https://github.com/square/kotlinpoet/issues/812
    val genericT = TypeVariableName("T")
    val typeOfT = Type::class.asTypeName().parameterizedBy(genericT)
    val tOfT = t.asTypeName().parameterizedBy(genericT)
    val boundedT = TypeVariableName("T", typeOfT, tOfT)
    val parameterizedContainer = container.parameterizedBy(genericT)

    return FunSpec
        .builder(name)
        .addAnnotation(AnnotationSpec.builder(JvmName::class).addMember("name = %S", jvmName).build())
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

private fun generateArithmeticOperatorStarProjection(name: String, operator: String, container: ClassName, jvmName: String): FunSpec {
    val rt = RealType::class.asTypeName().parameterizedBy(STAR)
    val crt = container.parameterizedBy(rt)
    val error = "error(\"Arithmetic·operator·$operator·($name)·not·supported·for·combination·of·types·${'$'}{this.type::class}·and·${'$'}{that.type::class}.·Use·any·pairwise·combination·of·${'$'}{types.realTypes.map·{·it::class·}}.\")\n"
    val cb = CodeBlock
        .builder()
        .add("return ${extensionsJavaName(name, container)}.$name(this, that) as? %T ?: $error", crt)
        .build()

    return typedFuncSpecBuilder(name, crt)
        .addAnnotation(AnnotationSpec.builder(JvmName::class).addMember("name = %S", jvmName).build())
        .addModifiers(KModifier.OPERATOR)
        .addParameter("that", container.parameterizedBy(rt))
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