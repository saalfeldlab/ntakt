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

@file:Suppress("UNCHECKED_CAST")

package net.imglib2.imklib

import kotlin.Suppress
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
import net.imglib2.type.operators.Sub
import net.imglib2.RealRandomAccessibleRealInterval as RRARI

operator fun <T : NumericType<T>> RRARI<T>.unaryMinus() =
    convert(type) { s, t -> t.set(s); t.mul(-1.0) }

@JvmName(name = "minus_1")
operator fun <T> RRARI<T>.minus(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Sub<T> {
  return convert(that, type, BiConverterMinus.instance<T>())
}

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
    this.type is DoubleType && that.type is DoubleType -> (this.asType(DoubleType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> (this.asType(DoubleType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is LongType -> (this.asType(DoubleType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is IntType -> (this.asType(DoubleType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is ShortType -> (this.asType(DoubleType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is ByteType -> (this.asType(DoubleType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedLongType -> (this.asType(DoubleType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedIntType -> (this.asType(DoubleType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedShortType -> (this.asType(DoubleType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedByteType -> (this.asType(DoubleType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> (this.asType(FloatType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is FloatType -> (this.asType(FloatType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is LongType -> (this.asType(FloatType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is IntType -> (this.asType(FloatType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is ShortType -> (this.asType(FloatType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is ByteType -> (this.asType(FloatType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedLongType -> (this.asType(FloatType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedIntType -> (this.asType(FloatType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedShortType -> (this.asType(FloatType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedByteType -> (this.asType(FloatType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is DoubleType -> (this.asType(LongType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is FloatType -> (this.asType(LongType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is LongType -> (this.asType(LongType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is IntType -> (this.asType(LongType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is ShortType -> (this.asType(LongType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is ByteType -> (this.asType(LongType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedLongType -> (this.asType(LongType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedIntType -> (this.asType(LongType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedShortType -> (this.asType(LongType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedByteType -> (this.asType(LongType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is DoubleType -> (this.asType(IntType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is FloatType -> (this.asType(IntType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is LongType -> (this.asType(IntType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is IntType -> (this.asType(IntType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is ShortType -> (this.asType(IntType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is ByteType -> (this.asType(IntType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedLongType -> (this.asType(IntType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedIntType -> (this.asType(IntType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedShortType -> (this.asType(IntType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedByteType -> (this.asType(IntType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is DoubleType -> (this.asType(ShortType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is FloatType -> (this.asType(ShortType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is LongType -> (this.asType(ShortType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is IntType -> (this.asType(ShortType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is ShortType -> (this.asType(ShortType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is ByteType -> (this.asType(ShortType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedLongType -> (this.asType(ShortType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedIntType -> (this.asType(ShortType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedShortType -> (this.asType(ShortType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedByteType -> (this.asType(ShortType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is DoubleType -> (this.asType(ByteType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is FloatType -> (this.asType(ByteType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is LongType -> (this.asType(ByteType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is IntType -> (this.asType(ByteType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is ShortType -> (this.asType(ByteType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is ByteType -> (this.asType(ByteType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedLongType -> (this.asType(ByteType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedIntType -> (this.asType(ByteType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedShortType -> (this.asType(ByteType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedByteType -> (this.asType(ByteType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is DoubleType -> (this.asType(UnsignedLongType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is FloatType -> (this.asType(UnsignedLongType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is LongType -> (this.asType(UnsignedLongType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is IntType -> (this.asType(UnsignedLongType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is ShortType -> (this.asType(UnsignedLongType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is ByteType -> (this.asType(UnsignedLongType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedLongType -> (this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedIntType -> (this.asType(UnsignedLongType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedShortType -> (this.asType(UnsignedLongType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedByteType -> (this.asType(UnsignedLongType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is DoubleType -> (this.asType(UnsignedIntType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is FloatType -> (this.asType(UnsignedIntType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is LongType -> (this.asType(UnsignedIntType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is IntType -> (this.asType(UnsignedIntType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is ShortType -> (this.asType(UnsignedIntType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is ByteType -> (this.asType(UnsignedIntType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedLongType -> (this.asType(UnsignedIntType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedIntType -> (this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedShortType -> (this.asType(UnsignedIntType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedByteType -> (this.asType(UnsignedIntType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is DoubleType -> (this.asType(UnsignedShortType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is FloatType -> (this.asType(UnsignedShortType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is LongType -> (this.asType(UnsignedShortType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is IntType -> (this.asType(UnsignedShortType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is ShortType -> (this.asType(UnsignedShortType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is ByteType -> (this.asType(UnsignedShortType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedLongType -> (this.asType(UnsignedShortType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedIntType -> (this.asType(UnsignedShortType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedShortType -> (this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedByteType -> (this.asType(UnsignedShortType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is DoubleType -> (this.asType(UnsignedByteType()) - that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is FloatType -> (this.asType(UnsignedByteType()) - that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is LongType -> (this.asType(UnsignedByteType()) - that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is IntType -> (this.asType(UnsignedByteType()) - that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is ShortType -> (this.asType(UnsignedByteType()) - that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is ByteType -> (this.asType(UnsignedByteType()) - that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedLongType -> (this.asType(UnsignedByteType()) - that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedIntType -> (this.asType(UnsignedByteType()) - that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedShortType -> (this.asType(UnsignedByteType()) - that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedByteType -> (this.asType(UnsignedByteType()) - that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    else -> error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}

