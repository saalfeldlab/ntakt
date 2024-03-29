import com.squareup.javapoet.AnnotationSpec
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.CodeBlock
import com.squareup.javapoet.JavaFile
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.ParameterSpec
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeSpec
import com.squareup.javapoet.TypeVariableName
import com.squareup.javapoet.WildcardTypeName
import net.imglib2.type.numeric.ComplexType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import javax.lang.model.element.Modifier

fun generateArithmeticExtensionsJava(`as`: String, className: String): JavaFile {
    val container = containersClasses[`as`] ?: error("Key `$`as`' not present in $containersClasses")
    val containerSimpleName = container.java.simpleName

    val javaClass = TypeSpec
        .classBuilder(className)
        .addModifiers(Modifier.PUBLIC)
        .addAnnotation(AnnotationSpec.builder(SuppressWarnings::class.java).addMember("value", "{\$S,\$S}", "unchecked", "rawtypes").build())
        .let { arithmetics.Operator.values().fold(it) { b, op -> b.makeArithmeticMethodSameGenericTypes(container.java, op).makeArithmeticMethod(container.java, op) } }
        .build()
    return JavaFile
        .builder(packageName, javaClass)
        .addStaticImport(ClassName.get(packageName, "${containerSimpleName}ExtensionsKt"), "getType")
        .addStaticImport(ClassName.get(packageName, "${containerSimpleName}ConverterExtensionsKt"), "asType", "convert")
        .build()
}

fun TypeSpec.Builder.makeArithmeticMethodSameGenericTypes(container: Class<*>, operator: arithmetics.Operator): TypeSpec.Builder {

    val operatorInterfaceName = operatorInterfaceMapping[operator.operation]!!.qualifiedName
    val typeInterfaceName = "net.imglib2.type.Type"
    val genericT = TypeVariableName.get("T", TypeVariableName.get("$typeInterfaceName<T> & $operatorInterfaceName<T>"))
    val containerClassName = ClassName.get(container)
    val parameterizedContainerName = ParameterizedTypeName.get(containerClassName, genericT)
    fun makeContainerSpec(name: String) = ParameterSpec.builder(parameterizedContainerName, name, Modifier.FINAL).build()

    val thiz = "thiz"
    val that = "that"
    val getType = "getType"

    val codeBlock = CodeBlock
        .builder()
        .add("return convert($thiz, $that, $getType($thiz), BiConverter${operator.operation.capitalize()}.Companion.instance());")
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
    val realTypeClassName = ClassName.get(bound)
    val wildCardClassName = ParameterizedTypeName.get(realTypeClassName, TypeVariableName.get("?"))
    val containerClassName = ClassName.get(container)
    val parameterizedContainerName = ParameterizedTypeName.get(containerClassName, WildcardTypeName.subtypeOf(wildCardClassName))
    fun makeContainerSpec(name: String) = ParameterSpec.builder(parameterizedContainerName, name, Modifier.FINAL).build()

    val thiz = "thiz"
    val that = "that"
    val getType = "getType"
    val asType = "asType"
    val operation = "${operator.operation}Generic"

    val codeBlock = CodeBlock
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