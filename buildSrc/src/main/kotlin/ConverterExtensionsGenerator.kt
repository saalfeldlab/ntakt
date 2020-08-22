import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.converter.BiConverter
import net.imglib2.converter.Converter
import net.imglib2.converter.Converters
import net.imglib2.converter.readwrite.SamplerConverter
import net.imglib2.type.Type


fun generateConverterExtensions(`as`: String, fileName: String): String {
    val container = containers[`as`] ?: error("Key `$`as`' not present in $containers")
    val kotlinFile =  FileSpec
            .builder("net.imglib2.imklib", fileName)
            .addAliasedImport(container, `as`)
            .addConverterExtensions(container)
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

private fun FileSpec.Builder.addConverterExtensions(container: ClassName): FileSpec.Builder {
    val t = TypeVariableName("T")
    val u = TypeVariableName("U")
    val v = TypeVariableName("V")
    val typeOfU = Type::class.asTypeName().parameterizedBy(u)
    val typeOfV = Type::class.asTypeName().parameterizedBy(v)
    val uType = TypeVariableName("U", typeOfU)
    val vType = TypeVariableName("V", typeOfV)
    val tIn = TypeVariableName("T", KModifier.IN)
    return this
            .addFunction(generateConverterExtension(container, t, uType))
            .addFunction(generateConverterExtensionLambda(container, t, uType))
            .addFunction(generateBiconverterExtension(container, t, u, vType))
            .addFunction(generateBiconverterExtensionLambda(container, t, u, vType))
            .addFunction(generateSamplerConverterExtension(container, tIn, uType))
//    fun <T, U: Type<U>> RA<T>.convert(converter: SamplerConverter<in T, U>) = Converters.convert(this, converter)
}

private fun generateConverterExtension(container: ClassName, t: TypeVariableName, u: TypeVariableName): FunSpec {
    return FunSpec
            .builder("convert")
            .addTypeVariable(t)
            .addTypeVariable(u)
            .receiver(container.parameterizedBy(t))
            .addParameter("u", u)
            .addParameter("converter", Converter::class.asClassName().parameterizedBy(t, u))
            .addStatement("return %T.convert(this,·converter,·u)", Converters::class)
            .build()
}

private fun generateConverterExtensionLambda(container: ClassName, t: TypeVariableName, u: TypeVariableName): FunSpec {
    return FunSpec
            .builder("convert")
            .addTypeVariable(t)
            .addTypeVariable(u)
            .receiver(container.parameterizedBy(t))
            .addModifiers(KModifier.INLINE)
            .addParameter("u", u)
            .addParameter(higherOrderFunctionParameter("converter", t, u))
            .addStatement("return convert(u,·Converter·{·a,·b·->·converter(a,·b)·})")
            .build()
}

private fun generateBiconverterExtension(container: ClassName, t: TypeVariableName, u: TypeVariableName, v: TypeVariableName): FunSpec {
    return FunSpec
            .builder("convert")
            .addTypeVariable(t)
            .addTypeVariable(u)
            .addTypeVariable(v)
            .receiver(container.parameterizedBy(t))
            .addParameter("that", container.parameterizedBy(u))
            .addParameter("v", v)
            .addParameter("converter", BiConverter::class.asClassName().parameterizedBy(t, u, v))
            .addStatement("return %T.convert(this,·that,·converter,·v)", Converters::class)
            .build()
}

private fun generateBiconverterExtensionLambda(container: ClassName, t: TypeVariableName, u: TypeVariableName, v: TypeVariableName): FunSpec {
    return FunSpec
            .builder("convert")
            .addTypeVariable(t)
            .addTypeVariable(u)
            .addTypeVariable(v)
            .receiver(container.parameterizedBy(t))
            .addModifiers(KModifier.INLINE)
            .addParameter("that", container.parameterizedBy(u))
            .addParameter("v", v)
            .addParameter(higherOrderFunctionParameter("converter", t, u, v))
            .addStatement("return convert(that,·v,·BiConverter·{·a,·b,·c·->·converter(a,·b,·c)·})")
            .build()
}

private fun generateSamplerConverterExtension(container: ClassName, t: TypeVariableName, u: TypeVariableName): FunSpec {
    return FunSpec
            .builder("convert")
            .addTypeVariable(TypeVariableName(t.name, variance = null))
            .addTypeVariable(u)
            .receiver(container.parameterizedBy(t))
            .addParameter("converter", SamplerConverter::class.asClassName().parameterizedBy(t, u))
            .addStatement("return %T.convert(this,·converter)", Converters::class)
            .build()
}

private fun higherOrderFunctionParameter(
        name: String,
        vararg className: TypeName,
        returnType: TypeName = Unit::class.asClassName()): ParameterSpec {
    val lambdaType = LambdaTypeName.get(null, *className, returnType = returnType)
    return ParameterSpec.builder(name, lambdaType, KModifier.CROSSINLINE).build()
}

private fun generatePlusConverting(
        name: String,
        operator: String,
        container: ClassName,
        t1: ClassName,
        t2: ClassName,
        o: ClassName,
        jvmName: String): FunSpec {
    //
    //fun <C: ComplexType<C>, R: RealType<R>> RA<C>.real(type: R) = convert(ComplexPart.REAL.converter(type))
    //fun <C: ComplexType<C>, R: RealType<R>> RA<C>.imaginary(type: R) = convert(ComplexPart.IMAGINARY.converter(type))
    //val <C: ComplexType<C>> RA<C>.real get() = real(DoubleType())
    //val <C: ComplexType<C>> RA<C>.imaginary get() = imaginary(DoubleType())
    //
    //fun <T> RA<T>.interval(min: LongArray, max: LongArray) = Views.interval(this, min, max)
    //fun <T> RA<T>.interval(vararg dims: Long) = interval(LongArray(dims.size) { 0L }, LongArray(dims.size) { dims[it] - 1L })
    //fun <T> RA<T>.interval(interval: Interval) = Views.interval(this, interval)
    //operator fun <T> RA<T>.get(interval: Interval) = interval(interval)
    //
    //fun <T: RealType<T>, U: RealType<U>> RA<T>.asType(u: U) = if (u::class == type::class) this as RA<U> else convert(u) { s, t -> t.setReal(s.realDouble) }
    //fun <T: IntegerType<T>, U: IntegerType<U>> RA<T>.asType(u: U) = if (u::class == type::class) this as RA<U> else convert(u) { s, t -> t.setInteger(s.integerLong) }
    //val <T: RealType<T>> RA<T>.asBytes get() = asType(ByteType())
    //val <T: RealType<T>> RA<T>.asShorts get() = asType(ShortType())
    //val <T: RealType<T>> RA<T>.asInts get() = asType(IntType())
    //val <T: RealType<T>> RA<T>.asLongs get() = asType(LongType())
    //val <T: RealType<T>> RA<T>.asUnsignedBytes get() = asType(UnsignedByteType())
    //val <T: RealType<T>> RA<T>.asUnsignedShorts get() = asType(UnsignedShortType())
    //val <T: RealType<T>> RA<T>.asUnsignedInts get() = asType(UnsignedIntType())
    //val <T: RealType<T>> RA<T>.asUnsignedLongs get() = asType(UnsignedLongType())
    //val <T: RealType<T>> RA<T>.asFloats get() = asType(FloatType())
    //val <T: RealType<T>> RA<T>.asDoubles get() = asType(DoubleType())
    return FunSpec
            .builder(name)
            .addAnnotation(AnnotationSpec.builder(JvmName::class).addMember("name = %S", jvmName).build())
            .addModifiers(KModifier.OPERATOR)
            .receiver(container.parameterizedBy(t1))
            .addParameter("that", container.parameterizedBy(t2))
            .returns(container.parameterizedBy(o))
            // Need · to add non-breaking space
            .addStatement("return this.asType(${o.simpleName}())·$operator·that.asType(${o.simpleName}())")
            .build()
}