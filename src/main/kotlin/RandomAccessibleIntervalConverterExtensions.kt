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
import net.imglib2.RandomAccessibleInterval as RAI

fun <T, U : Type<U>> RAI<T>.convert(u: U, converter: Converter<T, U>) =
    Converters.convert(this, converter, u)

inline fun <T, U : Type<U>> RAI<T>.convert(u: U, crossinline converter: (T, U) -> Unit) =
    convert(u, Converter { a, b -> converter(a, b) })

fun <T, U, V : Type<V>> RAI<T>.convert(
  that: RAI<U>,
  v: V,
  converter: BiConverter<T, U, V>
) = Converters.convert(this, that, converter, v)

inline fun <T, U, V : Type<V>> RAI<T>.convert(
  that: RAI<U>,
  v: V,
  crossinline converter: (
    T,
    U,
    V
  ) -> Unit
) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })

fun <T : RealType<T>, U : RealType<U>> RAI<T>.asType(u: U) =
    if (u::class == type::class) this as RAI<U> else convert(u) { s, t -> t.setReal(s.realDouble) }

@JvmName(name = "fromRealTypeWildcard")
fun <T : RealType<T>> RAI<out RealType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as RAI<T>
    else convert(t) { s, u -> u.setReal(s.getRealDouble()) }

fun <T : IntegerType<T>, U : IntegerType<U>> RAI<T>.asType(u: U) =
    if (u::class == type::class) this as RAI<U>
    else convert(u) { s, t -> t.setInteger(s.integerLong) }

@JvmName(name = "fromIntegerTypeWildcard")
fun <T : IntegerType<T>> RAI<out IntegerType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as RAI<T>
    else convert(t) { s, u -> u.setInteger(s.getIntegerLong()) }

@JvmName(name = "asDoublesFromRealType")
fun <T : RealType<T>> RAI<T>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromRealType")
fun <T : RealType<T>> RAI<T>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromRealType")
fun <T : RealType<T>> RAI<T>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromRealType")
fun <T : RealType<T>> RAI<T>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromRealType")
fun <T : RealType<T>> RAI<T>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromRealType")
fun <T : RealType<T>> RAI<T>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromRealType")
fun <T : RealType<T>> RAI<T>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromRealType")
fun <T : RealType<T>> RAI<T>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromRealType")
fun <T : RealType<T>> RAI<T>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromRealType")
fun <T : RealType<T>> RAI<T>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromRealTypeWildcard")
fun RAI<RealType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromRealTypeWildcard")
fun RAI<RealType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromRealTypeWildcard")
fun RAI<RealType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromRealTypeWildcard")
fun RAI<RealType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromRealTypeWildcard")
fun RAI<RealType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromRealTypeWildcard")
fun RAI<RealType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromRealTypeWildcard")
fun RAI<RealType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromRealTypeWildcard")
fun RAI<RealType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromRealTypeWildcard")
fun RAI<RealType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromRealTypeWildcard")
fun RAI<RealType<*>>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromIntegerType")
fun <T : IntegerType<T>> RAI<T>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromIntegerTypeWildcard")
fun RAI<IntegerType<*>>.asUnsignedBytes() = asType(UnsignedByteType())
