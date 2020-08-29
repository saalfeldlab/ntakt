/**
 * Copyright (c) 2020, Saalfeld Lab, HHMI Janelia
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

// auto-generated, do not modify!

package net.imglib2.imklib

import kotlin.Unit
import kotlin.jvm.JvmName
import net.imglib2.converter.BiConverter
import net.imglib2.converter.Converter
import net.imglib2.converter.Converters
import net.imglib2.imklib.converter.ComplexRealConverters
import net.imglib2.type.Type
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.complex.ComplexDoubleType
import net.imglib2.type.numeric.complex.ComplexFloatType
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
import net.imglib2.IterableInterval as II

fun <T, U : Type<U>> II<T>.convert(u: U, converter: Converter<T, U>) =
    Converters.convert(this, converter, u)

inline fun <T, U : Type<U>> II<T>.convert(u: U, crossinline converter: (T, U) -> Unit) =
    convert(u, Converter { a, b -> converter(a, b) })

fun <T, U, V : Type<V>> II<T>.convert(
  that: II<U>,
  v: V,
  converter: BiConverter<T, U, V>
) = Converters.convert(this, that, converter, v)

inline fun <T, U, V : Type<V>> II<T>.convert(
  that: II<U>,
  v: V,
  crossinline converter: (
    T,
    U,
    V
  ) -> Unit
) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })

fun <T : RealType<T>, U : RealType<U>> II<T>.asType(u: U) =
    if (u::class == type::class) this as II<U> else convert(u) { s, t -> t.setReal(s.realDouble) }

@JvmName(name = "fromRealTypeWildcard")
fun <T : RealType<T>> II<out RealType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as II<T>
    else convert(t) { s, u -> u.setReal(s.getRealDouble()) }

fun <T : IntegerType<T>, U : IntegerType<U>> II<T>.asType(u: U) =
    if (u::class == type::class) this as II<U>
    else convert(u) { s, t -> t.setInteger(s.integerLong) }

@JvmName(name = "fromIntegerTypeWildcard")
fun <T : IntegerType<T>> II<out IntegerType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as II<T>
    else convert(t) { s, u -> u.setInteger(s.getIntegerLong()) }

@JvmName(name = "asDoublesFromRealType")
fun <T : RealType<T>> II<T>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromRealType")
fun <T : RealType<T>> II<T>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromRealType")
fun <T : RealType<T>> II<T>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromRealType")
fun <T : RealType<T>> II<T>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromRealType")
fun <T : RealType<T>> II<T>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromRealType")
fun <T : RealType<T>> II<T>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromRealType")
fun <T : RealType<T>> II<T>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromRealType")
fun <T : RealType<T>> II<T>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromRealType")
fun <T : RealType<T>> II<T>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromRealType")
fun <T : RealType<T>> II<T>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromRealTypeWildcard")
fun II<out RealType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromRealTypeWildcard")
fun II<out RealType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromRealTypeWildcard")
fun II<out RealType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromRealTypeWildcard")
fun II<out RealType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromRealTypeWildcard")
fun II<out RealType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromRealTypeWildcard")
fun II<out RealType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromRealTypeWildcard")
fun II<out RealType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromRealTypeWildcard")
fun II<out RealType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromRealTypeWildcard")
fun II<out RealType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromRealTypeWildcard")
fun II<out RealType<*>>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromIntegerType")
fun <T : IntegerType<T>> II<T>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromIntegerType")
fun <T : IntegerType<T>> II<T>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromIntegerType")
fun <T : IntegerType<T>> II<T>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromIntegerType")
fun <T : IntegerType<T>> II<T>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromIntegerType")
fun <T : IntegerType<T>> II<T>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromIntegerType")
fun <T : IntegerType<T>> II<T>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromIntegerType")
fun <T : IntegerType<T>> II<T>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromIntegerType")
fun <T : IntegerType<T>> II<T>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromIntegerType")
fun <T : IntegerType<T>> II<T>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromIntegerType")
fun <T : IntegerType<T>> II<T>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromIntegerTypeWildcard")
fun II<out IntegerType<*>>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "complexDoubleReal")
fun II<ComplexDoubleType>.real() = Converters.convert(this, ComplexRealConverters.realDouble)

@JvmName(name = "complexDoubleImaginary")
fun II<ComplexDoubleType>.imaginary() =
    Converters.convert(this, ComplexRealConverters.imaginaryDouble)

@JvmName(name = "complexFloatReal")
fun II<ComplexFloatType>.real() = Converters.convert(this, ComplexRealConverters.realFloat)

@JvmName(name = "complexFloatImaginary")
fun II<ComplexFloatType>.imaginary() =
    Converters.convert(this, ComplexRealConverters.imaginaryFloat)

@JvmName(name = "complexDoubleRealReadOnly")
fun II<ComplexDoubleType>.realReadOnly() = convert(DoubleType()) { s, t -> t.setReal(s.realDouble) }

@JvmName(name = "complexDoubleImaginaryReadOnly")
fun II<ComplexDoubleType>.imaginaryReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.imaginaryDouble) }

@JvmName(name = "complexFloatRealReadOnly")
fun II<ComplexFloatType>.realReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.realFloat) }

@JvmName(name = "complexFloatImaginaryReadOnly")
fun II<ComplexFloatType>.imaginaryReadOnly() =
    convert(FloatType()) { s, t -> t.setReal(s.imaginaryFloat) }

@JvmName(name = "complexDoublePhaseReadOnly")
fun II<ComplexDoubleType>.phaseReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.phaseDouble) }

@JvmName(name = "complexFloatPhaseReadOnly")
fun II<ComplexFloatType>.phaseReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.phaseFloat) }

@JvmName(name = "complexDoublePowerReadOnly")
fun II<ComplexDoubleType>.powerReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.powerDouble) }

@JvmName(name = "complexFloatPowerReadOnly")
fun II<ComplexFloatType>.powerReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.powerFloat) }
