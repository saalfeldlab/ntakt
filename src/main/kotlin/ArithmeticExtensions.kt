package net.imglib2.imklib

import kotlin.jvm.JvmName
import net.imglib2.RandomAccessible
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

@JvmName(name = "plus_1")
operator fun <T> RandomAccessible<T>.plus(that: RandomAccessible<T>): RandomAccessible<T> where T :
    Type<T>, T : Add<T> = convert(that, type) { t, u, v -> v.set(t); v += u }

@JvmName(name = "plus_2")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<FloatType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_3")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_4")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<LongType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_5")
operator fun RandomAccessible<LongType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_6")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_7")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_8")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<ShortType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_9")
operator fun RandomAccessible<ShortType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_10")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<ByteType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_11")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_12")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_13")
operator fun RandomAccessible<UnsignedLongType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_14")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_15")
operator fun RandomAccessible<UnsignedIntType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_16")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_17")
operator fun RandomAccessible<UnsignedShortType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_18")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_19")
operator fun RandomAccessible<UnsignedByteType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_20")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<LongType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_21")
operator fun RandomAccessible<LongType>.plus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_22")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_23")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_24")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<ShortType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_25")
operator fun RandomAccessible<ShortType>.plus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_26")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<ByteType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_27")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_28")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_29")
operator fun RandomAccessible<UnsignedLongType>.plus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_30")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_31")
operator fun RandomAccessible<UnsignedIntType>.plus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_32")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_33")
operator fun RandomAccessible<UnsignedShortType>.plus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_34")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_35")
operator fun RandomAccessible<UnsignedByteType>.plus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) + that.asType(FloatType())

@JvmName(name = "plus_36")
operator fun RandomAccessible<LongType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_37")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_38")
operator fun RandomAccessible<LongType>.plus(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_39")
operator fun RandomAccessible<ShortType>.plus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_40")
operator fun RandomAccessible<LongType>.plus(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_41")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_42")
operator fun RandomAccessible<LongType>.plus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_43")
operator fun RandomAccessible<UnsignedLongType>.plus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_44")
operator fun RandomAccessible<LongType>.plus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_45")
operator fun RandomAccessible<UnsignedIntType>.plus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_46")
operator fun RandomAccessible<LongType>.plus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_47")
operator fun RandomAccessible<UnsignedShortType>.plus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_48")
operator fun RandomAccessible<LongType>.plus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_49")
operator fun RandomAccessible<UnsignedByteType>.plus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_50")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<ShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_51")
operator fun RandomAccessible<ShortType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_52")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<ByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_53")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_54")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_55")
operator fun RandomAccessible<UnsignedLongType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_56")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_57")
operator fun RandomAccessible<UnsignedIntType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_58")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_59")
operator fun RandomAccessible<UnsignedShortType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_60")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_61")
operator fun RandomAccessible<UnsignedByteType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_62")
operator fun RandomAccessible<ShortType>.plus(that: RandomAccessible<ByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_63")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<ShortType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_64")
operator fun RandomAccessible<ShortType>.plus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_65")
operator fun RandomAccessible<UnsignedLongType>.plus(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_66")
operator fun RandomAccessible<ShortType>.plus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_67")
operator fun RandomAccessible<UnsignedIntType>.plus(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_68")
operator fun RandomAccessible<ShortType>.plus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_69")
operator fun RandomAccessible<UnsignedShortType>.plus(that: RandomAccessible<ShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_70")
operator fun RandomAccessible<ShortType>.plus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_71")
operator fun RandomAccessible<UnsignedByteType>.plus(that: RandomAccessible<ShortType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_72")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_73")
operator fun RandomAccessible<UnsignedLongType>.plus(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_74")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_75")
operator fun RandomAccessible<UnsignedIntType>.plus(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) + that.asType(LongType())

@JvmName(name = "plus_76")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_77")
operator fun RandomAccessible<UnsignedShortType>.plus(that: RandomAccessible<ByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) + that.asType(IntType())

@JvmName(name = "plus_78")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_79")
operator fun RandomAccessible<UnsignedByteType>.plus(that: RandomAccessible<ByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) + that.asType(ShortType())

@JvmName(name = "plus_80")
operator fun RandomAccessible<UnsignedLongType>.plus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) +
    that.asType(UnsignedLongType())

@JvmName(name = "plus_81")
operator fun RandomAccessible<UnsignedIntType>.plus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) +
    that.asType(UnsignedLongType())

@JvmName(name = "plus_82")
operator fun RandomAccessible<UnsignedLongType>.plus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) +
    that.asType(UnsignedLongType())

@JvmName(name = "plus_83")
operator fun RandomAccessible<UnsignedShortType>.plus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) +
    that.asType(UnsignedLongType())

@JvmName(name = "plus_84")
operator fun RandomAccessible<UnsignedLongType>.plus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) +
    that.asType(UnsignedLongType())

@JvmName(name = "plus_85")
operator fun RandomAccessible<UnsignedByteType>.plus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) +
    that.asType(UnsignedLongType())

@JvmName(name = "plus_86")
operator fun RandomAccessible<UnsignedIntType>.plus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) +
    that.asType(UnsignedIntType())

@JvmName(name = "plus_87")
operator fun RandomAccessible<UnsignedShortType>.plus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) +
    that.asType(UnsignedIntType())

@JvmName(name = "plus_88")
operator fun RandomAccessible<UnsignedIntType>.plus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) +
    that.asType(UnsignedIntType())

@JvmName(name = "plus_89")
operator fun RandomAccessible<UnsignedByteType>.plus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) +
    that.asType(UnsignedIntType())

@JvmName(name = "plus_90")
operator fun RandomAccessible<UnsignedShortType>.plus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedShortType> = this.asType(UnsignedShortType()) +
    that.asType(UnsignedShortType())

@JvmName(name = "plus_91")
operator fun RandomAccessible<UnsignedByteType>.plus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedShortType> = this.asType(UnsignedShortType()) +
    that.asType(UnsignedShortType())

@JvmName(name = "minus_1")
operator fun <T> RandomAccessible<T>.minus(that: RandomAccessible<T>): RandomAccessible<T> where T :
    Type<T>, T : Sub<T> = convert(that, type) { t, u, v -> v.set(t); v -= u }

@JvmName(name = "minus_2")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<FloatType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_3")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_4")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<LongType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_5")
operator fun RandomAccessible<LongType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_6")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_7")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_8")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<ShortType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_9")
operator fun RandomAccessible<ShortType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_10")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<ByteType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_11")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_12")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_13")
operator fun RandomAccessible<UnsignedLongType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_14")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_15")
operator fun RandomAccessible<UnsignedIntType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_16")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_17")
operator fun RandomAccessible<UnsignedShortType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_18")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_19")
operator fun RandomAccessible<UnsignedByteType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_20")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<LongType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_21")
operator fun RandomAccessible<LongType>.minus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_22")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_23")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_24")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<ShortType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_25")
operator fun RandomAccessible<ShortType>.minus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_26")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<ByteType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_27")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_28")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_29")
operator fun RandomAccessible<UnsignedLongType>.minus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_30")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_31")
operator fun RandomAccessible<UnsignedIntType>.minus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_32")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_33")
operator fun RandomAccessible<UnsignedShortType>.minus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_34")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_35")
operator fun RandomAccessible<UnsignedByteType>.minus(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) - that.asType(FloatType())

@JvmName(name = "minus_36")
operator fun RandomAccessible<LongType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_37")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_38")
operator fun RandomAccessible<LongType>.minus(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_39")
operator fun RandomAccessible<ShortType>.minus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_40")
operator fun RandomAccessible<LongType>.minus(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_41")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_42")
operator fun RandomAccessible<LongType>.minus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_43")
operator fun RandomAccessible<UnsignedLongType>.minus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_44")
operator fun RandomAccessible<LongType>.minus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_45")
operator fun RandomAccessible<UnsignedIntType>.minus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_46")
operator fun RandomAccessible<LongType>.minus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_47")
operator fun RandomAccessible<UnsignedShortType>.minus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_48")
operator fun RandomAccessible<LongType>.minus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_49")
operator fun RandomAccessible<UnsignedByteType>.minus(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_50")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<ShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_51")
operator fun RandomAccessible<ShortType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_52")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<ByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_53")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_54")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_55")
operator fun RandomAccessible<UnsignedLongType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_56")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_57")
operator fun RandomAccessible<UnsignedIntType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_58")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_59")
operator fun RandomAccessible<UnsignedShortType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_60")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_61")
operator fun RandomAccessible<UnsignedByteType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_62")
operator fun RandomAccessible<ShortType>.minus(that: RandomAccessible<ByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_63")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<ShortType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_64")
operator fun RandomAccessible<ShortType>.minus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_65")
operator fun RandomAccessible<UnsignedLongType>.minus(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_66")
operator fun RandomAccessible<ShortType>.minus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_67")
operator fun RandomAccessible<UnsignedIntType>.minus(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_68")
operator fun RandomAccessible<ShortType>.minus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_69")
operator fun RandomAccessible<UnsignedShortType>.minus(that: RandomAccessible<ShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_70")
operator fun RandomAccessible<ShortType>.minus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_71")
operator fun RandomAccessible<UnsignedByteType>.minus(that: RandomAccessible<ShortType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_72")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_73")
operator fun RandomAccessible<UnsignedLongType>.minus(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_74")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_75")
operator fun RandomAccessible<UnsignedIntType>.minus(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) - that.asType(LongType())

@JvmName(name = "minus_76")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_77")
operator fun RandomAccessible<UnsignedShortType>.minus(that: RandomAccessible<ByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) - that.asType(IntType())

@JvmName(name = "minus_78")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_79")
operator fun RandomAccessible<UnsignedByteType>.minus(that: RandomAccessible<ByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) - that.asType(ShortType())

@JvmName(name = "minus_80")
operator fun RandomAccessible<UnsignedLongType>.minus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) -
    that.asType(UnsignedLongType())

@JvmName(name = "minus_81")
operator fun RandomAccessible<UnsignedIntType>.minus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) -
    that.asType(UnsignedLongType())

@JvmName(name = "minus_82")
operator fun RandomAccessible<UnsignedLongType>.minus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) -
    that.asType(UnsignedLongType())

@JvmName(name = "minus_83")
operator fun RandomAccessible<UnsignedShortType>.minus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) -
    that.asType(UnsignedLongType())

@JvmName(name = "minus_84")
operator fun RandomAccessible<UnsignedLongType>.minus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) -
    that.asType(UnsignedLongType())

@JvmName(name = "minus_85")
operator fun RandomAccessible<UnsignedByteType>.minus(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) -
    that.asType(UnsignedLongType())

@JvmName(name = "minus_86")
operator fun RandomAccessible<UnsignedIntType>.minus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) -
    that.asType(UnsignedIntType())

@JvmName(name = "minus_87")
operator fun RandomAccessible<UnsignedShortType>.minus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) -
    that.asType(UnsignedIntType())

@JvmName(name = "minus_88")
operator fun RandomAccessible<UnsignedIntType>.minus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) -
    that.asType(UnsignedIntType())

@JvmName(name = "minus_89")
operator fun RandomAccessible<UnsignedByteType>.minus(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) -
    that.asType(UnsignedIntType())

@JvmName(name = "minus_90")
operator fun RandomAccessible<UnsignedShortType>.minus(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedShortType> = this.asType(UnsignedShortType()) -
    that.asType(UnsignedShortType())

@JvmName(name = "minus_91")
operator fun RandomAccessible<UnsignedByteType>.minus(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedShortType> = this.asType(UnsignedShortType()) -
    that.asType(UnsignedShortType())

@JvmName(name = "times_1")
operator fun <T> RandomAccessible<T>.times(that: RandomAccessible<T>): RandomAccessible<T> where T :
    Type<T>, T : Mul<T> = convert(that, type) { t, u, v -> v.set(t); v *= u }

@JvmName(name = "times_2")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<FloatType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_3")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_4")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<LongType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_5")
operator fun RandomAccessible<LongType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_6")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_7")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_8")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<ShortType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_9")
operator fun RandomAccessible<ShortType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_10")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<ByteType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_11")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_12")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_13")
operator fun RandomAccessible<UnsignedLongType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_14")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_15")
operator fun RandomAccessible<UnsignedIntType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_16")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_17")
operator fun RandomAccessible<UnsignedShortType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_18")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_19")
operator fun RandomAccessible<UnsignedByteType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_20")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<LongType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_21")
operator fun RandomAccessible<LongType>.times(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_22")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_23")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_24")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<ShortType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_25")
operator fun RandomAccessible<ShortType>.times(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_26")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<ByteType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_27")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_28")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_29")
operator fun RandomAccessible<UnsignedLongType>.times(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_30")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_31")
operator fun RandomAccessible<UnsignedIntType>.times(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_32")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_33")
operator fun RandomAccessible<UnsignedShortType>.times(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_34")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_35")
operator fun RandomAccessible<UnsignedByteType>.times(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) * that.asType(FloatType())

@JvmName(name = "times_36")
operator fun RandomAccessible<LongType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_37")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_38")
operator fun RandomAccessible<LongType>.times(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_39")
operator fun RandomAccessible<ShortType>.times(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_40")
operator fun RandomAccessible<LongType>.times(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_41")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_42")
operator fun RandomAccessible<LongType>.times(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_43")
operator fun RandomAccessible<UnsignedLongType>.times(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_44")
operator fun RandomAccessible<LongType>.times(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_45")
operator fun RandomAccessible<UnsignedIntType>.times(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_46")
operator fun RandomAccessible<LongType>.times(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_47")
operator fun RandomAccessible<UnsignedShortType>.times(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_48")
operator fun RandomAccessible<LongType>.times(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_49")
operator fun RandomAccessible<UnsignedByteType>.times(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_50")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<ShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_51")
operator fun RandomAccessible<ShortType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_52")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<ByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_53")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_54")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_55")
operator fun RandomAccessible<UnsignedLongType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_56")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_57")
operator fun RandomAccessible<UnsignedIntType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_58")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_59")
operator fun RandomAccessible<UnsignedShortType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_60")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_61")
operator fun RandomAccessible<UnsignedByteType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_62")
operator fun RandomAccessible<ShortType>.times(that: RandomAccessible<ByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_63")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<ShortType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_64")
operator fun RandomAccessible<ShortType>.times(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_65")
operator fun RandomAccessible<UnsignedLongType>.times(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_66")
operator fun RandomAccessible<ShortType>.times(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_67")
operator fun RandomAccessible<UnsignedIntType>.times(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_68")
operator fun RandomAccessible<ShortType>.times(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_69")
operator fun RandomAccessible<UnsignedShortType>.times(that: RandomAccessible<ShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_70")
operator fun RandomAccessible<ShortType>.times(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_71")
operator fun RandomAccessible<UnsignedByteType>.times(that: RandomAccessible<ShortType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_72")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_73")
operator fun RandomAccessible<UnsignedLongType>.times(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_74")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_75")
operator fun RandomAccessible<UnsignedIntType>.times(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) * that.asType(LongType())

@JvmName(name = "times_76")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_77")
operator fun RandomAccessible<UnsignedShortType>.times(that: RandomAccessible<ByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) * that.asType(IntType())

@JvmName(name = "times_78")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_79")
operator fun RandomAccessible<UnsignedByteType>.times(that: RandomAccessible<ByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) * that.asType(ShortType())

@JvmName(name = "times_80")
operator fun RandomAccessible<UnsignedLongType>.times(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) *
    that.asType(UnsignedLongType())

@JvmName(name = "times_81")
operator fun RandomAccessible<UnsignedIntType>.times(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) *
    that.asType(UnsignedLongType())

@JvmName(name = "times_82")
operator fun RandomAccessible<UnsignedLongType>.times(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) *
    that.asType(UnsignedLongType())

@JvmName(name = "times_83")
operator fun RandomAccessible<UnsignedShortType>.times(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) *
    that.asType(UnsignedLongType())

@JvmName(name = "times_84")
operator fun RandomAccessible<UnsignedLongType>.times(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) *
    that.asType(UnsignedLongType())

@JvmName(name = "times_85")
operator fun RandomAccessible<UnsignedByteType>.times(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) *
    that.asType(UnsignedLongType())

@JvmName(name = "times_86")
operator fun RandomAccessible<UnsignedIntType>.times(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) *
    that.asType(UnsignedIntType())

@JvmName(name = "times_87")
operator fun RandomAccessible<UnsignedShortType>.times(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) *
    that.asType(UnsignedIntType())

@JvmName(name = "times_88")
operator fun RandomAccessible<UnsignedIntType>.times(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) *
    that.asType(UnsignedIntType())

@JvmName(name = "times_89")
operator fun RandomAccessible<UnsignedByteType>.times(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) *
    that.asType(UnsignedIntType())

@JvmName(name = "times_90")
operator fun RandomAccessible<UnsignedShortType>.times(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedShortType> = this.asType(UnsignedShortType()) *
    that.asType(UnsignedShortType())

@JvmName(name = "times_91")
operator fun RandomAccessible<UnsignedByteType>.times(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedShortType> = this.asType(UnsignedShortType()) *
    that.asType(UnsignedShortType())

@JvmName(name = "div_1")
operator fun <T> RandomAccessible<T>.div(that: RandomAccessible<T>): RandomAccessible<T> where T :
    Type<T>, T : Div<T> = convert(that, type) { t, u, v -> v.set(t); v /= u }

@JvmName(name = "div_2")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<FloatType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_3")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_4")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<LongType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_5")
operator fun RandomAccessible<LongType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_6")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_7")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_8")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<ShortType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_9")
operator fun RandomAccessible<ShortType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_10")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<ByteType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_11")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_12")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_13")
operator fun RandomAccessible<UnsignedLongType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_14")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_15")
operator fun RandomAccessible<UnsignedIntType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_16")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_17")
operator fun RandomAccessible<UnsignedShortType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_18")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_19")
operator fun RandomAccessible<UnsignedByteType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_20")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<LongType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_21")
operator fun RandomAccessible<LongType>.div(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_22")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_23")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_24")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<ShortType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_25")
operator fun RandomAccessible<ShortType>.div(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_26")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<ByteType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_27")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_28")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_29")
operator fun RandomAccessible<UnsignedLongType>.div(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_30")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_31")
operator fun RandomAccessible<UnsignedIntType>.div(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_32")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_33")
operator fun RandomAccessible<UnsignedShortType>.div(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_34")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_35")
operator fun RandomAccessible<UnsignedByteType>.div(that: RandomAccessible<FloatType>):
    RandomAccessible<FloatType> = this.asType(FloatType()) / that.asType(FloatType())

@JvmName(name = "div_36")
operator fun RandomAccessible<LongType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_37")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_38")
operator fun RandomAccessible<LongType>.div(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_39")
operator fun RandomAccessible<ShortType>.div(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_40")
operator fun RandomAccessible<LongType>.div(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_41")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_42")
operator fun RandomAccessible<LongType>.div(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_43")
operator fun RandomAccessible<UnsignedLongType>.div(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_44")
operator fun RandomAccessible<LongType>.div(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_45")
operator fun RandomAccessible<UnsignedIntType>.div(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_46")
operator fun RandomAccessible<LongType>.div(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_47")
operator fun RandomAccessible<UnsignedShortType>.div(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_48")
operator fun RandomAccessible<LongType>.div(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_49")
operator fun RandomAccessible<UnsignedByteType>.div(that: RandomAccessible<LongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_50")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<ShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_51")
operator fun RandomAccessible<ShortType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_52")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<ByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_53")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_54")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_55")
operator fun RandomAccessible<UnsignedLongType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_56")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_57")
operator fun RandomAccessible<UnsignedIntType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_58")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_59")
operator fun RandomAccessible<UnsignedShortType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_60")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_61")
operator fun RandomAccessible<UnsignedByteType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_62")
operator fun RandomAccessible<ShortType>.div(that: RandomAccessible<ByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_63")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<ShortType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_64")
operator fun RandomAccessible<ShortType>.div(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_65")
operator fun RandomAccessible<UnsignedLongType>.div(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_66")
operator fun RandomAccessible<ShortType>.div(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_67")
operator fun RandomAccessible<UnsignedIntType>.div(that: RandomAccessible<ShortType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_68")
operator fun RandomAccessible<ShortType>.div(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_69")
operator fun RandomAccessible<UnsignedShortType>.div(that: RandomAccessible<ShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_70")
operator fun RandomAccessible<ShortType>.div(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_71")
operator fun RandomAccessible<UnsignedByteType>.div(that: RandomAccessible<ShortType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_72")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_73")
operator fun RandomAccessible<UnsignedLongType>.div(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_74")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_75")
operator fun RandomAccessible<UnsignedIntType>.div(that: RandomAccessible<ByteType>):
    RandomAccessible<LongType> = this.asType(LongType()) / that.asType(LongType())

@JvmName(name = "div_76")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_77")
operator fun RandomAccessible<UnsignedShortType>.div(that: RandomAccessible<ByteType>):
    RandomAccessible<IntType> = this.asType(IntType()) / that.asType(IntType())

@JvmName(name = "div_78")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_79")
operator fun RandomAccessible<UnsignedByteType>.div(that: RandomAccessible<ByteType>):
    RandomAccessible<ShortType> = this.asType(ShortType()) / that.asType(ShortType())

@JvmName(name = "div_80")
operator fun RandomAccessible<UnsignedLongType>.div(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) /
    that.asType(UnsignedLongType())

@JvmName(name = "div_81")
operator fun RandomAccessible<UnsignedIntType>.div(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) /
    that.asType(UnsignedLongType())

@JvmName(name = "div_82")
operator fun RandomAccessible<UnsignedLongType>.div(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) /
    that.asType(UnsignedLongType())

@JvmName(name = "div_83")
operator fun RandomAccessible<UnsignedShortType>.div(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) /
    that.asType(UnsignedLongType())

@JvmName(name = "div_84")
operator fun RandomAccessible<UnsignedLongType>.div(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) /
    that.asType(UnsignedLongType())

@JvmName(name = "div_85")
operator fun RandomAccessible<UnsignedByteType>.div(that: RandomAccessible<UnsignedLongType>):
    RandomAccessible<UnsignedLongType> = this.asType(UnsignedLongType()) /
    that.asType(UnsignedLongType())

@JvmName(name = "div_86")
operator fun RandomAccessible<UnsignedIntType>.div(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) /
    that.asType(UnsignedIntType())

@JvmName(name = "div_87")
operator fun RandomAccessible<UnsignedShortType>.div(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) /
    that.asType(UnsignedIntType())

@JvmName(name = "div_88")
operator fun RandomAccessible<UnsignedIntType>.div(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) /
    that.asType(UnsignedIntType())

@JvmName(name = "div_89")
operator fun RandomAccessible<UnsignedByteType>.div(that: RandomAccessible<UnsignedIntType>):
    RandomAccessible<UnsignedIntType> = this.asType(UnsignedIntType()) /
    that.asType(UnsignedIntType())

@JvmName(name = "div_90")
operator fun RandomAccessible<UnsignedShortType>.div(that: RandomAccessible<UnsignedByteType>):
    RandomAccessible<UnsignedShortType> = this.asType(UnsignedShortType()) /
    that.asType(UnsignedShortType())

@JvmName(name = "div_91")
operator fun RandomAccessible<UnsignedByteType>.div(that: RandomAccessible<UnsignedShortType>):
    RandomAccessible<UnsignedShortType> = this.asType(UnsignedShortType()) /
    that.asType(UnsignedShortType())
