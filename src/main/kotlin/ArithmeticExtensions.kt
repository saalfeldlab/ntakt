package net.imglib2.imklib

import kotlin.jvm.JvmName
import net.imglib2.RandomAccessible
import net.imglib2.type.numeric.integer.ByteType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType

@JvmName(name = "plus_1")
operator fun RandomAccessible<ByteType>.plus(that: RandomAccessible<ByteType>):
        RandomAccessible<ByteType> = convert(that, ByteType()) { t, u, v -> v.set(t); v += u }

@JvmName(name = "plus_2")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<FloatType>):
        RandomAccessible<FloatType> = convert(that, FloatType()) { t, u, v -> v.set(t); v += u }

@JvmName(name = "plus_3")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<DoubleType>):
        RandomAccessible<DoubleType> = convert(that, DoubleType()) { t, u, v -> v.set(t); v += u }

@JvmName(name = "plus_4")
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<FloatType>):
        RandomAccessible<DoubleType> = asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_5")
operator fun RandomAccessible<FloatType>.plus(that: RandomAccessible<DoubleType>):
        RandomAccessible<DoubleType> = that + this

@JvmName(name = "minus_1")
operator fun RandomAccessible<ByteType>.minus(that: RandomAccessible<ByteType>):
        RandomAccessible<ByteType> = convert(that, ByteType()) { t, u, v -> v.set(t); v -= u }

@JvmName(name = "minus_2")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<FloatType>):
        RandomAccessible<FloatType> = convert(that, FloatType()) { t, u, v -> v.set(t); v -= u }

@JvmName(name = "minus_3")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<DoubleType>):
        RandomAccessible<DoubleType> = convert(that, DoubleType()) { t, u, v -> v.set(t); v -= u }

@JvmName(name = "minus_4")
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<FloatType>):
        RandomAccessible<DoubleType> = asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_5")
operator fun RandomAccessible<FloatType>.minus(that: RandomAccessible<DoubleType>):
        RandomAccessible<DoubleType> = that - this

@JvmName(name = "times_1")
operator fun RandomAccessible<ByteType>.times(that: RandomAccessible<ByteType>):
        RandomAccessible<ByteType> = convert(that, ByteType()) { t, u, v -> v.set(t); v *= u }

@JvmName(name = "times_2")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<FloatType>):
        RandomAccessible<FloatType> = convert(that, FloatType()) { t, u, v -> v.set(t); v *= u }

@JvmName(name = "times_3")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<DoubleType>):
        RandomAccessible<DoubleType> = convert(that, DoubleType()) { t, u, v -> v.set(t); v *= u }

@JvmName(name = "times_4")
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<FloatType>):
        RandomAccessible<DoubleType> = asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_5")
operator fun RandomAccessible<FloatType>.times(that: RandomAccessible<DoubleType>):
        RandomAccessible<DoubleType> = that * this

@JvmName(name = "div_1")
operator fun RandomAccessible<ByteType>.div(that: RandomAccessible<ByteType>):
        RandomAccessible<ByteType> = convert(that, ByteType()) { t, u, v -> v.set(t); v /= u }

@JvmName(name = "div_2")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<FloatType>):
        RandomAccessible<FloatType> = convert(that, FloatType()) { t, u, v -> v.set(t); v /= u }

@JvmName(name = "div_3")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<DoubleType>):
        RandomAccessible<DoubleType> = convert(that, DoubleType()) { t, u, v -> v.set(t); v /= u }

@JvmName(name = "div_4")
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<FloatType>):
        RandomAccessible<DoubleType> = asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_5")
operator fun RandomAccessible<FloatType>.div(that: RandomAccessible<DoubleType>):
        RandomAccessible<DoubleType> = that / this