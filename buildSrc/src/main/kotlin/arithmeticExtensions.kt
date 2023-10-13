import com.squareup.javapoet.*
import com.squareup.javapoet.ParameterSpec
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeSpec
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.WildcardTypeName
import net.imglib2.type.Type
import net.imglib2.type.numeric.ComplexType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import ntakt.GenerateCode
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.configurationcache.extensions.capitalized
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import javax.lang.model.element.Modifier
import kotlin.reflect.KClass


fun GenerateCode.arithmeticExtensions() {
    for ((`as`, name) in getTypeFileMapping("Arithmetic")) {
//        println("generating arithmetic plus extensions for $`as` ($name)")
        generateArithmeticExtensions(`as`, name.first).writeTo(targetDir.asFile)
        generateArithmeticExtensionsJava(`as`, "${name.first}Java").writeTo(targetDirJava.asFile)
    }
}

private val typesForWildcardBounds = listOf(ComplexType::class, IntegerType::class, RealType::class)
fun generateArithmeticExtensions(`as`: String, fileName: String): FileSpec {
    val container = containers[`as`] ?: error("Key `$`as`' not present in $containers")
    val kotlinFile = FileSpec
        .builder(packageName, fileName)
        .addAnnotation(AnnotationSpec.builder(Suppress::class).addMember("%S", "UNCHECKED_CAST").build())
        .addAliasedImport(container, `as`)
    for (operator in arithmetics.Operator.values()) {
        val (name, operatorName, type) = operator
        kotlinFile.addUnaryPlusMinus(container, operator.operation)
            .addFunction(generatePlusSameGenericTypes(name, container, type))
            .addFunction(generatePlusSameGenericTypesSpecifyBounds(name, container, NumericType::class))
        // Extension functions with wildcard bounds take precedence if the type is more specific than the
        // corresponding generic method, e.g. RA<out RealType<*>>.plus(RA<out RealType<*>) will take precedence
        // over T: NumericType<T> RA<T>.plus(RA<T>) for RA<DoubleType> if T: NumericType<T> RA<T>.plus(RA<T>)
        // (or more specific) is not defined. We need to define the same bounds for both wildcard/star projection
        // and generic overloads to make sure to use generics whenever possible.
        for (bound in typesForWildcardBounds)
            kotlinFile.addFunction(generatePlusSameGenericTypesSpecifyBounds(name, container, bound))
        kotlinFile.generateArithmeticOperatorStarProjections(name, operatorName, container)
    }
    return kotlinFile.build()
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

private fun extensionsJavaName(container: ClassName) = "${container.simpleName}ArithmeticExtensionsJava"

private fun FileSpec.Builder.generateArithmeticOperatorStarProjections(name: String, operator: String, container: ClassName): FileSpec.Builder =
    typesForWildcardBounds.fold(this) { b, bound ->
        val identifier = bound.simpleName!!.dropLast("Type".length)
        b.addFunction(generateArithmeticOperatorStarProjection(name, operator, container, bound, identifier))
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

//open class GenerateArithmeticExtensionsTask : ArithmeticExtensionsTask() {
//
//    @TaskAction
//    override fun runTask() = super.runTask()
//
//    @Input
//    override var header: String? = null
//}

fun generateArithmeticExtensionsJava(`as`: String, className: String): JavaFile {
    val container = containersClasses[`as`] ?: error("Key `$`as`' not present in $containersClasses")
    val containerSimpleName = container.java.simpleName

    val javaClass = TypeSpec
        .classBuilder(className)
        .addModifiers(Modifier.PUBLIC)
        .addAnnotation(com.squareup.javapoet.AnnotationSpec.builder(SuppressWarnings::class.java).addMember("value", "{\$S,\$S}", "unchecked", "rawtypes").build())
        .let { arithmetics.Operator.values().fold(it) { b, op -> b.makeArithmeticMethodSameGenericTypes(container.java, op).makeArithmeticMethod(container.java, op) } }
        .build()
    return JavaFile
        .builder(packageName, javaClass)
        .addStaticImport(com.squareup.javapoet.ClassName.get(packageName, "${containerSimpleName}ExtensionsKt"), "getType")
        .addStaticImport(com.squareup.javapoet.ClassName.get(packageName, "${containerSimpleName}ConverterExtensionsKt"), "asType", "convert")
        .build()
}

fun TypeSpec.Builder.makeArithmeticMethodSameGenericTypes(container: Class<*>, operator: arithmetics.Operator): TypeSpec.Builder {

    val operatorInterfaceName = operatorInterfaceMapping[operator.operation]!!.qualifiedName
    val typeInterfaceName = "net.imglib2.type.Type"
    val genericT = com.squareup.javapoet.TypeVariableName.get("T", com.squareup.javapoet.TypeVariableName.get("$typeInterfaceName<T> & $operatorInterfaceName<T>"))
    val containerClassName = com.squareup.javapoet.ClassName.get(container)
    val parameterizedContainerName = ParameterizedTypeName.get(containerClassName, genericT)
    fun makeContainerSpec(name: String) = ParameterSpec.builder(parameterizedContainerName, name, Modifier.FINAL).build()

    val thiz = "thiz"
    val that = "that"
    val getType = "getType"

    val codeBlock = com.squareup.javapoet.CodeBlock
        .builder()
        .add("return convert($thiz, $that, $getType($thiz), BiConverter${operator.operation.capitalized()}.Companion.instance());")
        .build()
    val method = MethodSpec
        .methodBuilder("${operator.operation}Generic")
        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        .addTypeVariable(genericT)
        .addParameter(makeContainerSpec(thiz))
        .addParameter(makeContainerSpec(that))
        .returns(parameterizedContainerName)
        .addCode(codeBlock)
        .build()
    return this.addMethod(method)
}

fun TypeSpec.Builder.makeArithmeticMethod(container: Class<*>, operator: arithmetics.Operator): TypeSpec.Builder {
    val classes = listOf(
        "Complex" to ComplexType::class,
        "Integer" to IntegerType::class,
        "Real" to RealType::class
    )
    return classes.fold(this) { b, (identifier, bound) -> b.makeArithmeticMethod(container, operator, bound.java, identifier) }
}

fun TypeSpec.Builder.makeArithmeticMethod(
    container: Class<*>,
    operator: arithmetics.Operator,
    bound: Class<*>,
    identifier: String): TypeSpec.Builder
{
    val realTypeClassName = com.squareup.javapoet.ClassName.get(bound)
    val wildCardClassName = ParameterizedTypeName.get(realTypeClassName, com.squareup.javapoet.TypeVariableName.get("?"))
    val containerClassName = com.squareup.javapoet.ClassName.get(container)
    val parameterizedContainerName = ParameterizedTypeName.get(containerClassName, com.squareup.javapoet.WildcardTypeName.subtypeOf(wildCardClassName))
    fun makeContainerSpec(name: String) = ParameterSpec.builder(parameterizedContainerName, name, Modifier.FINAL).build()

    val thiz = "thiz"
    val that = "that"
    val getType = "getType"
    val asType = "asType"
    val operation = "${operator.operation}Generic"

    val codeBlock = com.squareup.javapoet.CodeBlock
        .builder()
        .add("final \$T rt1 = $getType($thiz);\n", wildCardClassName)
        .add("final \$T rt2 = $getType($that);\n", wildCardClassName)
        .add("final \$T resultType = ArithmeticTypes.ResultType.get(rt1, rt2);\n", realTypeClassName)
        .add("return $operation($asType(thiz, resultType), $asType(that, resultType));\n")
        .build()
    val method = MethodSpec
        .methodBuilder("${operator.operation}$identifier")
        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        .addParameter(makeContainerSpec(thiz))
        .addParameter(makeContainerSpec(that))
        .returns(parameterizedContainerName)
        .addCode(codeBlock)
        .build()
    return this.addMethod(method)
}

fun JavaFile.writeSourceFile(header: String?) {
    val sourceString = StringBuilder().also { sb -> header?.let { sb.append(it) }; this.writeTo(sb) }.toString()
    val file = getFilePathFor(typeSpec.name)
    Files.createDirectories(file.parent)
    Files.write(file, sourceString.toByteArray(Charsets.UTF_8))
}

fun getFilePathFor(className: String): Path {
    val packageComponents = packageName.split(literalDotRegex).toTypedArray()
    val targetDirectory = Paths.get(outputDirJava.absolutePath, *packageComponents)
    return targetDirectory.resolve("$className.java")
}

private val literalDotRegex ="\\.".toRegex()

//open class GenerateArithmeticScalarExtensionsTask : ExtensionWithHeaderTask("ArithmeticScalar") {
//
//    @TaskAction
//    fun runTask() {
//        for ((`as`, name) in getTypeFileMapping("ArithmeticScalar")) {
//            Files.write(name.second.toPath(), generateArithmeticScalarExtensions(`as`, name.first).withHeader().toByteArray())
//        }
//    }
//
//    companion object {
//        const val name = "generateArithmeticScalarExtensions"
//    }
//
//}

//open class GenerateArithmeticExtensionHelperTask : NtaktExtensionsTask(ArithmeticExtensionsTask.group) {
//
//    @Input
//    override var header: String? = null
//
//    @Input
//    fun getClassName(): String = "ArtithmeticExtensionsHelper"
//
//    @OutputFile
//    fun getOutputFile(): File = outputDir.resolve("${getClassName()}.kt")
//
//    @TaskAction
//    fun runTask() {
//        println("generating arithmetic extensions helper")
//        Files.write(getOutputFile().toPath(), makeArithmeticBiConverters(getClassName()).withHeader().toByteArray())
//    }
//
//    companion object {
//        const val name = "generateArithmeticExtensionHelperTask"
//    }
//
//}
