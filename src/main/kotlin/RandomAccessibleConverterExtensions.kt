package net.imglib2.imklib

import kotlin.Unit
import kotlin.jvm.JvmName
import net.imglib2.converter.BiConverter
import net.imglib2.converter.Converter
import net.imglib2.converter.Converters
import net.imglib2.type.Type
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.ByteType
import net.imglib2.type.numeric.integer.IntType
import net.imglib2.type.numeric.integer.LongType
import net.imglib2.type.numeric.integer.ShortType
import net.imglib2.type.numeric.integer.UnsignedByteType
import net.imglib2.type.numeric.integer.UnsignedIntType
import net.imglib2.type.numeric.integer.UnsignedLongType
import net.imglib2.type.numeric.integer.UnsignedShortType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.RandomAccessible as RA

fun <T, U : Type<U>> RA<T>.convert(u: U, converter: Converter<T, U>) =
    Converters.convert(this, converter, u)

inline fun <T, U : Type<U>> RA<T>.convert(u: U, crossinline converter: (T, U) -> Unit) =
    convert(u, Converter { a, b -> converter(a, b) })

fun <T, U, V : Type<V>> RA<T>.convert(
  that: RA<U>,
  v: V,
  converter: BiConverter<T, U, V>
) = Converters.convert(this, that, converter, v)

inline fun <T, U, V : Type<V>> RA<T>.convert(
  that: RA<U>,
  v: V,
  crossinline converter: (
    T,
    U,
    V
  ) -> Unit
) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })

fun <T : RealType<T>, U : RealType<U>> RA<T>.asType(u: U) =
    if (u::class == type::class) this as RA<U> else convert(u) { s, t -> t.setReal(s.realDouble) }

@JvmName(name = "fromRealTypeWildcard")
fun <T : RealType<T>> RA<out RealType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as RA<T>
    else convert(t) { s, u -> u.setReal(s.getRealDouble()) }

fun <T : IntegerType<T>, U : IntegerType<U>> RA<T>.asType(u: U) =
    if (u::class == type::class) this as RA<U>
    else convert(u) { s, t -> t.setInteger(s.integerLong) }

@JvmName(name = "fromIntegerTypeWildcard")
fun <T : IntegerType<T>> RA<out IntegerType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as RA<T>
    else convert(t) { s, u -> u.setInteger(s.getIntegerLong()) }

@JvmName(name = "asDoublesFromRealType")
fun <T : RealType<T>> RA<T>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromRealType")
fun <T : RealType<T>> RA<T>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromRealType")
fun <T : RealType<T>> RA<T>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromRealType")
fun <T : RealType<T>> RA<T>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromRealType")
fun <T : RealType<T>> RA<T>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromRealType")
fun <T : RealType<T>> RA<T>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromRealType")
fun <T : RealType<T>> RA<T>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromRealType")
fun <T : RealType<T>> RA<T>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromRealType")
fun <T : RealType<T>> RA<T>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromRealType")
fun <T : RealType<T>> RA<T>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromRealTypeWildcard")
fun RA<RealType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromRealTypeWildcard")
fun RA<RealType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromRealTypeWildcard")
fun RA<RealType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromRealTypeWildcard")
fun RA<RealType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromRealTypeWildcard")
fun RA<RealType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromRealTypeWildcard")
fun RA<RealType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromRealTypeWildcard")
fun RA<RealType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromRealTypeWildcard")
fun RA<RealType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromRealTypeWildcard")
fun RA<RealType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromRealTypeWildcard")
fun RA<RealType<*>>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromIntegerType")
fun <T : IntegerType<T>> RA<T>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromIntegerTypeWildcard")
fun RA<IntegerType<*>>.asUnsignedBytes() = asType(UnsignedByteType())
