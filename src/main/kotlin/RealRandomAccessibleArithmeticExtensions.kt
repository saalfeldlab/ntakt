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
import net.imglib2.RealRandomAccessible as RRA

operator fun <T : NumericType<T>> RRA<T>.unaryPlus() = this

operator fun <T : NumericType<T>> RRA<T>.unaryMinus() =
    convert(type) { s, t -> t.set(s); t.mul(-1.0) }

@JvmName(name = "plus_1")
operator fun <T> RRA<T>.plus(that: RRA<T>): RRA<T> where T : Type<T>, T : Add<T> = convert(that,
    type) { t, u, v -> v.set(t); v += u }

@JvmName(name = "plus_2")
operator fun RRA<DoubleType>.plus(that: RRA<FloatType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_3")
operator fun RRA<FloatType>.plus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_4")
operator fun RRA<DoubleType>.plus(that: RRA<LongType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_5")
operator fun RRA<LongType>.plus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_6")
operator fun RRA<DoubleType>.plus(that: RRA<IntType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_7")
operator fun RRA<IntType>.plus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_8")
operator fun RRA<DoubleType>.plus(that: RRA<ShortType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_9")
operator fun RRA<ShortType>.plus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_10")
operator fun RRA<DoubleType>.plus(that: RRA<ByteType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_11")
operator fun RRA<ByteType>.plus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_12")
operator fun RRA<DoubleType>.plus(that: RRA<UnsignedLongType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_13")
operator fun RRA<UnsignedLongType>.plus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_14")
operator fun RRA<DoubleType>.plus(that: RRA<UnsignedIntType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_15")
operator fun RRA<UnsignedIntType>.plus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_16")
operator fun RRA<DoubleType>.plus(that: RRA<UnsignedShortType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_17")
operator fun RRA<UnsignedShortType>.plus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_18")
operator fun RRA<DoubleType>.plus(that: RRA<UnsignedByteType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_19")
operator fun RRA<UnsignedByteType>.plus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_20")
operator fun RRA<FloatType>.plus(that: RRA<LongType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_21")
operator fun RRA<LongType>.plus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_22")
operator fun RRA<FloatType>.plus(that: RRA<IntType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_23")
operator fun RRA<IntType>.plus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_24")
operator fun RRA<FloatType>.plus(that: RRA<ShortType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_25")
operator fun RRA<ShortType>.plus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_26")
operator fun RRA<FloatType>.plus(that: RRA<ByteType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_27")
operator fun RRA<ByteType>.plus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_28")
operator fun RRA<FloatType>.plus(that: RRA<UnsignedLongType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_29")
operator fun RRA<UnsignedLongType>.plus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_30")
operator fun RRA<FloatType>.plus(that: RRA<UnsignedIntType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_31")
operator fun RRA<UnsignedIntType>.plus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_32")
operator fun RRA<FloatType>.plus(that: RRA<UnsignedShortType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_33")
operator fun RRA<UnsignedShortType>.plus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_34")
operator fun RRA<FloatType>.plus(that: RRA<UnsignedByteType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_35")
operator fun RRA<UnsignedByteType>.plus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_36")
operator fun RRA<LongType>.plus(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_37")
operator fun RRA<IntType>.plus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_38")
operator fun RRA<LongType>.plus(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_39")
operator fun RRA<ShortType>.plus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_40")
operator fun RRA<LongType>.plus(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_41")
operator fun RRA<ByteType>.plus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_42")
operator fun RRA<LongType>.plus(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_43")
operator fun RRA<UnsignedLongType>.plus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_44")
operator fun RRA<LongType>.plus(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_45")
operator fun RRA<UnsignedIntType>.plus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_46")
operator fun RRA<LongType>.plus(that: RRA<UnsignedShortType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_47")
operator fun RRA<UnsignedShortType>.plus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_48")
operator fun RRA<LongType>.plus(that: RRA<UnsignedByteType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_49")
operator fun RRA<UnsignedByteType>.plus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_50")
operator fun RRA<IntType>.plus(that: RRA<ShortType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_51")
operator fun RRA<ShortType>.plus(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_52")
operator fun RRA<IntType>.plus(that: RRA<ByteType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_53")
operator fun RRA<ByteType>.plus(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_54")
operator fun RRA<IntType>.plus(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_55")
operator fun RRA<UnsignedLongType>.plus(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_56")
operator fun RRA<IntType>.plus(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_57")
operator fun RRA<UnsignedIntType>.plus(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_58")
operator fun RRA<IntType>.plus(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_59")
operator fun RRA<UnsignedShortType>.plus(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_60")
operator fun RRA<IntType>.plus(that: RRA<UnsignedByteType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_61")
operator fun RRA<UnsignedByteType>.plus(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_62")
operator fun RRA<ShortType>.plus(that: RRA<ByteType>): RRA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_63")
operator fun RRA<ByteType>.plus(that: RRA<ShortType>): RRA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_64")
operator fun RRA<ShortType>.plus(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_65")
operator fun RRA<UnsignedLongType>.plus(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_66")
operator fun RRA<ShortType>.plus(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_67")
operator fun RRA<UnsignedIntType>.plus(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_68")
operator fun RRA<ShortType>.plus(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_69")
operator fun RRA<UnsignedShortType>.plus(that: RRA<ShortType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_70")
operator fun RRA<ShortType>.plus(that: RRA<UnsignedByteType>): RRA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_71")
operator fun RRA<UnsignedByteType>.plus(that: RRA<ShortType>): RRA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_72")
operator fun RRA<ByteType>.plus(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_73")
operator fun RRA<UnsignedLongType>.plus(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_74")
operator fun RRA<ByteType>.plus(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_75")
operator fun RRA<UnsignedIntType>.plus(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_76")
operator fun RRA<ByteType>.plus(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_77")
operator fun RRA<UnsignedShortType>.plus(that: RRA<ByteType>): RRA<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_78")
operator fun RRA<ByteType>.plus(that: RRA<UnsignedByteType>): RRA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_79")
operator fun RRA<UnsignedByteType>.plus(that: RRA<ByteType>): RRA<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_80")
operator fun RRA<UnsignedLongType>.plus(that: RRA<UnsignedIntType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_81")
operator fun RRA<UnsignedIntType>.plus(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_82")
operator fun RRA<UnsignedLongType>.plus(that: RRA<UnsignedShortType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_83")
operator fun RRA<UnsignedShortType>.plus(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_84")
operator fun RRA<UnsignedLongType>.plus(that: RRA<UnsignedByteType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_85")
operator fun RRA<UnsignedByteType>.plus(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_86")
operator fun RRA<UnsignedIntType>.plus(that: RRA<UnsignedShortType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_87")
operator fun RRA<UnsignedShortType>.plus(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_88")
operator fun RRA<UnsignedIntType>.plus(that: RRA<UnsignedByteType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_89")
operator fun RRA<UnsignedByteType>.plus(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_90")
operator fun RRA<UnsignedShortType>.plus(that: RRA<UnsignedByteType>): RRA<UnsignedShortType> =
    this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "plus_91")
operator fun RRA<UnsignedByteType>.plus(that: RRA<UnsignedShortType>): RRA<UnsignedShortType> =
    this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "plus_92")
operator fun RRA<RealType<*>>.plus(that: RRA<RealType<*>>): RRA<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> this.asType(DoubleType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> this.asType(DoubleType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is LongType -> this.asType(DoubleType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is IntType -> this.asType(DoubleType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ShortType -> this.asType(DoubleType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ByteType -> this.asType(DoubleType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedLongType -> this.asType(DoubleType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedIntType -> this.asType(DoubleType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedShortType -> this.asType(DoubleType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedByteType -> this.asType(DoubleType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> this.asType(FloatType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is FloatType -> this.asType(FloatType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is LongType -> this.asType(FloatType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is IntType -> this.asType(FloatType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ShortType -> this.asType(FloatType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ByteType -> this.asType(FloatType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedLongType -> this.asType(FloatType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedIntType -> this.asType(FloatType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedShortType -> this.asType(FloatType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedByteType -> this.asType(FloatType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is DoubleType -> this.asType(LongType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is LongType && that.type is FloatType -> this.asType(LongType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is LongType && that.type is LongType -> this.asType(LongType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is IntType -> this.asType(LongType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ShortType -> this.asType(LongType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ByteType -> this.asType(LongType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedLongType -> this.asType(LongType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedIntType -> this.asType(LongType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedShortType -> this.asType(LongType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedByteType -> this.asType(LongType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is DoubleType -> this.asType(IntType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is IntType && that.type is FloatType -> this.asType(IntType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is IntType && that.type is LongType -> this.asType(IntType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is IntType -> this.asType(IntType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ShortType -> this.asType(IntType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ByteType -> this.asType(IntType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedLongType -> this.asType(IntType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedIntType -> this.asType(IntType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedShortType -> this.asType(IntType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedByteType -> this.asType(IntType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is DoubleType -> this.asType(ShortType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is FloatType -> this.asType(ShortType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is LongType -> this.asType(ShortType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is IntType -> this.asType(ShortType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ShortType -> this.asType(ShortType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ByteType -> this.asType(ShortType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedLongType -> this.asType(ShortType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedIntType -> this.asType(ShortType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedShortType -> this.asType(ShortType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedByteType -> this.asType(ShortType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is DoubleType -> this.asType(ByteType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is FloatType -> this.asType(ByteType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is LongType -> this.asType(ByteType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is IntType -> this.asType(ByteType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ShortType -> this.asType(ByteType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ByteType -> this.asType(ByteType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedLongType -> this.asType(ByteType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedIntType -> this.asType(ByteType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedShortType -> this.asType(ByteType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedByteType -> this.asType(ByteType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is DoubleType -> this.asType(UnsignedLongType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is FloatType -> this.asType(UnsignedLongType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is LongType -> this.asType(UnsignedLongType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is IntType -> this.asType(UnsignedLongType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ShortType -> this.asType(UnsignedLongType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ByteType -> this.asType(UnsignedLongType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedLongType -> this.asType(UnsignedLongType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedIntType -> this.asType(UnsignedLongType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedShortType -> this.asType(UnsignedLongType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedByteType -> this.asType(UnsignedLongType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is DoubleType -> this.asType(UnsignedIntType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is FloatType -> this.asType(UnsignedIntType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is LongType -> this.asType(UnsignedIntType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is IntType -> this.asType(UnsignedIntType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ShortType -> this.asType(UnsignedIntType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ByteType -> this.asType(UnsignedIntType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedLongType -> this.asType(UnsignedIntType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedIntType -> this.asType(UnsignedIntType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedShortType -> this.asType(UnsignedIntType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedByteType -> this.asType(UnsignedIntType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is DoubleType -> this.asType(UnsignedShortType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is FloatType -> this.asType(UnsignedShortType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is LongType -> this.asType(UnsignedShortType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is IntType -> this.asType(UnsignedShortType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ShortType -> this.asType(UnsignedShortType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ByteType -> this.asType(UnsignedShortType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedLongType -> this.asType(UnsignedShortType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedIntType -> this.asType(UnsignedShortType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedShortType -> this.asType(UnsignedShortType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedByteType -> this.asType(UnsignedShortType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is DoubleType -> this.asType(UnsignedByteType()).plus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is FloatType -> this.asType(UnsignedByteType()).plus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is LongType -> this.asType(UnsignedByteType()).plus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is IntType -> this.asType(UnsignedByteType()).plus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ShortType -> this.asType(UnsignedByteType()).plus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ByteType -> this.asType(UnsignedByteType()).plus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedLongType -> this.asType(UnsignedByteType()).plus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedIntType -> this.asType(UnsignedByteType()).plus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedShortType -> this.asType(UnsignedByteType()).plus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedByteType -> this.asType(UnsignedByteType()).plus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    else -> error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}


@JvmName(name = "minus_1")
operator fun <T> RRA<T>.minus(that: RRA<T>): RRA<T> where T : Type<T>, T : Sub<T> = convert(that,
    type) { t, u, v -> v.set(t); v -= u }

@JvmName(name = "minus_2")
operator fun RRA<DoubleType>.minus(that: RRA<FloatType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_3")
operator fun RRA<FloatType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_4")
operator fun RRA<DoubleType>.minus(that: RRA<LongType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_5")
operator fun RRA<LongType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_6")
operator fun RRA<DoubleType>.minus(that: RRA<IntType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_7")
operator fun RRA<IntType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_8")
operator fun RRA<DoubleType>.minus(that: RRA<ShortType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_9")
operator fun RRA<ShortType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_10")
operator fun RRA<DoubleType>.minus(that: RRA<ByteType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_11")
operator fun RRA<ByteType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_12")
operator fun RRA<DoubleType>.minus(that: RRA<UnsignedLongType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_13")
operator fun RRA<UnsignedLongType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_14")
operator fun RRA<DoubleType>.minus(that: RRA<UnsignedIntType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_15")
operator fun RRA<UnsignedIntType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_16")
operator fun RRA<DoubleType>.minus(that: RRA<UnsignedShortType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_17")
operator fun RRA<UnsignedShortType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_18")
operator fun RRA<DoubleType>.minus(that: RRA<UnsignedByteType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_19")
operator fun RRA<UnsignedByteType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_20")
operator fun RRA<FloatType>.minus(that: RRA<LongType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_21")
operator fun RRA<LongType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_22")
operator fun RRA<FloatType>.minus(that: RRA<IntType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_23")
operator fun RRA<IntType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_24")
operator fun RRA<FloatType>.minus(that: RRA<ShortType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_25")
operator fun RRA<ShortType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_26")
operator fun RRA<FloatType>.minus(that: RRA<ByteType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_27")
operator fun RRA<ByteType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_28")
operator fun RRA<FloatType>.minus(that: RRA<UnsignedLongType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_29")
operator fun RRA<UnsignedLongType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_30")
operator fun RRA<FloatType>.minus(that: RRA<UnsignedIntType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_31")
operator fun RRA<UnsignedIntType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_32")
operator fun RRA<FloatType>.minus(that: RRA<UnsignedShortType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_33")
operator fun RRA<UnsignedShortType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_34")
operator fun RRA<FloatType>.minus(that: RRA<UnsignedByteType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_35")
operator fun RRA<UnsignedByteType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_36")
operator fun RRA<LongType>.minus(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_37")
operator fun RRA<IntType>.minus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_38")
operator fun RRA<LongType>.minus(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_39")
operator fun RRA<ShortType>.minus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_40")
operator fun RRA<LongType>.minus(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_41")
operator fun RRA<ByteType>.minus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_42")
operator fun RRA<LongType>.minus(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_43")
operator fun RRA<UnsignedLongType>.minus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_44")
operator fun RRA<LongType>.minus(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_45")
operator fun RRA<UnsignedIntType>.minus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_46")
operator fun RRA<LongType>.minus(that: RRA<UnsignedShortType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_47")
operator fun RRA<UnsignedShortType>.minus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_48")
operator fun RRA<LongType>.minus(that: RRA<UnsignedByteType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_49")
operator fun RRA<UnsignedByteType>.minus(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_50")
operator fun RRA<IntType>.minus(that: RRA<ShortType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_51")
operator fun RRA<ShortType>.minus(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_52")
operator fun RRA<IntType>.minus(that: RRA<ByteType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_53")
operator fun RRA<ByteType>.minus(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_54")
operator fun RRA<IntType>.minus(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_55")
operator fun RRA<UnsignedLongType>.minus(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_56")
operator fun RRA<IntType>.minus(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_57")
operator fun RRA<UnsignedIntType>.minus(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_58")
operator fun RRA<IntType>.minus(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_59")
operator fun RRA<UnsignedShortType>.minus(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_60")
operator fun RRA<IntType>.minus(that: RRA<UnsignedByteType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_61")
operator fun RRA<UnsignedByteType>.minus(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_62")
operator fun RRA<ShortType>.minus(that: RRA<ByteType>): RRA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_63")
operator fun RRA<ByteType>.minus(that: RRA<ShortType>): RRA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_64")
operator fun RRA<ShortType>.minus(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_65")
operator fun RRA<UnsignedLongType>.minus(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_66")
operator fun RRA<ShortType>.minus(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_67")
operator fun RRA<UnsignedIntType>.minus(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_68")
operator fun RRA<ShortType>.minus(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_69")
operator fun RRA<UnsignedShortType>.minus(that: RRA<ShortType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_70")
operator fun RRA<ShortType>.minus(that: RRA<UnsignedByteType>): RRA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_71")
operator fun RRA<UnsignedByteType>.minus(that: RRA<ShortType>): RRA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_72")
operator fun RRA<ByteType>.minus(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_73")
operator fun RRA<UnsignedLongType>.minus(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_74")
operator fun RRA<ByteType>.minus(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_75")
operator fun RRA<UnsignedIntType>.minus(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_76")
operator fun RRA<ByteType>.minus(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_77")
operator fun RRA<UnsignedShortType>.minus(that: RRA<ByteType>): RRA<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_78")
operator fun RRA<ByteType>.minus(that: RRA<UnsignedByteType>): RRA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_79")
operator fun RRA<UnsignedByteType>.minus(that: RRA<ByteType>): RRA<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_80")
operator fun RRA<UnsignedLongType>.minus(that: RRA<UnsignedIntType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_81")
operator fun RRA<UnsignedIntType>.minus(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_82")
operator fun RRA<UnsignedLongType>.minus(that: RRA<UnsignedShortType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_83")
operator fun RRA<UnsignedShortType>.minus(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_84")
operator fun RRA<UnsignedLongType>.minus(that: RRA<UnsignedByteType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_85")
operator fun RRA<UnsignedByteType>.minus(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_86")
operator fun RRA<UnsignedIntType>.minus(that: RRA<UnsignedShortType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_87")
operator fun RRA<UnsignedShortType>.minus(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_88")
operator fun RRA<UnsignedIntType>.minus(that: RRA<UnsignedByteType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_89")
operator fun RRA<UnsignedByteType>.minus(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_90")
operator fun RRA<UnsignedShortType>.minus(that: RRA<UnsignedByteType>): RRA<UnsignedShortType> =
    this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "minus_91")
operator fun RRA<UnsignedByteType>.minus(that: RRA<UnsignedShortType>): RRA<UnsignedShortType> =
    this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "minus_92")
operator fun RRA<RealType<*>>.minus(that: RRA<RealType<*>>): RRA<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> this.asType(DoubleType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> this.asType(DoubleType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is LongType -> this.asType(DoubleType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is IntType -> this.asType(DoubleType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ShortType -> this.asType(DoubleType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ByteType -> this.asType(DoubleType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedLongType -> this.asType(DoubleType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedIntType -> this.asType(DoubleType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedShortType -> this.asType(DoubleType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedByteType -> this.asType(DoubleType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> this.asType(FloatType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is FloatType -> this.asType(FloatType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is LongType -> this.asType(FloatType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is IntType -> this.asType(FloatType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ShortType -> this.asType(FloatType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ByteType -> this.asType(FloatType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedLongType -> this.asType(FloatType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedIntType -> this.asType(FloatType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedShortType -> this.asType(FloatType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedByteType -> this.asType(FloatType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is DoubleType -> this.asType(LongType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is LongType && that.type is FloatType -> this.asType(LongType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is LongType && that.type is LongType -> this.asType(LongType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is IntType -> this.asType(LongType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ShortType -> this.asType(LongType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ByteType -> this.asType(LongType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedLongType -> this.asType(LongType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedIntType -> this.asType(LongType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedShortType -> this.asType(LongType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedByteType -> this.asType(LongType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is DoubleType -> this.asType(IntType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is IntType && that.type is FloatType -> this.asType(IntType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is IntType && that.type is LongType -> this.asType(IntType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is IntType -> this.asType(IntType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ShortType -> this.asType(IntType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ByteType -> this.asType(IntType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedLongType -> this.asType(IntType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedIntType -> this.asType(IntType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedShortType -> this.asType(IntType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedByteType -> this.asType(IntType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is DoubleType -> this.asType(ShortType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is FloatType -> this.asType(ShortType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is LongType -> this.asType(ShortType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is IntType -> this.asType(ShortType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ShortType -> this.asType(ShortType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ByteType -> this.asType(ShortType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedLongType -> this.asType(ShortType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedIntType -> this.asType(ShortType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedShortType -> this.asType(ShortType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedByteType -> this.asType(ShortType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is DoubleType -> this.asType(ByteType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is FloatType -> this.asType(ByteType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is LongType -> this.asType(ByteType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is IntType -> this.asType(ByteType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ShortType -> this.asType(ByteType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ByteType -> this.asType(ByteType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedLongType -> this.asType(ByteType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedIntType -> this.asType(ByteType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedShortType -> this.asType(ByteType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedByteType -> this.asType(ByteType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is DoubleType -> this.asType(UnsignedLongType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is FloatType -> this.asType(UnsignedLongType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is LongType -> this.asType(UnsignedLongType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is IntType -> this.asType(UnsignedLongType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ShortType -> this.asType(UnsignedLongType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ByteType -> this.asType(UnsignedLongType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedLongType -> this.asType(UnsignedLongType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedIntType -> this.asType(UnsignedLongType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedShortType -> this.asType(UnsignedLongType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedByteType -> this.asType(UnsignedLongType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is DoubleType -> this.asType(UnsignedIntType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is FloatType -> this.asType(UnsignedIntType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is LongType -> this.asType(UnsignedIntType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is IntType -> this.asType(UnsignedIntType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ShortType -> this.asType(UnsignedIntType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ByteType -> this.asType(UnsignedIntType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedLongType -> this.asType(UnsignedIntType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedIntType -> this.asType(UnsignedIntType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedShortType -> this.asType(UnsignedIntType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedByteType -> this.asType(UnsignedIntType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is DoubleType -> this.asType(UnsignedShortType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is FloatType -> this.asType(UnsignedShortType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is LongType -> this.asType(UnsignedShortType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is IntType -> this.asType(UnsignedShortType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ShortType -> this.asType(UnsignedShortType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ByteType -> this.asType(UnsignedShortType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedLongType -> this.asType(UnsignedShortType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedIntType -> this.asType(UnsignedShortType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedShortType -> this.asType(UnsignedShortType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedByteType -> this.asType(UnsignedShortType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is DoubleType -> this.asType(UnsignedByteType()).minus(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is FloatType -> this.asType(UnsignedByteType()).minus(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is LongType -> this.asType(UnsignedByteType()).minus(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is IntType -> this.asType(UnsignedByteType()).minus(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ShortType -> this.asType(UnsignedByteType()).minus(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ByteType -> this.asType(UnsignedByteType()).minus(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedLongType -> this.asType(UnsignedByteType()).minus(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedIntType -> this.asType(UnsignedByteType()).minus(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedShortType -> this.asType(UnsignedByteType()).minus(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedByteType -> this.asType(UnsignedByteType()).minus(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    else -> error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}


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
    this.type is DoubleType && that.type is DoubleType -> this.asType(DoubleType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> this.asType(DoubleType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is LongType -> this.asType(DoubleType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is IntType -> this.asType(DoubleType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ShortType -> this.asType(DoubleType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ByteType -> this.asType(DoubleType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedLongType -> this.asType(DoubleType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedIntType -> this.asType(DoubleType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedShortType -> this.asType(DoubleType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedByteType -> this.asType(DoubleType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> this.asType(FloatType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is FloatType -> this.asType(FloatType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is LongType -> this.asType(FloatType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is IntType -> this.asType(FloatType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ShortType -> this.asType(FloatType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ByteType -> this.asType(FloatType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedLongType -> this.asType(FloatType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedIntType -> this.asType(FloatType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedShortType -> this.asType(FloatType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedByteType -> this.asType(FloatType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is DoubleType -> this.asType(LongType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is LongType && that.type is FloatType -> this.asType(LongType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is LongType && that.type is LongType -> this.asType(LongType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is IntType -> this.asType(LongType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ShortType -> this.asType(LongType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ByteType -> this.asType(LongType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedLongType -> this.asType(LongType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedIntType -> this.asType(LongType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedShortType -> this.asType(LongType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedByteType -> this.asType(LongType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is DoubleType -> this.asType(IntType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is IntType && that.type is FloatType -> this.asType(IntType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is IntType && that.type is LongType -> this.asType(IntType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is IntType -> this.asType(IntType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ShortType -> this.asType(IntType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ByteType -> this.asType(IntType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedLongType -> this.asType(IntType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedIntType -> this.asType(IntType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedShortType -> this.asType(IntType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedByteType -> this.asType(IntType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is DoubleType -> this.asType(ShortType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is FloatType -> this.asType(ShortType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is LongType -> this.asType(ShortType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is IntType -> this.asType(ShortType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ShortType -> this.asType(ShortType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ByteType -> this.asType(ShortType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedLongType -> this.asType(ShortType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedIntType -> this.asType(ShortType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedShortType -> this.asType(ShortType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedByteType -> this.asType(ShortType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is DoubleType -> this.asType(ByteType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is FloatType -> this.asType(ByteType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is LongType -> this.asType(ByteType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is IntType -> this.asType(ByteType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ShortType -> this.asType(ByteType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ByteType -> this.asType(ByteType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedLongType -> this.asType(ByteType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedIntType -> this.asType(ByteType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedShortType -> this.asType(ByteType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedByteType -> this.asType(ByteType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is DoubleType -> this.asType(UnsignedLongType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is FloatType -> this.asType(UnsignedLongType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is LongType -> this.asType(UnsignedLongType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is IntType -> this.asType(UnsignedLongType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ShortType -> this.asType(UnsignedLongType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ByteType -> this.asType(UnsignedLongType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedLongType -> this.asType(UnsignedLongType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedIntType -> this.asType(UnsignedLongType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedShortType -> this.asType(UnsignedLongType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedByteType -> this.asType(UnsignedLongType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is DoubleType -> this.asType(UnsignedIntType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is FloatType -> this.asType(UnsignedIntType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is LongType -> this.asType(UnsignedIntType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is IntType -> this.asType(UnsignedIntType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ShortType -> this.asType(UnsignedIntType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ByteType -> this.asType(UnsignedIntType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedLongType -> this.asType(UnsignedIntType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedIntType -> this.asType(UnsignedIntType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedShortType -> this.asType(UnsignedIntType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedByteType -> this.asType(UnsignedIntType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is DoubleType -> this.asType(UnsignedShortType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is FloatType -> this.asType(UnsignedShortType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is LongType -> this.asType(UnsignedShortType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is IntType -> this.asType(UnsignedShortType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ShortType -> this.asType(UnsignedShortType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ByteType -> this.asType(UnsignedShortType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedLongType -> this.asType(UnsignedShortType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedIntType -> this.asType(UnsignedShortType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedShortType -> this.asType(UnsignedShortType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedByteType -> this.asType(UnsignedShortType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is DoubleType -> this.asType(UnsignedByteType()).times(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is FloatType -> this.asType(UnsignedByteType()).times(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is LongType -> this.asType(UnsignedByteType()).times(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is IntType -> this.asType(UnsignedByteType()).times(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ShortType -> this.asType(UnsignedByteType()).times(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ByteType -> this.asType(UnsignedByteType()).times(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedLongType -> this.asType(UnsignedByteType()).times(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedIntType -> this.asType(UnsignedByteType()).times(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedShortType -> this.asType(UnsignedByteType()).times(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedByteType -> this.asType(UnsignedByteType()).times(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    else -> error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}


@JvmName(name = "div_1")
operator fun <T> RRA<T>.div(that: RRA<T>): RRA<T> where T : Type<T>, T : Div<T> = convert(that,
    type) { t, u, v -> v.set(t); v /= u }

@JvmName(name = "div_2")
operator fun RRA<DoubleType>.div(that: RRA<FloatType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_3")
operator fun RRA<FloatType>.div(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_4")
operator fun RRA<DoubleType>.div(that: RRA<LongType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_5")
operator fun RRA<LongType>.div(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_6")
operator fun RRA<DoubleType>.div(that: RRA<IntType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_7")
operator fun RRA<IntType>.div(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_8")
operator fun RRA<DoubleType>.div(that: RRA<ShortType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_9")
operator fun RRA<ShortType>.div(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_10")
operator fun RRA<DoubleType>.div(that: RRA<ByteType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_11")
operator fun RRA<ByteType>.div(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_12")
operator fun RRA<DoubleType>.div(that: RRA<UnsignedLongType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_13")
operator fun RRA<UnsignedLongType>.div(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_14")
operator fun RRA<DoubleType>.div(that: RRA<UnsignedIntType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_15")
operator fun RRA<UnsignedIntType>.div(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_16")
operator fun RRA<DoubleType>.div(that: RRA<UnsignedShortType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_17")
operator fun RRA<UnsignedShortType>.div(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_18")
operator fun RRA<DoubleType>.div(that: RRA<UnsignedByteType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_19")
operator fun RRA<UnsignedByteType>.div(that: RRA<DoubleType>): RRA<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_20")
operator fun RRA<FloatType>.div(that: RRA<LongType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_21")
operator fun RRA<LongType>.div(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_22")
operator fun RRA<FloatType>.div(that: RRA<IntType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_23")
operator fun RRA<IntType>.div(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_24")
operator fun RRA<FloatType>.div(that: RRA<ShortType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_25")
operator fun RRA<ShortType>.div(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_26")
operator fun RRA<FloatType>.div(that: RRA<ByteType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_27")
operator fun RRA<ByteType>.div(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_28")
operator fun RRA<FloatType>.div(that: RRA<UnsignedLongType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_29")
operator fun RRA<UnsignedLongType>.div(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_30")
operator fun RRA<FloatType>.div(that: RRA<UnsignedIntType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_31")
operator fun RRA<UnsignedIntType>.div(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_32")
operator fun RRA<FloatType>.div(that: RRA<UnsignedShortType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_33")
operator fun RRA<UnsignedShortType>.div(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_34")
operator fun RRA<FloatType>.div(that: RRA<UnsignedByteType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_35")
operator fun RRA<UnsignedByteType>.div(that: RRA<FloatType>): RRA<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_36")
operator fun RRA<LongType>.div(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_37")
operator fun RRA<IntType>.div(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_38")
operator fun RRA<LongType>.div(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_39")
operator fun RRA<ShortType>.div(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_40")
operator fun RRA<LongType>.div(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_41")
operator fun RRA<ByteType>.div(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_42")
operator fun RRA<LongType>.div(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_43")
operator fun RRA<UnsignedLongType>.div(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_44")
operator fun RRA<LongType>.div(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_45")
operator fun RRA<UnsignedIntType>.div(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_46")
operator fun RRA<LongType>.div(that: RRA<UnsignedShortType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_47")
operator fun RRA<UnsignedShortType>.div(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_48")
operator fun RRA<LongType>.div(that: RRA<UnsignedByteType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_49")
operator fun RRA<UnsignedByteType>.div(that: RRA<LongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_50")
operator fun RRA<IntType>.div(that: RRA<ShortType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_51")
operator fun RRA<ShortType>.div(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_52")
operator fun RRA<IntType>.div(that: RRA<ByteType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_53")
operator fun RRA<ByteType>.div(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_54")
operator fun RRA<IntType>.div(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_55")
operator fun RRA<UnsignedLongType>.div(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_56")
operator fun RRA<IntType>.div(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_57")
operator fun RRA<UnsignedIntType>.div(that: RRA<IntType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_58")
operator fun RRA<IntType>.div(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_59")
operator fun RRA<UnsignedShortType>.div(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_60")
operator fun RRA<IntType>.div(that: RRA<UnsignedByteType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_61")
operator fun RRA<UnsignedByteType>.div(that: RRA<IntType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_62")
operator fun RRA<ShortType>.div(that: RRA<ByteType>): RRA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_63")
operator fun RRA<ByteType>.div(that: RRA<ShortType>): RRA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_64")
operator fun RRA<ShortType>.div(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_65")
operator fun RRA<UnsignedLongType>.div(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_66")
operator fun RRA<ShortType>.div(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_67")
operator fun RRA<UnsignedIntType>.div(that: RRA<ShortType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_68")
operator fun RRA<ShortType>.div(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_69")
operator fun RRA<UnsignedShortType>.div(that: RRA<ShortType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_70")
operator fun RRA<ShortType>.div(that: RRA<UnsignedByteType>): RRA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_71")
operator fun RRA<UnsignedByteType>.div(that: RRA<ShortType>): RRA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_72")
operator fun RRA<ByteType>.div(that: RRA<UnsignedLongType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_73")
operator fun RRA<UnsignedLongType>.div(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_74")
operator fun RRA<ByteType>.div(that: RRA<UnsignedIntType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_75")
operator fun RRA<UnsignedIntType>.div(that: RRA<ByteType>): RRA<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_76")
operator fun RRA<ByteType>.div(that: RRA<UnsignedShortType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_77")
operator fun RRA<UnsignedShortType>.div(that: RRA<ByteType>): RRA<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_78")
operator fun RRA<ByteType>.div(that: RRA<UnsignedByteType>): RRA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_79")
operator fun RRA<UnsignedByteType>.div(that: RRA<ByteType>): RRA<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_80")
operator fun RRA<UnsignedLongType>.div(that: RRA<UnsignedIntType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_81")
operator fun RRA<UnsignedIntType>.div(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_82")
operator fun RRA<UnsignedLongType>.div(that: RRA<UnsignedShortType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_83")
operator fun RRA<UnsignedShortType>.div(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_84")
operator fun RRA<UnsignedLongType>.div(that: RRA<UnsignedByteType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_85")
operator fun RRA<UnsignedByteType>.div(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_86")
operator fun RRA<UnsignedIntType>.div(that: RRA<UnsignedShortType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_87")
operator fun RRA<UnsignedShortType>.div(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_88")
operator fun RRA<UnsignedIntType>.div(that: RRA<UnsignedByteType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_89")
operator fun RRA<UnsignedByteType>.div(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_90")
operator fun RRA<UnsignedShortType>.div(that: RRA<UnsignedByteType>): RRA<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())

@JvmName(name = "div_91")
operator fun RRA<UnsignedByteType>.div(that: RRA<UnsignedShortType>): RRA<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())

@JvmName(name = "div_92")
operator fun RRA<RealType<*>>.div(that: RRA<RealType<*>>): RRA<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> this.asType(DoubleType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> this.asType(DoubleType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is LongType -> this.asType(DoubleType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is IntType -> this.asType(DoubleType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ShortType -> this.asType(DoubleType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is ByteType -> this.asType(DoubleType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedLongType -> this.asType(DoubleType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedIntType -> this.asType(DoubleType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedShortType -> this.asType(DoubleType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is DoubleType && that.type is UnsignedByteType -> this.asType(DoubleType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> this.asType(FloatType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is FloatType -> this.asType(FloatType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is LongType -> this.asType(FloatType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is IntType -> this.asType(FloatType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ShortType -> this.asType(FloatType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is ByteType -> this.asType(FloatType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedLongType -> this.asType(FloatType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedIntType -> this.asType(FloatType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedShortType -> this.asType(FloatType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is FloatType && that.type is UnsignedByteType -> this.asType(FloatType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is DoubleType -> this.asType(LongType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is LongType && that.type is FloatType -> this.asType(LongType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is LongType && that.type is LongType -> this.asType(LongType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is IntType -> this.asType(LongType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ShortType -> this.asType(LongType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is ByteType -> this.asType(LongType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedLongType -> this.asType(LongType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedIntType -> this.asType(LongType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedShortType -> this.asType(LongType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is LongType && that.type is UnsignedByteType -> this.asType(LongType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is DoubleType -> this.asType(IntType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is IntType && that.type is FloatType -> this.asType(IntType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is IntType && that.type is LongType -> this.asType(IntType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is IntType -> this.asType(IntType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ShortType -> this.asType(IntType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is ByteType -> this.asType(IntType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedLongType -> this.asType(IntType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedIntType -> this.asType(IntType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedShortType -> this.asType(IntType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is IntType && that.type is UnsignedByteType -> this.asType(IntType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is DoubleType -> this.asType(ShortType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is FloatType -> this.asType(ShortType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is LongType -> this.asType(ShortType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is IntType -> this.asType(ShortType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ShortType -> this.asType(ShortType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is ByteType -> this.asType(ShortType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedLongType -> this.asType(ShortType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedIntType -> this.asType(ShortType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedShortType -> this.asType(ShortType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ShortType && that.type is UnsignedByteType -> this.asType(ShortType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is DoubleType -> this.asType(ByteType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is FloatType -> this.asType(ByteType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is LongType -> this.asType(ByteType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is IntType -> this.asType(ByteType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ShortType -> this.asType(ByteType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is ByteType -> this.asType(ByteType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedLongType -> this.asType(ByteType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedIntType -> this.asType(ByteType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedShortType -> this.asType(ByteType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is ByteType && that.type is UnsignedByteType -> this.asType(ByteType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is DoubleType -> this.asType(UnsignedLongType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is FloatType -> this.asType(UnsignedLongType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is LongType -> this.asType(UnsignedLongType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is IntType -> this.asType(UnsignedLongType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ShortType -> this.asType(UnsignedLongType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is ByteType -> this.asType(UnsignedLongType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedLongType -> this.asType(UnsignedLongType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedIntType -> this.asType(UnsignedLongType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedShortType -> this.asType(UnsignedLongType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedByteType -> this.asType(UnsignedLongType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is DoubleType -> this.asType(UnsignedIntType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is FloatType -> this.asType(UnsignedIntType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is LongType -> this.asType(UnsignedIntType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is IntType -> this.asType(UnsignedIntType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ShortType -> this.asType(UnsignedIntType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is ByteType -> this.asType(UnsignedIntType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedLongType -> this.asType(UnsignedIntType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedIntType -> this.asType(UnsignedIntType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedShortType -> this.asType(UnsignedIntType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedByteType -> this.asType(UnsignedIntType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is DoubleType -> this.asType(UnsignedShortType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is FloatType -> this.asType(UnsignedShortType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is LongType -> this.asType(UnsignedShortType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is IntType -> this.asType(UnsignedShortType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ShortType -> this.asType(UnsignedShortType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is ByteType -> this.asType(UnsignedShortType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedLongType -> this.asType(UnsignedShortType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedIntType -> this.asType(UnsignedShortType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedShortType -> this.asType(UnsignedShortType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedByteType -> this.asType(UnsignedShortType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is DoubleType -> this.asType(UnsignedByteType()).div(that.asType(DoubleType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is FloatType -> this.asType(UnsignedByteType()).div(that.asType(FloatType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is LongType -> this.asType(UnsignedByteType()).div(that.asType(LongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is IntType -> this.asType(UnsignedByteType()).div(that.asType(IntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ShortType -> this.asType(UnsignedByteType()).div(that.asType(ShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is ByteType -> this.asType(UnsignedByteType()).div(that.asType(ByteType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedLongType -> this.asType(UnsignedByteType()).div(that.asType(UnsignedLongType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedIntType -> this.asType(UnsignedByteType()).div(that.asType(UnsignedIntType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedShortType -> this.asType(UnsignedByteType()).div(that.asType(UnsignedShortType())) as RRA<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedByteType -> this.asType(UnsignedByteType()).div(that.asType(UnsignedByteType())) as RRA<RealType<*>>
    else -> error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${imklib.types.realTypes.map { it::class }}.")
}

