package net.imklib2

import net.imglib2.*
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imklib2.IntegerTypeExtensions.Companion.asType
import net.imklib2.IntegerTypeExtensions.Companion.plus
import net.imklib2.IntegerTypeExtensions.Companion.times
import net.imklib2.RealTypeExtensions.Companion.asType
import net.imklib2.RealTypeExtensions.Companion.minus
import net.imklib2.RealTypeExtensions.Companion.minusAssign
import net.imklib2.RealTypeExtensions.Companion.plus
import net.imklib2.RealTypeExtensions.Companion.times
import net.imklib2.RealTypeExtensions.Companion.timesAssign
import net.imklib2.IntegerTypeExtensions as ITE
import net.imklib2.RandomAccessibleExtensions as RAE
import net.imklib2.RealTypeExtensions as RTE


// types

// RealType
// createWithValue
fun <T: RealType<T>> T.createWithValue(value: Byte) = with(RTE) { createWithValue(value) }
fun <T: RealType<T>> T.createWithValue(value: Short) = with(RTE) { createWithValue(value) }
fun <T: RealType<T>> T.createWithValue(value: Int) = with(RTE) { createWithValue(value) }
fun <T: RealType<T>> T.createWithValue(value: Long) = with(RTE) { createWithValue(value) }
fun <T: RealType<T>> T.createWithValue(value: Float) = with(RTE) { createWithValue(value) }
fun <T: RealType<T>> T.createWithValue(value: Double) = with(RTE) { createWithValue(value) }

fun <T: RealType<T>> Byte.asType(type: T) = with(RTE) { asType(type) }
fun <T: RealType<T>> Short.asType(type: T) = with(RTE) { asType(type) }
fun <T: RealType<T>> Int.asType(type: T) = with(RTE) { asType(type) }
fun <T: RealType<T>> Long.asType(type: T) = with(RTE) { asType(type) }
fun <T: RealType<T>> Float.asType(type: T) = with(RTE) { asType(type) }
fun <T: RealType<T>> Double.asType(type: T) = with(RTE) { asType(type) }

fun Float.asType() = with(RTE) { asType() }
fun Double.asType() = with(RTE) { asType() }

// conversion
val <T: RealType<T>> T.floatType get() = with(RTE) { floatType }
val <T: RealType<T>> T.doubleType get() = with(RTE) { doubleType }

// add
operator fun <T: RealType<T>> T.plusAssign(value: T) = with(RTE) { this@plusAssign += value }
operator fun <T: RealType<T>> T.plus(value: T) = with(RTE) { this@plus + value }
// T + primitive type
operator fun <T: RealType<T>> T.plusAssign(value: Byte) = with(RTE) { this@plusAssign += value }
operator fun <T: RealType<T>> T.plus(value: Byte) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> T.plusAssign(value: Short) = with(RTE) { this@plusAssign += value }
operator fun <T: RealType<T>> T.plus(value: Short) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> T.plusAssign(value: Int) = with(RTE) { this@plusAssign += value }
operator fun <T: RealType<T>> T.plus(value: Int) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> T.plusAssign(value: Long) = with(RTE) { this@plusAssign += value }
operator fun <T: RealType<T>> T.plus(value: Long) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> T.plusAssign(value: Float) = with(RTE) { this@plusAssign += value }
operator fun <T: RealType<T>> T.plus(value: Float) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> T.plusAssign(value: Double) = with(RTE) { this@plusAssign += value }
operator fun <T: RealType<T>> T.plus(value: Double) = with(RTE) { this@plus + value }
// primitive type + T
operator fun <T: RealType<T>> Byte.plus(value: T) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> Short.plus(value: T) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> Int.plus(value: T) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> Long.plus(value: T) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> Float.plus(value: T) = with(RTE) { this@plus + value }
operator fun <T: RealType<T>> Double.plus(value: T) = with(RTE) { this@plus + value }

// subtract
operator fun <T: RealType<T>> T.minusAssign(value: T) = with(RTE) { this@minusAssign -= value }
operator fun <T: RealType<T>> T.minus(value: T) = with(RTE) { this@minus - value }
// T - primitive type
operator fun <T: RealType<T>> T.minusAssign(value: Byte) = with(RTE) { this@minusAssign -= value }
operator fun <T: RealType<T>> T.minus(value: Byte) = with (RTE) { this@minus - value }
operator fun <T: RealType<T>> T.minusAssign(value: Short) = with(RTE) { this@minusAssign -= value }
operator fun <T: RealType<T>> T.minus(value: Short) = with (RTE) { this@minus - value }
operator fun <T: RealType<T>> T.minusAssign(value: Int) = with(RTE) { this@minusAssign -= value }
operator fun <T: RealType<T>> T.minus(value: Int) = with (RTE) { this@minus - value }
operator fun <T: RealType<T>> T.minusAssign(value: Long) = with(RTE) { this@minusAssign -= value }
operator fun <T: RealType<T>> T.minus(value: Long) = with (RTE) { this@minus - value }
operator fun <T: RealType<T>> T.minusAssign(value: Float) = with(RTE) { this@minusAssign -= value }
operator fun <T: RealType<T>> T.minus(value: Float) = with (RTE) { this@minus - value }
operator fun <T: RealType<T>> T.minusAssign(value: Double) = with(RTE) { this@minusAssign -= value }
operator fun <T: RealType<T>> T.minus(value: Double) = with (RTE) { this@minus - value }
// primitive type - T
operator fun <T: RealType<T>> Byte.minus(value: T) = with(RTE) { this@minus - value }
operator fun <T: RealType<T>> Short.minus(value: T) = with(RTE) { this@minus - value }
operator fun <T: RealType<T>> Int.minus(value: T) = with(RTE) { this@minus - value }
operator fun <T: RealType<T>> Long.minus(value: T) = with(RTE) { this@minus - value }
operator fun <T: RealType<T>> Float.minus(value: T) = with(RTE) { this@minus - value }
operator fun <T: RealType<T>> Double.minus(value: T) = with(RTE) { this@minus - value }

// multiply
operator fun <T: RealType<T>> T.timesAssign(value: T) = with(RTE) { this@timesAssign *= value }
operator fun <T: RealType<T>> T.times(value: T) = with(RTE) { this@times * value }
// T * primitive type
operator fun <T: RealType<T>> T.timesAssign(value: Byte) = with (RTE) { this@timesAssign *= value }
operator fun <T: RealType<T>> T.times(value: Byte) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> T.timesAssign(value: Short) = with (RTE) { this@timesAssign *= value }
operator fun <T: RealType<T>> T.times(value: Short) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> T.timesAssign(value: Int) = with (RTE) { this@timesAssign *= value }
operator fun <T: RealType<T>> T.times(value: Int) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> T.timesAssign(value: Long) = with (RTE) { this@timesAssign *= value }
operator fun <T: RealType<T>> T.times(value: Long) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> T.timesAssign(value: Float) = with (RTE) { this@timesAssign *= value }
operator fun <T: RealType<T>> T.times(value: Float) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> T.timesAssign(value: Double) = with (RTE) { this@timesAssign *= value }
operator fun <T: RealType<T>> T.times(value: Double) = with(RTE) { this@times * value }
// primitive type * T
operator fun <T: RealType<T>> Byte.times(value: T) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> Short.times(value: T) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> Int.times(value: T) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> Long.times(value: T) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> Float.times(value: T) = with(RTE) { this@times * value }
operator fun <T: RealType<T>> Double.times(value: T) = with(RTE) { this@times * value }

// divide
operator fun <T: RealType<T>> T.divAssign(value: T) = with(RTE) { this@divAssign /= value }
// T * primitive type
operator fun <T: RealType<T>> T.divAssign(value: Byte) = with (RTE) { this@divAssign /= value }
operator fun <T: RealType<T>> T.div(value: Byte) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> T.divAssign(value: Short) = with (RTE) { this@divAssign /= value }
operator fun <T: RealType<T>> T.div(value: Short) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> T.divAssign(value: Int) = with (RTE) { this@divAssign /= value }
operator fun <T: RealType<T>> T.div(value: Int) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> T.divAssign(value: Long) = with (RTE) { this@divAssign /= value }
operator fun <T: RealType<T>> T.div(value: Long) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> T.divAssign(value: Float) = with (RTE) { this@divAssign /= value }
operator fun <T: RealType<T>> T.div(value: Float) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> T.divAssign(value: Double) = with (RTE) { this@divAssign /= value }
operator fun <T: RealType<T>> T.div(value: Double) = with(RTE) { this@div / value }
// primitive type * T
operator fun <T: RealType<T>> Byte.div(value: T) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> Short.div(value: T) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> Int.div(value: T) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> Long.div(value: T) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> Float.div(value: T) = with(RTE) { this@div / value }
operator fun <T: RealType<T>> Double.div(value: T) = with(RTE) { this@div / value }


// IntegerType
// createWithValue
fun <T: IntegerType<T>> T.createWithValue(value: Byte) = with(ITE) { createWithValue(value) }
fun <T: IntegerType<T>> T.createWithValue(value: Short) = with(ITE) { createWithValue(value) }
fun <T: IntegerType<T>> T.createWithValue(value: Int) = with(ITE) { createWithValue(value) }
fun <T: IntegerType<T>> T.createWithValue(value: Long) = with(ITE) { createWithValue(value) }

fun <T: IntegerType<T>> Byte.asType(type: T) = with(ITE) { asType(type) }
fun <T: IntegerType<T>> Short.asType(type: T) = with(ITE) { asType(type) }
fun <T: IntegerType<T>> Int.asType(type: T) = with(ITE) { asType(type) }
fun <T: IntegerType<T>> Long.asType(type: T) = with(ITE) { asType(type) }

fun Byte.asType() = with(ITE) { asType() }
fun Short.asType() = with(ITE) { asType() }
fun Int.asType() = with(ITE) { asType() }
fun Long.asType() = with(ITE) { asType() }

fun Byte.asUnsignedType() = with(ITE) { asUnsignedType() }
fun Short.asUnsignedType() = with(ITE) { asUnsignedType() }
fun Int.asUnsignedType() = with(ITE) { asUnsignedType() }
fun Long.asUnsignedType() = with(ITE) { asUnsignedType() }

// conversion
val <T: IntegerType<T>> T.byteType get() = with(ITE) { byteType }
val <T: IntegerType<T>> T.unsignedByteType get() = with(ITE) { unsignedByteType }
val <T: IntegerType<T>> T.shortType get() = with(ITE) { shortType }
val <T: IntegerType<T>> T.unsignedShortType get() = with(ITE) { unsignedShortType }
val <T: IntegerType<T>> T.intType get() = with(ITE) { intType }
val <T: IntegerType<T>> T.unsignedIntType get() = with(ITE) { unsignedIntType }
val <T: IntegerType<T>> T.longType get() = with(ITE) { longType }
val <T: IntegerType<T>> T.unsignedLongType get() = with(ITE) { unsignedLongType }

// add
// T + primitive type
operator fun <T: IntegerType<T>> T.plusAssign(value: Byte) = with(ITE) { this@plusAssign += value }
operator fun <T: IntegerType<T>> T.plus(value: Byte) = with(ITE) { this@plus + value }
operator fun <T: IntegerType<T>> T.plusAssign(value: Short) = with(ITE) { this@plusAssign += value }
operator fun <T: IntegerType<T>> T.plus(value: Short) = with(ITE) { this@plus + value }
operator fun <T: IntegerType<T>> T.plusAssign(value: Int) = with(ITE) { this@plusAssign += value }
operator fun <T: IntegerType<T>> T.plus(value: Int) = with(ITE) { this@plus + value }
operator fun <T: IntegerType<T>> T.plusAssign(value: Long) = with(ITE) { this@plusAssign += value }
operator fun <T: IntegerType<T>> T.plus(value: Long) = with(ITE) { this@plus + value }
// primitive type + T
operator fun <T: IntegerType<T>> Byte.plus(value: T) = with(ITE) { this@plus + value }
operator fun <T: IntegerType<T>> Short.plus(value: T) = with(ITE) { this@plus + value }
operator fun <T: IntegerType<T>> Int.plus(value: T) = with(ITE) { this@plus + value }
operator fun <T: IntegerType<T>> Long.plus(value: T) = with(ITE) { this@plus + value }

// subtract
// T - primitive type
operator fun <T: IntegerType<T>> T.minusAssign(value: Byte) = with(ITE) { this@minusAssign -= value }
operator fun <T: IntegerType<T>> T.minus(value: Byte) = with(ITE) { this@minus - value }
operator fun <T: IntegerType<T>> T.minusAssign(value: Short) = with(ITE) { this@minusAssign -= value }
operator fun <T: IntegerType<T>> T.minus(value: Short) = with(ITE) { this@minus - value }
operator fun <T: IntegerType<T>> T.minusAssign(value: Int) = with(ITE) { this@minusAssign -= value }
operator fun <T: IntegerType<T>> T.minus(value: Int) = with(ITE) { this@minus - value }
operator fun <T: IntegerType<T>> T.minusAssign(value: Long) = with(ITE) { this@minusAssign -= value }
operator fun <T: IntegerType<T>> T.minus(value: Long) = with(ITE) { this@minus - value }
// primitive type - T
operator fun <T: IntegerType<T>> Byte.minus(value: T) = with(ITE) { this@minus - value }
operator fun <T: IntegerType<T>> Short.minus(value: T) = with(ITE) { this@minus - value }
operator fun <T: IntegerType<T>> Int.minus(value: T) = with(ITE) { this@minus - value }
operator fun <T: IntegerType<T>> Long.minus(value: T) = with(ITE) { this@minus - value }

// multiply
// T * primitive type
operator fun <T: IntegerType<T>> T.timesAssign(value: Byte) = with(ITE) { this@timesAssign *= value }
operator fun <T: IntegerType<T>> T.times(value: Byte) = with(ITE) { this@times * value }
operator fun <T: IntegerType<T>> T.timesAssign(value: Short) = with(ITE) { this@timesAssign *= value }
operator fun <T: IntegerType<T>> T.times(value: Short) = with(ITE) { this@times * value }
operator fun <T: IntegerType<T>> T.timesAssign(value: Int) = with(ITE) { this@timesAssign *= value }
operator fun <T: IntegerType<T>> T.times(value: Int) = with(ITE) { this@times * value }
operator fun <T: IntegerType<T>> T.timesAssign(value: Long) = with(ITE) { this@timesAssign *= value }
operator fun <T: IntegerType<T>> T.times(value: Long) = with(ITE) { this@times * value }
// primitive type * T
operator fun <T: IntegerType<T>> Byte.times(value: T) = with(ITE) { this@times * value }
operator fun <T: IntegerType<T>> Short.times(value: T) = with(ITE) { this@times * value }
operator fun <T: IntegerType<T>> Int.times(value: T) = with(ITE) { this@times * value }
operator fun <T: IntegerType<T>> Long.times(value: T) = with(ITE) { this@times * value }

// divide
// T / primtive type
operator fun <T: IntegerType<T>> T.divAssign(value: Byte) = with(ITE) { this@divAssign /= value }
operator fun <T: IntegerType<T>> T.div(value: Byte) = with(ITE) { this@div / value }
operator fun <T: IntegerType<T>> T.divAssign(value: Short) = with(ITE) { this@divAssign /= value }
operator fun <T: IntegerType<T>> T.div(value: Short) = with(ITE) { this@div / value }
operator fun <T: IntegerType<T>> T.divAssign(value: Int) = with(ITE) { this@divAssign /= value }
operator fun <T: IntegerType<T>> T.div(value: Int) = with(ITE) { this@div / value }
operator fun <T: IntegerType<T>> T.divAssign(value: Long) = with(ITE) { this@divAssign /= value }
operator fun <T: IntegerType<T>> T.div(value: Long) = with(ITE) { this@div / value }
// primitive type / T
operator fun <T: IntegerType<T>> Byte.div(value: T) = with(ITE) { this@div / value }
operator fun <T: IntegerType<T>> Short.div(value: T) = with(ITE) { this@div / value }
operator fun <T: IntegerType<T>> Int.div(value: T) = with(ITE) { this@div / value }
operator fun <T: IntegerType<T>> Long.div(value: T) = with(ITE) { this@div / value }


// RandomAccessible, RandomAccessibleInterval, Interval
fun <T> RandomAccessible<T>.get(vararg position: Long): T? = with(RAE) { get(*position) }
fun <T> RandomAccessible<T>.get(vararg position: Int): T? = with(RAE) { get(*position) }
fun <T> RandomAccessible<T>.get(position: Localizable): T? = with(RAE) { get(position) }

fun <T> RandomAccessible<T>.translate(vararg translation: Long) = with(RAE) { translate(*translation) }
fun <T> RandomAccessibleInterval<T>.translate(vararg translation: Long) = with(RAE) { translate(*translation) }

val Interval.minAsLongs: LongArray get() = with(RAE) { minAsLongs }
val Interval.maxAsLongs: LongArray get() = with(RAE) { maxAsLongs }
val Interval.minAsInts: IntArray get() = with(RAE) { minAsInts }
val Interval.maxAsInts: IntArray get() = with(RAE) { maxAsInts }
val Interval.minAsPoint: Point get() = with(RAE) { minAsPoint }
val Interval.maxAsPoint: Point get() = with(RAE) { maxAsPoint }
val RealInterval.minAsDoubles: DoubleArray get() = with(RAE) { minAsDoubles }
val RealInterval.maxAsDoubles: DoubleArray get() = with(RAE) { maxAsDoubles }
val RealInterval.minAsFloats: FloatArray get() = with(RAE) { minAsFloats }
val RealInterval.maxAsFloats: FloatArray get() = with(RAE) { maxAsFloats }
val RealInterval.minAsRealPoint: RealPoint get() = with(RAE) { minAsRealPoint }
val RealInterval.maxAsRealPoint: RealPoint get() = with(RAE) { maxAsRealPoint }

infix fun Interval.intersect(that: Interval) = with (RAE) { intersect(that) }
infix fun Interval.union(that: Interval) = with (RAE) { union(that) }
operator fun Interval.contains(that: Interval) = with (RAE) { contains(that) }
operator fun Interval.contains(location: Localizable) = with (RAE) { contains(location) }
operator fun Interval.contains(location: IntArray) = with (RAE) { contains(location) }
operator fun Interval.contains(location: LongArray) = with (RAE) { contains(location) }
fun Interval.containsAll(vararg location: Int) = contains(location)
fun Interval.containsAll(location: LongArray) = contains(location)

infix fun RealInterval.intersect(that: RealInterval) = with(RAE) { intersect(that) }
infix fun RealInterval.union(that: RealInterval) = with(RAE) { union(that) }
operator fun RealInterval.contains(that: RealInterval) = with(RAE) { contains(that) }
operator fun RealInterval.contains(location: RealLocalizable) = with (RAE) { contains(location) }
operator fun RealInterval.contains(location: FloatArray) = with(RAE) { contains(location) }
operator fun RealInterval.contains(location: DoubleArray) = with(RAE) { contains(location) }
fun RealInterval.containsAll(vararg location: Float) = contains(location)
fun RealInterval.containsAll(vararg location: Double) = contains(location)``