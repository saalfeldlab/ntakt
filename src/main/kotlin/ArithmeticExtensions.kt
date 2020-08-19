package net.imglib2.imklib

import kotlin.jvm.JvmName
import net.imglib2.RandomAccessible
import net.imglib2.type.Type
import net.imglib2.type.numeric.integer.IntType
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
operator fun RandomAccessible<DoubleType>.plus(that: RandomAccessible<IntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

@JvmName(name = "plus_5")
operator fun RandomAccessible<IntType>.plus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) + that.asType(DoubleType())

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
operator fun RandomAccessible<DoubleType>.minus(that: RandomAccessible<IntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

@JvmName(name = "minus_5")
operator fun RandomAccessible<IntType>.minus(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) - that.asType(DoubleType())

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
operator fun RandomAccessible<DoubleType>.times(that: RandomAccessible<IntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

@JvmName(name = "times_5")
operator fun RandomAccessible<IntType>.times(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) * that.asType(DoubleType())

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
operator fun RandomAccessible<DoubleType>.div(that: RandomAccessible<IntType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())

@JvmName(name = "div_5")
operator fun RandomAccessible<IntType>.div(that: RandomAccessible<DoubleType>):
    RandomAccessible<DoubleType> = this.asType(DoubleType()) / that.asType(DoubleType())
