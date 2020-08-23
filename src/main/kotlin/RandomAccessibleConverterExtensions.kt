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

fun <T : IntegerType<T>, U : IntegerType<U>> RA<T>.asType(u: U) =
    if (u::class == type::class) this as RA<U>
    else convert(u) { s, t -> t.setInteger(s.integerLong) }

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
