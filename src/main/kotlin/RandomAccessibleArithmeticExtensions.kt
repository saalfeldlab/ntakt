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

import kotlin.jvm.JvmName
import net.imglib2.type.Type
import net.imglib2.type.numeric.NumericType
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
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub
import net.imglib2.RandomAccessible as RA

operator fun <T : NumericType<T>> RA<T>.unaryPlus() = this

operator fun <T : NumericType<T>> RA<T>.unaryMinus() = convert(type) { s, t -> t.set(s); t.mul(-1.0)
    }

@JvmName(name = "plus_1")
operator fun <T> RA<T>.plus(that: RA<T>): RA<T> where T : Type<T>, T : Add<T> = convert(that, type)
    { t, u, v -> v.set(t); v += u }

@JvmName(name = "plus_2")
operator fun RA<DoubleType>.plus(that: RA<FloatType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_3")
operator fun RA<FloatType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_4")
operator fun RA<DoubleType>.plus(that: RA<LongType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_5")
operator fun RA<LongType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_6")
operator fun RA<DoubleType>.plus(that: RA<IntType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_7")
operator fun RA<IntType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_8")
operator fun RA<DoubleType>.plus(that: RA<ShortType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_9")
operator fun RA<ShortType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_10")
operator fun RA<DoubleType>.plus(that: RA<ByteType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_11")
operator fun RA<ByteType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_12")
operator fun RA<DoubleType>.plus(that: RA<UnsignedLongType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_13")
operator fun RA<UnsignedLongType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_14")
operator fun RA<DoubleType>.plus(that: RA<UnsignedIntType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_15")
operator fun RA<UnsignedIntType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_16")
operator fun RA<DoubleType>.plus(that: RA<UnsignedShortType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_17")
operator fun RA<UnsignedShortType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_18")
operator fun RA<DoubleType>.plus(that: RA<UnsignedByteType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_19")
operator fun RA<UnsignedByteType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_20")
operator fun RA<FloatType>.plus(that: RA<LongType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_21")
operator fun RA<LongType>.plus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_22")
operator fun RA<FloatType>.plus(that: RA<IntType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_23")
operator fun RA<IntType>.plus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_24")
operator fun RA<FloatType>.plus(that: RA<ShortType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_25")
operator fun RA<ShortType>.plus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_26")
operator fun RA<FloatType>.plus(that: RA<ByteType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_27")
operator fun RA<ByteType>.plus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_28")
operator fun RA<FloatType>.plus(that: RA<UnsignedLongType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_29")
operator fun RA<UnsignedLongType>.plus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_30")
operator fun RA<FloatType>.plus(that: RA<UnsignedIntType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_31")
operator fun RA<UnsignedIntType>.plus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_32")
operator fun RA<FloatType>.plus(that: RA<UnsignedShortType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_33")
operator fun RA<UnsignedShortType>.plus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_34")
operator fun RA<FloatType>.plus(that: RA<UnsignedByteType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_35")
operator fun RA<UnsignedByteType>.plus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_36")
operator fun RA<LongType>.plus(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_37")
operator fun RA<IntType>.plus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_38")
operator fun RA<LongType>.plus(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_39")
operator fun RA<ShortType>.plus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_40")
operator fun RA<LongType>.plus(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_41")
operator fun RA<ByteType>.plus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_42")
operator fun RA<LongType>.plus(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_43")
operator fun RA<UnsignedLongType>.plus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_44")
operator fun RA<LongType>.plus(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_45")
operator fun RA<UnsignedIntType>.plus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_46")
operator fun RA<LongType>.plus(that: RA<UnsignedShortType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_47")
operator fun RA<UnsignedShortType>.plus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_48")
operator fun RA<LongType>.plus(that: RA<UnsignedByteType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_49")
operator fun RA<UnsignedByteType>.plus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_50")
operator fun RA<IntType>.plus(that: RA<ShortType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_51")
operator fun RA<ShortType>.plus(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_52")
operator fun RA<IntType>.plus(that: RA<ByteType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_53")
operator fun RA<ByteType>.plus(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_54")
operator fun RA<IntType>.plus(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_55")
operator fun RA<UnsignedLongType>.plus(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_56")
operator fun RA<IntType>.plus(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_57")
operator fun RA<UnsignedIntType>.plus(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_58")
operator fun RA<IntType>.plus(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_59")
operator fun RA<UnsignedShortType>.plus(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_60")
operator fun RA<IntType>.plus(that: RA<UnsignedByteType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_61")
operator fun RA<UnsignedByteType>.plus(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_62")
operator fun RA<ShortType>.plus(that: RA<ByteType>): RA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_63")
operator fun RA<ByteType>.plus(that: RA<ShortType>): RA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_64")
operator fun RA<ShortType>.plus(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_65")
operator fun RA<UnsignedLongType>.plus(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_66")
operator fun RA<ShortType>.plus(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_67")
operator fun RA<UnsignedIntType>.plus(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_68")
operator fun RA<ShortType>.plus(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_69")
operator fun RA<UnsignedShortType>.plus(that: RA<ShortType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_70")
operator fun RA<ShortType>.plus(that: RA<UnsignedByteType>): RA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_71")
operator fun RA<UnsignedByteType>.plus(that: RA<ShortType>): RA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_72")
operator fun RA<ByteType>.plus(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_73")
operator fun RA<UnsignedLongType>.plus(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_74")
operator fun RA<ByteType>.plus(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_75")
operator fun RA<UnsignedIntType>.plus(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_76")
operator fun RA<ByteType>.plus(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_77")
operator fun RA<UnsignedShortType>.plus(that: RA<ByteType>): RA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_78")
operator fun RA<ByteType>.plus(that: RA<UnsignedByteType>): RA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_79")
operator fun RA<UnsignedByteType>.plus(that: RA<ByteType>): RA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_80")
operator fun RA<UnsignedLongType>.plus(that: RA<UnsignedIntType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_81")
operator fun RA<UnsignedIntType>.plus(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_82")
operator fun RA<UnsignedLongType>.plus(that: RA<UnsignedShortType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_83")
operator fun RA<UnsignedShortType>.plus(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_84")
operator fun RA<UnsignedLongType>.plus(that: RA<UnsignedByteType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_85")
operator fun RA<UnsignedByteType>.plus(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_86")
operator fun RA<UnsignedIntType>.plus(that: RA<UnsignedShortType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_87")
operator fun RA<UnsignedShortType>.plus(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_88")
operator fun RA<UnsignedIntType>.plus(that: RA<UnsignedByteType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_89")
operator fun RA<UnsignedByteType>.plus(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_90")
operator fun RA<UnsignedShortType>.plus(that: RA<UnsignedByteType>): RA<UnsignedShortType> =
    this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "plus_91")
operator fun RA<UnsignedByteType>.plus(that: RA<UnsignedShortType>): RA<UnsignedShortType> =
    this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "plus_92")
operator fun RA<RealType<*>>.plus(that: RA<RealType<*>>): RA<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> this.asType(DoubleType()).plus(that.asType(DoubleType())) as RA<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> this.asType(DoubleType()).plus(that.asType(FloatType())) as RA<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> this.asType(FloatType()).plus(that.asType(DoubleType())) as RA<RealType<*>>
    this.type is FloatType && that.type is FloatType -> this.asType(FloatType()).plus(that.asType(FloatType())) as RA<RealType<*>>
    else -> error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}


@JvmName(name = "minus_1")
operator fun <T> RA<T>.minus(that: RA<T>): RA<T> where T : Type<T>, T : Sub<T> = convert(that, type)
    { t, u, v -> v.set(t); v -= u }

@JvmName(name = "minus_2")
operator fun RA<DoubleType>.minus(that: RA<FloatType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_3")
operator fun RA<FloatType>.minus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_4")
operator fun RA<DoubleType>.minus(that: RA<LongType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_5")
operator fun RA<LongType>.minus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_6")
operator fun RA<DoubleType>.minus(that: RA<IntType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_7")
operator fun RA<IntType>.minus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_8")
operator fun RA<DoubleType>.minus(that: RA<ShortType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_9")
operator fun RA<ShortType>.minus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_10")
operator fun RA<DoubleType>.minus(that: RA<ByteType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_11")
operator fun RA<ByteType>.minus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_12")
operator fun RA<DoubleType>.minus(that: RA<UnsignedLongType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_13")
operator fun RA<UnsignedLongType>.minus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_14")
operator fun RA<DoubleType>.minus(that: RA<UnsignedIntType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_15")
operator fun RA<UnsignedIntType>.minus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_16")
operator fun RA<DoubleType>.minus(that: RA<UnsignedShortType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_17")
operator fun RA<UnsignedShortType>.minus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_18")
operator fun RA<DoubleType>.minus(that: RA<UnsignedByteType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_19")
operator fun RA<UnsignedByteType>.minus(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_20")
operator fun RA<FloatType>.minus(that: RA<LongType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_21")
operator fun RA<LongType>.minus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_22")
operator fun RA<FloatType>.minus(that: RA<IntType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_23")
operator fun RA<IntType>.minus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_24")
operator fun RA<FloatType>.minus(that: RA<ShortType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_25")
operator fun RA<ShortType>.minus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_26")
operator fun RA<FloatType>.minus(that: RA<ByteType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_27")
operator fun RA<ByteType>.minus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_28")
operator fun RA<FloatType>.minus(that: RA<UnsignedLongType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_29")
operator fun RA<UnsignedLongType>.minus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_30")
operator fun RA<FloatType>.minus(that: RA<UnsignedIntType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_31")
operator fun RA<UnsignedIntType>.minus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_32")
operator fun RA<FloatType>.minus(that: RA<UnsignedShortType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_33")
operator fun RA<UnsignedShortType>.minus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_34")
operator fun RA<FloatType>.minus(that: RA<UnsignedByteType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_35")
operator fun RA<UnsignedByteType>.minus(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_36")
operator fun RA<LongType>.minus(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_37")
operator fun RA<IntType>.minus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_38")
operator fun RA<LongType>.minus(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_39")
operator fun RA<ShortType>.minus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_40")
operator fun RA<LongType>.minus(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_41")
operator fun RA<ByteType>.minus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_42")
operator fun RA<LongType>.minus(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_43")
operator fun RA<UnsignedLongType>.minus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_44")
operator fun RA<LongType>.minus(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_45")
operator fun RA<UnsignedIntType>.minus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_46")
operator fun RA<LongType>.minus(that: RA<UnsignedShortType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_47")
operator fun RA<UnsignedShortType>.minus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_48")
operator fun RA<LongType>.minus(that: RA<UnsignedByteType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_49")
operator fun RA<UnsignedByteType>.minus(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_50")
operator fun RA<IntType>.minus(that: RA<ShortType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_51")
operator fun RA<ShortType>.minus(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_52")
operator fun RA<IntType>.minus(that: RA<ByteType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_53")
operator fun RA<ByteType>.minus(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_54")
operator fun RA<IntType>.minus(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_55")
operator fun RA<UnsignedLongType>.minus(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_56")
operator fun RA<IntType>.minus(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_57")
operator fun RA<UnsignedIntType>.minus(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_58")
operator fun RA<IntType>.minus(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_59")
operator fun RA<UnsignedShortType>.minus(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_60")
operator fun RA<IntType>.minus(that: RA<UnsignedByteType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_61")
operator fun RA<UnsignedByteType>.minus(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_62")
operator fun RA<ShortType>.minus(that: RA<ByteType>): RA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_63")
operator fun RA<ByteType>.minus(that: RA<ShortType>): RA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_64")
operator fun RA<ShortType>.minus(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_65")
operator fun RA<UnsignedLongType>.minus(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_66")
operator fun RA<ShortType>.minus(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_67")
operator fun RA<UnsignedIntType>.minus(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_68")
operator fun RA<ShortType>.minus(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_69")
operator fun RA<UnsignedShortType>.minus(that: RA<ShortType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_70")
operator fun RA<ShortType>.minus(that: RA<UnsignedByteType>): RA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_71")
operator fun RA<UnsignedByteType>.minus(that: RA<ShortType>): RA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_72")
operator fun RA<ByteType>.minus(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_73")
operator fun RA<UnsignedLongType>.minus(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_74")
operator fun RA<ByteType>.minus(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_75")
operator fun RA<UnsignedIntType>.minus(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_76")
operator fun RA<ByteType>.minus(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_77")
operator fun RA<UnsignedShortType>.minus(that: RA<ByteType>): RA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_78")
operator fun RA<ByteType>.minus(that: RA<UnsignedByteType>): RA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_79")
operator fun RA<UnsignedByteType>.minus(that: RA<ByteType>): RA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_80")
operator fun RA<UnsignedLongType>.minus(that: RA<UnsignedIntType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_81")
operator fun RA<UnsignedIntType>.minus(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_82")
operator fun RA<UnsignedLongType>.minus(that: RA<UnsignedShortType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_83")
operator fun RA<UnsignedShortType>.minus(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_84")
operator fun RA<UnsignedLongType>.minus(that: RA<UnsignedByteType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_85")
operator fun RA<UnsignedByteType>.minus(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_86")
operator fun RA<UnsignedIntType>.minus(that: RA<UnsignedShortType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_87")
operator fun RA<UnsignedShortType>.minus(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_88")
operator fun RA<UnsignedIntType>.minus(that: RA<UnsignedByteType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_89")
operator fun RA<UnsignedByteType>.minus(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_90")
operator fun RA<UnsignedShortType>.minus(that: RA<UnsignedByteType>): RA<UnsignedShortType> =
    this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "minus_91")
operator fun RA<UnsignedByteType>.minus(that: RA<UnsignedShortType>): RA<UnsignedShortType> =
    this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "minus_92")
operator fun RA<RealType<*>>.minus(that: RA<RealType<*>>): RA<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> this.asType(DoubleType()).minus(that.asType(DoubleType())) as RA<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> this.asType(DoubleType()).minus(that.asType(FloatType())) as RA<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> this.asType(FloatType()).minus(that.asType(DoubleType())) as RA<RealType<*>>
    this.type is FloatType && that.type is FloatType -> this.asType(FloatType()).minus(that.asType(FloatType())) as RA<RealType<*>>
    else -> error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}


@JvmName(name = "times_1")
operator fun <T> RA<T>.times(that: RA<T>): RA<T> where T : Type<T>, T : Mul<T> = convert(that, type)
    { t, u, v -> v.set(t); v *= u }

@JvmName(name = "times_2")
operator fun RA<DoubleType>.times(that: RA<FloatType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_3")
operator fun RA<FloatType>.times(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_4")
operator fun RA<DoubleType>.times(that: RA<LongType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_5")
operator fun RA<LongType>.times(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_6")
operator fun RA<DoubleType>.times(that: RA<IntType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_7")
operator fun RA<IntType>.times(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_8")
operator fun RA<DoubleType>.times(that: RA<ShortType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_9")
operator fun RA<ShortType>.times(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_10")
operator fun RA<DoubleType>.times(that: RA<ByteType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_11")
operator fun RA<ByteType>.times(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_12")
operator fun RA<DoubleType>.times(that: RA<UnsignedLongType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_13")
operator fun RA<UnsignedLongType>.times(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_14")
operator fun RA<DoubleType>.times(that: RA<UnsignedIntType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_15")
operator fun RA<UnsignedIntType>.times(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_16")
operator fun RA<DoubleType>.times(that: RA<UnsignedShortType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_17")
operator fun RA<UnsignedShortType>.times(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_18")
operator fun RA<DoubleType>.times(that: RA<UnsignedByteType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_19")
operator fun RA<UnsignedByteType>.times(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_20")
operator fun RA<FloatType>.times(that: RA<LongType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_21")
operator fun RA<LongType>.times(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_22")
operator fun RA<FloatType>.times(that: RA<IntType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_23")
operator fun RA<IntType>.times(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_24")
operator fun RA<FloatType>.times(that: RA<ShortType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_25")
operator fun RA<ShortType>.times(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_26")
operator fun RA<FloatType>.times(that: RA<ByteType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_27")
operator fun RA<ByteType>.times(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_28")
operator fun RA<FloatType>.times(that: RA<UnsignedLongType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_29")
operator fun RA<UnsignedLongType>.times(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_30")
operator fun RA<FloatType>.times(that: RA<UnsignedIntType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_31")
operator fun RA<UnsignedIntType>.times(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_32")
operator fun RA<FloatType>.times(that: RA<UnsignedShortType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_33")
operator fun RA<UnsignedShortType>.times(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_34")
operator fun RA<FloatType>.times(that: RA<UnsignedByteType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_35")
operator fun RA<UnsignedByteType>.times(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_36")
operator fun RA<LongType>.times(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_37")
operator fun RA<IntType>.times(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_38")
operator fun RA<LongType>.times(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_39")
operator fun RA<ShortType>.times(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_40")
operator fun RA<LongType>.times(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_41")
operator fun RA<ByteType>.times(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_42")
operator fun RA<LongType>.times(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_43")
operator fun RA<UnsignedLongType>.times(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_44")
operator fun RA<LongType>.times(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_45")
operator fun RA<UnsignedIntType>.times(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_46")
operator fun RA<LongType>.times(that: RA<UnsignedShortType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_47")
operator fun RA<UnsignedShortType>.times(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_48")
operator fun RA<LongType>.times(that: RA<UnsignedByteType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_49")
operator fun RA<UnsignedByteType>.times(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_50")
operator fun RA<IntType>.times(that: RA<ShortType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_51")
operator fun RA<ShortType>.times(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_52")
operator fun RA<IntType>.times(that: RA<ByteType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_53")
operator fun RA<ByteType>.times(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_54")
operator fun RA<IntType>.times(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_55")
operator fun RA<UnsignedLongType>.times(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_56")
operator fun RA<IntType>.times(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_57")
operator fun RA<UnsignedIntType>.times(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_58")
operator fun RA<IntType>.times(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_59")
operator fun RA<UnsignedShortType>.times(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_60")
operator fun RA<IntType>.times(that: RA<UnsignedByteType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_61")
operator fun RA<UnsignedByteType>.times(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_62")
operator fun RA<ShortType>.times(that: RA<ByteType>): RA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_63")
operator fun RA<ByteType>.times(that: RA<ShortType>): RA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_64")
operator fun RA<ShortType>.times(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_65")
operator fun RA<UnsignedLongType>.times(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_66")
operator fun RA<ShortType>.times(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_67")
operator fun RA<UnsignedIntType>.times(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_68")
operator fun RA<ShortType>.times(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_69")
operator fun RA<UnsignedShortType>.times(that: RA<ShortType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_70")
operator fun RA<ShortType>.times(that: RA<UnsignedByteType>): RA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_71")
operator fun RA<UnsignedByteType>.times(that: RA<ShortType>): RA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_72")
operator fun RA<ByteType>.times(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_73")
operator fun RA<UnsignedLongType>.times(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_74")
operator fun RA<ByteType>.times(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_75")
operator fun RA<UnsignedIntType>.times(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_76")
operator fun RA<ByteType>.times(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_77")
operator fun RA<UnsignedShortType>.times(that: RA<ByteType>): RA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_78")
operator fun RA<ByteType>.times(that: RA<UnsignedByteType>): RA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_79")
operator fun RA<UnsignedByteType>.times(that: RA<ByteType>): RA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_80")
operator fun RA<UnsignedLongType>.times(that: RA<UnsignedIntType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_81")
operator fun RA<UnsignedIntType>.times(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_82")
operator fun RA<UnsignedLongType>.times(that: RA<UnsignedShortType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_83")
operator fun RA<UnsignedShortType>.times(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_84")
operator fun RA<UnsignedLongType>.times(that: RA<UnsignedByteType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_85")
operator fun RA<UnsignedByteType>.times(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_86")
operator fun RA<UnsignedIntType>.times(that: RA<UnsignedShortType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_87")
operator fun RA<UnsignedShortType>.times(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_88")
operator fun RA<UnsignedIntType>.times(that: RA<UnsignedByteType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_89")
operator fun RA<UnsignedByteType>.times(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_90")
operator fun RA<UnsignedShortType>.times(that: RA<UnsignedByteType>): RA<UnsignedShortType> =
    this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "times_91")
operator fun RA<UnsignedByteType>.times(that: RA<UnsignedShortType>): RA<UnsignedShortType> =
    this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "times_92")
operator fun RA<RealType<*>>.times(that: RA<RealType<*>>): RA<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> this.asType(DoubleType()).times(that.asType(DoubleType())) as RA<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> this.asType(DoubleType()).times(that.asType(FloatType())) as RA<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> this.asType(FloatType()).times(that.asType(DoubleType())) as RA<RealType<*>>
    this.type is FloatType && that.type is FloatType -> this.asType(FloatType()).times(that.asType(FloatType())) as RA<RealType<*>>
    else -> error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}


@JvmName(name = "div_1")
operator fun <T> RA<T>.div(that: RA<T>): RA<T> where T : Type<T>, T : Div<T> = convert(that, type) {
    t, u, v -> v.set(t); v /= u }

@JvmName(name = "div_2")
operator fun RA<DoubleType>.div(that: RA<FloatType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_3")
operator fun RA<FloatType>.div(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_4")
operator fun RA<DoubleType>.div(that: RA<LongType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_5")
operator fun RA<LongType>.div(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_6")
operator fun RA<DoubleType>.div(that: RA<IntType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_7")
operator fun RA<IntType>.div(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_8")
operator fun RA<DoubleType>.div(that: RA<ShortType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_9")
operator fun RA<ShortType>.div(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_10")
operator fun RA<DoubleType>.div(that: RA<ByteType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_11")
operator fun RA<ByteType>.div(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_12")
operator fun RA<DoubleType>.div(that: RA<UnsignedLongType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_13")
operator fun RA<UnsignedLongType>.div(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_14")
operator fun RA<DoubleType>.div(that: RA<UnsignedIntType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_15")
operator fun RA<UnsignedIntType>.div(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_16")
operator fun RA<DoubleType>.div(that: RA<UnsignedShortType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_17")
operator fun RA<UnsignedShortType>.div(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_18")
operator fun RA<DoubleType>.div(that: RA<UnsignedByteType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_19")
operator fun RA<UnsignedByteType>.div(that: RA<DoubleType>): RA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_20")
operator fun RA<FloatType>.div(that: RA<LongType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_21")
operator fun RA<LongType>.div(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_22")
operator fun RA<FloatType>.div(that: RA<IntType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_23")
operator fun RA<IntType>.div(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_24")
operator fun RA<FloatType>.div(that: RA<ShortType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_25")
operator fun RA<ShortType>.div(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_26")
operator fun RA<FloatType>.div(that: RA<ByteType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_27")
operator fun RA<ByteType>.div(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_28")
operator fun RA<FloatType>.div(that: RA<UnsignedLongType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_29")
operator fun RA<UnsignedLongType>.div(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_30")
operator fun RA<FloatType>.div(that: RA<UnsignedIntType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_31")
operator fun RA<UnsignedIntType>.div(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_32")
operator fun RA<FloatType>.div(that: RA<UnsignedShortType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_33")
operator fun RA<UnsignedShortType>.div(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_34")
operator fun RA<FloatType>.div(that: RA<UnsignedByteType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_35")
operator fun RA<UnsignedByteType>.div(that: RA<FloatType>): RA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_36")
operator fun RA<LongType>.div(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_37")
operator fun RA<IntType>.div(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_38")
operator fun RA<LongType>.div(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_39")
operator fun RA<ShortType>.div(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_40")
operator fun RA<LongType>.div(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_41")
operator fun RA<ByteType>.div(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_42")
operator fun RA<LongType>.div(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_43")
operator fun RA<UnsignedLongType>.div(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_44")
operator fun RA<LongType>.div(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_45")
operator fun RA<UnsignedIntType>.div(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_46")
operator fun RA<LongType>.div(that: RA<UnsignedShortType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_47")
operator fun RA<UnsignedShortType>.div(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_48")
operator fun RA<LongType>.div(that: RA<UnsignedByteType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_49")
operator fun RA<UnsignedByteType>.div(that: RA<LongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_50")
operator fun RA<IntType>.div(that: RA<ShortType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_51")
operator fun RA<ShortType>.div(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_52")
operator fun RA<IntType>.div(that: RA<ByteType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_53")
operator fun RA<ByteType>.div(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_54")
operator fun RA<IntType>.div(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_55")
operator fun RA<UnsignedLongType>.div(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_56")
operator fun RA<IntType>.div(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_57")
operator fun RA<UnsignedIntType>.div(that: RA<IntType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_58")
operator fun RA<IntType>.div(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_59")
operator fun RA<UnsignedShortType>.div(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_60")
operator fun RA<IntType>.div(that: RA<UnsignedByteType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_61")
operator fun RA<UnsignedByteType>.div(that: RA<IntType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_62")
operator fun RA<ShortType>.div(that: RA<ByteType>): RA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_63")
operator fun RA<ByteType>.div(that: RA<ShortType>): RA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_64")
operator fun RA<ShortType>.div(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_65")
operator fun RA<UnsignedLongType>.div(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_66")
operator fun RA<ShortType>.div(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_67")
operator fun RA<UnsignedIntType>.div(that: RA<ShortType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_68")
operator fun RA<ShortType>.div(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_69")
operator fun RA<UnsignedShortType>.div(that: RA<ShortType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_70")
operator fun RA<ShortType>.div(that: RA<UnsignedByteType>): RA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_71")
operator fun RA<UnsignedByteType>.div(that: RA<ShortType>): RA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_72")
operator fun RA<ByteType>.div(that: RA<UnsignedLongType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_73")
operator fun RA<UnsignedLongType>.div(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_74")
operator fun RA<ByteType>.div(that: RA<UnsignedIntType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_75")
operator fun RA<UnsignedIntType>.div(that: RA<ByteType>): RA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_76")
operator fun RA<ByteType>.div(that: RA<UnsignedShortType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_77")
operator fun RA<UnsignedShortType>.div(that: RA<ByteType>): RA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_78")
operator fun RA<ByteType>.div(that: RA<UnsignedByteType>): RA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_79")
operator fun RA<UnsignedByteType>.div(that: RA<ByteType>): RA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_80")
operator fun RA<UnsignedLongType>.div(that: RA<UnsignedIntType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_81")
operator fun RA<UnsignedIntType>.div(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_82")
operator fun RA<UnsignedLongType>.div(that: RA<UnsignedShortType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_83")
operator fun RA<UnsignedShortType>.div(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_84")
operator fun RA<UnsignedLongType>.div(that: RA<UnsignedByteType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_85")
operator fun RA<UnsignedByteType>.div(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_86")
operator fun RA<UnsignedIntType>.div(that: RA<UnsignedShortType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_87")
operator fun RA<UnsignedShortType>.div(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_88")
operator fun RA<UnsignedIntType>.div(that: RA<UnsignedByteType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_89")
operator fun RA<UnsignedByteType>.div(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_90")
operator fun RA<UnsignedShortType>.div(that: RA<UnsignedByteType>): RA<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())

@JvmName(name = "div_91")
operator fun RA<UnsignedByteType>.div(that: RA<UnsignedShortType>): RA<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())

@JvmName(name = "div_92")
operator fun RA<RealType<*>>.div(that: RA<RealType<*>>): RA<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> this.asType(DoubleType()).div(that.asType(DoubleType())) as RA<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> this.asType(DoubleType()).div(that.asType(FloatType())) as RA<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> this.asType(FloatType()).div(that.asType(DoubleType())) as RA<RealType<*>>
    this.type is FloatType && that.type is FloatType -> this.asType(FloatType()).div(that.asType(FloatType())) as RA<RealType<*>>
    else -> error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}

