import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.type.Type
import net.imglib2.type.numeric.RealType
import kotlin.reflect.KClass

fun generateArithmeticScalarExtensions(`as`: String, fileName: String): String {
    val kotlinFile =  FileSpec.builder("net.imglib2.imklib", fileName)
    val container = containers[`as`] ?: error("Key `$`as`' not present in $containers")
    for ((name, operatorName, type) in arithmetics.operatorNames) {
        kotlinFile.addFunction(generateArithmeticScalarOperatorSameType(name, operatorName, container, type))
        kotlinFile.addArithmeticScalarOperatorsPrimitiveTypes(name, operatorName, container)
    }
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

private fun generateArithmeticScalarOperatorSameType(name: String, operator: String, container: ClassName, type: KClass<*>): FunSpec {
    // TODO for some reason, compilation of generated sources fails with Type::class, type, e.g.
    // val (genericT, boundedT) = "T".genericAndBounded(Type::class, type)
    // java.lang.AssertionError: Empty intersection for types [Type<(T..T?)>, Add<(T..T?)>, Type<T>, Add<T>]
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)

    return typedFuncSpecBuilder(name, container.parameterizedBy(genericT), boundedT)
            .addModifiers(KModifier.OPERATOR)
            .addParameter("value", genericT)
            .addStatement("return convert(type)·{·s,·t ->·t.set(s); t $operator= value }")
            .build()
}

private fun FileSpec.Builder.addArithmeticScalarOperatorsPrimitiveTypes(name: String, operator: String, container: ClassName)
        = primitiveTypes.fold(this) { b, t -> b.addFunction(generateArithmeticScalarOperatorsPrimitiveType(name, operator, container, t)) }

private fun generateArithmeticScalarOperatorsPrimitiveType(name: String, operator: String, container: ClassName, primitiveType: KClass<*>): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder(name, container.parameterizedBy(genericT), boundedT)
            .addModifiers(KModifier.OPERATOR)
            .addParameter("value", primitiveType)
            .addStatement("return this·$operator·type.also·{·it.setTo(value) }")
            .build()
}
