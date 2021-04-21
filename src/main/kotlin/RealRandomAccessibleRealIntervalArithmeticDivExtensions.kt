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

package org.ntakt

import kotlin.Suppress
import kotlin.jvm.JvmName
import net.imglib2.type.Type
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
import net.imglib2.type.operators.Div
import net.imglib2.RealRandomAccessibleRealInterval as RRARI

@JvmName(name = "div_1")
operator fun <T> RRARI<T>.div(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Div<T> {
  return convert(that, type, BiConverterDiv.instance<T>())
}

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
    this.type is DoubleType && that.type is DoubleType -> (this.asType(DoubleType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> (this.asType(DoubleType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is LongType -> (this.asType(DoubleType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is IntType -> (this.asType(DoubleType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is ShortType -> (this.asType(DoubleType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is ByteType -> (this.asType(DoubleType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedLongType -> (this.asType(DoubleType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedIntType -> (this.asType(DoubleType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedShortType -> (this.asType(DoubleType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedByteType -> (this.asType(DoubleType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> (this.asType(FloatType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is FloatType -> (this.asType(FloatType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is LongType -> (this.asType(FloatType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is IntType -> (this.asType(FloatType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is ShortType -> (this.asType(FloatType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is ByteType -> (this.asType(FloatType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedLongType -> (this.asType(FloatType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedIntType -> (this.asType(FloatType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedShortType -> (this.asType(FloatType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedByteType -> (this.asType(FloatType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is DoubleType -> (this.asType(LongType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is FloatType -> (this.asType(LongType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is LongType -> (this.asType(LongType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is IntType -> (this.asType(LongType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is ShortType -> (this.asType(LongType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is ByteType -> (this.asType(LongType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedLongType -> (this.asType(LongType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedIntType -> (this.asType(LongType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedShortType -> (this.asType(LongType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedByteType -> (this.asType(LongType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is DoubleType -> (this.asType(IntType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is FloatType -> (this.asType(IntType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is LongType -> (this.asType(IntType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is IntType -> (this.asType(IntType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is ShortType -> (this.asType(IntType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is ByteType -> (this.asType(IntType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedLongType -> (this.asType(IntType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedIntType -> (this.asType(IntType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedShortType -> (this.asType(IntType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedByteType -> (this.asType(IntType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is DoubleType -> (this.asType(ShortType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is FloatType -> (this.asType(ShortType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is LongType -> (this.asType(ShortType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is IntType -> (this.asType(ShortType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is ShortType -> (this.asType(ShortType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is ByteType -> (this.asType(ShortType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedLongType -> (this.asType(ShortType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedIntType -> (this.asType(ShortType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedShortType -> (this.asType(ShortType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedByteType -> (this.asType(ShortType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is DoubleType -> (this.asType(ByteType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is FloatType -> (this.asType(ByteType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is LongType -> (this.asType(ByteType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is IntType -> (this.asType(ByteType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is ShortType -> (this.asType(ByteType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is ByteType -> (this.asType(ByteType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedLongType -> (this.asType(ByteType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedIntType -> (this.asType(ByteType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedShortType -> (this.asType(ByteType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedByteType -> (this.asType(ByteType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is DoubleType -> (this.asType(UnsignedLongType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is FloatType -> (this.asType(UnsignedLongType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is LongType -> (this.asType(UnsignedLongType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is IntType -> (this.asType(UnsignedLongType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is ShortType -> (this.asType(UnsignedLongType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is ByteType -> (this.asType(UnsignedLongType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedLongType -> (this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedIntType -> (this.asType(UnsignedLongType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedShortType -> (this.asType(UnsignedLongType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedByteType -> (this.asType(UnsignedLongType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is DoubleType -> (this.asType(UnsignedIntType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is FloatType -> (this.asType(UnsignedIntType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is LongType -> (this.asType(UnsignedIntType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is IntType -> (this.asType(UnsignedIntType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is ShortType -> (this.asType(UnsignedIntType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is ByteType -> (this.asType(UnsignedIntType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedLongType -> (this.asType(UnsignedIntType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedIntType -> (this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedShortType -> (this.asType(UnsignedIntType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedByteType -> (this.asType(UnsignedIntType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is DoubleType -> (this.asType(UnsignedShortType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is FloatType -> (this.asType(UnsignedShortType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is LongType -> (this.asType(UnsignedShortType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is IntType -> (this.asType(UnsignedShortType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is ShortType -> (this.asType(UnsignedShortType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is ByteType -> (this.asType(UnsignedShortType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedLongType -> (this.asType(UnsignedShortType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedIntType -> (this.asType(UnsignedShortType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedShortType -> (this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedByteType -> (this.asType(UnsignedShortType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is DoubleType -> (this.asType(UnsignedByteType()) / that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is FloatType -> (this.asType(UnsignedByteType()) / that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is LongType -> (this.asType(UnsignedByteType()) / that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is IntType -> (this.asType(UnsignedByteType()) / that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is ShortType -> (this.asType(UnsignedByteType()) / that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is ByteType -> (this.asType(UnsignedByteType()) / that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedLongType -> (this.asType(UnsignedByteType()) / that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedIntType -> (this.asType(UnsignedByteType()) / that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedShortType -> (this.asType(UnsignedByteType()) / that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedByteType -> (this.asType(UnsignedByteType()) / that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    else -> error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${ntakt.types.realTypes.map { it::class }}.")
}

