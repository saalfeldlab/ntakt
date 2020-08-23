package net.imglib2.imklib

import kotlin.jvm.JvmName
import net.imglib2.type.Type
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
