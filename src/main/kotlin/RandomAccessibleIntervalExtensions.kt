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
package net.imglib2.imklib

import bdv.util.BdvFunctions
import bdv.util.BdvOptions
import bdv.util.BdvStackSource
import bdv.util.volatiles.VolatileViews
import gnu.trove.list.array.TLongArrayList
import net.imglib2.Interval
import net.imglib2.Localizable
import net.imglib2.Point
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
import net.imglib2.util.ConstantUtils
import net.imglib2.util.Util
import net.imglib2.view.Views
import kotlin.math.absoluteValue
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI

fun <T> RAI<T>.translate(vararg translation: Long) = Views.translate(this, *translation)
fun <T> RAI<T>.translate(translation: Localizable) = translate(*translation.positionAsLongArray())
fun <T> RAI<T>.translateInverse(vararg translation: Long) = Views.translateInverse(this, *translation)
fun <T> RAI<T>.translateInverse(translation: Localizable) = translateInverse(*translation.positionAsLongArray())
operator fun <T> RAI<T>.plus(translation: LongArray) = translate(*translation)
operator fun <T> RAI<T>.plus(translation: Localizable) = translate(translation)
operator fun <T> RAI<T>.minus(translation: LongArray) = translateInverse(*translation)
operator fun <T> RAI<T>.minus(translation: Localizable) = translateInverse(translation)

val <T> RAI<T>.type get() = this[minAsPoint()]
val <T: Type<T>> RAI<T>.type get() = this[minAsPoint()].createVariable()
@JvmName("typeWildCard") fun RAI<*>.getType() = this[minAsPoint()]
@JvmName("typeWildCardType") fun RAI<out Type<*>>.getType() = this[minAsPoint()].createVariable()
@JvmName("typeWildCardRealType") fun RAI<out RealType<*>>.getType() = this[minAsPoint()].createVariable()

val <T> RAI<T>.iterable get() = Views.iterable(this)
val <T> RAI<T>.flatIterable get() = Views.flatIterable(this)
fun <T> RAI<T>.iterable(useFlatIterationOrder: Boolean) = if (useFlatIterationOrder) flatIterable else iterable

fun <T: Type<T>> RAI<T>.extendValue(extension: T) = Views.extendValue(this, extension)
fun <T: RealType<T>> RAI<T>.extendValue(extension: Float) = Views.extendValue(this, extension)
fun <T: RealType<T>> RAI<T>.extendValue(extension: Double) = Views.extendValue(this, extension)
fun <T: IntegerType<T>> RAI<T>.extendValue(extension: Int) = Views.extendValue(this, extension)
fun <T: IntegerType<T>> RAI<T>.extendValue(extension: Long) = Views.extendValue(this, extension)
fun <T> RAI<T>.extendBorder() = Views.extendBorder(this)
fun <T: NumericType<T>> RAI<T>.extendZero() = Views.extendZero(this)
fun <T> RAI<T>.extendMirrorDouble() = Views.extendMirrorDouble(this)
fun <T> RAI<T>.extendMirrorSingle() = Views.extendMirrorSingle(this)
fun <T> RAI<T>.extendPeriodic() = Views.extendPeriodic(this)
fun <T: RealType<T>> RAI<T>.extendRandom(min: Double, max: Double) = Views.extendRandom(this, min, max)

val <T> RAI<T>.flatStringRepresentation get() = "$this: ${flatIterable.joinToString(" ,", "[", "]")}"

val RAI<*>.isZeroMin get() = Views.isZeroMin(this)
val <T> RAI<T>.zeroMin get() = if (isZeroMin) this else Views.zeroMin(this)
fun <T> RAI<T>.subsample(step: Long) = Views.subsample(this, step)
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
fun RAI<IntType>.asARGBs(shiftRight: Int = 0) = convert(ARGBType()) { s, t -> t.set(s.get() shr shiftRight) }


// asign operations:
// TODO how can we make sure that it only is applied to RAIs that can be written into?
operator fun <T: Add<T>> RAI<T>.plusAssign(value: T) = iterable.forEach { it += value }
operator fun <T: Sub<T>> RAI<T>.minusAssign(value: T) = iterable.forEach { it -= value }
operator fun <T: Mul<T>> RAI<T>.timesAssign(value: T) = iterable.forEach { it *= value }
operator fun <T: Div<T>> RAI<T>.divAssign(value: T) = iterable.forEach { it /= value }

operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Byte) = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Short) = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Int) = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Long) = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Float) = this.plusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.plusAssign(value: Double) = this.plusAssign(type.createWithValue(value))

operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Byte) = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Short) = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Int) = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Long) = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Float) = this.minusAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.minusAssign(value: Double) = this.minusAssign(type.createWithValue(value))

operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Byte) = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Short) = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Int) = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Long) = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Float) = this.timesAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.timesAssign(value: Double) = this.timesAssign(type.createWithValue(value))

operator fun <T: RealType<T>> RAI<T>.divAssign(value: Byte) = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Short) = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Int) = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Long) = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Float) = this.divAssign(type.createWithValue(value))
operator fun <T: RealType<T>> RAI<T>.divAssign(value: Double) = this.divAssign(type.createWithValue(value))

operator fun <T: Type<T>> RAI<T>.set(interval: Interval, value: T) = this[interval].forEach { it.set(value) }
operator fun <T: Type<T>> RAI<T>.set(interval: Interval, iterator: Iterator<T>) = this[interval].flatIterable.forEach { it.set(iterator.next()) }
operator fun <T: Type<T>> RAI<T>.set(interval: Interval, iterable: Iterable<T>) = set(interval, iterable.iterator())
operator fun <T: Type<T>> RAI<T>.set(interval: Interval, rai: RAI<T>) = set(interval, rai.flatIterable)

operator fun <T: RealType<T>> RAI<T>.plusAssign(other: RA<RealType<*>>) = set(this, (this as RAI<RealType<*>> + other[this]).asType(type))
operator fun <T: RealType<T>> RAI<T>.minusAssign(other: RA<RealType<*>>) = set(this, (this as RAI<RealType<*>> - other[this]).asType(type))
operator fun <T: RealType<T>> RAI<T>.timesAssign(other: RA<RealType<*>>) = set(this, (this as RAI<RealType<*>> * other[this]).asType(type))
operator fun <T: RealType<T>> RAI<T>.divAssign(other: RA<RealType<*>>) = set(this, (this as RAI<RealType<*>> / other[this]).asType(type))

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

fun <T> RAI<*>.constant(constant: T) = ConstantUtils.constantRandomAccessibleInterval(constant, this)

fun <T: Type<T>> RAI<T>.show(name: String, options: BdvOptions = BdvOptions.options()) =
        BdvFunctions.show(this, name, options)
fun <T: Type<T>> RAI<T>.show(name: String, bdv: BdvStackSource<*>, options: BdvOptions = BdvOptions.options()) =
        show(name, options.addTo(bdv))

fun <T> RAI<T>.hyperSlice(d: Int, pos: Long) = Views.hyperSlice(this, d, pos)
fun <T> RAI<T>.hyperSlicesList(d: Int): List<RAI<T>> = (min(d) .. max(d)).map { hyperSlice(d, it) }

fun <T> RAI<T>.reduce(d: Int, operation: (RAI<T>, RAI<T>) -> RAI<T>) = hyperSlicesList(d).reduce(operation)
fun <T, U> RAI<T>.fold(d: Int, initial: U, operation: (U, RAI<T>) -> U) = hyperSlicesList(d).fold(initial, operation)

fun <T: IntegerType<T>, I: IntegerType<I>> RAI<T>.sum(d: Int, i: I) = asType(i).reduce(d) { rai1, rai2 -> rai1 + rai2 }
fun <T: RealType<T>, R: RealType<R>> RAI<T>.sum(d: Int, r: R) = asType(r).reduce(d) { rai1, rai2 -> rai1 + rai2 }
@JvmName("sumInt") fun <T: IntegerType<T>> RAI<T>.sum(d: Int) = sum(d, imklib.types.long)
@JvmName("sumReal") fun <T: RealType<T>> RAI<T>.sum(d: Int) = sum(d, imklib.types.double)

fun <T: IntegerType<T>, I: IntegerType<I>> RAI<T>.mean(d: Int, i: I) = sum(d, i) / (max(d) - min(d) + 1).toDouble()
fun <T: RealType<T>, R: RealType<R>> RAI<T>.mean(d: Int, r: R) = sum(d, r) / (max(d) - min(d) + 1).toDouble()
@JvmName("meanInt") fun <T: IntegerType<T>> RAI<T>.mean(d: Int) = mean(d, imklib.types.long)
@JvmName("meanReal") fun <T: RealType<T>> RAI<T>.mean(d: Int) = mean(d, imklib.types.double)

fun RAI<out BooleanType<*>>.all() = iterable.cursor().let { c ->
    while (c.hasNext()) {
        if (!c.next().get())
            return@let false
    }
    true
}

fun RAI<BooleanType<*>>.any() = iterable.cursor().let { c ->
    while (c.hasNext()) {
        if (c.next().get())
            return@let true
    }
    false
}

operator fun <T> RAI<T>.get(vararg slicing: Slicing): RAI<T> {
    require(slicing.size <= nDim) { "Number of slices has to be smalller or equal to number of dimensions but got: ${slicing.size} > $nDim. Slicing: ${slicing.toList()}" }
    require(slicing.filter { it == _el }.size <= 1) { "Cannot use more than 1 Ellipsis object. Slicing: ${slicing.toList()}" }
    return when {
        slicing.any { it == _el } -> {
            val index = slicing.indexOf(_el)
            val before = slicing.toList().subList(0, index)
            val after = slicing.toList().subList(index + 1, slicing.size)
            get(*(before + List(nDim - before.size - after.size) { Slice() } + after).toTypedArray())
        }
        slicing.size < nDim -> get(*(slicing.toList() + List(nDim - slicing.size) { Slice() }).toTypedArray())
        slicing.all { it is Slice } -> this.applyCompleteSlicing(slicing.map { it as Slice })
        else -> error("blub")
    }
}

public fun RAI<out IntegerType<*>>.toIntArray(useFlatIterationOrder: Boolean = true) =
    IntArray(numElements.toInt()).also { a -> iterable(useFlatIterationOrder).forEachIndexed { i, type -> a[i] = type.getInteger() } }
public fun RAI<out IntegerType<*>>.toLongArray(flatIterationOrder: Boolean = true) =
    LongArray(numElements.toInt()).also { a -> iterable(flatIterationOrder).forEachIndexed { i, type -> a[i] = type.getIntegerLong() } }
public fun RAI<RealType<*>>.toFloatArray(flatIterationOrder: Boolean = true) =
    FloatArray(numElements.toInt()).also { a -> iterable(flatIterationOrder).forEachIndexed { i, type -> a[i] = type.getRealFloat() } }
public fun RAI<RealType<*>>.toDoubleArray(flatIterationOrder: Boolean = true) =
    DoubleArray(numElements.toInt()).also { a -> iterable(flatIterationOrder).forEachIndexed { i, type -> a[i] = type.getRealDouble() } }

private fun <T> RAI<T>.applyCompleteSlicing(slicing: List<Slice>): RAI<T> {
    val restricted = this[slicing.interval(this)] as RAI<T>
    val inverted = (0 until nDim).fold(restricted) { acc, d -> if (slicing[d].step?.let { it < 0 } == true) acc.invertAxis(d) else acc }
    return inverted.zeroMin.subsample(*slicing.map { it.step?.absoluteValue ?: 1 }.toLongArray())
}
