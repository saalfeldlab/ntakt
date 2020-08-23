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
import net.imglib2.RandomAccessibleInterval as RAI

@JvmName(name = "plus_1")
operator fun <T> RAI<T>.plus(that: RAI<T>): RAI<T> where T : Type<T>, T : Add<T> = convert(that,
    type) { t, u, v -> v.set(t); v += u }

@JvmName(name = "plus_2")
operator fun RAI<DoubleType>.plus(that: RAI<FloatType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_3")
operator fun RAI<FloatType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_4")
operator fun RAI<DoubleType>.plus(that: RAI<LongType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_5")
operator fun RAI<LongType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_6")
operator fun RAI<DoubleType>.plus(that: RAI<IntType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_7")
operator fun RAI<IntType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_8")
operator fun RAI<DoubleType>.plus(that: RAI<ShortType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_9")
operator fun RAI<ShortType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_10")
operator fun RAI<DoubleType>.plus(that: RAI<ByteType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_11")
operator fun RAI<ByteType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_12")
operator fun RAI<DoubleType>.plus(that: RAI<UnsignedLongType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_13")
operator fun RAI<UnsignedLongType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_14")
operator fun RAI<DoubleType>.plus(that: RAI<UnsignedIntType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_15")
operator fun RAI<UnsignedIntType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_16")
operator fun RAI<DoubleType>.plus(that: RAI<UnsignedShortType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_17")
operator fun RAI<UnsignedShortType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_18")
operator fun RAI<DoubleType>.plus(that: RAI<UnsignedByteType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_19")
operator fun RAI<UnsignedByteType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_20")
operator fun RAI<FloatType>.plus(that: RAI<LongType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_21")
operator fun RAI<LongType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_22")
operator fun RAI<FloatType>.plus(that: RAI<IntType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_23")
operator fun RAI<IntType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_24")
operator fun RAI<FloatType>.plus(that: RAI<ShortType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_25")
operator fun RAI<ShortType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_26")
operator fun RAI<FloatType>.plus(that: RAI<ByteType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_27")
operator fun RAI<ByteType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_28")
operator fun RAI<FloatType>.plus(that: RAI<UnsignedLongType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_29")
operator fun RAI<UnsignedLongType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_30")
operator fun RAI<FloatType>.plus(that: RAI<UnsignedIntType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_31")
operator fun RAI<UnsignedIntType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_32")
operator fun RAI<FloatType>.plus(that: RAI<UnsignedShortType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_33")
operator fun RAI<UnsignedShortType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_34")
operator fun RAI<FloatType>.plus(that: RAI<UnsignedByteType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_35")
operator fun RAI<UnsignedByteType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_36")
operator fun RAI<LongType>.plus(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_37")
operator fun RAI<IntType>.plus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_38")
operator fun RAI<LongType>.plus(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_39")
operator fun RAI<ShortType>.plus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_40")
operator fun RAI<LongType>.plus(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_41")
operator fun RAI<ByteType>.plus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_42")
operator fun RAI<LongType>.plus(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_43")
operator fun RAI<UnsignedLongType>.plus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_44")
operator fun RAI<LongType>.plus(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_45")
operator fun RAI<UnsignedIntType>.plus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_46")
operator fun RAI<LongType>.plus(that: RAI<UnsignedShortType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_47")
operator fun RAI<UnsignedShortType>.plus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_48")
operator fun RAI<LongType>.plus(that: RAI<UnsignedByteType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_49")
operator fun RAI<UnsignedByteType>.plus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_50")
operator fun RAI<IntType>.plus(that: RAI<ShortType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_51")
operator fun RAI<ShortType>.plus(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_52")
operator fun RAI<IntType>.plus(that: RAI<ByteType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_53")
operator fun RAI<ByteType>.plus(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_54")
operator fun RAI<IntType>.plus(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_55")
operator fun RAI<UnsignedLongType>.plus(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_56")
operator fun RAI<IntType>.plus(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_57")
operator fun RAI<UnsignedIntType>.plus(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_58")
operator fun RAI<IntType>.plus(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_59")
operator fun RAI<UnsignedShortType>.plus(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_60")
operator fun RAI<IntType>.plus(that: RAI<UnsignedByteType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_61")
operator fun RAI<UnsignedByteType>.plus(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_62")
operator fun RAI<ShortType>.plus(that: RAI<ByteType>): RAI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_63")
operator fun RAI<ByteType>.plus(that: RAI<ShortType>): RAI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_64")
operator fun RAI<ShortType>.plus(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_65")
operator fun RAI<UnsignedLongType>.plus(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_66")
operator fun RAI<ShortType>.plus(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_67")
operator fun RAI<UnsignedIntType>.plus(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_68")
operator fun RAI<ShortType>.plus(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_69")
operator fun RAI<UnsignedShortType>.plus(that: RAI<ShortType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_70")
operator fun RAI<ShortType>.plus(that: RAI<UnsignedByteType>): RAI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_71")
operator fun RAI<UnsignedByteType>.plus(that: RAI<ShortType>): RAI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_72")
operator fun RAI<ByteType>.plus(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_73")
operator fun RAI<UnsignedLongType>.plus(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_74")
operator fun RAI<ByteType>.plus(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_75")
operator fun RAI<UnsignedIntType>.plus(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_76")
operator fun RAI<ByteType>.plus(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_77")
operator fun RAI<UnsignedShortType>.plus(that: RAI<ByteType>): RAI<IntType> =
    this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_78")
operator fun RAI<ByteType>.plus(that: RAI<UnsignedByteType>): RAI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_79")
operator fun RAI<UnsignedByteType>.plus(that: RAI<ByteType>): RAI<ShortType> =
    this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_80")
operator fun RAI<UnsignedLongType>.plus(that: RAI<UnsignedIntType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_81")
operator fun RAI<UnsignedIntType>.plus(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_82")
operator fun RAI<UnsignedLongType>.plus(that: RAI<UnsignedShortType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_83")
operator fun RAI<UnsignedShortType>.plus(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_84")
operator fun RAI<UnsignedLongType>.plus(that: RAI<UnsignedByteType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_85")
operator fun RAI<UnsignedByteType>.plus(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) + that.asType(UnsignedLongType())

@JvmName(name = "plus_86")
operator fun RAI<UnsignedIntType>.plus(that: RAI<UnsignedShortType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_87")
operator fun RAI<UnsignedShortType>.plus(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_88")
operator fun RAI<UnsignedIntType>.plus(that: RAI<UnsignedByteType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_89")
operator fun RAI<UnsignedByteType>.plus(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) + that.asType(UnsignedIntType())

@JvmName(name = "plus_90")
operator fun RAI<UnsignedShortType>.plus(that: RAI<UnsignedByteType>): RAI<UnsignedShortType> =
    this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "plus_91")
operator fun RAI<UnsignedByteType>.plus(that: RAI<UnsignedShortType>): RAI<UnsignedShortType> =
    this.asType(UnsignedShortType()) + that.asType(UnsignedShortType())

@JvmName(name = "minus_1")
operator fun <T> RAI<T>.minus(that: RAI<T>): RAI<T> where T : Type<T>, T : Sub<T> = convert(that,
    type) { t, u, v -> v.set(t); v -= u }

@JvmName(name = "minus_2")
operator fun RAI<DoubleType>.minus(that: RAI<FloatType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_3")
operator fun RAI<FloatType>.minus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_4")
operator fun RAI<DoubleType>.minus(that: RAI<LongType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_5")
operator fun RAI<LongType>.minus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_6")
operator fun RAI<DoubleType>.minus(that: RAI<IntType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_7")
operator fun RAI<IntType>.minus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_8")
operator fun RAI<DoubleType>.minus(that: RAI<ShortType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_9")
operator fun RAI<ShortType>.minus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_10")
operator fun RAI<DoubleType>.minus(that: RAI<ByteType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_11")
operator fun RAI<ByteType>.minus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_12")
operator fun RAI<DoubleType>.minus(that: RAI<UnsignedLongType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_13")
operator fun RAI<UnsignedLongType>.minus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_14")
operator fun RAI<DoubleType>.minus(that: RAI<UnsignedIntType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_15")
operator fun RAI<UnsignedIntType>.minus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_16")
operator fun RAI<DoubleType>.minus(that: RAI<UnsignedShortType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_17")
operator fun RAI<UnsignedShortType>.minus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_18")
operator fun RAI<DoubleType>.minus(that: RAI<UnsignedByteType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_19")
operator fun RAI<UnsignedByteType>.minus(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_20")
operator fun RAI<FloatType>.minus(that: RAI<LongType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_21")
operator fun RAI<LongType>.minus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_22")
operator fun RAI<FloatType>.minus(that: RAI<IntType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_23")
operator fun RAI<IntType>.minus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_24")
operator fun RAI<FloatType>.minus(that: RAI<ShortType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_25")
operator fun RAI<ShortType>.minus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_26")
operator fun RAI<FloatType>.minus(that: RAI<ByteType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_27")
operator fun RAI<ByteType>.minus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_28")
operator fun RAI<FloatType>.minus(that: RAI<UnsignedLongType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_29")
operator fun RAI<UnsignedLongType>.minus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_30")
operator fun RAI<FloatType>.minus(that: RAI<UnsignedIntType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_31")
operator fun RAI<UnsignedIntType>.minus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_32")
operator fun RAI<FloatType>.minus(that: RAI<UnsignedShortType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_33")
operator fun RAI<UnsignedShortType>.minus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_34")
operator fun RAI<FloatType>.minus(that: RAI<UnsignedByteType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_35")
operator fun RAI<UnsignedByteType>.minus(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_36")
operator fun RAI<LongType>.minus(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_37")
operator fun RAI<IntType>.minus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_38")
operator fun RAI<LongType>.minus(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_39")
operator fun RAI<ShortType>.minus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_40")
operator fun RAI<LongType>.minus(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_41")
operator fun RAI<ByteType>.minus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_42")
operator fun RAI<LongType>.minus(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_43")
operator fun RAI<UnsignedLongType>.minus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_44")
operator fun RAI<LongType>.minus(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_45")
operator fun RAI<UnsignedIntType>.minus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_46")
operator fun RAI<LongType>.minus(that: RAI<UnsignedShortType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_47")
operator fun RAI<UnsignedShortType>.minus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_48")
operator fun RAI<LongType>.minus(that: RAI<UnsignedByteType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_49")
operator fun RAI<UnsignedByteType>.minus(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_50")
operator fun RAI<IntType>.minus(that: RAI<ShortType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_51")
operator fun RAI<ShortType>.minus(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_52")
operator fun RAI<IntType>.minus(that: RAI<ByteType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_53")
operator fun RAI<ByteType>.minus(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_54")
operator fun RAI<IntType>.minus(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_55")
operator fun RAI<UnsignedLongType>.minus(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_56")
operator fun RAI<IntType>.minus(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_57")
operator fun RAI<UnsignedIntType>.minus(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_58")
operator fun RAI<IntType>.minus(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_59")
operator fun RAI<UnsignedShortType>.minus(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_60")
operator fun RAI<IntType>.minus(that: RAI<UnsignedByteType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_61")
operator fun RAI<UnsignedByteType>.minus(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_62")
operator fun RAI<ShortType>.minus(that: RAI<ByteType>): RAI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_63")
operator fun RAI<ByteType>.minus(that: RAI<ShortType>): RAI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_64")
operator fun RAI<ShortType>.minus(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_65")
operator fun RAI<UnsignedLongType>.minus(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_66")
operator fun RAI<ShortType>.minus(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_67")
operator fun RAI<UnsignedIntType>.minus(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_68")
operator fun RAI<ShortType>.minus(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_69")
operator fun RAI<UnsignedShortType>.minus(that: RAI<ShortType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_70")
operator fun RAI<ShortType>.minus(that: RAI<UnsignedByteType>): RAI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_71")
operator fun RAI<UnsignedByteType>.minus(that: RAI<ShortType>): RAI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_72")
operator fun RAI<ByteType>.minus(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_73")
operator fun RAI<UnsignedLongType>.minus(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_74")
operator fun RAI<ByteType>.minus(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_75")
operator fun RAI<UnsignedIntType>.minus(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_76")
operator fun RAI<ByteType>.minus(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_77")
operator fun RAI<UnsignedShortType>.minus(that: RAI<ByteType>): RAI<IntType> =
    this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_78")
operator fun RAI<ByteType>.minus(that: RAI<UnsignedByteType>): RAI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_79")
operator fun RAI<UnsignedByteType>.minus(that: RAI<ByteType>): RAI<ShortType> =
    this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_80")
operator fun RAI<UnsignedLongType>.minus(that: RAI<UnsignedIntType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_81")
operator fun RAI<UnsignedIntType>.minus(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_82")
operator fun RAI<UnsignedLongType>.minus(that: RAI<UnsignedShortType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_83")
operator fun RAI<UnsignedShortType>.minus(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_84")
operator fun RAI<UnsignedLongType>.minus(that: RAI<UnsignedByteType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_85")
operator fun RAI<UnsignedByteType>.minus(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) - that.asType(UnsignedLongType())

@JvmName(name = "minus_86")
operator fun RAI<UnsignedIntType>.minus(that: RAI<UnsignedShortType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_87")
operator fun RAI<UnsignedShortType>.minus(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_88")
operator fun RAI<UnsignedIntType>.minus(that: RAI<UnsignedByteType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_89")
operator fun RAI<UnsignedByteType>.minus(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) - that.asType(UnsignedIntType())

@JvmName(name = "minus_90")
operator fun RAI<UnsignedShortType>.minus(that: RAI<UnsignedByteType>): RAI<UnsignedShortType> =
    this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "minus_91")
operator fun RAI<UnsignedByteType>.minus(that: RAI<UnsignedShortType>): RAI<UnsignedShortType> =
    this.asType(UnsignedShortType()) - that.asType(UnsignedShortType())

@JvmName(name = "times_1")
operator fun <T> RAI<T>.times(that: RAI<T>): RAI<T> where T : Type<T>, T : Mul<T> = convert(that,
    type) { t, u, v -> v.set(t); v *= u }

@JvmName(name = "times_2")
operator fun RAI<DoubleType>.times(that: RAI<FloatType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_3")
operator fun RAI<FloatType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_4")
operator fun RAI<DoubleType>.times(that: RAI<LongType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_5")
operator fun RAI<LongType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_6")
operator fun RAI<DoubleType>.times(that: RAI<IntType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_7")
operator fun RAI<IntType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_8")
operator fun RAI<DoubleType>.times(that: RAI<ShortType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_9")
operator fun RAI<ShortType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_10")
operator fun RAI<DoubleType>.times(that: RAI<ByteType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_11")
operator fun RAI<ByteType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_12")
operator fun RAI<DoubleType>.times(that: RAI<UnsignedLongType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_13")
operator fun RAI<UnsignedLongType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_14")
operator fun RAI<DoubleType>.times(that: RAI<UnsignedIntType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_15")
operator fun RAI<UnsignedIntType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_16")
operator fun RAI<DoubleType>.times(that: RAI<UnsignedShortType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_17")
operator fun RAI<UnsignedShortType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_18")
operator fun RAI<DoubleType>.times(that: RAI<UnsignedByteType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_19")
operator fun RAI<UnsignedByteType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_20")
operator fun RAI<FloatType>.times(that: RAI<LongType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_21")
operator fun RAI<LongType>.times(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_22")
operator fun RAI<FloatType>.times(that: RAI<IntType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_23")
operator fun RAI<IntType>.times(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_24")
operator fun RAI<FloatType>.times(that: RAI<ShortType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_25")
operator fun RAI<ShortType>.times(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_26")
operator fun RAI<FloatType>.times(that: RAI<ByteType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_27")
operator fun RAI<ByteType>.times(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_28")
operator fun RAI<FloatType>.times(that: RAI<UnsignedLongType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_29")
operator fun RAI<UnsignedLongType>.times(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_30")
operator fun RAI<FloatType>.times(that: RAI<UnsignedIntType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_31")
operator fun RAI<UnsignedIntType>.times(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_32")
operator fun RAI<FloatType>.times(that: RAI<UnsignedShortType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_33")
operator fun RAI<UnsignedShortType>.times(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_34")
operator fun RAI<FloatType>.times(that: RAI<UnsignedByteType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_35")
operator fun RAI<UnsignedByteType>.times(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_36")
operator fun RAI<LongType>.times(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_37")
operator fun RAI<IntType>.times(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_38")
operator fun RAI<LongType>.times(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_39")
operator fun RAI<ShortType>.times(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_40")
operator fun RAI<LongType>.times(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_41")
operator fun RAI<ByteType>.times(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_42")
operator fun RAI<LongType>.times(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_43")
operator fun RAI<UnsignedLongType>.times(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_44")
operator fun RAI<LongType>.times(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_45")
operator fun RAI<UnsignedIntType>.times(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_46")
operator fun RAI<LongType>.times(that: RAI<UnsignedShortType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_47")
operator fun RAI<UnsignedShortType>.times(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_48")
operator fun RAI<LongType>.times(that: RAI<UnsignedByteType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_49")
operator fun RAI<UnsignedByteType>.times(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_50")
operator fun RAI<IntType>.times(that: RAI<ShortType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_51")
operator fun RAI<ShortType>.times(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_52")
operator fun RAI<IntType>.times(that: RAI<ByteType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_53")
operator fun RAI<ByteType>.times(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_54")
operator fun RAI<IntType>.times(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_55")
operator fun RAI<UnsignedLongType>.times(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_56")
operator fun RAI<IntType>.times(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_57")
operator fun RAI<UnsignedIntType>.times(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_58")
operator fun RAI<IntType>.times(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_59")
operator fun RAI<UnsignedShortType>.times(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_60")
operator fun RAI<IntType>.times(that: RAI<UnsignedByteType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_61")
operator fun RAI<UnsignedByteType>.times(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_62")
operator fun RAI<ShortType>.times(that: RAI<ByteType>): RAI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_63")
operator fun RAI<ByteType>.times(that: RAI<ShortType>): RAI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_64")
operator fun RAI<ShortType>.times(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_65")
operator fun RAI<UnsignedLongType>.times(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_66")
operator fun RAI<ShortType>.times(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_67")
operator fun RAI<UnsignedIntType>.times(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_68")
operator fun RAI<ShortType>.times(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_69")
operator fun RAI<UnsignedShortType>.times(that: RAI<ShortType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_70")
operator fun RAI<ShortType>.times(that: RAI<UnsignedByteType>): RAI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_71")
operator fun RAI<UnsignedByteType>.times(that: RAI<ShortType>): RAI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_72")
operator fun RAI<ByteType>.times(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_73")
operator fun RAI<UnsignedLongType>.times(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_74")
operator fun RAI<ByteType>.times(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_75")
operator fun RAI<UnsignedIntType>.times(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_76")
operator fun RAI<ByteType>.times(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_77")
operator fun RAI<UnsignedShortType>.times(that: RAI<ByteType>): RAI<IntType> =
    this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_78")
operator fun RAI<ByteType>.times(that: RAI<UnsignedByteType>): RAI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_79")
operator fun RAI<UnsignedByteType>.times(that: RAI<ByteType>): RAI<ShortType> =
    this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_80")
operator fun RAI<UnsignedLongType>.times(that: RAI<UnsignedIntType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_81")
operator fun RAI<UnsignedIntType>.times(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_82")
operator fun RAI<UnsignedLongType>.times(that: RAI<UnsignedShortType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_83")
operator fun RAI<UnsignedShortType>.times(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_84")
operator fun RAI<UnsignedLongType>.times(that: RAI<UnsignedByteType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_85")
operator fun RAI<UnsignedByteType>.times(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())

@JvmName(name = "times_86")
operator fun RAI<UnsignedIntType>.times(that: RAI<UnsignedShortType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_87")
operator fun RAI<UnsignedShortType>.times(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_88")
operator fun RAI<UnsignedIntType>.times(that: RAI<UnsignedByteType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_89")
operator fun RAI<UnsignedByteType>.times(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())

@JvmName(name = "times_90")
operator fun RAI<UnsignedShortType>.times(that: RAI<UnsignedByteType>): RAI<UnsignedShortType> =
    this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "times_91")
operator fun RAI<UnsignedByteType>.times(that: RAI<UnsignedShortType>): RAI<UnsignedShortType> =
    this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())

@JvmName(name = "div_1")
operator fun <T> RAI<T>.div(that: RAI<T>): RAI<T> where T : Type<T>, T : Div<T> = convert(that,
    type) { t, u, v -> v.set(t); v /= u }

@JvmName(name = "div_2")
operator fun RAI<DoubleType>.div(that: RAI<FloatType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_3")
operator fun RAI<FloatType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_4")
operator fun RAI<DoubleType>.div(that: RAI<LongType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_5")
operator fun RAI<LongType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_6")
operator fun RAI<DoubleType>.div(that: RAI<IntType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_7")
operator fun RAI<IntType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_8")
operator fun RAI<DoubleType>.div(that: RAI<ShortType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_9")
operator fun RAI<ShortType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_10")
operator fun RAI<DoubleType>.div(that: RAI<ByteType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_11")
operator fun RAI<ByteType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_12")
operator fun RAI<DoubleType>.div(that: RAI<UnsignedLongType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_13")
operator fun RAI<UnsignedLongType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_14")
operator fun RAI<DoubleType>.div(that: RAI<UnsignedIntType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_15")
operator fun RAI<UnsignedIntType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_16")
operator fun RAI<DoubleType>.div(that: RAI<UnsignedShortType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_17")
operator fun RAI<UnsignedShortType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_18")
operator fun RAI<DoubleType>.div(that: RAI<UnsignedByteType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_19")
operator fun RAI<UnsignedByteType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_20")
operator fun RAI<FloatType>.div(that: RAI<LongType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_21")
operator fun RAI<LongType>.div(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_22")
operator fun RAI<FloatType>.div(that: RAI<IntType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_23")
operator fun RAI<IntType>.div(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_24")
operator fun RAI<FloatType>.div(that: RAI<ShortType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_25")
operator fun RAI<ShortType>.div(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_26")
operator fun RAI<FloatType>.div(that: RAI<ByteType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_27")
operator fun RAI<ByteType>.div(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_28")
operator fun RAI<FloatType>.div(that: RAI<UnsignedLongType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_29")
operator fun RAI<UnsignedLongType>.div(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_30")
operator fun RAI<FloatType>.div(that: RAI<UnsignedIntType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_31")
operator fun RAI<UnsignedIntType>.div(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_32")
operator fun RAI<FloatType>.div(that: RAI<UnsignedShortType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_33")
operator fun RAI<UnsignedShortType>.div(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_34")
operator fun RAI<FloatType>.div(that: RAI<UnsignedByteType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_35")
operator fun RAI<UnsignedByteType>.div(that: RAI<FloatType>): RAI<FloatType> =
    this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_36")
operator fun RAI<LongType>.div(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_37")
operator fun RAI<IntType>.div(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_38")
operator fun RAI<LongType>.div(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_39")
operator fun RAI<ShortType>.div(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_40")
operator fun RAI<LongType>.div(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_41")
operator fun RAI<ByteType>.div(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_42")
operator fun RAI<LongType>.div(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_43")
operator fun RAI<UnsignedLongType>.div(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_44")
operator fun RAI<LongType>.div(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_45")
operator fun RAI<UnsignedIntType>.div(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_46")
operator fun RAI<LongType>.div(that: RAI<UnsignedShortType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_47")
operator fun RAI<UnsignedShortType>.div(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_48")
operator fun RAI<LongType>.div(that: RAI<UnsignedByteType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_49")
operator fun RAI<UnsignedByteType>.div(that: RAI<LongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_50")
operator fun RAI<IntType>.div(that: RAI<ShortType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_51")
operator fun RAI<ShortType>.div(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_52")
operator fun RAI<IntType>.div(that: RAI<ByteType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_53")
operator fun RAI<ByteType>.div(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_54")
operator fun RAI<IntType>.div(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_55")
operator fun RAI<UnsignedLongType>.div(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_56")
operator fun RAI<IntType>.div(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_57")
operator fun RAI<UnsignedIntType>.div(that: RAI<IntType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_58")
operator fun RAI<IntType>.div(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_59")
operator fun RAI<UnsignedShortType>.div(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_60")
operator fun RAI<IntType>.div(that: RAI<UnsignedByteType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_61")
operator fun RAI<UnsignedByteType>.div(that: RAI<IntType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_62")
operator fun RAI<ShortType>.div(that: RAI<ByteType>): RAI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_63")
operator fun RAI<ByteType>.div(that: RAI<ShortType>): RAI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_64")
operator fun RAI<ShortType>.div(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_65")
operator fun RAI<UnsignedLongType>.div(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_66")
operator fun RAI<ShortType>.div(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_67")
operator fun RAI<UnsignedIntType>.div(that: RAI<ShortType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_68")
operator fun RAI<ShortType>.div(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_69")
operator fun RAI<UnsignedShortType>.div(that: RAI<ShortType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_70")
operator fun RAI<ShortType>.div(that: RAI<UnsignedByteType>): RAI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_71")
operator fun RAI<UnsignedByteType>.div(that: RAI<ShortType>): RAI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_72")
operator fun RAI<ByteType>.div(that: RAI<UnsignedLongType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_73")
operator fun RAI<UnsignedLongType>.div(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_74")
operator fun RAI<ByteType>.div(that: RAI<UnsignedIntType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_75")
operator fun RAI<UnsignedIntType>.div(that: RAI<ByteType>): RAI<LongType> =
    this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_76")
operator fun RAI<ByteType>.div(that: RAI<UnsignedShortType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_77")
operator fun RAI<UnsignedShortType>.div(that: RAI<ByteType>): RAI<IntType> =
    this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_78")
operator fun RAI<ByteType>.div(that: RAI<UnsignedByteType>): RAI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_79")
operator fun RAI<UnsignedByteType>.div(that: RAI<ByteType>): RAI<ShortType> =
    this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_80")
operator fun RAI<UnsignedLongType>.div(that: RAI<UnsignedIntType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_81")
operator fun RAI<UnsignedIntType>.div(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_82")
operator fun RAI<UnsignedLongType>.div(that: RAI<UnsignedShortType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_83")
operator fun RAI<UnsignedShortType>.div(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_84")
operator fun RAI<UnsignedLongType>.div(that: RAI<UnsignedByteType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_85")
operator fun RAI<UnsignedByteType>.div(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    this.asType(UnsignedLongType()) / that.asType(UnsignedLongType())

@JvmName(name = "div_86")
operator fun RAI<UnsignedIntType>.div(that: RAI<UnsignedShortType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_87")
operator fun RAI<UnsignedShortType>.div(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_88")
operator fun RAI<UnsignedIntType>.div(that: RAI<UnsignedByteType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_89")
operator fun RAI<UnsignedByteType>.div(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    this.asType(UnsignedIntType()) / that.asType(UnsignedIntType())

@JvmName(name = "div_90")
operator fun RAI<UnsignedShortType>.div(that: RAI<UnsignedByteType>): RAI<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())

@JvmName(name = "div_91")
operator fun RAI<UnsignedByteType>.div(that: RAI<UnsignedShortType>): RAI<UnsignedShortType> =
    this.asType(UnsignedShortType()) / that.asType(UnsignedShortType())
