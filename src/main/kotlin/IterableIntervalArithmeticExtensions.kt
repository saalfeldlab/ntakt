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
import net.imglib2.IterableInterval as II

operator fun <T : NumericType<T>> II<T>.unaryPlus() = this

operator fun <T : NumericType<T>> II<T>.unaryMinus() = convert(type) { s, t -> t.set(s); t.mul(-1.0)
    }

@JvmName(name = "plus_1")
operator fun <T> II<T>.plus(that: II<T>): II<T> where T : Type<T>, T : Add<T> = convert(that, type)
    { t, u, v -> v.set(t); v += u }

@JvmName(name = "plus_2")
operator fun II<DoubleType>.plus(that: II<FloatType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_3")
operator fun II<FloatType>.plus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_4")
operator fun II<DoubleType>.plus(that: II<LongType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_5")
operator fun II<LongType>.plus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_6")
operator fun II<DoubleType>.plus(that: II<IntType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_7")
operator fun II<IntType>.plus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_8")
operator fun II<DoubleType>.plus(that: II<ShortType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_9")
operator fun II<ShortType>.plus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_10")
operator fun II<DoubleType>.plus(that: II<ByteType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_11")
operator fun II<ByteType>.plus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_12")
operator fun II<DoubleType>.plus(that: II<UnsignedLongType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_13")
operator fun II<UnsignedLongType>.plus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_14")
operator fun II<DoubleType>.plus(that: II<UnsignedIntType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_15")
operator fun II<UnsignedIntType>.plus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_16")
operator fun II<DoubleType>.plus(that: II<UnsignedShortType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_17")
operator fun II<UnsignedShortType>.plus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_18")
operator fun II<DoubleType>.plus(that: II<UnsignedByteType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_19")
operator fun II<UnsignedByteType>.plus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_20")
operator fun II<FloatType>.plus(that: II<LongType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_21")
operator fun II<LongType>.plus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_22")
operator fun II<FloatType>.plus(that: II<IntType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_23")
operator fun II<IntType>.plus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_24")
operator fun II<FloatType>.plus(that: II<ShortType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_25")
operator fun II<ShortType>.plus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_26")
operator fun II<FloatType>.plus(that: II<ByteType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_27")
operator fun II<ByteType>.plus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_28")
operator fun II<FloatType>.plus(that: II<UnsignedLongType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_29")
operator fun II<UnsignedLongType>.plus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_30")
operator fun II<FloatType>.plus(that: II<UnsignedIntType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_31")
operator fun II<UnsignedIntType>.plus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_32")
operator fun II<FloatType>.plus(that: II<UnsignedShortType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_33")
operator fun II<UnsignedShortType>.plus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_34")
operator fun II<FloatType>.plus(that: II<UnsignedByteType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_35")
operator fun II<UnsignedByteType>.plus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_36")
operator fun II<LongType>.plus(that: II<IntType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_37")
operator fun II<IntType>.plus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_38")
operator fun II<LongType>.plus(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_39")
operator fun II<ShortType>.plus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_40")
operator fun II<LongType>.plus(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_41")
operator fun II<ByteType>.plus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_42")
operator fun II<LongType>.plus(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_43")
operator fun II<UnsignedLongType>.plus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_44")
operator fun II<LongType>.plus(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_45")
operator fun II<UnsignedIntType>.plus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_46")
operator fun II<LongType>.plus(that: II<UnsignedShortType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_47")
operator fun II<UnsignedShortType>.plus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_48")
operator fun II<LongType>.plus(that: II<UnsignedByteType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_49")
operator fun II<UnsignedByteType>.plus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_50")
operator fun II<IntType>.plus(that: II<ShortType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_51")
operator fun II<ShortType>.plus(that: II<IntType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_52")
operator fun II<IntType>.plus(that: II<ByteType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_53")
operator fun II<ByteType>.plus(that: II<IntType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_54")
operator fun II<IntType>.plus(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_55")
operator fun II<UnsignedLongType>.plus(that: II<IntType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_56")
operator fun II<IntType>.plus(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_57")
operator fun II<UnsignedIntType>.plus(that: II<IntType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_58")
operator fun II<IntType>.plus(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_59")
operator fun II<UnsignedShortType>.plus(that: II<IntType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_60")
operator fun II<IntType>.plus(that: II<UnsignedByteType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_61")
operator fun II<UnsignedByteType>.plus(that: II<IntType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_62")
operator fun II<ShortType>.plus(that: II<ByteType>): II<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_63")
operator fun II<ByteType>.plus(that: II<ShortType>): II<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_64")
operator fun II<ShortType>.plus(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_65")
operator fun II<UnsignedLongType>.plus(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_66")
operator fun II<ShortType>.plus(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_67")
operator fun II<UnsignedIntType>.plus(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_68")
operator fun II<ShortType>.plus(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_69")
operator fun II<UnsignedShortType>.plus(that: II<ShortType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_70")
operator fun II<ShortType>.plus(that: II<UnsignedByteType>): II<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_71")
operator fun II<UnsignedByteType>.plus(that: II<ShortType>): II<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_72")
operator fun II<ByteType>.plus(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_73")
operator fun II<UnsignedLongType>.plus(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_74")
operator fun II<ByteType>.plus(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_75")
operator fun II<UnsignedIntType>.plus(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_76")
operator fun II<ByteType>.plus(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_77")
operator fun II<UnsignedShortType>.plus(that: II<ByteType>): II<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_78")
operator fun II<ByteType>.plus(that: II<UnsignedByteType>): II<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_79")
operator fun II<UnsignedByteType>.plus(that: II<ByteType>): II<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_80")
operator fun II<UnsignedLongType>.plus(that: II<UnsignedIntType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_81")
operator fun II<UnsignedIntType>.plus(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_82")
operator fun II<UnsignedLongType>.plus(that: II<UnsignedShortType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_83")
operator fun II<UnsignedShortType>.plus(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_84")
operator fun II<UnsignedLongType>.plus(that: II<UnsignedByteType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_85")
operator fun II<UnsignedByteType>.plus(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_86")
operator fun II<UnsignedIntType>.plus(that: II<UnsignedShortType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_87")
operator fun II<UnsignedShortType>.plus(that: II<UnsignedIntType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_88")
operator fun II<UnsignedIntType>.plus(that: II<UnsignedByteType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_89")
operator fun II<UnsignedByteType>.plus(that: II<UnsignedIntType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_90")
operator fun II<UnsignedShortType>.plus(that: II<UnsignedByteType>): II<UnsignedShortType> =
    this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "plus_91")
operator fun II<UnsignedByteType>.plus(that: II<UnsignedShortType>): II<UnsignedShortType> =
    this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "minus_1")
operator fun <T> II<T>.minus(that: II<T>): II<T> where T : Type<T>, T : Sub<T> = convert(that, type)
    { t, u, v -> v.set(t); v -= u }

@JvmName(name = "minus_2")
operator fun II<DoubleType>.minus(that: II<FloatType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_3")
operator fun II<FloatType>.minus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_4")
operator fun II<DoubleType>.minus(that: II<LongType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_5")
operator fun II<LongType>.minus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_6")
operator fun II<DoubleType>.minus(that: II<IntType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_7")
operator fun II<IntType>.minus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_8")
operator fun II<DoubleType>.minus(that: II<ShortType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_9")
operator fun II<ShortType>.minus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_10")
operator fun II<DoubleType>.minus(that: II<ByteType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_11")
operator fun II<ByteType>.minus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_12")
operator fun II<DoubleType>.minus(that: II<UnsignedLongType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_13")
operator fun II<UnsignedLongType>.minus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_14")
operator fun II<DoubleType>.minus(that: II<UnsignedIntType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_15")
operator fun II<UnsignedIntType>.minus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_16")
operator fun II<DoubleType>.minus(that: II<UnsignedShortType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_17")
operator fun II<UnsignedShortType>.minus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_18")
operator fun II<DoubleType>.minus(that: II<UnsignedByteType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_19")
operator fun II<UnsignedByteType>.minus(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_20")
operator fun II<FloatType>.minus(that: II<LongType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_21")
operator fun II<LongType>.minus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_22")
operator fun II<FloatType>.minus(that: II<IntType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_23")
operator fun II<IntType>.minus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_24")
operator fun II<FloatType>.minus(that: II<ShortType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_25")
operator fun II<ShortType>.minus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_26")
operator fun II<FloatType>.minus(that: II<ByteType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_27")
operator fun II<ByteType>.minus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_28")
operator fun II<FloatType>.minus(that: II<UnsignedLongType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_29")
operator fun II<UnsignedLongType>.minus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_30")
operator fun II<FloatType>.minus(that: II<UnsignedIntType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_31")
operator fun II<UnsignedIntType>.minus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_32")
operator fun II<FloatType>.minus(that: II<UnsignedShortType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_33")
operator fun II<UnsignedShortType>.minus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_34")
operator fun II<FloatType>.minus(that: II<UnsignedByteType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_35")
operator fun II<UnsignedByteType>.minus(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_36")
operator fun II<LongType>.minus(that: II<IntType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_37")
operator fun II<IntType>.minus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_38")
operator fun II<LongType>.minus(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_39")
operator fun II<ShortType>.minus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_40")
operator fun II<LongType>.minus(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_41")
operator fun II<ByteType>.minus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_42")
operator fun II<LongType>.minus(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_43")
operator fun II<UnsignedLongType>.minus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_44")
operator fun II<LongType>.minus(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_45")
operator fun II<UnsignedIntType>.minus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_46")
operator fun II<LongType>.minus(that: II<UnsignedShortType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_47")
operator fun II<UnsignedShortType>.minus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_48")
operator fun II<LongType>.minus(that: II<UnsignedByteType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_49")
operator fun II<UnsignedByteType>.minus(that: II<LongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_50")
operator fun II<IntType>.minus(that: II<ShortType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_51")
operator fun II<ShortType>.minus(that: II<IntType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_52")
operator fun II<IntType>.minus(that: II<ByteType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_53")
operator fun II<ByteType>.minus(that: II<IntType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_54")
operator fun II<IntType>.minus(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_55")
operator fun II<UnsignedLongType>.minus(that: II<IntType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_56")
operator fun II<IntType>.minus(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_57")
operator fun II<UnsignedIntType>.minus(that: II<IntType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_58")
operator fun II<IntType>.minus(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_59")
operator fun II<UnsignedShortType>.minus(that: II<IntType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_60")
operator fun II<IntType>.minus(that: II<UnsignedByteType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_61")
operator fun II<UnsignedByteType>.minus(that: II<IntType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_62")
operator fun II<ShortType>.minus(that: II<ByteType>): II<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_63")
operator fun II<ByteType>.minus(that: II<ShortType>): II<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_64")
operator fun II<ShortType>.minus(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_65")
operator fun II<UnsignedLongType>.minus(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_66")
operator fun II<ShortType>.minus(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_67")
operator fun II<UnsignedIntType>.minus(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_68")
operator fun II<ShortType>.minus(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_69")
operator fun II<UnsignedShortType>.minus(that: II<ShortType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_70")
operator fun II<ShortType>.minus(that: II<UnsignedByteType>): II<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_71")
operator fun II<UnsignedByteType>.minus(that: II<ShortType>): II<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_72")
operator fun II<ByteType>.minus(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_73")
operator fun II<UnsignedLongType>.minus(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_74")
operator fun II<ByteType>.minus(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_75")
operator fun II<UnsignedIntType>.minus(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_76")
operator fun II<ByteType>.minus(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_77")
operator fun II<UnsignedShortType>.minus(that: II<ByteType>): II<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_78")
operator fun II<ByteType>.minus(that: II<UnsignedByteType>): II<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_79")
operator fun II<UnsignedByteType>.minus(that: II<ByteType>): II<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_80")
operator fun II<UnsignedLongType>.minus(that: II<UnsignedIntType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_81")
operator fun II<UnsignedIntType>.minus(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_82")
operator fun II<UnsignedLongType>.minus(that: II<UnsignedShortType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_83")
operator fun II<UnsignedShortType>.minus(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_84")
operator fun II<UnsignedLongType>.minus(that: II<UnsignedByteType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_85")
operator fun II<UnsignedByteType>.minus(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_86")
operator fun II<UnsignedIntType>.minus(that: II<UnsignedShortType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_87")
operator fun II<UnsignedShortType>.minus(that: II<UnsignedIntType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_88")
operator fun II<UnsignedIntType>.minus(that: II<UnsignedByteType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_89")
operator fun II<UnsignedByteType>.minus(that: II<UnsignedIntType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_90")
operator fun II<UnsignedShortType>.minus(that: II<UnsignedByteType>): II<UnsignedShortType> =
    this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "minus_91")
operator fun II<UnsignedByteType>.minus(that: II<UnsignedShortType>): II<UnsignedShortType> =
    this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "times_1")
operator fun <T> II<T>.times(that: II<T>): II<T> where T : Type<T>, T : Mul<T> = convert(that, type)
    { t, u, v -> v.set(t); v *= u }

@JvmName(name = "times_2")
operator fun II<DoubleType>.times(that: II<FloatType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_3")
operator fun II<FloatType>.times(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_4")
operator fun II<DoubleType>.times(that: II<LongType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_5")
operator fun II<LongType>.times(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_6")
operator fun II<DoubleType>.times(that: II<IntType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_7")
operator fun II<IntType>.times(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_8")
operator fun II<DoubleType>.times(that: II<ShortType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_9")
operator fun II<ShortType>.times(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_10")
operator fun II<DoubleType>.times(that: II<ByteType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_11")
operator fun II<ByteType>.times(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_12")
operator fun II<DoubleType>.times(that: II<UnsignedLongType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_13")
operator fun II<UnsignedLongType>.times(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_14")
operator fun II<DoubleType>.times(that: II<UnsignedIntType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_15")
operator fun II<UnsignedIntType>.times(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_16")
operator fun II<DoubleType>.times(that: II<UnsignedShortType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_17")
operator fun II<UnsignedShortType>.times(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_18")
operator fun II<DoubleType>.times(that: II<UnsignedByteType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_19")
operator fun II<UnsignedByteType>.times(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_20")
operator fun II<FloatType>.times(that: II<LongType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_21")
operator fun II<LongType>.times(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_22")
operator fun II<FloatType>.times(that: II<IntType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_23")
operator fun II<IntType>.times(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_24")
operator fun II<FloatType>.times(that: II<ShortType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_25")
operator fun II<ShortType>.times(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_26")
operator fun II<FloatType>.times(that: II<ByteType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_27")
operator fun II<ByteType>.times(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_28")
operator fun II<FloatType>.times(that: II<UnsignedLongType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_29")
operator fun II<UnsignedLongType>.times(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_30")
operator fun II<FloatType>.times(that: II<UnsignedIntType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_31")
operator fun II<UnsignedIntType>.times(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_32")
operator fun II<FloatType>.times(that: II<UnsignedShortType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_33")
operator fun II<UnsignedShortType>.times(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_34")
operator fun II<FloatType>.times(that: II<UnsignedByteType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_35")
operator fun II<UnsignedByteType>.times(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_36")
operator fun II<LongType>.times(that: II<IntType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_37")
operator fun II<IntType>.times(that: II<LongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_38")
operator fun II<LongType>.times(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_39")
operator fun II<ShortType>.times(that: II<LongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_40")
operator fun II<LongType>.times(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_41")
operator fun II<ByteType>.times(that: II<LongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_42")
operator fun II<LongType>.times(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_43")
operator fun II<UnsignedLongType>.times(that: II<LongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_44")
operator fun II<LongType>.times(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_45")
operator fun II<UnsignedIntType>.times(that: II<LongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_46")
operator fun II<LongType>.times(that: II<UnsignedShortType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_47")
operator fun II<UnsignedShortType>.times(that: II<LongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_48")
operator fun II<LongType>.times(that: II<UnsignedByteType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_49")
operator fun II<UnsignedByteType>.times(that: II<LongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_50")
operator fun II<IntType>.times(that: II<ShortType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_51")
operator fun II<ShortType>.times(that: II<IntType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_52")
operator fun II<IntType>.times(that: II<ByteType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_53")
operator fun II<ByteType>.times(that: II<IntType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_54")
operator fun II<IntType>.times(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_55")
operator fun II<UnsignedLongType>.times(that: II<IntType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_56")
operator fun II<IntType>.times(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_57")
operator fun II<UnsignedIntType>.times(that: II<IntType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_58")
operator fun II<IntType>.times(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_59")
operator fun II<UnsignedShortType>.times(that: II<IntType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_60")
operator fun II<IntType>.times(that: II<UnsignedByteType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_61")
operator fun II<UnsignedByteType>.times(that: II<IntType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_62")
operator fun II<ShortType>.times(that: II<ByteType>): II<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_63")
operator fun II<ByteType>.times(that: II<ShortType>): II<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_64")
operator fun II<ShortType>.times(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_65")
operator fun II<UnsignedLongType>.times(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_66")
operator fun II<ShortType>.times(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_67")
operator fun II<UnsignedIntType>.times(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_68")
operator fun II<ShortType>.times(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_69")
operator fun II<UnsignedShortType>.times(that: II<ShortType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_70")
operator fun II<ShortType>.times(that: II<UnsignedByteType>): II<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_71")
operator fun II<UnsignedByteType>.times(that: II<ShortType>): II<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_72")
operator fun II<ByteType>.times(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_73")
operator fun II<UnsignedLongType>.times(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_74")
operator fun II<ByteType>.times(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_75")
operator fun II<UnsignedIntType>.times(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_76")
operator fun II<ByteType>.times(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_77")
operator fun II<UnsignedShortType>.times(that: II<ByteType>): II<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_78")
operator fun II<ByteType>.times(that: II<UnsignedByteType>): II<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_79")
operator fun II<UnsignedByteType>.times(that: II<ByteType>): II<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_80")
operator fun II<UnsignedLongType>.times(that: II<UnsignedIntType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_81")
operator fun II<UnsignedIntType>.times(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_82")
operator fun II<UnsignedLongType>.times(that: II<UnsignedShortType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_83")
operator fun II<UnsignedShortType>.times(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_84")
operator fun II<UnsignedLongType>.times(that: II<UnsignedByteType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_85")
operator fun II<UnsignedByteType>.times(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_86")
operator fun II<UnsignedIntType>.times(that: II<UnsignedShortType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_87")
operator fun II<UnsignedShortType>.times(that: II<UnsignedIntType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_88")
operator fun II<UnsignedIntType>.times(that: II<UnsignedByteType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_89")
operator fun II<UnsignedByteType>.times(that: II<UnsignedIntType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_90")
operator fun II<UnsignedShortType>.times(that: II<UnsignedByteType>): II<UnsignedShortType> =
    this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "times_91")
operator fun II<UnsignedByteType>.times(that: II<UnsignedShortType>): II<UnsignedShortType> =
    this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "div_1")
operator fun <T> II<T>.div(that: II<T>): II<T> where T : Type<T>, T : Div<T> = convert(that, type) {
    t, u, v -> v.set(t); v /= u }

@JvmName(name = "div_2")
operator fun II<DoubleType>.div(that: II<FloatType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_3")
operator fun II<FloatType>.div(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_4")
operator fun II<DoubleType>.div(that: II<LongType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_5")
operator fun II<LongType>.div(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_6")
operator fun II<DoubleType>.div(that: II<IntType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_7")
operator fun II<IntType>.div(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_8")
operator fun II<DoubleType>.div(that: II<ShortType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_9")
operator fun II<ShortType>.div(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_10")
operator fun II<DoubleType>.div(that: II<ByteType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_11")
operator fun II<ByteType>.div(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_12")
operator fun II<DoubleType>.div(that: II<UnsignedLongType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_13")
operator fun II<UnsignedLongType>.div(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_14")
operator fun II<DoubleType>.div(that: II<UnsignedIntType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_15")
operator fun II<UnsignedIntType>.div(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_16")
operator fun II<DoubleType>.div(that: II<UnsignedShortType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_17")
operator fun II<UnsignedShortType>.div(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_18")
operator fun II<DoubleType>.div(that: II<UnsignedByteType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_19")
operator fun II<UnsignedByteType>.div(that: II<DoubleType>): II<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_20")
operator fun II<FloatType>.div(that: II<LongType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_21")
operator fun II<LongType>.div(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_22")
operator fun II<FloatType>.div(that: II<IntType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_23")
operator fun II<IntType>.div(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_24")
operator fun II<FloatType>.div(that: II<ShortType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_25")
operator fun II<ShortType>.div(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_26")
operator fun II<FloatType>.div(that: II<ByteType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_27")
operator fun II<ByteType>.div(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_28")
operator fun II<FloatType>.div(that: II<UnsignedLongType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_29")
operator fun II<UnsignedLongType>.div(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_30")
operator fun II<FloatType>.div(that: II<UnsignedIntType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_31")
operator fun II<UnsignedIntType>.div(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_32")
operator fun II<FloatType>.div(that: II<UnsignedShortType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_33")
operator fun II<UnsignedShortType>.div(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_34")
operator fun II<FloatType>.div(that: II<UnsignedByteType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_35")
operator fun II<UnsignedByteType>.div(that: II<FloatType>): II<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_36")
operator fun II<LongType>.div(that: II<IntType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_37")
operator fun II<IntType>.div(that: II<LongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_38")
operator fun II<LongType>.div(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_39")
operator fun II<ShortType>.div(that: II<LongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_40")
operator fun II<LongType>.div(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_41")
operator fun II<ByteType>.div(that: II<LongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_42")
operator fun II<LongType>.div(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_43")
operator fun II<UnsignedLongType>.div(that: II<LongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_44")
operator fun II<LongType>.div(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_45")
operator fun II<UnsignedIntType>.div(that: II<LongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_46")
operator fun II<LongType>.div(that: II<UnsignedShortType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_47")
operator fun II<UnsignedShortType>.div(that: II<LongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_48")
operator fun II<LongType>.div(that: II<UnsignedByteType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_49")
operator fun II<UnsignedByteType>.div(that: II<LongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_50")
operator fun II<IntType>.div(that: II<ShortType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_51")
operator fun II<ShortType>.div(that: II<IntType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_52")
operator fun II<IntType>.div(that: II<ByteType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_53")
operator fun II<ByteType>.div(that: II<IntType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_54")
operator fun II<IntType>.div(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_55")
operator fun II<UnsignedLongType>.div(that: II<IntType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_56")
operator fun II<IntType>.div(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_57")
operator fun II<UnsignedIntType>.div(that: II<IntType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_58")
operator fun II<IntType>.div(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_59")
operator fun II<UnsignedShortType>.div(that: II<IntType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_60")
operator fun II<IntType>.div(that: II<UnsignedByteType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_61")
operator fun II<UnsignedByteType>.div(that: II<IntType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_62")
operator fun II<ShortType>.div(that: II<ByteType>): II<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_63")
operator fun II<ByteType>.div(that: II<ShortType>): II<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_64")
operator fun II<ShortType>.div(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_65")
operator fun II<UnsignedLongType>.div(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_66")
operator fun II<ShortType>.div(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_67")
operator fun II<UnsignedIntType>.div(that: II<ShortType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_68")
operator fun II<ShortType>.div(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_69")
operator fun II<UnsignedShortType>.div(that: II<ShortType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_70")
operator fun II<ShortType>.div(that: II<UnsignedByteType>): II<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_71")
operator fun II<UnsignedByteType>.div(that: II<ShortType>): II<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_72")
operator fun II<ByteType>.div(that: II<UnsignedLongType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_73")
operator fun II<UnsignedLongType>.div(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_74")
operator fun II<ByteType>.div(that: II<UnsignedIntType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_75")
operator fun II<UnsignedIntType>.div(that: II<ByteType>): II<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_76")
operator fun II<ByteType>.div(that: II<UnsignedShortType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_77")
operator fun II<UnsignedShortType>.div(that: II<ByteType>): II<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_78")
operator fun II<ByteType>.div(that: II<UnsignedByteType>): II<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_79")
operator fun II<UnsignedByteType>.div(that: II<ByteType>): II<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_80")
operator fun II<UnsignedLongType>.div(that: II<UnsignedIntType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_81")
operator fun II<UnsignedIntType>.div(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_82")
operator fun II<UnsignedLongType>.div(that: II<UnsignedShortType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_83")
operator fun II<UnsignedShortType>.div(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_84")
operator fun II<UnsignedLongType>.div(that: II<UnsignedByteType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_85")
operator fun II<UnsignedByteType>.div(that: II<UnsignedLongType>): II<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_86")
operator fun II<UnsignedIntType>.div(that: II<UnsignedShortType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_87")
operator fun II<UnsignedShortType>.div(that: II<UnsignedIntType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_88")
operator fun II<UnsignedIntType>.div(that: II<UnsignedByteType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_89")
operator fun II<UnsignedByteType>.div(that: II<UnsignedIntType>): II<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_90")
operator fun II<UnsignedShortType>.div(that: II<UnsignedByteType>): II<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())

@JvmName(name = "div_91")
operator fun II<UnsignedByteType>.div(that: II<UnsignedShortType>): II<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())
