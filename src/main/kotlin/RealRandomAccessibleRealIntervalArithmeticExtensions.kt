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
import net.imglib2.RealRandomAccessibleRealInterval as RRARI

operator fun <T : NumericType<T>> RRARI<T>.unaryPlus() = this

operator fun <T : NumericType<T>> RRARI<T>.unaryMinus() =
    convert(type) { s, t -> t.set(s); t.mul(-1.0) }

@JvmName(name = "plus_1")
operator fun <T> RRARI<T>.plus(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Add<T> =
    convert(that, type) { t, u, v -> v.set(t); v += u }

@JvmName(name = "plus_2")
operator fun RRARI<DoubleType>.plus(that: RRARI<FloatType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_3")
operator fun RRARI<FloatType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_4")
operator fun RRARI<DoubleType>.plus(that: RRARI<LongType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_5")
operator fun RRARI<LongType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_6")
operator fun RRARI<DoubleType>.plus(that: RRARI<IntType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_7")
operator fun RRARI<IntType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_8")
operator fun RRARI<DoubleType>.plus(that: RRARI<ShortType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_9")
operator fun RRARI<ShortType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_10")
operator fun RRARI<DoubleType>.plus(that: RRARI<ByteType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_11")
operator fun RRARI<ByteType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_12")
operator fun RRARI<DoubleType>.plus(that: RRARI<UnsignedLongType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_13")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_14")
operator fun RRARI<DoubleType>.plus(that: RRARI<UnsignedIntType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_15")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_16")
operator fun RRARI<DoubleType>.plus(that: RRARI<UnsignedShortType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_17")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_18")
operator fun RRARI<DoubleType>.plus(that: RRARI<UnsignedByteType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_19")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_20")
operator fun RRARI<FloatType>.plus(that: RRARI<LongType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_21")
operator fun RRARI<LongType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_22")
operator fun RRARI<FloatType>.plus(that: RRARI<IntType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_23")
operator fun RRARI<IntType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_24")
operator fun RRARI<FloatType>.plus(that: RRARI<ShortType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_25")
operator fun RRARI<ShortType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_26")
operator fun RRARI<FloatType>.plus(that: RRARI<ByteType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_27")
operator fun RRARI<ByteType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_28")
operator fun RRARI<FloatType>.plus(that: RRARI<UnsignedLongType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_29")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_30")
operator fun RRARI<FloatType>.plus(that: RRARI<UnsignedIntType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_31")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_32")
operator fun RRARI<FloatType>.plus(that: RRARI<UnsignedShortType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_33")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_34")
operator fun RRARI<FloatType>.plus(that: RRARI<UnsignedByteType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_35")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_36")
operator fun RRARI<LongType>.plus(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_37")
operator fun RRARI<IntType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_38")
operator fun RRARI<LongType>.plus(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_39")
operator fun RRARI<ShortType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_40")
operator fun RRARI<LongType>.plus(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_41")
operator fun RRARI<ByteType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_42")
operator fun RRARI<LongType>.plus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_43")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_44")
operator fun RRARI<LongType>.plus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_45")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_46")
operator fun RRARI<LongType>.plus(that: RRARI<UnsignedShortType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_47")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_48")
operator fun RRARI<LongType>.plus(that: RRARI<UnsignedByteType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_49")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_50")
operator fun RRARI<IntType>.plus(that: RRARI<ShortType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_51")
operator fun RRARI<ShortType>.plus(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_52")
operator fun RRARI<IntType>.plus(that: RRARI<ByteType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_53")
operator fun RRARI<ByteType>.plus(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_54")
operator fun RRARI<IntType>.plus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_55")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_56")
operator fun RRARI<IntType>.plus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_57")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_58")
operator fun RRARI<IntType>.plus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_59")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_60")
operator fun RRARI<IntType>.plus(that: RRARI<UnsignedByteType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_61")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_62")
operator fun RRARI<ShortType>.plus(that: RRARI<ByteType>): RRARI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_63")
operator fun RRARI<ByteType>.plus(that: RRARI<ShortType>): RRARI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_64")
operator fun RRARI<ShortType>.plus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_65")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_66")
operator fun RRARI<ShortType>.plus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_67")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_68")
operator fun RRARI<ShortType>.plus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_69")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<ShortType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_70")
operator fun RRARI<ShortType>.plus(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_71")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<ShortType>): RRARI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_72")
operator fun RRARI<ByteType>.plus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_73")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_74")
operator fun RRARI<ByteType>.plus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_75")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_76")
operator fun RRARI<ByteType>.plus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_77")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<ByteType>): RRARI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_78")
operator fun RRARI<ByteType>.plus(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_79")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<ByteType>): RRARI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_80")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<UnsignedIntType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_81")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_82")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<UnsignedShortType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_83")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_84")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<UnsignedByteType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_85")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_86")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<UnsignedShortType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_87")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_88")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<UnsignedByteType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_89")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_90")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<UnsignedByteType>): RRARI<UnsignedShortType>
    = this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "plus_91")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<UnsignedShortType>): RRARI<UnsignedShortType>
    = this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "plus_92")
operator fun RRARI<RealType<*>>.plus(that: RRARI<RealType<*>>): RRARI<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> (this as RRARI<DoubleType>).plus(that as RRARI<DoubleType>) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> (this as RRARI<DoubleType>).plus(that as RRARI<FloatType>) as RRARI<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> (this as RRARI<FloatType>).plus(that as RRARI<DoubleType>) as RRARI<RealType<*>>
    this.type is FloatType && that.type is FloatType -> (this as RRARI<FloatType>).plus(that as RRARI<FloatType>) as RRARI<RealType<*>>
    else -> error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}


@JvmName(name = "minus_1")
operator fun <T> RRARI<T>.minus(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Sub<T> =
    convert(that, type) { t, u, v -> v.set(t); v -= u }

@JvmName(name = "minus_2")
operator fun RRARI<DoubleType>.minus(that: RRARI<FloatType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_3")
operator fun RRARI<FloatType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_4")
operator fun RRARI<DoubleType>.minus(that: RRARI<LongType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_5")
operator fun RRARI<LongType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_6")
operator fun RRARI<DoubleType>.minus(that: RRARI<IntType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_7")
operator fun RRARI<IntType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_8")
operator fun RRARI<DoubleType>.minus(that: RRARI<ShortType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_9")
operator fun RRARI<ShortType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_10")
operator fun RRARI<DoubleType>.minus(that: RRARI<ByteType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_11")
operator fun RRARI<ByteType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_12")
operator fun RRARI<DoubleType>.minus(that: RRARI<UnsignedLongType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_13")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_14")
operator fun RRARI<DoubleType>.minus(that: RRARI<UnsignedIntType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_15")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_16")
operator fun RRARI<DoubleType>.minus(that: RRARI<UnsignedShortType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_17")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_18")
operator fun RRARI<DoubleType>.minus(that: RRARI<UnsignedByteType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_19")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_20")
operator fun RRARI<FloatType>.minus(that: RRARI<LongType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_21")
operator fun RRARI<LongType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_22")
operator fun RRARI<FloatType>.minus(that: RRARI<IntType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_23")
operator fun RRARI<IntType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_24")
operator fun RRARI<FloatType>.minus(that: RRARI<ShortType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_25")
operator fun RRARI<ShortType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_26")
operator fun RRARI<FloatType>.minus(that: RRARI<ByteType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_27")
operator fun RRARI<ByteType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_28")
operator fun RRARI<FloatType>.minus(that: RRARI<UnsignedLongType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_29")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_30")
operator fun RRARI<FloatType>.minus(that: RRARI<UnsignedIntType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_31")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_32")
operator fun RRARI<FloatType>.minus(that: RRARI<UnsignedShortType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_33")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_34")
operator fun RRARI<FloatType>.minus(that: RRARI<UnsignedByteType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_35")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_36")
operator fun RRARI<LongType>.minus(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_37")
operator fun RRARI<IntType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_38")
operator fun RRARI<LongType>.minus(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_39")
operator fun RRARI<ShortType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_40")
operator fun RRARI<LongType>.minus(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_41")
operator fun RRARI<ByteType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_42")
operator fun RRARI<LongType>.minus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_43")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_44")
operator fun RRARI<LongType>.minus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_45")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_46")
operator fun RRARI<LongType>.minus(that: RRARI<UnsignedShortType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_47")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_48")
operator fun RRARI<LongType>.minus(that: RRARI<UnsignedByteType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_49")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_50")
operator fun RRARI<IntType>.minus(that: RRARI<ShortType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_51")
operator fun RRARI<ShortType>.minus(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_52")
operator fun RRARI<IntType>.minus(that: RRARI<ByteType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_53")
operator fun RRARI<ByteType>.minus(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_54")
operator fun RRARI<IntType>.minus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_55")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_56")
operator fun RRARI<IntType>.minus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_57")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_58")
operator fun RRARI<IntType>.minus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_59")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_60")
operator fun RRARI<IntType>.minus(that: RRARI<UnsignedByteType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_61")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_62")
operator fun RRARI<ShortType>.minus(that: RRARI<ByteType>): RRARI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_63")
operator fun RRARI<ByteType>.minus(that: RRARI<ShortType>): RRARI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_64")
operator fun RRARI<ShortType>.minus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_65")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_66")
operator fun RRARI<ShortType>.minus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_67")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_68")
operator fun RRARI<ShortType>.minus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_69")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<ShortType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_70")
operator fun RRARI<ShortType>.minus(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_71")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<ShortType>): RRARI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_72")
operator fun RRARI<ByteType>.minus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_73")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_74")
operator fun RRARI<ByteType>.minus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_75")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_76")
operator fun RRARI<ByteType>.minus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_77")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<ByteType>): RRARI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_78")
operator fun RRARI<ByteType>.minus(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_79")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<ByteType>): RRARI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_80")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<UnsignedIntType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_81")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_82")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<UnsignedShortType>): RRARI<UnsignedLongType>
    = this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_83")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType>
    = this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_84")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<UnsignedByteType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_85")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_86")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<UnsignedShortType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_87")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_88")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<UnsignedByteType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_89")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_90")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<UnsignedByteType>): RRARI<UnsignedShortType>
    = this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "minus_91")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<UnsignedShortType>): RRARI<UnsignedShortType>
    = this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "minus_92")
operator fun RRARI<RealType<*>>.minus(that: RRARI<RealType<*>>): RRARI<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> (this as RRARI<DoubleType>).minus(that as RRARI<DoubleType>) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> (this as RRARI<DoubleType>).minus(that as RRARI<FloatType>) as RRARI<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> (this as RRARI<FloatType>).minus(that as RRARI<DoubleType>) as RRARI<RealType<*>>
    this.type is FloatType && that.type is FloatType -> (this as RRARI<FloatType>).minus(that as RRARI<FloatType>) as RRARI<RealType<*>>
    else -> error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}


@JvmName(name = "times_1")
operator fun <T> RRARI<T>.times(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Mul<T> =
    convert(that, type) { t, u, v -> v.set(t); v *= u }

@JvmName(name = "times_2")
operator fun RRARI<DoubleType>.times(that: RRARI<FloatType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_3")
operator fun RRARI<FloatType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_4")
operator fun RRARI<DoubleType>.times(that: RRARI<LongType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_5")
operator fun RRARI<LongType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_6")
operator fun RRARI<DoubleType>.times(that: RRARI<IntType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_7")
operator fun RRARI<IntType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_8")
operator fun RRARI<DoubleType>.times(that: RRARI<ShortType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_9")
operator fun RRARI<ShortType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_10")
operator fun RRARI<DoubleType>.times(that: RRARI<ByteType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_11")
operator fun RRARI<ByteType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_12")
operator fun RRARI<DoubleType>.times(that: RRARI<UnsignedLongType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_13")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_14")
operator fun RRARI<DoubleType>.times(that: RRARI<UnsignedIntType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_15")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_16")
operator fun RRARI<DoubleType>.times(that: RRARI<UnsignedShortType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_17")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_18")
operator fun RRARI<DoubleType>.times(that: RRARI<UnsignedByteType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_19")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_20")
operator fun RRARI<FloatType>.times(that: RRARI<LongType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_21")
operator fun RRARI<LongType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_22")
operator fun RRARI<FloatType>.times(that: RRARI<IntType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_23")
operator fun RRARI<IntType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_24")
operator fun RRARI<FloatType>.times(that: RRARI<ShortType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_25")
operator fun RRARI<ShortType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_26")
operator fun RRARI<FloatType>.times(that: RRARI<ByteType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_27")
operator fun RRARI<ByteType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_28")
operator fun RRARI<FloatType>.times(that: RRARI<UnsignedLongType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_29")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_30")
operator fun RRARI<FloatType>.times(that: RRARI<UnsignedIntType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_31")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_32")
operator fun RRARI<FloatType>.times(that: RRARI<UnsignedShortType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_33")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_34")
operator fun RRARI<FloatType>.times(that: RRARI<UnsignedByteType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_35")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_36")
operator fun RRARI<LongType>.times(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_37")
operator fun RRARI<IntType>.times(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_38")
operator fun RRARI<LongType>.times(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_39")
operator fun RRARI<ShortType>.times(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_40")
operator fun RRARI<LongType>.times(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_41")
operator fun RRARI<ByteType>.times(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_42")
operator fun RRARI<LongType>.times(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_43")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_44")
operator fun RRARI<LongType>.times(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_45")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_46")
operator fun RRARI<LongType>.times(that: RRARI<UnsignedShortType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_47")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_48")
operator fun RRARI<LongType>.times(that: RRARI<UnsignedByteType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_49")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_50")
operator fun RRARI<IntType>.times(that: RRARI<ShortType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_51")
operator fun RRARI<ShortType>.times(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_52")
operator fun RRARI<IntType>.times(that: RRARI<ByteType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_53")
operator fun RRARI<ByteType>.times(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_54")
operator fun RRARI<IntType>.times(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_55")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_56")
operator fun RRARI<IntType>.times(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_57")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_58")
operator fun RRARI<IntType>.times(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_59")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_60")
operator fun RRARI<IntType>.times(that: RRARI<UnsignedByteType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_61")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_62")
operator fun RRARI<ShortType>.times(that: RRARI<ByteType>): RRARI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_63")
operator fun RRARI<ByteType>.times(that: RRARI<ShortType>): RRARI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_64")
operator fun RRARI<ShortType>.times(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_65")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_66")
operator fun RRARI<ShortType>.times(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_67")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_68")
operator fun RRARI<ShortType>.times(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_69")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<ShortType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_70")
operator fun RRARI<ShortType>.times(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_71")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<ShortType>): RRARI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_72")
operator fun RRARI<ByteType>.times(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_73")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_74")
operator fun RRARI<ByteType>.times(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_75")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_76")
operator fun RRARI<ByteType>.times(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_77")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<ByteType>): RRARI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_78")
operator fun RRARI<ByteType>.times(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_79")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<ByteType>): RRARI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_80")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<UnsignedIntType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_81")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_82")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<UnsignedShortType>): RRARI<UnsignedLongType>
    = this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_83")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType>
    = this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_84")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<UnsignedByteType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_85")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_86")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<UnsignedShortType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_87")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_88")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<UnsignedByteType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_89")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_90")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<UnsignedByteType>): RRARI<UnsignedShortType>
    = this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "times_91")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<UnsignedShortType>): RRARI<UnsignedShortType>
    = this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "times_92")
operator fun RRARI<RealType<*>>.times(that: RRARI<RealType<*>>): RRARI<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> (this as RRARI<DoubleType>).times(that as RRARI<DoubleType>) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> (this as RRARI<DoubleType>).times(that as RRARI<FloatType>) as RRARI<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> (this as RRARI<FloatType>).times(that as RRARI<DoubleType>) as RRARI<RealType<*>>
    this.type is FloatType && that.type is FloatType -> (this as RRARI<FloatType>).times(that as RRARI<FloatType>) as RRARI<RealType<*>>
    else -> error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}


@JvmName(name = "div_1")
operator fun <T> RRARI<T>.div(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Div<T> =
    convert(that, type) { t, u, v -> v.set(t); v /= u }

@JvmName(name = "div_2")
operator fun RRARI<DoubleType>.div(that: RRARI<FloatType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_3")
operator fun RRARI<FloatType>.div(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_4")
operator fun RRARI<DoubleType>.div(that: RRARI<LongType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_5")
operator fun RRARI<LongType>.div(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_6")
operator fun RRARI<DoubleType>.div(that: RRARI<IntType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_7")
operator fun RRARI<IntType>.div(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_8")
operator fun RRARI<DoubleType>.div(that: RRARI<ShortType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_9")
operator fun RRARI<ShortType>.div(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_10")
operator fun RRARI<DoubleType>.div(that: RRARI<ByteType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_11")
operator fun RRARI<ByteType>.div(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_12")
operator fun RRARI<DoubleType>.div(that: RRARI<UnsignedLongType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_13")
operator fun RRARI<UnsignedLongType>.div(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_14")
operator fun RRARI<DoubleType>.div(that: RRARI<UnsignedIntType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_15")
operator fun RRARI<UnsignedIntType>.div(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_16")
operator fun RRARI<DoubleType>.div(that: RRARI<UnsignedShortType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_17")
operator fun RRARI<UnsignedShortType>.div(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_18")
operator fun RRARI<DoubleType>.div(that: RRARI<UnsignedByteType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_19")
operator fun RRARI<UnsignedByteType>.div(that: RRARI<DoubleType>): RRARI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_20")
operator fun RRARI<FloatType>.div(that: RRARI<LongType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_21")
operator fun RRARI<LongType>.div(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_22")
operator fun RRARI<FloatType>.div(that: RRARI<IntType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_23")
operator fun RRARI<IntType>.div(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_24")
operator fun RRARI<FloatType>.div(that: RRARI<ShortType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_25")
operator fun RRARI<ShortType>.div(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_26")
operator fun RRARI<FloatType>.div(that: RRARI<ByteType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_27")
operator fun RRARI<ByteType>.div(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_28")
operator fun RRARI<FloatType>.div(that: RRARI<UnsignedLongType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_29")
operator fun RRARI<UnsignedLongType>.div(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_30")
operator fun RRARI<FloatType>.div(that: RRARI<UnsignedIntType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_31")
operator fun RRARI<UnsignedIntType>.div(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_32")
operator fun RRARI<FloatType>.div(that: RRARI<UnsignedShortType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_33")
operator fun RRARI<UnsignedShortType>.div(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_34")
operator fun RRARI<FloatType>.div(that: RRARI<UnsignedByteType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_35")
operator fun RRARI<UnsignedByteType>.div(that: RRARI<FloatType>): RRARI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_36")
operator fun RRARI<LongType>.div(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_37")
operator fun RRARI<IntType>.div(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_38")
operator fun RRARI<LongType>.div(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_39")
operator fun RRARI<ShortType>.div(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_40")
operator fun RRARI<LongType>.div(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_41")
operator fun RRARI<ByteType>.div(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_42")
operator fun RRARI<LongType>.div(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_43")
operator fun RRARI<UnsignedLongType>.div(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_44")
operator fun RRARI<LongType>.div(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_45")
operator fun RRARI<UnsignedIntType>.div(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_46")
operator fun RRARI<LongType>.div(that: RRARI<UnsignedShortType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_47")
operator fun RRARI<UnsignedShortType>.div(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_48")
operator fun RRARI<LongType>.div(that: RRARI<UnsignedByteType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_49")
operator fun RRARI<UnsignedByteType>.div(that: RRARI<LongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_50")
operator fun RRARI<IntType>.div(that: RRARI<ShortType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_51")
operator fun RRARI<ShortType>.div(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_52")
operator fun RRARI<IntType>.div(that: RRARI<ByteType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_53")
operator fun RRARI<ByteType>.div(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_54")
operator fun RRARI<IntType>.div(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_55")
operator fun RRARI<UnsignedLongType>.div(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_56")
operator fun RRARI<IntType>.div(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_57")
operator fun RRARI<UnsignedIntType>.div(that: RRARI<IntType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_58")
operator fun RRARI<IntType>.div(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_59")
operator fun RRARI<UnsignedShortType>.div(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_60")
operator fun RRARI<IntType>.div(that: RRARI<UnsignedByteType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_61")
operator fun RRARI<UnsignedByteType>.div(that: RRARI<IntType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_62")
operator fun RRARI<ShortType>.div(that: RRARI<ByteType>): RRARI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_63")
operator fun RRARI<ByteType>.div(that: RRARI<ShortType>): RRARI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_64")
operator fun RRARI<ShortType>.div(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_65")
operator fun RRARI<UnsignedLongType>.div(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_66")
operator fun RRARI<ShortType>.div(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_67")
operator fun RRARI<UnsignedIntType>.div(that: RRARI<ShortType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_68")
operator fun RRARI<ShortType>.div(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_69")
operator fun RRARI<UnsignedShortType>.div(that: RRARI<ShortType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_70")
operator fun RRARI<ShortType>.div(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_71")
operator fun RRARI<UnsignedByteType>.div(that: RRARI<ShortType>): RRARI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_72")
operator fun RRARI<ByteType>.div(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_73")
operator fun RRARI<UnsignedLongType>.div(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_74")
operator fun RRARI<ByteType>.div(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_75")
operator fun RRARI<UnsignedIntType>.div(that: RRARI<ByteType>): RRARI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_76")
operator fun RRARI<ByteType>.div(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_77")
operator fun RRARI<UnsignedShortType>.div(that: RRARI<ByteType>): RRARI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_78")
operator fun RRARI<ByteType>.div(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_79")
operator fun RRARI<UnsignedByteType>.div(that: RRARI<ByteType>): RRARI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_80")
operator fun RRARI<UnsignedLongType>.div(that: RRARI<UnsignedIntType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_81")
operator fun RRARI<UnsignedIntType>.div(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_82")
operator fun RRARI<UnsignedLongType>.div(that: RRARI<UnsignedShortType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_83")
operator fun RRARI<UnsignedShortType>.div(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_84")
operator fun RRARI<UnsignedLongType>.div(that: RRARI<UnsignedByteType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_85")
operator fun RRARI<UnsignedByteType>.div(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_86")
operator fun RRARI<UnsignedIntType>.div(that: RRARI<UnsignedShortType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_87")
operator fun RRARI<UnsignedShortType>.div(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_88")
operator fun RRARI<UnsignedIntType>.div(that: RRARI<UnsignedByteType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_89")
operator fun RRARI<UnsignedByteType>.div(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_90")
operator fun RRARI<UnsignedShortType>.div(that: RRARI<UnsignedByteType>): RRARI<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())

@JvmName(name = "div_91")
operator fun RRARI<UnsignedByteType>.div(that: RRARI<UnsignedShortType>): RRARI<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())

@JvmName(name = "div_92")
operator fun RRARI<RealType<*>>.div(that: RRARI<RealType<*>>): RRARI<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> (this as RRARI<DoubleType>).div(that as RRARI<DoubleType>) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> (this as RRARI<DoubleType>).div(that as RRARI<FloatType>) as RRARI<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> (this as RRARI<FloatType>).div(that as RRARI<DoubleType>) as RRARI<RealType<*>>
    this.type is FloatType && that.type is FloatType -> (this as RRARI<FloatType>).div(that as RRARI<FloatType>) as RRARI<RealType<*>>
    else -> error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}

