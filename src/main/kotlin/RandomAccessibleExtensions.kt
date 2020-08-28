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

import net.imglib2.Interval
import net.imglib2.Localizable
import net.imglib2.interpolation.InterpolatorFactory
import net.imglib2.interpolation.randomaccess.LanczosInterpolatorFactory
import net.imglib2.interpolation.randomaccess.NLinearInterpolatorARGBFactory
import net.imglib2.interpolation.randomaccess.NLinearInterpolatorFactory
import net.imglib2.interpolation.randomaccess.NearestNeighborInterpolatorFactory
import net.imglib2.loops.LoopBuilder
import net.imglib2.type.Type
import net.imglib2.type.numeric.ARGBType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import net.imglib2.view.Views
import java.util.function.BiConsumer
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI

operator fun <T> RA<T>.get(vararg position: Long): T = getAt(*position)
operator fun <T> RA<T>.get(vararg position: Int): T = getAt(*position)
operator fun <T> RA<T>.get(position: Localizable): T = getAt(position)

fun <T> RA<T>.translate(vararg translation: Long) = Views.translate(this, *translation)
fun <T> RA<T>.translate(translation: Localizable) = translate(*translation.positionAsLongArray())
fun <T> RA<T>.translateInverse(vararg translation: Long) = Views.translateInverse(this, *translation)
fun <T> RA<T>.translateInverse(translation: Localizable) = translateInverse(*translation.positionAsLongArray())
operator fun <T> RA<T>.plus(translation: LongArray) = translate(*translation)
operator fun <T> RA<T>.plus(translation: Localizable) = translate(translation)
operator fun <T> RA<T>.minus(translation: LongArray) = translateInverse(*translation)
operator fun <T> RA<T>.minus(translation: Localizable) = translateInverse(translation)

val <T> RA<T>.type get() = randomAccess().get()
val <T: Type<T>> RA<T>.type get() = randomAccess().get().createVariable()
@JvmName("typeWildCard") fun RA<*>.getType() = randomAccess().get()
@JvmName("typeWildCardType") fun RA<out Type<*>>.getType() = randomAccess().get().createVariable()
@JvmName("typeWildCardRealType") fun RA<out RealType<*>>.getType() = randomAccess().get().createVariable()

// TODO need to fix variance in sampler converter extensions first
//fun <C: ComplexType<C>, R: RealType<R>> RA<C>.real(type: R) = convert(ComplexPart.REAL.converter(type))
//fun <C: ComplexType<C>, R: RealType<R>> RA<C>.imaginary(type: R) = convert(ComplexPart.IMAGINARY.converter(type))
//val <C: ComplexType<C>> RA<C>.real get() = real(DoubleType())
//val <C: ComplexType<C>> RA<C>.imaginary get() = imaginary(DoubleType())

fun <T> RA<T>.interval(min: LongArray, max: LongArray) = Views.interval(this, min, max)
fun <T> RA<T>.interval(vararg dims: Long) = interval(LongArray(dims.size) { 0L }, LongArray(dims.size) { dims[it] - 1L })
fun <T> RA<T>.interval(interval: Interval) = Views.interval(this, interval)
operator fun <T> RA<T>.get(interval: Interval) = interval(interval)

fun <T> RA<T>.interpolate(factory: InterpolatorFactory<T, RA<T>>) = Views.interpolate(this, factory)
val <T> RA<T>.interpolatedNearestNeigbor get() = interpolate(NearestNeighborInterpolatorFactory())
val <T: NumericType<T>> RA<T>.interpolatedNLinear get() = interpolate(NLinearInterpolatorFactory())
val RA<ARGBType>.interpoalteNLinear get() = interpolate(NLinearInterpolatorARGBFactory())
val <T: RealType<T>> RA<T>.interpolatedLanczos get() = interpolate(LanczosInterpolatorFactory())

fun <T: Type<T>> RA<T>.writeInto(target: RAI<T>) = LoopBuilder.setImages(this[target], target).forEachPixel(BiConsumer { s, t -> t.set(s) })
