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

package org.ntakt

import kotlin.Unit
import kotlin.jvm.JvmName
import net.imglib2.converter.BiConverter
import net.imglib2.converter.Converter
import net.imglib2.converter.Converters
import net.imglib2.type.Type
import net.imglib2.type.numeric.ComplexType
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
import org.ntakt.converter.ComplexRealConverters
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

fun <T : RealType<T>> RAI<out RealType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as RAI<T>
    else convert(t) { s, u -> u.setReal(s.realDouble) }

fun <T : IntegerType<T>> RAI<out IntegerType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as RAI<T>
    else convert(t) { s, u -> u.setInteger(s.integerLong) }

fun <T : ComplexType<T>> RAI<out ComplexType<*>>.asType(t: T) =
    if (t::class == getType()::class) this as RAI<T>
    else convert(t) { s, u -> u.setReal(s.realDouble); u.setImaginary(s.imaginaryDouble) }

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
fun RAI<out RealType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromRealTypeWildcard")
fun RAI<out RealType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromRealTypeWildcard")
fun RAI<out RealType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromRealTypeWildcard")
fun RAI<out RealType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromRealTypeWildcard")
fun RAI<out RealType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromRealTypeWildcard")
fun RAI<out RealType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromRealTypeWildcard")
fun RAI<out RealType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromRealTypeWildcard")
fun RAI<out RealType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromRealTypeWildcard")
fun RAI<out RealType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromRealTypeWildcard")
fun RAI<out RealType<*>>.asUnsignedBytes() = asType(UnsignedByteType())

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
fun RAI<out IntegerType<*>>.asDoubles() = asType(DoubleType())

@JvmName(name = "asFloatsFromIntegerTypeWildcard")
fun RAI<out IntegerType<*>>.asFloats() = asType(FloatType())

@JvmName(name = "asLongsFromIntegerTypeWildcard")
fun RAI<out IntegerType<*>>.asLongs() = asType(LongType())

@JvmName(name = "asIntsFromIntegerTypeWildcard")
fun RAI<out IntegerType<*>>.asInts() = asType(IntType())

@JvmName(name = "asShortsFromIntegerTypeWildcard")
fun RAI<out IntegerType<*>>.asShorts() = asType(ShortType())

@JvmName(name = "asBytesFromIntegerTypeWildcard")
fun RAI<out IntegerType<*>>.asBytes() = asType(ByteType())

@JvmName(name = "asUnsignedLongsFromIntegerTypeWildcard")
fun RAI<out IntegerType<*>>.asUnsignedLongs() = asType(UnsignedLongType())

@JvmName(name = "asUnsignedIntsFromIntegerTypeWildcard")
fun RAI<out IntegerType<*>>.asUnsignedInts() = asType(UnsignedIntType())

@JvmName(name = "asUnsignedShortsFromIntegerTypeWildcard")
fun RAI<out IntegerType<*>>.asUnsignedShorts() = asType(UnsignedShortType())

@JvmName(name = "asUnsignedBytesFromIntegerTypeWildcard")
fun RAI<out IntegerType<*>>.asUnsignedBytes() = asType(UnsignedByteType())

@JvmName(name = "complexDoubleReal")
fun RAI<ComplexDoubleType>.real() = Converters.convert(this, ComplexRealConverters.realDouble)

@JvmName(name = "complexDoubleImaginary")
fun RAI<ComplexDoubleType>.imaginary() =
    Converters.convert(this, ComplexRealConverters.imaginaryDouble)

@JvmName(name = "complexFloatReal")
fun RAI<ComplexFloatType>.real() = Converters.convert(this, ComplexRealConverters.realFloat)

@JvmName(name = "complexFloatImaginary")
fun RAI<ComplexFloatType>.imaginary() =
    Converters.convert(this, ComplexRealConverters.imaginaryFloat)

@JvmName(name = "complexDoubleRealReadOnly")
fun RAI<ComplexDoubleType>.realReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.realDouble) }

@JvmName(name = "complexDoubleImaginaryReadOnly")
fun RAI<ComplexDoubleType>.imaginaryReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.imaginaryDouble) }

@JvmName(name = "complexFloatRealReadOnly")
fun RAI<ComplexFloatType>.realReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.realFloat) }

@JvmName(name = "complexFloatImaginaryReadOnly")
fun RAI<ComplexFloatType>.imaginaryReadOnly() =
    convert(FloatType()) { s, t -> t.setReal(s.imaginaryFloat) }

@JvmName(name = "complexDoublePhaseReadOnly")
fun RAI<ComplexDoubleType>.phaseReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.phaseDouble) }

@JvmName(name = "complexFloatPhaseReadOnly")
fun RAI<ComplexFloatType>.phaseReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.phaseFloat) }

@JvmName(name = "complexDoublePowerReadOnly")
fun RAI<ComplexDoubleType>.powerReadOnly() =
    convert(DoubleType()) { s, t -> t.setReal(s.powerDouble) }

@JvmName(name = "complexFloatPowerReadOnly")
fun RAI<ComplexFloatType>.powerReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.powerFloat) }
