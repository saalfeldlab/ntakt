package net.imglib2.imklib

import kotlin.Byte
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.math.E
import net.imglib2.RandomAccessibleInterval
import net.imglib2.type.numeric.RealType

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.plus(value: T) =
    convert(type) { s, t -> t.set(s); t += value }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.plus(value: Byte) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.plus(value: Short) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.plus(value: Int) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.plus(value: Long) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.plus(value: Float) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.plus(value: Double) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.minus(value: T) =
    convert(type) { s, t -> t.set(s); t -= value }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.minus(value: Byte) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.minus(value: Short) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.minus(value: Int) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.minus(value: Long) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.minus(value: Float) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.minus(value: Double) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.times(value: T) =
    convert(type) { s, t -> t.set(s); t *= value }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.times(value: Byte) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.times(value: Short) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.times(value: Int) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.times(value: Long) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.times(value: Float) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.times(value: Double) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.div(value: T) =
    convert(type) { s, t -> t.set(s); t /= value }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.div(value: Byte) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.div(value: Short) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.div(value: Int) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.div(value: Long) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.div(value: Float) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RandomAccessibleInterval<T>.div(value: Double) =
    this / type.also { it.setTo(value) }

fun <T : RealType<T>> RandomAccessibleInterval<T>.pow(exponent: T) = convert(type) { s, t ->
    t.set(s); t.pow(exponent) }

infix fun <T : RealType<T>> RandomAccessibleInterval<T>.`**`(exponent: T) = pow(exponent)

fun <T : RealType<T>> RandomAccessibleInterval<T>.pow(exponent: RandomAccessibleInterval<T>) =
    convert(exponent, type) { s, t, u -> t.set(s); t.pow(u) }

infix fun <T : RealType<T>> RandomAccessibleInterval<T>.`**`(exponent: RandomAccessibleInterval<T>)
    = pow(exponent)

fun <T : RealType<T>> RandomAccessibleInterval<T>.pow(exponent: Double) = convert(type) { s, t ->
    t.set(s); t.pow(exponent) }

infix fun <T : RealType<T>> RandomAccessibleInterval<T>.`**`(exponent: Double) = pow(exponent)

fun <T : RealType<T>> RandomAccessibleInterval<T>.pow(exponent: Float) = convert(type) { s, t ->
    t.set(s); t.pow(exponent) }

infix fun <T : RealType<T>> RandomAccessibleInterval<T>.`**`(exponent: Float) = pow(exponent)

fun <T : RealType<T>> RandomAccessibleInterval<T>.exp(base: T) = convert(type) { s, t -> t.set(s);
    t.exp(base) }

fun <T : RealType<T>> RandomAccessibleInterval<T>.exp(exponent: RandomAccessibleInterval<T>) =
    convert(exponent, type) { s, t, u -> t.set(s); t.exp(u) }

fun <T : RealType<T>> RandomAccessibleInterval<T>.exp(base: Double = E) = convert(type) { s, t ->
    t.set(s); t.exp(base) }

fun <T : RealType<T>> RandomAccessibleInterval<T>.exp(base: Float) = convert(type) { s, t ->
    t.set(s); t.exp(base) }
