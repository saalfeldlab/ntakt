package net.imklib2

import net.imglib2.*
import net.imglib2.converter.BiConverter
import net.imglib2.converter.Converter
import net.imglib2.converter.Converters
import net.imglib2.type.Type
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.util.Intervals
import net.imglib2.view.Views
import kotlin.math.E
import kotlin.math.pow
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI


// types

// RealType
// createWithValue
fun <T: RealType<T>> T.createWithValue(value: Byte) = createVariable().also { it.setReal(value.toDouble()) }
fun <T: RealType<T>> T.createWithValue(value: Short) = createVariable().also { it.setReal(value.toDouble()) }
fun <T: RealType<T>> T.createWithValue(value: Int) = createVariable().also { it.setReal(value.toDouble()) }
fun <T: RealType<T>> T.createWithValue(value: Long) = createVariable().also { it.setReal(value.toDouble()) }
fun <T: RealType<T>> T.createWithValue(value: Float) = createVariable().also { it.setReal(value) }
fun <T: RealType<T>> T.createWithValue(value: Double) = createVariable().also { it.setReal(value) }

fun <T: RealType<T>> Byte.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Short.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Int.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Long.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Float.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Double.asType(type: T) = type.createWithValue(this)

fun Float.asType() = asType(FloatType())
fun Double.asType() = asType(DoubleType())

// conversion
val <T: RealType<T>> T.floatType get() = when(this) {
    is FloatType -> copy()
    else -> FloatType(realFloat)
}
val <T: RealType<T>> T.doubleType get() = when(this) {
    is DoubleType -> copy()
    else -> DoubleType(realDouble)
}

// add
operator fun <T: RealType<T>> T.plusAssign(value: T) = add(value)
operator fun <T: RealType<T>> T.plus(value: T) = copy().also { it += value }
// T + primitive type
operator fun <T: RealType<T>> T.plusAssign(value: Byte) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Byte) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Short) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Short) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Int) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Int) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Long) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Long) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Float) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Float) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Double) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Double) = createWithValue(value).also { it += this }
// primitive type + T
operator fun <T: RealType<T>> Byte.plus(value: T) = value + this
operator fun <T: RealType<T>> Short.plus(value: T) = value + this
operator fun <T: RealType<T>> Int.plus(value: T) = value + this
operator fun <T: RealType<T>> Long.plus(value: T) = value + this
operator fun <T: RealType<T>> Float.plus(value: T) = value + this
operator fun <T: RealType<T>> Double.plus(value: T) = value + this

// subtract
operator fun <T: RealType<T>> T.minusAssign(value: T) = sub(value)
operator fun <T: RealType<T>> T.minus(value: T) = copy().also { it -= value }
// T - primitive type
operator fun <T: RealType<T>> T.minusAssign(value: Byte) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Byte) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Short) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Short) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Int) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Int) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Long) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Long) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Float) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Float) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Double) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Double) = copy().also { it -= value }
// primitive type - T
operator fun <T: RealType<T>> Byte.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Short.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Int.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Long.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Float.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Double.minus(value: T) = asType(value) - value

// multiply
operator fun <T: RealType<T>> T.timesAssign(value: T) = mul(value)
operator fun <T: RealType<T>> T.times(value: T) = copy().also { it *= value }
// T * primitive type
operator fun <T: RealType<T>> T.timesAssign(value: Byte) = mul(value.toDouble())
operator fun <T: RealType<T>> T.times(value: Byte) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Short) = mul(value.toDouble())
operator fun <T: RealType<T>> T.times(value: Short) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Int) = mul(value.toDouble())
operator fun <T: RealType<T>> T.times(value: Int) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Long) = mul(value.toDouble())
operator fun <T: RealType<T>> T.times(value: Long) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Float) = mul(value)
operator fun <T: RealType<T>> T.times(value: Float) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Double) = mul(value)
operator fun <T: RealType<T>> T.times(value: Double) = copy().also { it *= value }
// primitive type * T
operator fun <T: RealType<T>> Byte.times(value: T) = value * this
operator fun <T: RealType<T>> Short.times(value: T) = value * this
operator fun <T: RealType<T>> Int.times(value: T) = value * this
operator fun <T: RealType<T>> Long.times(value: T) = value * this
operator fun <T: RealType<T>> Float.times(value: T) = value * this
operator fun <T: RealType<T>> Double.times(value: T) = value * this

// divide
operator fun <T: RealType<T>> T.divAssign(value: T) = div(value)
// T / primitive type
operator fun <T: RealType<T>> T.divAssign(value: Byte) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Byte) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Short) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Short) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Int) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Int) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Long) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Long) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Float) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Float) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Double) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Double) = copy().also { it /= value }
// primitive Type / T
operator fun <T: RealType<T>> Byte.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Short.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Int.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Long.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Float.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Double.div(value: T) = asType(value).also { it /= value }

// power
fun <T: RealType<T>> T.pow(exponent: Float) = setReal(realFloat.pow(exponent))
fun <T: RealType<T>> T.pow(exponent: Int) = setReal(realDouble.pow(exponent))
fun <T: RealType<T>> Double.pow(exponent: T) = pow(exponent.realDouble)
fun <T: RealType<T>> Float.pow(exponent: T) = pow(exponent.realFloat)
fun <T: RealType<T>> Int.pow(exponent: T) = toDouble().pow(exponent.realDouble)
fun <T: RealType<T>> T.pow(exponent: RealType<*>) = pow(exponent.getRealDouble())
fun <T: RealType<T>> T.pow(exponent: IntegerType<*>) = pow(exponent.getInteger())
infix fun <T: RealType<T>> T.`**`(exponent: Double) = copy().also { pow(exponent) }
infix fun <T: RealType<T>> T.`**`(exponent: Float) = copy().also { pow(exponent) }
infix fun <T: RealType<T>> T.`**`(exponent: RealType<*>) = copy().also { pow(exponent) }
infix fun <T: RealType<T>> T.`**`(exponent: IntegerType<*>) = copy().also { pow(exponent) }

// exp
fun <T: RealType<T>> T.exp(base: Double = E) = { setReal(base.pow(realDouble)) }
fun <T: RealType<T>> T.exp(base: Float = E.toFloat()) = { setReal(base.pow(realFloat)) }
fun <T: RealType<T>> T.exp(base: RealType<*>) = { setReal(base.getRealDouble().pow(realDouble)) }


// IntegerType
// createWithValue
fun <T: IntegerType<T>> T.createWithValue(value: Byte) = createVariable().also { it.setInteger(value.toInt()) }
fun <T: IntegerType<T>> T.createWithValue(value: Short) = createVariable().also { it.setInteger(value.toInt()) }
fun <T: IntegerType<T>> T.createWithValue(value: Int) = createVariable().also { it.setInteger(value) }
fun <T: IntegerType<T>> T.createWithValue(value: Long) = createVariable().also { it.setInteger(value) }

fun <T: IntegerType<T>> Byte.asType(type: T) = type.createWithValue(this)
fun <T: IntegerType<T>> Short.asType(type: T) = type.createWithValue(this)
fun <T: IntegerType<T>> Int.asType(type: T) = type.createWithValue(this)
fun <T: IntegerType<T>> Long.asType(type: T) = type.createWithValue(this)

fun Byte.asType() = asType(ByteType())
fun Short.asType() = asType(ShortType())
fun Int.asType() = asType(IntType())
fun Long.asType() = asType(LongType())

fun Byte.asUnsignedType() = asType(UnsignedByteType())
fun Short.asUnsignedType() = asType(UnsignedShortType())
fun Int.asUnsignedType() = asType(UnsignedIntType())
fun Long.asUnsignedType() = asType(UnsignedLongType())

// conversion
val <T: IntegerType<T>> T.byteType get() = when(this) {
    is ByteType -> copy()
    else -> ByteType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.unsignedByteType get() = when(this) {
    is UnsignedByteType -> copy()
    else -> UnsignedByteType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.shortType get() = when(this) {
    is ShortType -> copy()
    else -> ShortType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.unsignedShortType get() = when(this) {
    is UnsignedShortType -> copy()
    else -> UnsignedShortType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.intType get() = when(this) {
    is IntType -> copy()
    else -> IntType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.unsignedIntType get() = when(this) {
    is UnsignedIntType -> copy()
    else -> UnsignedIntType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.longType get() = when(this) {
    is LongType -> copy()
    else -> LongType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.unsignedLongType get() = when(this) {
    is UnsignedLongType -> copy()
    else -> UnsignedLongType().also { it.setInteger(integerLong) }
}

// add
// T + primitive type
operator fun <T: IntegerType<T>> T.plusAssign(value: Byte) = setInteger(integerLong + value)
operator fun <T: IntegerType<T>> T.plus(value: Byte) = copy().also { it += value }
operator fun <T: IntegerType<T>> T.plusAssign(value: Short) = setInteger(integerLong + value)
operator fun <T: IntegerType<T>> T.plus(value: Short) = copy().also { it += value }
operator fun <T: IntegerType<T>> T.plusAssign(value: Int) = setInteger(integerLong + value)
operator fun <T: IntegerType<T>> T.plus(value: Int) = copy().also { it += value }
operator fun <T: IntegerType<T>> T.plusAssign(value: Long) = setInteger(integerLong + value)
operator fun <T: IntegerType<T>> T.plus(value: Long) = copy().also { it += value }
// primitive type + T
operator fun <T: IntegerType<T>> Byte.plus(value: T) = value + this
operator fun <T: IntegerType<T>> Short.plus(value: T) = value + this
operator fun <T: IntegerType<T>> Int.plus(value: T) = value + this
operator fun <T: IntegerType<T>> Long.plus(value: T) = value + this

// subtract
// T - primitive type
operator fun <T: IntegerType<T>> T.minusAssign(value: Byte) = setInteger(integerLong - value)
operator fun <T: IntegerType<T>> T.minus(value: Byte) = copy().also { it -= value }
operator fun <T: IntegerType<T>> T.minusAssign(value: Short) = setInteger(integerLong - value)
operator fun <T: IntegerType<T>> T.minus(value: Short) = copy().also { it -= value }
operator fun <T: IntegerType<T>> T.minusAssign(value: Int) = setInteger(integerLong - value)
operator fun <T: IntegerType<T>> T.minus(value: Int) = copy().also { it -= value }
operator fun <T: IntegerType<T>> T.minusAssign(value: Long) = setInteger(integerLong - value)
operator fun <T: IntegerType<T>> T.minus(value: Long) = copy().also { it -= value }
// primitive type - T
operator fun <T: IntegerType<T>> Byte.minus(value: T) = asType(value) - value
operator fun <T: IntegerType<T>> Short.minus(value: T) = asType(value) - value
operator fun <T: IntegerType<T>> Int.minus(value: T) = asType(value) - value
operator fun <T: IntegerType<T>> Long.minus(value: T) = asType(value) - value

// multiply
// T * primitive type
operator fun <T: IntegerType<T>> T.timesAssign(value: Byte) = setInteger(integerLong * value)
operator fun <T: IntegerType<T>> T.times(value: Byte) = copy().also { it *= value }
operator fun <T: IntegerType<T>> T.timesAssign(value: Short) = setInteger(integerLong * value)
operator fun <T: IntegerType<T>> T.times(value: Short) = copy().also { it *= value }
operator fun <T: IntegerType<T>> T.timesAssign(value: Int) = setInteger(integerLong * value)
operator fun <T: IntegerType<T>> T.times(value: Int) = copy().also { it *= value }
operator fun <T: IntegerType<T>> T.timesAssign(value: Long) = setInteger(integerLong * value)
operator fun <T: IntegerType<T>> T.times(value: Long) = copy().also { it *= value }
// primitive type * T
operator fun <T: IntegerType<T>> Byte.times(value: T) = value * this
operator fun <T: IntegerType<T>> Short.times(value: T) = value * this
operator fun <T: IntegerType<T>> Int.times(value: T) = value * this
operator fun <T: IntegerType<T>> Long.times(value: T) = value * this

// divide
// T / primtive type
operator fun <T: IntegerType<T>> T.divAssign(value: Byte) = setInteger(integerLong / value)
operator fun <T: IntegerType<T>> T.div(value: Byte) = copy().also { it /= value }
operator fun <T: IntegerType<T>> T.divAssign(value: Short) = setInteger(integerLong / value)
operator fun <T: IntegerType<T>> T.div(value: Short) = copy().also { it /= value }
operator fun <T: IntegerType<T>> T.divAssign(value: Int) = setInteger(integerLong / value)
operator fun <T: IntegerType<T>> T.div(value: Int) = copy().also { it /= value }
operator fun <T: IntegerType<T>> T.divAssign(value: Long) = setInteger(integerLong / value)
operator fun <T: IntegerType<T>> T.div(value: Long) = copy().also { it /= value }
// primitive type / T
operator fun <T: IntegerType<T>> Byte.div(value: T) = asType(value).also { it /= value }
operator fun <T: IntegerType<T>> Short.div(value: T) = asType(value).also { it /= value }
operator fun <T: IntegerType<T>> Int.div(value: T) = asType(value).also { it /= value }
operator fun <T: IntegerType<T>> Long.div(value: T) = asType(value).also { it /= value }


// RandomAccessible, RandomAccessibleInterval, Interval
operator fun <T> RA<T>.get(vararg position: Long): T = getAt(*position)
operator fun <T> RA<T>.get(vararg position: Int): T = getAt(*position)
operator fun <T> RA<T>.get(position: Localizable): T = getAt(position)

fun <T> RA<T>.translate(vararg translation: Long): RA<T> = Views.translate(this, *translation)
fun <T> RAI<T>.translate(vararg translation: Long): RAI<T> = Views.translate(this, *translation)

val <T> RA<T>.type get() = randomAccess().get()
val <T: Type<T>> RA<T>.type get() = randomAccess().get().createVariable()
val <T> RAI<T>.type get() = this[minAsPoint()]
val <T: Type<T>> RAI<T>.type get() = this[minAsPoint()].createVariable()

// RA
fun <T, U: Type<U>> RA<T>.convert(u: U, converter: Converter<T, U>) = Converters.convert(this, converter, u)
inline fun <T, U: Type<U>> RA<T>.convert(u : U, crossinline converter: (T, U) -> Unit) = convert(u, Converter { a, b -> converter(a, b) })
fun <T, U, V: Type<V>> RA<T>.convert(that: RA<U>, v: V, converter: BiConverter<T, U, V>) = Converters.convert(this, that, converter, v)
inline fun <T, U, V: Type<V>> RA<T>.convert(that: RA<U>, v: V, crossinline converter: (T, U, V) -> Unit) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })

operator fun <T: RealType<T>> RA<T>.plus(that: RA<T>) = convert(that, type) { t, u, v -> v.set(t); v += u }
operator fun <T: RealType<T>> RA<T>.plus(value: Byte) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RA<T>.plus(value: Short) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RA<T>.plus(value: Int) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RA<T>.plus(value: Long) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RA<T>.plus(value: Float) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RA<T>.plus(value: Double) = convert(type) { s, t -> t.set(s); t += value }

operator fun <T: RealType<T>> RA<T>.minus(that: RA<T>) = convert(that, type) { t, u, v -> v.set(t); v -= u }
operator fun <T: RealType<T>> RA<T>.minus(value: Byte) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RA<T>.minus(value: Short) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RA<T>.minus(value: Int) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RA<T>.minus(value: Long) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RA<T>.minus(value: Float) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RA<T>.minus(value: Double) = convert(type) { s, t -> t.set(s); t -= value }

operator fun <T: RealType<T>> RA<T>.times(that: RA<T>) = convert(that, type) { t, u, v -> v.set(t); v *= u }
operator fun <T: RealType<T>> RA<T>.times(value: Byte) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RA<T>.times(value: Short) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RA<T>.times(value: Int) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RA<T>.times(value: Long) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RA<T>.times(value: Float) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RA<T>.times(value: Double) = convert(type) { s, t -> t.set(s); t *= value }

operator fun <T: RealType<T>> RA<T>.div(that: RA<T>) = convert(that, type) { t, u, v -> v.set(t); v /= u }
operator fun <T: RealType<T>> RA<T>.div(value: Byte) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RA<T>.div(value: Short) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RA<T>.div(value: Int) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RA<T>.div(value: Long) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RA<T>.div(value: Float) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RA<T>.div(value: Double) = convert(type) { s, t -> t.set(s); t /= value }

infix fun <T: RealType<T>> RA<T>.`**`(exponent: RA<T>) = convert(exponent, type) { t, u, v -> v.set(t); v.pow(u) }
infix fun <T: RealType<T>> RA<T>.`**`(exponent: Double) = convert(type) { s, t -> t.set(s); t.pow(exponent) }
infix fun <T: RealType<T>> RA<T>.`**`(exponent: Float) = convert(type) { s, t -> t.set(s); t.pow(exponent) }
infix fun <T: RealType<T>> RA<T>.`**`(exponent: RealType<*>) = convert(type) { s, t -> t.set(s); t.pow(exponent) }
fun <T: RealType<T>> RA<T>.exp(base: RA<T>) = convert(base, type) { t, u, v -> v.set(u); v.pow(t) }
fun <T: RealType<T>> RA<T>.exp(base: Double = E) = convert(type) { s, t -> t.set(s); t.exp(base) }
fun <T: RealType<T>> RA<T>.exp(base: Float) = exp(base.toDouble())
fun <T: RealType<T>> RA<T>.exp(base: RealType<*>) = exp(base.getRealDouble())

// RAI
fun <T, U: Type<U>> RAI<T>.convert(u: U, converter: Converter<T, U>) = Converters.convert(this, converter, u)
inline fun <T, U: Type<U>> RAI<T>.convert(u : U, crossinline converter: (T, U) -> Unit) = convert(u, Converter { a, b -> converter(a, b) })
fun <T, U, V: Type<V>> RAI<T>.convert(that: RAI<U>, v: V, converter: BiConverter<T, U, V>) = Converters.convert(this, that, converter, v)
inline fun <T, U, V: Type<V>> RAI<T>.convert(that: RAI<U>, v: V, crossinline converter: (T, U, V) -> Unit) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })

operator fun <T: RealType<T>> RAI<T>.plus(that: RAI<T>) = convert(that, type) { t, u, v -> v.set(t); v += u }
operator fun <T: RealType<T>> RAI<T>.plus(value: Byte) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RAI<T>.plus(value: Short) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RAI<T>.plus(value: Int) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RAI<T>.plus(value: Long) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RAI<T>.plus(value: Float) = convert(type) { s, t -> t.set(s); t += value }
operator fun <T: RealType<T>> RAI<T>.plus(value: Double) = convert(type) { s, t -> t.set(s); t += value }

operator fun <T: RealType<T>> RAI<T>.minus(that: RAI<T>) = convert(that, type) { t, u, v -> v.set(t); v -= u }
operator fun <T: RealType<T>> RAI<T>.minus(value: Byte) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RAI<T>.minus(value: Short) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RAI<T>.minus(value: Int) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RAI<T>.minus(value: Long) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RAI<T>.minus(value: Float) = convert(type) { s, t -> t.set(s); t -= value }
operator fun <T: RealType<T>> RAI<T>.minus(value: Double) = convert(type) { s, t -> t.set(s); t -= value }

operator fun <T: RealType<T>> RAI<T>.times(that: RAI<T>) = convert(that, type) { t, u, v -> v.set(t); v *= u }
operator fun <T: RealType<T>> RAI<T>.times(value: Byte) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RAI<T>.times(value: Short) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RAI<T>.times(value: Int) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RAI<T>.times(value: Long) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RAI<T>.times(value: Float) = convert(type) { s, t -> t.set(s); t *= value }
operator fun <T: RealType<T>> RAI<T>.times(value: Double) = convert(type) { s, t -> t.set(s); t *= value }

operator fun <T: RealType<T>> RAI<T>.div(that: RAI<T>) = convert(that, type) { t, u, v -> v.set(t); v /= u }
operator fun <T: RealType<T>> RAI<T>.div(value: Byte) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RAI<T>.div(value: Short) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RAI<T>.div(value: Int) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RAI<T>.div(value: Long) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RAI<T>.div(value: Float) = convert(type) { s, t -> t.set(s); t /= value }
operator fun <T: RealType<T>> RAI<T>.div(value: Double) = convert(type) { s, t -> t.set(s); t /= value }

infix fun <T: RealType<T>> RAI<T>.`**`(exponent: RAI<T>) = convert(exponent, type) { t, u, v -> v.set(t); v.pow(u) }
infix fun <T: RealType<T>> RAI<T>.`**`(exponent: Double) = convert(type) { s, t -> t.set(s); t.pow(exponent) }
infix fun <T: RealType<T>> RAI<T>.`**`(exponent: Float) = convert(type) { s, t -> t.set(s); t.pow(exponent) }
infix fun <T: RealType<T>> RAI<T>.`**`(exponent: RealType<*>) = convert(type) { s, t -> t.set(s); t.pow(exponent) }
fun <T: RealType<T>> RAI<T>.exp(base: RAI<T>) = convert(base, type) { t, u, v -> v.set(u); v.pow(t) }
fun <T: RealType<T>> RAI<T>.exp(base: Double = E) = convert(type) { s, t -> t.set(s); t.exp(base) }
fun <T: RealType<T>> RAI<T>.exp(base: Float) = exp(base.toDouble())
fun <T: RealType<T>> RAI<T>.exp(base: RealType<*>) = exp(base.getRealDouble())

val Interval.minAsLongs: LongArray get() = minAsLongArray()
val Interval.maxAsLongs: LongArray get() = maxAsLongArray()
val Interval.minAsInts: IntArray get() = IntArray(numDimensions()) { min(it).toInt() }
val Interval.maxAsInts: IntArray get() = IntArray(numDimensions()) { max(it).toInt() }
val Interval.minAsPoint: Point get() = minAsPoint()
val Interval.maxAsPoint: Point get() = maxAsPoint()
val RealInterval.minAsDoubles: DoubleArray get() = minAsDoubleArray()
val RealInterval.maxAsDoubles: DoubleArray get() = maxAsDoubleArray()
val RealInterval.minAsFloats: FloatArray get() = FloatArray(numDimensions()) { realMin(it).toFloat() }
val RealInterval.maxAsFloats: FloatArray get() = FloatArray(numDimensions()) { realMax(it).toFloat() }
val RealInterval.minAsRealPoint: RealPoint get() = minAsRealPoint()
// TODO wait for imglib/imglib2#292 before reverting back to maxAsRealPoint()
val RealInterval.maxAsRealPoint: RealPoint get() = RealPoint(numDimensions()).also { realMax(it) }

infix fun Interval.intersect(that: Interval) = Intervals.intersect(this, that)
infix fun Interval.union(that: Interval) = Intervals.union(this, that)
operator fun Interval.contains(that: Interval) = Intervals.contains(this, that)
operator fun Interval.contains(location: Localizable) = Intervals.contains(this, location)
operator fun Interval.contains(location: IntArray) = containsAll(*location)
operator fun Interval.contains(location: LongArray) = containsAll(*location)
fun Interval.containsAll(vararg location: Int): Boolean {
    for (d in 0 until numDimensions()) {
        val p = location[d]
        if (p < min(d) || p > max(d))
            return false
    }
    return true
}
fun Interval.containsAll(vararg location: Long): Boolean {
    for (d in 0 until numDimensions()) {
        val p = location[d]
        if (p < min(d) || p > max(d))
            return false
    }
    return true
}

infix fun RealInterval.intersect(that: RealInterval) = Intervals.intersect(this, that)
infix fun RealInterval.union(that: RealInterval) = Intervals.union(this, that)
operator fun RealInterval.contains(that: RealInterval) = Intervals.contains(this, that)
operator fun RealInterval.contains(location: RealLocalizable) = Intervals.contains(this, location)
operator fun RealInterval.contains(location: FloatArray) = containsAll(*location)
operator fun RealInterval.contains(location: DoubleArray) = containsAll(*location)
fun RealInterval.containsAll(vararg location: Float): Boolean {
    for (d in 0 until numDimensions()) {
        val p = location[d]
        if (p < realMin(d) || p > realMax(d))
            return false
    }
    return true
}
fun RealInterval.containsAll(vararg location: Double): Boolean {
    for (d in 0 until numDimensions()) {
        val p = location[d]
        if (p < realMin(d) || p > realMax(d))
            return false
    }
    return true
}