import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.type.numeric.RealType
import kotlin.reflect.KClass

fun generateArithmeticScalarExtensions(`as`: String, fileName: String): String {
    val kotlinFile =  FileSpec.builder("org.ntakt", fileName)
    val container = containers[`as`] ?: error("Key `$`as`' not present in $containers")
    for ((operation, operatorName, type) in arithmetics.Operator.values()) {
        kotlinFile.addFunction(generateArithmeticScalarOperatorSameType(operation, operatorName, container, type))
        kotlinFile.addArithmeticScalarOperatorsPrimitiveTypes(operation, operatorName, container)
    }
    kotlinFile.addPow(container)
    kotlinFile.addExp(container)
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

private fun FileSpec.Builder.addArithmeticScalarOperatorsPrimitiveTypes(name: String, operator: String, container: ClassName): FileSpec.Builder {
    println("TODO: Arithmetic scalar operators do not consider range of primitive type yet; i.e. RAI<IntType> $operator Double -> RAI<IntType>")
    return primitiveTypes.fold(this) { b, t -> b.addFunction(generateArithmeticScalarOperatorsPrimitiveType(name, operator, container, t)) }
}

private fun generateArithmeticScalarOperatorsPrimitiveType(name: String, operator: String, container: ClassName, primitiveType: KClass<*>): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    // TODO consider possible range of value based on primitiveType and choose return type accordingly
    return typedFuncSpecBuilder(name, container.parameterizedBy(genericT), boundedT)
            .addModifiers(KModifier.OPERATOR)
            .addParameter("value", primitiveType)
            .addStatement("return this·$operator·type.also·{·it.setTo(value) }")
            .build()
}

private fun FileSpec.Builder.addPow(container: ClassName): FileSpec.Builder {
    addFunction(generatePow(container))
    addFunction(`generate**Infix`(container))
    addFunction(generatePowContainer(container))
    addFunction(`generate**InfixContainer`(container))
    return arrayOf(Double::class.asTypeName(), Float::class.asTypeName()).fold(this) { b, t ->
        b.addFunction(generatePow(container, t)).addFunction(`generate**Infix`(container, t))
    }
}

// TODO this should probably live in a different file
private fun generatePowContainer(container: ClassName): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder("pow", container.parameterizedBy(genericT), boundedT)
            .addParameter("exponent", container.parameterizedBy(genericT))
            .addStatement("return convert(exponent, type) { s, t, u -> t.set(s); t.pow(u) }")
            .build()
}

// TODO this should probably live in a different file
private fun `generate**InfixContainer`(container: ClassName): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder("**", container.parameterizedBy(genericT), boundedT)
            .addParameter("exponent", container.parameterizedBy(genericT))
            .addModifiers(KModifier.INFIX)
            .addStatement("return pow(exponent)")
            .build()
}

private fun generatePow(container: ClassName): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder("pow", container.parameterizedBy(genericT), boundedT)
            .addParameter("exponent", genericT)
            .addStatement("return convert(type) { s, t -> t.set(s); t.pow(exponent) }")
            .build()
}

private fun `generate**Infix`(container: ClassName): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder("**", container.parameterizedBy(genericT), boundedT)
            .addParameter("exponent", genericT)
            .addModifiers(KModifier.INFIX)
            .addStatement("return pow(exponent)")
            .build()
}

private fun generatePow(container: ClassName, type: TypeName): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder("pow", container.parameterizedBy(genericT), boundedT)
            .addParameter("exponent", type)
            .addStatement("return convert(type) { s, t -> t.set(s); t.pow(exponent) }")
            .build()
}

private fun `generate**Infix`(container: ClassName, type: TypeName): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder("**", container.parameterizedBy(genericT), boundedT)
            .addParameter("exponent", type)
            .addModifiers(KModifier.INFIX)
            .addStatement("return pow(exponent)")
            .build()
}

private fun FileSpec.Builder.addExp(container: ClassName): FileSpec.Builder {
    addImport("kotlin.math", "E")
    addFunction(generateExp(container))
    addFunction(generateExpContainer(container))
    addFunction(generateExp(container, Double::class.asTypeName(), "E"))
    addFunction(generateExp(container, Float::class.asTypeName()))
    return this
}

private fun generateExp(container: ClassName): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder("exp", container.parameterizedBy(genericT), boundedT)
            .addParameter("base", genericT)
            .addStatement("return convert(type) { s, t -> t.set(s); t.exp(base) }")
            .build()
}

// TODO this should probably live in a different file
private fun generateExpContainer(container: ClassName): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder("exp", container.parameterizedBy(genericT), boundedT)
            .addParameter("exponent", container.parameterizedBy(genericT))
            .addStatement("return convert(exponent, type) { s, t, u -> t.set(s); t.exp(u) }")
            .build()
}

private fun generateExp(container: ClassName, type: TypeName, defaultValue: Any? = null): FunSpec {
    val (genericT, boundedT) = "T".genericAndBounded(RealType::class)
    return typedFuncSpecBuilder("exp", container.parameterizedBy(genericT), boundedT)
            .let { b -> defaultValue?.let { b.addParameter(ParameterSpec.builder("base", type).defaultValue("$defaultValue").build()) } ?: b.addParameter("base", type) }
            .addStatement("return convert(type) { s, t -> t.set(s); t.exp(base) }")
            .build()
}

//infix fun <T: RealType<T>> RandomAccessibleInterval<T>.`**`(exponent: RandomAccessibleInterval<T>) = convert(exponent, type) { t, u, v -> v.set(t); v.pow(u) }

//fun <T: RealType<T>> RandomAccessibleInterval<T>.exp(base: RandomAccessibleInterval<T>) = convert(base, type) { t, u, v -> v.set(u); v.pow(t) }

