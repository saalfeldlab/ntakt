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
import net.imglib2.RealRandomAccessible as RRA

fun <T, U : Type<U>> RRA<T>.convert(u: U, converter: Converter<T, U>) =
    Converters.convert(this, converter, u)

inline fun <T, U : Type<U>> RRA<T>.convert(u: U, crossinline converter: (T, U) -> Unit) =
    convert(u, Converter { a, b -> converter(a, b) })

fun <T, U, V : Type<V>> RRA<T>.convert(
  that: RRA<U>,
  v: V,
  converter: BiConverter<T, U, V>
) = Converters.convert(this, that, converter, v)

inline fun <T, U, V : Type<V>> RRA<T>.convert(
  that: RRA<U>,
  v: V,
  crossinline converter: (
    T,
    U,
    V
  ) -> Unit
) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })

fun <T : RealType<T>, U : RealType<U>> RRA<T>.asType(u: U) =
    if (u::class == type::class) this as RRA<U> else convert(u) { s, t -> t.setReal(s.realDouble) }

@JvmName(name = "fromRealTypeWildcard")
fun <T : RealType<T>> RRA<out RealType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as RRA<T>
    else convert(t) { s, u -> u.setReal(s.getRealDouble()) }

fun <T : IntegerType<T>, U : IntegerType<U>> RRA<T>.asType(u: U) =
    if (u::class == type::class) this as RRA<U>
    else convert(u) { s, t -> t.setInteger(s.integerLong) }

@JvmName(name = "fromIntegerTypeWildcard")
fun <T : IntegerType<T>> RRA<out IntegerType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as RRA<T>
    else convert(t) { s, u -> u.setInteger(s.getIntegerLong()) }

@JvmName(name = "asDoublesFromRealType")
fun <T : RealType<T>> RRA<T>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromRealType")
fun <T : RealType<T>> RRA<T>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromRealType")
fun <T : RealType<T>> RRA<T>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromRealType")
fun <T : RealType<T>> RRA<T>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromRealType")
fun <T : RealType<T>> RRA<T>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromRealType")
fun <T : RealType<T>> RRA<T>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromRealType")
fun <T : RealType<T>> RRA<T>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromRealType")
fun <T : RealType<T>> RRA<T>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromRealType")
fun <T : RealType<T>> RRA<T>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromRealType")
fun <T : RealType<T>> RRA<T>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromRealTypeWildcard")
fun RRA<out RealType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromRealTypeWildcard")
fun RRA<out RealType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromRealTypeWildcard")
fun RRA<out RealType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromRealTypeWildcard")
fun RRA<out RealType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromRealTypeWildcard")
fun RRA<out RealType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromRealTypeWildcard")
fun RRA<out RealType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromRealTypeWildcard")
fun RRA<out RealType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromRealTypeWildcard")
fun RRA<out RealType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromRealTypeWildcard")
fun RRA<out RealType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromRealTypeWildcard")
fun RRA<out RealType<*>>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromIntegerType")
fun <T : IntegerType<T>> RRA<T>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "asDoublesFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromIntegerTypeWildcard")
fun RRA<out IntegerType<*>>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "complexDoubleRealReadOnly")
fun RRA<ComplexDoubleType>.realReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.realDouble) }

@JvmName(name = "complexDoubleImaginaryReadOnly")
fun RRA<ComplexDoubleType>.imaginaryReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.imaginaryDouble) }

@JvmName(name = "complexFloatRealReadOnly")
fun RRA<ComplexFloatType>.realReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.realFloat) }

@JvmName(name = "complexFloatImaginaryReadOnly")
fun RRA<ComplexFloatType>.imaginaryReadOnly() =
    convert(FloatType()) { s, t -> t.setReal(s.imaginaryFloat) }

@JvmName(name = "complexDoublePhaseReadOnly")
fun RRA<ComplexDoubleType>.phaseReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.phaseDouble) }

@JvmName(name = "complexFloatPhaseReadOnly")
fun RRA<ComplexFloatType>.phaseReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.phaseFloat) }

@JvmName(name = "complexDoublePowerReadOnly")
fun RRA<ComplexDoubleType>.powerReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.powerDouble) }

@JvmName(name = "complexFloatPowerReadOnly")
fun RRA<ComplexFloatType>.powerReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.powerFloat) }
