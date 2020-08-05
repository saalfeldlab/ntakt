package net.imglib2.imklib

import net.imglib2.RealInterval
import net.imglib2.RealLocalizable
import net.imglib2.RealPoint
import net.imglib2.util.Intervals

val RealInterval.minAsDoubles: DoubleArray get() = minAsDoubleArray()
val RealInterval.maxAsDoubles: DoubleArray get() = maxAsDoubleArray()
val RealInterval.minAsFloats: FloatArray get() = FloatArray(numDimensions()) { realMin(it).toFloat() }
val RealInterval.maxAsFloats: FloatArray get() = FloatArray(numDimensions()) { realMax(it).toFloat() }
val RealInterval.minAsRealPoint: RealPoint get() = minAsRealPoint()
// TODO wait for imglib/imglib2#292 before reverting back to maxAsRealPoint()
val RealInterval.maxAsRealPoint: RealPoint get() = RealPoint(numDimensions()).also { realMax(it) }

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