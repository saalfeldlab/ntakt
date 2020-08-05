package net.imglib2.imklib

import net.imglib2.Interval
import net.imglib2.Localizable
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI
import net.imglib2.converter.BiConverter
import net.imglib2.converter.Converter
import net.imglib2.converter.Converters
import net.imglib2.type.Type
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.view.Views
import kotlin.math.E

operator fun <T> RA<T>.get(vararg position: Long): T = getAt(*position)
operator fun <T> RA<T>.get(vararg position: Int): T = getAt(*position)
operator fun <T> RA<T>.get(position: Localizable): T = getAt(position)

fun <T> RA<T>.translate(vararg translation: Long) = Views.translate(this, *translation)
fun <T> RA<T>.translate(translation: Localizable) = translate(*translation.positionAsLongArray())
fun <T> RA<T>.translateInverse(vararg translation: Long) = Views.translateInverse(this, *translation)
fun <T> RA<T>.translateInverse(translation: Localizable) = translateInverse(*translation.positionAsLongArray())
operator fun <T> RA<T>.plus(translation: LongArray) = translate(*translation)
operator fun <T> RA<T>.plus(translation: Localizable) = translate(translation)
operator fun <T> RA<T>.minus(translation: LongArray) = translateInverse(*translation)
operator fun <T> RA<T>.minus(translation: Localizable) = translateInverse(translation)

val <T: Type<T>> RA<T>.type get() = randomAccess().get().createVariable()

fun <T, U: Type<U>> RA<T>.convert(u: U, converter: Converter<T, U>) = Converters.convert(this, converter, u)
inline fun <T, U: Type<U>> RA<T>.convert(u : U, crossinline converter: (T, U) -> Unit) = convert(u, Converter { a, b -> converter(a, b) })
fun <T, U, V: Type<V>> RA<T>.convert(that: RA<U>, v: V, converter: BiConverter<T, U, V>) = Converters.convert(this, that, converter, v)
inline fun <T, U, V: Type<V>> RA<T>.convert(that: RA<U>, v: V, crossinline converter: (T, U, V) -> Unit) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })

fun <T> RA<T>.interval(min: LongArray, max: LongArray) = Views.interval(this, min, max)
fun <T> RA<T>.interval(vararg dims: Long) = interval(LongArray(dims.size) { 0L }, LongArray(dims.size) { dims[it] - 1L })
fun <T> RA<T>.interval(interval: Interval) = Views.interval(this, interval)
operator fun <T> RA<T>.get(interval: Interval) = interval(interval)

fun <T: RealType<T>, U: RealType<U>> RA<T>.asType(u: U) = if (u::class == type::class) this as RA<U> else convert(u) { s, t -> t.setReal(s.realDouble) }
fun <T: IntegerType<T>, U: IntegerType<U>> RA<T>.asType(u: U) = if (u::class == type::class) this as RA<U> else convert(u) { s, t -> t.setInteger(s.integerLong) }
val <T: RealType<T>> RA<T>.asBytes get() = asType(ByteType())
val <T: RealType<T>> RA<T>.asShorts get() = asType(ShortType())
val <T: RealType<T>> RA<T>.asInts get() = asType(IntType())
val <T: RealType<T>> RA<T>.asLongs get() = asType(LongType())
val <T: RealType<T>> RA<T>.asUnsignedBytes get() = asType(UnsignedByteType())
val <T: RealType<T>> RA<T>.asUnsignedShorts get() = asType(UnsignedShortType())
val <T: RealType<T>> RA<T>.asUnsignedInts get() = asType(UnsignedIntType())
val <T: RealType<T>> RA<T>.asUnsignedLongs get() = asType(UnsignedLongType())
val <T: RealType<T>> RA<T>.asFloats get() = asType(FloatType())
val <T: RealType<T>> RA<T>.asDoubles get() = asType(DoubleType())

operator fun <T: RealType<T>> RA<T>.unaryMinus() = convert(type) { s, t -> t.setReal(-s.realDouble) }
operator fun <T: RealType<T>> RA<T>.unaryPlus() = this

operator fun <T: RealType<T>> RA<T>.plus(that: RA<T>) = convert(that, type) { t, u, v -> v.set(t); v += u }
operator fun <T: RealType<T>> RA<T>.plus(that: RAI<T>) = this[that] + that
operator fun <T: RealType<T>> RA<T>.plus(value: T) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RA<T>.plus(value: Byte) = this + type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.plus(value: Short) = this + type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.plus(value: Int) = this + type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.plus(value: Long) = this + type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.plus(value: Float) = this + type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.plus(value: Double) = this + type.also { it.setTo(value) }
operator fun <T: RealType<T>> T.plus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Byte.plus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Short.plus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Int.plus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Long.plus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Float.plus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Double.plus(that: RA<T>) = that + this

operator fun <T: RealType<T>> RA<T>.minus(that: RA<T>) = convert(that, type) { t, u, v -> v.set(t); v -= u }
operator fun <T: RealType<T>> RA<T>.minus(that: RAI<T>) = this[that] - that
operator fun <T: RealType<T>> RA<T>.minus(value: T) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RA<T>.minus(value: Byte) = this - type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.minus(value: Short) = this - type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.minus(value: Int) = this - type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.minus(value: Long) = this - type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.minus(value: Float) = this - type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.minus(value: Double) = this - type.also { it.setTo(value) }
operator fun <T: RealType<T>> T.minus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Byte.minus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Short.minus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Int.minus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Long.minus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Float.minus(that: RA<T>) = that + this
operator fun <T: RealType<T>> Double.minus(that: RA<T>) = that + this

operator fun <T: RealType<T>> RA<T>.times(that: RA<T>) = convert(that, type) { t, u, v -> v.set(t); v *= u }
operator fun <T: RealType<T>> RA<T>.times(that: RAI<T>) = this[that] * that
operator fun <T: RealType<T>> RA<T>.times(value: T) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RA<T>.times(value: Byte) = this * type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.times(value: Short) = this * type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.times(value: Int) = this * type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.times(value: Long) = this * type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.times(value: Float) = this * type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.times(value: Double) = this * type.also { it.setTo(value) }
operator fun <T: RealType<T>> T.times(that: RA<T>) = that + this
operator fun <T: RealType<T>> Byte.times(that: RA<T>) = that + this
operator fun <T: RealType<T>> Short.times(that: RA<T>) = that + this
operator fun <T: RealType<T>> Int.times(that: RA<T>) = that + this
operator fun <T: RealType<T>> Long.times(that: RA<T>) = that + this
operator fun <T: RealType<T>> Float.times(that: RA<T>) = that + this
operator fun <T: RealType<T>> Double.times(that: RA<T>) = that + this

operator fun <T: RealType<T>> RA<T>.div(that: RA<T>) = convert(that, type) { t, u, v -> v.set(t); v /= u }
operator fun <T: RealType<T>> RA<T>.div(that: RAI<T>) = this[that] / that
operator fun <T: RealType<T>> RA<T>.div(value: T) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RA<T>.div(value: Byte) = this / type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.div(value: Short) = this / type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.div(value: Int) = this / type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.div(value: Long) = this / type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.div(value: Float) = this / type.also { it.setTo(value) }
operator fun <T: RealType<T>> RA<T>.div(value: Double) = this / type.also { it.setTo(value) }
operator fun <T: RealType<T>> T.div(that: RA<T>) = that + this
operator fun <T: RealType<T>> Byte.div(that: RA<T>) = that + this
operator fun <T: RealType<T>> Short.div(that: RA<T>) = that + this
operator fun <T: RealType<T>> Int.div(that: RA<T>) = that + this
operator fun <T: RealType<T>> Long.div(that: RA<T>) = that + this
operator fun <T: RealType<T>> Float.div(that: RA<T>) = that + this
operator fun <T: RealType<T>> Double.div(that: RA<T>) = that + this

infix fun <T: RealType<T>> RA<T>.`**`(exponent: RA<T>) = convert(exponent, type) { t, u, v -> v.set(t); v.pow(u) }
infix fun <T: RealType<T>> RA<T>.`**`(exponent: Double) = convert(type) { s, t -> t.set(s); t.pow(exponent) }
infix fun <T: RealType<T>> RA<T>.`**`(exponent: Float) = convert(type) { s, t -> t.set(s); t.pow(exponent) }
infix fun <T: RealType<T>> RA<T>.`**`(exponent: RealType<*>) = convert(type) { s, t -> t.set(s); t.pow(exponent) }
fun <T: RealType<T>> RA<T>.exp(base: RA<T>) = convert(base, type) { t, u, v -> v.set(u); v.pow(t) }
fun <T: RealType<T>> RA<T>.exp(base: Double = E) = convert(type) { s, t -> t.set(s); t.exp(base) }
fun <T: RealType<T>> RA<T>.exp(base: Float) = exp(base.toDouble())
fun <T: RealType<T>> RA<T>.exp(base: RealType<*>) = exp(base.getRealDouble())