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
import net.imglib2.type.operators.Mul
import net.imglib2.RealRandomAccessible as RRA

@JvmName(name = "times_1")
operator fun <T> RRA<T>.times(that: RRA<T>): RRA<T> where T : Type<T>, T : Mul<T> = convert(that,
    type) { t, u, v -> v.set(t); v *= u }

@JvmName(name = "times_2")
operator fun RRA<DoubleType>.times(that: RRA<FloatType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_3")
operator fun RRA<FloatType>.times(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_4")
operator fun RRA<DoubleType>.times(that: RRA<LongType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_5")
operator fun RRA<LongType>.times(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_6")
operator fun RRA<DoubleType>.times(that: RRA<IntType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_7")
operator fun RRA<IntType>.times(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_8")
operator fun RRA<DoubleType>.times(that: RRA<ShortType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_9")
operator fun RRA<ShortType>.times(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_10")
operator fun RRA<DoubleType>.times(that: RRA<ByteType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_11")
operator fun RRA<ByteType>.times(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_12")
operator fun RRA<DoubleType>.times(that: RRA<UnsignedLongType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_13")
operator fun RRA<UnsignedLongType>.times(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_14")
operator fun RRA<DoubleType>.times(that: RRA<UnsignedIntType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_15")
operator fun RRA<UnsignedIntType>.times(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_16")
operator fun RRA<DoubleType>.times(that: RRA<UnsignedShortType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_17")
operator fun RRA<UnsignedShortType>.times(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_18")
operator fun RRA<DoubleType>.times(that: RRA<UnsignedByteType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_19")
operator fun RRA<UnsignedByteType>.times(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_20")
operator fun RRA<FloatType>.times(that: RRA<LongType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_21")
operator fun RRA<LongType>.times(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_22")
operator fun RRA<FloatType>.times(that: RRA<IntType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_23")
operator fun RRA<IntType>.times(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_24")
operator fun RRA<FloatType>.times(that: RRA<ShortType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_25")
operator fun RRA<ShortType>.times(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_26")
operator fun RRA<FloatType>.times(that: RRA<ByteType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_27")
operator fun RRA<ByteType>.times(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_28")
operator fun RRA<FloatType>.times(that: RRA<UnsignedLongType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_29")
operator fun RRA<UnsignedLongType>.times(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_30")
operator fun RRA<FloatType>.times(that: RRA<UnsignedIntType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_31")
operator fun RRA<UnsignedIntType>.times(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_32")
operator fun RRA<FloatType>.times(that: RRA<UnsignedShortType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_33")
operator fun RRA<UnsignedShortType>.times(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_34")
operator fun RRA<FloatType>.times(that: RRA<UnsignedByteType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_35")
operator fun RRA<UnsignedByteType>.times(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_36")
operator fun RRA<LongType>.times(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_37")
operator fun RRA<IntType>.times(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_38")
operator fun RRA<LongType>.times(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_39")
operator fun RRA<ShortType>.times(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_40")
operator fun RRA<LongType>.times(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_41")
operator fun RRA<ByteType>.times(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_42")
operator fun RRA<LongType>.times(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_43")
operator fun RRA<UnsignedLongType>.times(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_44")
operator fun RRA<LongType>.times(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_45")
operator fun RRA<UnsignedIntType>.times(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_46")
operator fun RRA<LongType>.times(that: RRA<UnsignedShortType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_47")
operator fun RRA<UnsignedShortType>.times(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_48")
operator fun RRA<LongType>.times(that: RRA<UnsignedByteType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_49")
operator fun RRA<UnsignedByteType>.times(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_50")
operator fun RRA<IntType>.times(that: RRA<ShortType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_51")
operator fun RRA<ShortType>.times(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_52")
operator fun RRA<IntType>.times(that: RRA<ByteType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_53")
operator fun RRA<ByteType>.times(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_54")
operator fun RRA<IntType>.times(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_55")
operator fun RRA<UnsignedLongType>.times(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_56")
operator fun RRA<IntType>.times(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_57")
operator fun RRA<UnsignedIntType>.times(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_58")
operator fun RRA<IntType>.times(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_59")
operator fun RRA<UnsignedShortType>.times(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_60")
operator fun RRA<IntType>.times(that: RRA<UnsignedByteType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_61")
operator fun RRA<UnsignedByteType>.times(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_62")
operator fun RRA<ShortType>.times(that: RRA<ByteType>): RRA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_63")
operator fun RRA<ByteType>.times(that: RRA<ShortType>): RRA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_64")
operator fun RRA<ShortType>.times(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_65")
operator fun RRA<UnsignedLongType>.times(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_66")
operator fun RRA<ShortType>.times(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_67")
operator fun RRA<UnsignedIntType>.times(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_68")
operator fun RRA<ShortType>.times(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_69")
operator fun RRA<UnsignedShortType>.times(that: RRA<ShortType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_70")
operator fun RRA<ShortType>.times(that: RRA<UnsignedByteType>): RRA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_71")
operator fun RRA<UnsignedByteType>.times(that: RRA<ShortType>): RRA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_72")
operator fun RRA<ByteType>.times(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_73")
operator fun RRA<UnsignedLongType>.times(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_74")
operator fun RRA<ByteType>.times(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_75")
operator fun RRA<UnsignedIntType>.times(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_76")
operator fun RRA<ByteType>.times(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_77")
operator fun RRA<UnsignedShortType>.times(that: RRA<ByteType>): RRA<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_78")
operator fun RRA<ByteType>.times(that: RRA<UnsignedByteType>): RRA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_79")
operator fun RRA<UnsignedByteType>.times(that: RRA<ByteType>): RRA<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_80")
operator fun RRA<UnsignedLongType>.times(that: RRA<UnsignedIntType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_81")
operator fun RRA<UnsignedIntType>.times(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_82")
operator fun RRA<UnsignedLongType>.times(that: RRA<UnsignedShortType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_83")
operator fun RRA<UnsignedShortType>.times(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_84")
operator fun RRA<UnsignedLongType>.times(that: RRA<UnsignedByteType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_85")
operator fun RRA<UnsignedByteType>.times(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_86")
operator fun RRA<UnsignedIntType>.times(that: RRA<UnsignedShortType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_87")
operator fun RRA<UnsignedShortType>.times(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_88")
operator fun RRA<UnsignedIntType>.times(that: RRA<UnsignedByteType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_89")
operator fun RRA<UnsignedByteType>.times(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_90")
operator fun RRA<UnsignedShortType>.times(that: RRA<UnsignedByteType>): RRA<UnsignedShortType> =
    this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "times_91")
operator fun RRA<UnsignedByteType>.times(that: RRA<UnsignedShortType>): RRA<UnsignedShortType> =
    this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "times_92")
operator fun RRA<RealType<*>>.times(that: RRA<RealType<*>>): RRA<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> (this.asType(DoubleType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is LongType -> (this.asType(DoubleType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is IntType -> (this.asType(DoubleType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ShortType -> (this.asType(DoubleType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ByteType -> (this.asType(DoubleType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedLongType -> (this.asType(DoubleType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedIntType -> (this.asType(DoubleType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedShortType -> (this.asType(DoubleType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedByteType -> (this.asType(DoubleType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> (this.asType(FloatType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is LongType -> (this.asType(FloatType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is IntType -> (this.asType(FloatType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ShortType -> (this.asType(FloatType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ByteType -> (this.asType(FloatType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedLongType -> (this.asType(FloatType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedIntType -> (this.asType(FloatType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedShortType -> (this.asType(FloatType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedByteType -> (this.asType(FloatType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is DoubleType -> (this.asType(LongType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is LongType && that.type is FloatType -> (this.asType(LongType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is LongType && that.type is LongType -> (this.asType(LongType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is IntType -> (this.asType(LongType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ShortType -> (this.asType(LongType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ByteType -> (this.asType(LongType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedLongType -> (this.asType(LongType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedIntType -> (this.asType(LongType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedShortType -> (this.asType(LongType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedByteType -> (this.asType(LongType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is DoubleType -> (this.asType(IntType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is IntType && that.type is FloatType -> (this.asType(IntType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is IntType && that.type is LongType -> (this.asType(IntType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is IntType -> (this.asType(IntType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ShortType -> (this.asType(IntType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ByteType -> (this.asType(IntType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedLongType -> (this.asType(IntType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedIntType -> (this.asType(IntType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedShortType -> (this.asType(IntType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedByteType -> (this.asType(IntType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is DoubleType -> (this.asType(ShortType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is FloatType -> (this.asType(ShortType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is LongType -> (this.asType(ShortType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is IntType -> (this.asType(ShortType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ShortType -> (this.asType(ShortType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ByteType -> (this.asType(ShortType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedLongType -> (this.asType(ShortType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedIntType -> (this.asType(ShortType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedShortType -> (this.asType(ShortType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedByteType -> (this.asType(ShortType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is DoubleType -> (this.asType(ByteType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is FloatType -> (this.asType(ByteType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is LongType -> (this.asType(ByteType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is IntType -> (this.asType(ByteType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ShortType -> (this.asType(ByteType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ByteType -> (this.asType(ByteType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedLongType -> (this.asType(ByteType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedIntType -> (this.asType(ByteType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedShortType -> (this.asType(ByteType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedByteType -> (this.asType(ByteType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is DoubleType -> (this.asType(UnsignedLongType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is FloatType -> (this.asType(UnsignedLongType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is LongType -> (this.asType(UnsignedLongType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is IntType -> (this.asType(UnsignedLongType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ShortType -> (this.asType(UnsignedLongType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ByteType -> (this.asType(UnsignedLongType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedLongType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedIntType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedShortType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedByteType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is DoubleType -> (this.asType(UnsignedIntType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is FloatType -> (this.asType(UnsignedIntType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is LongType -> (this.asType(UnsignedIntType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is IntType -> (this.asType(UnsignedIntType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ShortType -> (this.asType(UnsignedIntType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ByteType -> (this.asType(UnsignedIntType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedLongType -> (this.asType(UnsignedIntType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedIntType -> (this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedShortType -> (this.asType(UnsignedIntType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedByteType -> (this.asType(UnsignedIntType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is DoubleType -> (this.asType(UnsignedShortType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is FloatType -> (this.asType(UnsignedShortType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is LongType -> (this.asType(UnsignedShortType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is IntType -> (this.asType(UnsignedShortType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ShortType -> (this.asType(UnsignedShortType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ByteType -> (this.asType(UnsignedShortType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedLongType -> (this.asType(UnsignedShortType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedIntType -> (this.asType(UnsignedShortType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedShortType -> (this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedByteType -> (this.asType(UnsignedShortType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is DoubleType -> (this.asType(UnsignedByteType()) * that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is FloatType -> (this.asType(UnsignedByteType()) * that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is LongType -> (this.asType(UnsignedByteType()) * that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is IntType -> (this.asType(UnsignedByteType()) * that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ShortType -> (this.asType(UnsignedByteType()) * that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ByteType -> (this.asType(UnsignedByteType()) * that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedLongType -> (this.asType(UnsignedByteType()) * that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedIntType -> (this.asType(UnsignedByteType()) * that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedShortType -> (this.asType(UnsignedByteType()) * that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedByteType -> (this.asType(UnsignedByteType()) * that.asType(UnsignedByteType())) as RRA<RealType<*>>
    else -> error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}

