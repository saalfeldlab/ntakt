package net.imglib2.imklib

import kotlin.Byte
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import net.imglib2.RandomAccessible
import net.imglib2.type.numeric.RealType

operator fun <T : RealType<T>> RandomAccessible<T>.plus(value: T) =
    convert(type) { s, t -> t.set(s); t += value }

operator fun <T : RealType<T>> RandomAccessible<T>.plus(value: Byte) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.plus(value: Short) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.plus(value: Int) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.plus(value: Long) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.plus(value: Float) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.plus(value: Double) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.minus(value: T) =
    convert(type) { s, t -> t.set(s); t -= value }

operator fun <T : RealType<T>> RandomAccessible<T>.minus(value: Byte) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.minus(value: Short) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.minus(value: Int) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.minus(value: Long) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.minus(value: Float) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.minus(value: Double) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.times(value: T) =
    convert(type) { s, t -> t.set(s); t *= value }

operator fun <T : RealType<T>> RandomAccessible<T>.times(value: Byte) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.times(value: Short) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.times(value: Int) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.times(value: Long) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.times(value: Float) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.times(value: Double) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.div(value: T) = convert(type) { s, t -> t.set(s);
    t /= value }

operator fun <T : RealType<T>> RandomAccessible<T>.div(value: Byte) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.div(value: Short) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.div(value: Int) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.div(value: Long) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.div(value: Float) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessible<T>.div(value: Double) =
    this / type.also { it.setTo(value) }
