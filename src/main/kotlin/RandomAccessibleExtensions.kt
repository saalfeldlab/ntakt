package net.imklib2

import net.imglib2.*
import net.imglib2.converter.BiConverter
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI
import net.imglib2.converter.Converter
import net.imglib2.converter.Converters
import net.imglib2.type.Type
import net.imglib2.type.numeric.RealType
import net.imglib2.util.Intervals
import net.imglib2.view.Views

class RandomAccessibleExtensions {

    companion object {
        operator fun <T> RA<T>.get(vararg position: Long): T = getAt(*position)
        operator fun <T> RA<T>.get(vararg position: Int): T = getAt(*position)
        operator fun <T> RA<T>.get(position: Localizable): T = getAt(position)

        fun <T> RA<T>.translate(vararg translation: Long): RA<T> = Views.translate(this, *translation)
        fun <T> RAI<T>.translate(vararg translation: Long): RAI<T> = Views.translate(this, *translation)

        val <T> RA<T>.type get() = randomAccess().get()
        val <T: Type<T>> RA<T>.type get() = randomAccess().get().createVariable()
        val <T> RAI<T>.type get() = this[minAsPoint()]
        val <T: Type<T>> RAI<T>.type get() = this[minAsPoint()].createVariable()

        fun <T, U: Type<U>> RA<T>.convert(u: U, converter: Converter<T, U>) = Converters.convert(this, converter, u)
        inline fun <T, U: Type<U>> RA<T>.convert(u : U, crossinline converter: (T, U) -> Unit) = convert(u, Converter { a, b -> converter(a, b) })
        fun <T, U, V: Type<V>> RA<T>.convert(that: RA<U>, v: V, converter: BiConverter<T, U, V>) = Converters.convert(this, that, converter, v)
        inline fun <T, U, V: Type<V>> RA<T>.convert(that: RA<U>, v: V, crossinline converter: (T, U, V) -> Unit) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })
        operator fun <T: RealType<T>> RA<T>.plus(that: RA<T>) =  convert(that, type) { t, u, v -> v.set(t); v += u }

        fun <T, U: Type<U>> RAI<T>.convert(u: U, converter: Converter<T, U>) = Converters.convert(this, converter, u)
        inline fun <T, U: Type<U>> RAI<T>.convert(u : U, crossinline converter: (T, U) -> Unit) = convert(u, Converter { a, b -> converter(a, b) })
        fun <T, U, V: Type<V>> RAI<T>.convert(that: RAI<U>, v: V, converter: BiConverter<T, U, V>) = Converters.convert(this, that, converter, v)
        inline fun <T, U, V: Type<V>> RAI<T>.convert(that: RAI<U>, v: V, crossinline converter: (T, U, V) -> Unit) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })
        fun <T: RealType<T>> RAI<T>.plus(that: RAI<T>) =  convert(that, type) { t, u, v -> v.set(t); v += u }

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