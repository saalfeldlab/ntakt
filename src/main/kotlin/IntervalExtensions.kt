package net.imglib2.imklib

import net.imglib2.*
import net.imglib2.util.Intervals

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