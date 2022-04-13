/**
 * Copyright (c) 2020, Saalfeld Lab, HHMI Janelia
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
@file:Suppress("unused")
package org.ntakt

import bdv.util.BdvFunctions
import bdv.util.BdvOptions
import bdv.util.BdvStackSource
import bdv.util.volatiles.VolatileViews
import gnu.trove.list.array.TLongArrayList
import net.imglib2.*
import net.imglib2.cache.LoaderCache
import net.imglib2.cache.ref.SoftRefLoaderCache
import net.imglib2.img.ImgFactory
import net.imglib2.img.basictypeaccess.volatiles.VolatileArrayDataAccess
import net.imglib2.img.cell.Cell
import net.imglib2.type.BooleanType
import net.imglib2.type.NativeType
import net.imglib2.type.Type
import net.imglib2.type.numeric.ARGBType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.IntType
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub
import net.imglib2.util.Util
import net.imglib2.view.Views
import kotlin.math.absoluteValue
import kotlin.reflect.KClass
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI

fun <T> RAI<T>.translate(vararg translation: Long): RAI<T> = Views.translate(this, *translation)
fun <T> RAI<T>.translate(translation: Localizable): RAI<T> = translate(*translation.positionAsLongArray())
fun <T> RAI<T>.translateInverse(vararg translation: Long): RAI<T> = Views.translateInverse(this, *translation)
fun <T> RAI<T>.translateInverse(translation: Localizable): RAI<T> = translateInverse(*translation.positionAsLongArray())
operator fun <T> RAI<T>.plus(translation: LongArray): RAI<T> = translate(*translation)
operator fun <T> RAI<T>.plus(translation: Localizable): RAI<T> = translate(translation)
operator fun <T> RAI<T>.minus(translation: LongArray): RAI<T> = translateInverse(*translation)
operator fun <T> RAI<T>.minus(translation: Localizable): RAI<T> = translateInverse(translation)

val <T> RAI<T>.type: T get() = this[minAsPoint()]
val <T: Type<T>> RAI<T>.type: T get() = this[minAsPoint()].createVariable()
@JvmName("typeWildCard") fun RAI<*>.getType(): Any = this[minAsPoint()]
@JvmName("typeWildCardType") fun RAI<out Type<*>>.getType(): Type<*> = this[minAsPoint()].createVariable()
@JvmName("typeWildCardRealType") fun RAI<out RealType<*>>.getType(): RealType<*> = this[minAsPoint()].createVariable()

val <T> RAI<T>.iterable get(): IterableInterval<T> = Views.iterable(this)
val <T> RAI<T>.flatIterable get(): IterableInterval<T> = Views.flatIterable(this)
fun <T> RAI<T>.iterable(useFlatIterationOrder: Boolean): IterableInterval<T> = if (useFlatIterationOrder) flatIterable else iterable

fun <T> RAI<T>.extendValue(extension: T): RA<T> = Views.extendValue(this, extension)
fun <T: RealType<T>> RAI<T>.extendValue(extension: Float): RA<T> = Views.extendValue(this, extension)
fun <T: RealType<T>> RAI<T>.extendValue(extension: Double): RA<T> = Views.extendValue(this, extension)
fun <T: IntegerType<T>> RAI<T>.extendValue(extension: Int): RA<T> = Views.extendValue(this, extension)
fun <T: IntegerType<T>> RAI<T>.extendValue(extension: Long): RA<T> = Views.extendValue(this, extension)
fun <T> RAI<T>.extendBorder(): RA<T> = Views.extendBorder(this)
fun <T: NumericType<T>> RAI<T>.extendZero(): RA<T> = Views.extendZero(this)
fun <T> RAI<T>.extendMirrorDouble(): RA<T> = Views.extendMirrorDouble(this)
fun <T> RAI<T>.extendMirrorSingle(): RA<T> = Views.extendMirrorSingle(this)
fun <T> RAI<T>.extendPeriodic(): RA<T> = Views.extendPeriodic(this)
fun <T: RealType<T>> RAI<T>.extendRandom(min: Double, max: Double): RA<T> = Views.extendRandom(this, min, max)

fun <T> RAI<T>.expandValue(extension: T, vararg border: Long): RAI<T> = Views.expandValue(this, extension, *border)
fun <T: RealType<T>> RAI<T>.expandValue(extension: Float, vararg border: Long): RAI<T> = Views.expandValue(this, extension, *border)
fun <T: RealType<T>> RAI<T>.expandValue(extension: Double, vararg border: Long): RAI<T> = Views.expandValue(this, extension, *border)
fun <T: IntegerType<T>> RAI<T>.expandValue(extension: Int, vararg border: Long): RAI<T> = Views.expandValue(this, extension, *border)
fun <T: IntegerType<T>> RAI<T>.expandValue(extension: Long, vararg border: Long): RAI<T> = Views.expandValue(this, extension, *border)
fun <T> RAI<T>.expandBorder(vararg border: Long): RAI<T> = Views.expandBorder(this, *border)
fun <T: NumericType<T>> RAI<T>.expandZero(vararg border: Long): RAI<T> = Views.expandZero(this, *border)
fun <T> RAI<T>.expandMirrorDouble(vararg border: Long): RAI<T> = Views.expandMirrorDouble(this, *border)
fun <T> RAI<T>.expandMirrorSingle(vararg border: Long): RAI<T> = Views.expandMirrorSingle(this, *border)
fun <T> RAI<T>.expandPeriodic(vararg border: Long): RAI<T> = Views.expandPeriodic(this, *border)
fun <T: RealType<T>> RAI<T>.expandRandom(min: Double, max: Double, vararg border: Long): RAI<T> = Views.expandRandom(this, min, max, *border)

val <T> RAI<T>.flatStringRepresentation: String get() = "$this: ${flatIterable.joinToString(", ", "[", "]")}"

val RAI<*>.isZeroMin: Boolean get() = Views.isZeroMin(this)
val <T> RAI<T>.zeroMin: RAI<T> get() = if (isZeroMin) this else Views.zeroMin(this)
fun <T> RAI<T>.subsample(step: Long): RAI<T> = Views.subsample(this, step)
fun <T> RAI<T>.subsample(vararg steps: Long): RAI<T> = Views.subsample(this, *steps)
fun <T> RAI<T>.invertAxis(d: Int): RAI<T> = Views.invertAxis(this, d)

fun <T: NativeType<T>> RAI<T>.materialize(factory: ImgFactory<T> = Util.getSuitableImgFactory(this, type)) = factory
        .create(this)
        .also { this.writeInto(it) }
        .let { if (this.isZeroMin) it else it + minAsPoint } as RAI<T>

fun <T: NativeType<T>> RAI<T>.cache(
        vararg blockSize: Int = IntArray(numDimensions()) { 32 },
        loaderCache: LoaderCache<Long, Cell<VolatileArrayDataAccess<*>>> = SoftRefLoaderCache()) = cacheRAI(this, blockSize, loaderCache)

val RAI<out Type<*>>.volatileView: RAI<out Type<*>> get() =
    VolatileViews.wrapAsVolatile(this) as? RAI<out Type<*>> ?: error("Unable to create volatile view for $this")

// TODO add to all containers
fun RAI<IntType>.asARGBs(shiftRight: Int = 0): RAI<ARGBType> = convert(ARGBType()) { s, t -> t.set(s.get() shr shiftRight) }


// asign operations:
// TODO how can we make sure that it only is applied to RAIs that can be written into?
operator fun <T: Add<T>> RAI<T>.plusAssign(value: T): Unit= iterable.forEach { it += value }
operator fun <T: Sub<T>> RAI<T>.minusAssign(value: T): Unit = iterable.forEach { it -= value }
operator fun <T: Mul<T>> RAI<T>.timesAssign(value: T): Unit = iterable.forEach { it *= value }
operator fun <T: Div<T>> RAI<T>.divAssign(value: T): Unit = iterable.forEach { it /= value }

operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Byte): Unit = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Short): Unit = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Int): Unit = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Long): Unit = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Float): Unit = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Double): Unit = this.plusAssign(type.createWithValue(value))

operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Byte): Unit = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Short): Unit = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Int): Unit = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Long): Unit = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Float): Unit = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Double): Unit = this.minusAssign(type.createWithValue(value))

operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Byte): Unit = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Short): Unit = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Int): Unit = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Long): Unit = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Float): Unit = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Double): Unit = this.timesAssign(type.createWithValue(value))

operator fun <T: RealType<T>> RAI<T>.divAssign(value: Byte): Unit = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Short): Unit = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Int): Unit = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Long): Unit = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Float): Unit = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Double): Unit = this.divAssign(type.createWithValue(value))

operator fun <T: Type<T>> RAI<T>.set(interval: Interval, value: T): Unit = this[interval].iterable.forEach { it.set(value) }
operator fun <T: Type<T>> RAI<T>.set(interval: Interval, iterator: Iterator<T>): Unit = this[interval].flatIterable.forEach { it.set(iterator.next()) }
operator fun <T: Type<T>> RAI<T>.set(interval: Interval, iterable: Iterable<T>): Unit = set(interval, iterable.iterator())
operator fun <T: Type<T>> RAI<T>.set(interval: Interval, rai: RAI<T>): Unit = set(interval, rai.flatIterable)

operator fun <T: RealType<T>> RAI<T>.plusAssign(other: RA<out RealType<*>>): Unit = set(this, (this as RAI<out RealType<*>> + other[this]).asType(type))
operator fun <T: RealType<T>> RAI<T>.minusAssign(other: RA<out RealType<*>>): Unit = set(this, (this as RAI<out RealType<*>> + other[this]).asType(type))
operator fun <T: RealType<T>> RAI<T>.timesAssign(other: RA<out RealType<*>>): Unit = set(this, (this as RAI<out RealType<*>> + other[this]).asType(type))
operator fun <T: RealType<T>> RAI<T>.divAssign(other: RA<out RealType<*>>): Unit = set(this, (this as RAI<out RealType<*>> + other[this]).asType(type))

inline fun <T: BooleanType<T>> RAI<T>.where(consumeWhereTrue: (Localizable) -> Unit) {
    val cursor = this.iterable.cursor()
    while (cursor.hasNext())
        if (cursor.next().get())
            consumeWhereTrue(cursor)
}
fun <T: BooleanType<T>> RAI<T>.where(): List<Point> = mutableListOf<Point>().also { l -> where { l += Point(it) } }
fun <T: BooleanType<T>> RAI<T>.whereAsArrays(): Array<LongArray> {
    val nDim = this.nDim
    val indices = Array(nDim) { TLongArrayList() }
    where { l -> for (d in 0 until nDim) indices[d].add(l.getLongPosition(d)) }
    return indices.map { it.toArray() }.toTypedArray()
}

fun <T: Type<T>> RAI<T>.show(name: String, options: BdvOptions = BdvOptions.options()): BdvStackSource<T> =
        BdvFunctions.show(this, name, options)
fun <T: Type<T>> RAI<T>.show(name: String, bdv: BdvStackSource<*>, options: BdvOptions = BdvOptions.options()): BdvStackSource<T> =
        show(name, options.addTo(bdv))

fun <T> RAI<T>.hyperSlice(d: Int, pos: Long): RAI<T> = Views.hyperSlice(this, d, pos)
fun <T> RAI<T>.hyperSlicesList(d: Int): List<RAI<T>> = (min(d) .. max(d)).map { hyperSlice(d, it) }

fun <T> RAI<T>.reduce(d: Int, operation: (RAI<T>, RAI<T>) -> RAI<T>): RAI<T> = hyperSlicesList(d).reduce(operation)
fun <T, U> RAI<T>.fold(d: Int, initial: U, operation: (U, RAI<T>) -> U): U = hyperSlicesList(d).fold(initial, operation)

//fun <T: IntegerType<T>, I: IntegerType<I>> RAI<T>.sum(d: Int, i: I): RAI<I> = asType(i).reduce(d) { rai1, rai2 -> rai1 + rai2 }
//fun <T: RealType<T>, R: RealType<R>> RAI<T>.sum(d: Int, r: R): RAI<R> = asType(r).reduce(d) { rai1, rai2 -> rai1 + rai2 }
//@JvmName("sumInt") fun <T: IntegerType<T>> RAI<T>.sum(d: Int): RAI<LongType> = sum(d, types.long)
//@JvmName("sumReal") fun <T: RealType<T>> RAI<T>.sum(d: Int): RAI<DoubleType> = sum(d, types.double)
//
//fun <T: IntegerType<T>, I: IntegerType<I>> RAI<T>.mean(d: Int, i: I): RAI<I> = sum(d, i) / (max(d) - min(d) + 1).toDouble()
//fun <T: RealType<T>, R: RealType<R>> RAI<T>.mean(d: Int, r: R): RAI<R> = sum(d, r) / (max(d) - min(d) + 1).toDouble()
//@JvmName("meanInt") fun <T: IntegerType<T>> RAI<T>.mean(d: Int): RAI<LongType> = mean(d, types.long)
//@JvmName("meanReal") fun <T: RealType<T>> RAI<T>.mean(d: Int): RAI<DoubleType> = mean(d, types.double)

inline fun <T> RAI<T>.all(crossinline predicate: (T) -> Boolean): Boolean = iterable.all(predicate)
inline fun <T> RAI<T>.any(crossinline predicate: (T) -> Boolean): Boolean = iterable.any(predicate)
fun RAI<out BooleanType<*>>.any(): Boolean = any { it.get() }
fun RAI<out BooleanType<*>>.all(): Boolean = all { it.get() }

fun RAI<out IntegerType<*>>.toIntArray(useFlatIterationOrder: Boolean = true): IntArray =
    IntArray(numElements.toInt()).also { a -> iterable(useFlatIterationOrder).forEachIndexed { i, type -> a[i] = type.integer } }
fun RAI<out IntegerType<*>>.toLongArray(flatIterationOrder: Boolean = true): LongArray =
    LongArray(numElements.toInt()).also { a -> iterable(flatIterationOrder).forEachIndexed { i, type -> a[i] = type.integerLong } }
fun RAI<RealType<*>>.toFloatArray(flatIterationOrder: Boolean = true): FloatArray =
    FloatArray(numElements.toInt()).also { a -> iterable(flatIterationOrder).forEachIndexed { i, type -> a[i] = type.realFloat } }
fun RAI<RealType<*>>.toDoubleArray(flatIterationOrder: Boolean = true): DoubleArray =
    DoubleArray(numElements.toInt()).also { a -> iterable(flatIterationOrder).forEachIndexed { i, type -> a[i] = type.realDouble } }

/**
 * Add slicing access to [RAI] similar to Python. Slices are used to create a sub-interval view that is contained in the
 * original [RAI]. Note that only the dimensions of a [RAI] are considered, but not its min and max. The start and stop
 * values of a [Slice] are with respect to the dimensions of a [RAI], i.e. between `0` and `dimension`, while min may be
 * non-zero, and max at `min + dimension - 1`. In other words, [RAI.isZeroMin] is ensured if necessary. Example:
 * ```kotlin
 * val data = ntakt.ints(10) { it }
 * // all elements
 * val data = data[Slice()]
 * // all elements
 * val data = data[_el]
 * // every other element
 * data[2.step]
 * // data in reversed order
 * data[(-1).step]
 * // all elements starting at index 3
 * data[3.start]
 * // all elements before index 7
 * data[7.stop]
 * // every other element between 3 (inclusive) and 7 (exclusive)
 * data[3 sl 7 st 2]
 * // every other element between 7 (exclusive) and 3 (inclusive)
 * data[3 sl 7 st -2]
 * ```
 *
 * In the case of multiple dimensions, slices need not be provided for all dimensions. If there are fewer slices than
 * dimensions, multiple `Slice()` will be appended as needed. To omit `Slice()` at the start or in the middle, use the
 * Ellipsis object `_el`. Only one ellipsis can be passed (more ellipses would be ambiguous). Examples:
 * ```kotlin
 * data = ntakt.ints(3, 4) { it }
 * // all data
 * data[_el]
 * // every other column
 * data[2.step]
 * // every other row
 * data[Slice(), 2.step]
 * // every other row
 * data[_el, 2.step]
 * // every other row from index 4 (exclusive) to index 1 (inclusive)
 * data[_el, 1.start st -2]
 * ```
 */
operator fun <T> RAI<T>.get(vararg slicing: Slicing): RAI<T> {
    val sanitized = sanitizeSlicing(slicing.toList())
    val positions = sanitized.withIndex().filter { it.value is SanitizedPosition }.map { it.index to it.value as SanitizedPosition }
    val slices = sanitized.filter { it is SanitizedSlice }.map { it as SanitizedSlice }
    return applyHyperSlicesForPositions(positions).applyCompleteSlicing(slices)
}

@JvmName("getArraySlicing")
operator fun <T> RAI<T>.get(slicing: Array<out Slicing>): RAI<T> = get(*slicing)
operator fun <T> RAI<T>.get(slicing: Collection<Slicing>): RAI<T> = this[slicing.toTypedArray()]
operator fun <T> RAI<T>.get(slicing: Iterable<Slicing>): RAI<T> = this[slicing.map { it }]

private fun Dimensions.sanitizeSlicing(slicing: List<Slicing>): List<Sanitized> {
    require(slicing.size <= nDim) { "Number of slices has to be smalller or equal to number of dimensions but got: ${slicing.size} > $nDim. Slicing: ${slicing.toList()}" }
    require(slicing.count { it == _el } <= 1) { "Cannot use more than 1 Ellipsis object. Slicing: ${slicing.toList()}" }
    require(slicing.all { it::class in compatibleSlicings }) { "Found incompatible slicing: ${slicing.map { it::class }.filter { it !in compatibleSlicings }.toSet().map { it.simpleName }}. Compatible slicings: ${compatibleSlicings.map { it.simpleName }}" }

    return when {
        slicing.any { it == _el } -> {
            val index = slicing.indexOf(_el)
            val before = slicing.toList().subList(0, index)
            val after = slicing.toList().subList(index + 1, slicing.size)
            sanitizeSlicing(before + List(nDim - before.size - after.size) { slice() } + after)
        }
        slicing.size < nDim -> sanitizeSlicing(slicing + listOf(_el)) // Using listOf(_el) here only works because the case slicing.any { it == _el } is executed first
        slicing.all { it is Slicing.Slice || it is Slicing.Position } -> slicing.mapIndexed { d, s -> sanitizeSlicing(s, dimension(d)) }
        else -> error("Invalid slicing: $slicing")
    }
}

private val compatibleSlicings: Set<KClass<out Slicing>> = setOf(Slicing.Ellipsis::class, Slicing.Slice::class, Slicing.Position::class)

private fun sanitizeSlicing(slicing: Slicing, dimension: Long): Sanitized = when (slicing) {
    is Slicing.Slice -> sanitizeSlice(slicing, dimension)
    is Slicing.Position -> SanitizedPosition(normalizeIndexStrict(slicing.pos, dimension))
    else -> error("Expected ${Slicing.Slice::class} or ${Slicing.Position::class} but got $slicing (${slicing::class})")
}

private fun sanitizeSlice(slice: Slicing.Slice, dimension: Long): SanitizedSlice =  when {
    slice.start === null -> sanitizeSlice(slice.withStart(0L), dimension)
    slice.stop === null -> sanitizeSlice(slice.withStop(dimension), dimension)
    slice.step === null -> sanitizeSlice(slice.withStep(1L), dimension)
    slice.start < 0 || slice.start > dimension -> sanitizeSlice(slice.withStart(normalizeIndex(slice.start, dimension)), dimension)
    slice.stop < 0 || slice.stop > dimension -> sanitizeSlice(slice.withStop(normalizeIndex(slice.stop, dimension)), dimension)
    slice.start > slice.stop -> sanitizeSlice(slice.withStop(slice.start), dimension)
    else -> SanitizedSlice(start = normalizeIndex(slice.start, dimension), stop = normalizeIndex(slice.stop, dimension), step = slice.step)
}

private fun <T> RAI<T>.applyHyperSlicesForPositions(slicing: List<Pair<Int, SanitizedPosition>>): RAI<T> {
    require(nDim >= slicing.size) { "Number of slices inconsistent with number of dimensions: $nDim < ${slicing.size}. slicing=$slicing" }
    require(slicing.map { it.first }.toSet().size == slicing.size) { "Found duplicates in slicing: $slicing" }
    require(slicing.none { it.first < 0 || it.first >= nDim }) {"Found slicing dimensions < 0 or > numDimensions: $slicing"}
    return slicing.sortedByDescending { it.first }.fold(zeroMin) { acc, s -> acc.hyperSlice(s.first, s.second.pos) }
}

private fun <T> RAI<T>.applyCompleteSlicing(slicing: List<SanitizedSlice>): RAI<T> {
    require(nDim == slicing.size) { "Number of slices inconsistent with number of dimensions: $nDim != ${slicing.size}. slicing=$slicing" }
    return when {
        isZeroMin -> {
            val restricted = this[slicing.interval].zeroMin as RAI<T>
            val inverted =
                (0 until nDim).fold(restricted) { acc, d -> if (slicing[d].step < 0 ) acc.invertAxis(d) else acc }
            inverted.zeroMin.subsample(*slicing.map { it.step.absoluteValue }.toLongArray())
        }
        else -> zeroMin.applyCompleteSlicing(slicing)
    }

}

private interface Sanitized

private data class SanitizedSlice(val start: Long, val stop: Long, val step: Long): Sanitized {
    init {
        require(start <= stop) {"start is larger than stop: $start > $stop"}
        require(step != 0L) {"Invalid step=$step"}
    }
}

private data class SanitizedPosition(val pos: Long): Sanitized

private val List<SanitizedSlice>.interval get() = (map { it.start } + map { it.stop - 1 }).toLongArray().intervalMinMax

private fun normalizeIndex(index: Long, dimension: Long): Long {
    return if (index < 0) {
        require(-index <= dimension) { "Index out of bounds: Absolute value of negative index $index must be smaller than or equal to dimension $dimension."}
        dimension + index
    } else {
        require(index <= dimension) { "Index out of bounds: Index $index must be smaller than or equal to dimension $dimension." }
        index
    }
}

private fun normalizeIndexStrict(index: Long, dimension: Long): Long {
    return if (index < 0) {
        require(-index <= dimension) { "Index out of bounds: Absolute value of negative index $index must be smaller than or equal to dimension $dimension."}
        dimension + index
    } else {
        require(index < dimension) { "Index out of bounds: Index $index must be smaller than dimension $dimension." }
        index
    }
}
