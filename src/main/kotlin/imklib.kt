package net.imklib2

import net.imglib2.*
import net.imklib2.RandomAccessibleExtensions.Companion as RAE

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
fun RealInterval.containsAll(vararg location: Double) = contains(location)