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

import bdv.util.volatiles.VolatileViews
import net.imglib2.Localizable
import net.imglib2.cache.LoaderCache
import net.imglib2.cache.ref.SoftRefLoaderCache
import net.imglib2.converter.ComplexImaginaryFloatConverter
import net.imglib2.converter.ComplexRealFloatConverter
import net.imglib2.converter.Converters
import net.imglib2.img.ImgFactory
import net.imglib2.img.basictypeaccess.volatiles.VolatileArrayDataAccess
import net.imglib2.img.cell.Cell
import net.imglib2.imklib.net.imglib2.imklib.converter.ComplexRealConverters
import net.imglib2.type.NativeType
import net.imglib2.type.Type
import net.imglib2.type.numeric.ARGBType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.complex.ComplexDoubleType
import net.imglib2.type.numeric.complex.ComplexFloatType
import net.imglib2.type.numeric.integer.IntType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.util.Util
import net.imglib2.view.Views
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


// TODO need to fix variance in sampler converter extensions first
@JvmName("complexDoubleReal") fun RAI<ComplexDoubleType>.real() = Converters.convert(this, ComplexRealConverters.realDouble)
@JvmName("complexDoubleImaginary") fun RAI<ComplexDoubleType>.imaginary() = Converters.convert(this, ComplexRealConverters.imaginaryDouble)
@JvmName("complexFloatReal") fun RAI<ComplexFloatType>.real() = Converters.convert(this, ComplexRealConverters.realFloat)
@JvmName("complexFloatImaginary") fun RAI<ComplexFloatType>.imaginary() = Converters.convert(this, ComplexRealConverters.imaginaryFloat)
@JvmName("complexDoubleRealReadOnly") fun RAI<ComplexDoubleType>.realReadOnly() = convert(DoubleType()) { s, t -> t.setReal(s.realDouble)}
@JvmName("complexDoubleImaginaryReadOnly") fun RAI<ComplexDoubleType>.imaginaryReadOnly() = convert(DoubleType())  { s, t -> t.setReal(s.imaginaryDouble)}
@JvmName("complexFloatRealReadOnly") fun RAI<ComplexFloatType>.realReadOnly() = convert(FloatType(), ComplexRealFloatConverter())
@JvmName("complexFloatImaginaryReadOnly") fun RAI<ComplexFloatType>.imaginaryReadOnly() = convert(FloatType(), ComplexImaginaryFloatConverter())
@JvmName("complexDoublePhase") fun RAI<ComplexDoubleType>.phaseReadOnly() = convert(DoubleType()) { s, t -> t.setReal(s.phaseDouble) }
@JvmName("complexFloatPhase") fun RAI<ComplexFloatType>.phaseReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.phaseFloat) }
@JvmName("complexDoublePower") fun RAI<ComplexDoubleType>.powerReadOnly() = convert(DoubleType()) { s, t -> t.setReal(s.powerDouble) }
@JvmName("complexFloatPower") fun RAI<ComplexFloatType>.powerReadOnly() = convert(FloatType()) { s, t -> t.setReal(s.powerFloat) }

fun <T: Type<T>> RAI<T>.extendValue(extension: T) = Views.extendValue(this, extension)
fun <T: RealType<T>> RAI<T>.extendValue(extension: Float) = Views.extendValue(this, extension)
fun <T: RealType<T>> RAI<T>.extendValue(extension: Double) = Views.extendValue(this, extension)
fun <T: IntegerType<T>> RAI<T>.extendValue(extension: Int) = Views.extendValue(this, extension)
fun <T: IntegerType<T>> RAI<T>.extendValue(extension: Long) = Views.extendValue(this, extension)
fun <T> RAI<T>.extendBorder() = Views.extendBorder(this)
fun <T: NumericType<T>> RAI<T>.extendZero() = Views.extendZero(this)
fun <T> RAI<T>.extendMirrorDouble() = Views.extendMirrorDouble(this)
fun <T> RAI<T>.extendMirrorSingle() = Views.extendMirrorSingle(this)

val <T> RAI<T>.flatStringRepresentation get() = "$this: ${flatIterable.joinToString(" ,", "[", "]")}"

val <T> RAI<T>.isZeroMin get() = Views.isZeroMin(this)
val <T> RAI<T>.zeroMin get() = if (isZeroMin) this else Views.zeroMin(this)

fun <T: NativeType<T>> RAI<T>.materialize(factory: ImgFactory<T> = Util.getSuitableImgFactory(this, type)) = factory
        .create(this)
        .also { this.writeInto(it) }
        .let { if (this.isZeroMin) it else it + minAsPoint } as RAI<T>

fun <T: NativeType<T>> RAI<T>.cache(
        vararg blockSize: Int = IntArray(numDimensions()) { 32 },
        loaderCache: LoaderCache<Long, Cell<VolatileArrayDataAccess<*>>> = SoftRefLoaderCache()) = cacheRAI(this, blockSize, loaderCache)

val RAI<*>.volatileView get() = VolatileViews.wrapAsVolatile(this) ?: error("Unable to create volatile view for $this")

// TODO add to all containers
fun RAI<IntType>.asARGBs(shiftRight: Int = 0) = convert(ARGBType()) { s, t -> t.set(s.get() shr shiftRight) }
