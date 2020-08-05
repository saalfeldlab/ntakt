package net.imglib2.imklib

import net.imglib2.*
import net.imglib2.util.Intervals

val LongArray.interval get() = FinalInterval(*this)
val Collection<Long>.interval get() = toLongArray().interval
val IntArray.interval get() = map { it.toLong() }.interval

val LongArray.intervalMinMax get() = Intervals.createMinMax(*this)
val Collection<Long>.intervalMinMax get() = toLongArray().intervalMinMax
val IntArray.intervalMinMax get() = map { it.toLong() }.intervalMinMax

val DoubleArray.interval get() = FinalRealInterval(DoubleArray(size) { 0.0 }, this)
val Collection<Double>.interval get() = toDoubleArray().interval
val FloatArray.interval get() = map { it.toDouble() }.interval

val DoubleArray.intervalMinMax get() = Intervals.createMinMaxReal(*this)
val Collection<Double>.intervalMinMax get() = toDoubleArray().intervalMinMax
val FloatArray.intervalMinMax get() = map { it.toDouble() }.intervalMinMax

fun Interval.translate(vararg translation: Long) = Intervals.translate(this, *translation)
fun Interval.translate(translation: Localizable) = translate(*translation.positionAsLongArray())
fun Interval.translateInverse(vararg translation: Long) = Intervals.translateInverse(this, *translation)
fun Interval.translateInverse(translation: Localizable) = translateInverse(*translation.positionAsLongArray())
operator fun Interval.plus(translation: LongArray) = translate(*translation)
operator fun Interval.plus(translation: Localizable) = translate(translation)
operator fun Interval.minus(translation: LongArray) = translateInverse(*translation)
operator fun Interval.minus(translation: Localizable) = translateInverse(translation)

val Interval.minAsLongs: LongArray get() = minAsLongArray()
val Interval.maxAsLongs: LongArray get() = maxAsLongArray()
val Interval.minAsInts: IntArray get() = IntArray(numDimensions()) { min(it).toInt() }
val Interval.maxAsInts: IntArray get() = IntArray(numDimensions()) { max(it).toInt() }
val Interval.minAsPoint: Point get() = minAsPoint()
val Interval.maxAsPoint: Point get() = maxAsPoint()

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