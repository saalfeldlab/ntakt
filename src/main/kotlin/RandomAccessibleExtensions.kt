package net.imklib2

import net.imglib2.*
import net.imglib2.util.Intervals
import net.imglib2.view.Views

class RandomAccessibleExtensions {

    companion object {
        fun <T> RandomAccessible<T>.get(vararg position: Long): T? = getAt(*position)
        fun <T> RandomAccessible<T>.get(vararg position: Int): T? = getAt(*position)
        fun <T> RandomAccessible<T>.get(position: Localizable): T? = getAt(position)

        fun <T> RandomAccessible<T>.translate(vararg translation: Long): RandomAccessible<T> = Views.translate(
            this,
            *translation)
        fun <T> RandomAccessibleInterval<T>.translate(vararg translation: Long): RandomAccessibleInterval<T> = Views.translate(
            this,
            *translation)

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
    }

}