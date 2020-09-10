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

import net.imglib2.FinalRealInterval
import net.imglib2.RealInterval
import net.imglib2.RealLocalizable
import net.imglib2.RealRandomAccessible as RRA
import net.imglib2.RealRandomAccessibleRealInterval as RRARI
import net.imglib2.realtransform.*
import net.imglib2.type.Type
import net.imglib2.type.numeric.RealType
import net.imglib2.view.Views

operator fun <T> RRA<T>.get(vararg position: Double) = getAt(*position)
operator fun <T> RRA<T>.get(vararg position: Float) = getAt(*position)
operator fun <T> RRA<T>.get(vararg position: Long) = getAt(*DoubleArray(position.size) { position[it].toDouble() })
operator fun <T> RRA<T>.get(vararg position: Int) = getAt(*DoubleArray(position.size) { position[it].toDouble() })
operator fun <T> RRA<T>.get(position: RealLocalizable) = getAt(position)

val <T> RRA<T>.type get() = realRandomAccess().get()
val <T: Type<T>> RRA<T>.type get() = realRandomAccess().get().createVariable()
@JvmName("typeWildCard") fun RRA<*>.getType() = realRandomAccess().get()
@JvmName("typeWildCardType") fun RRA<out Type<*>>.getType() = realRandomAccess().get().createVariable()
@JvmName("typeWildCardRealType") fun RRA<out RealType<*>>.getType() = realRandomAccess().get().createVariable()

val <T> RRA<T>.rastered get() = Views.raster(this)

fun <T> RRA<T>.transform(transform: InvertibleRealTransform) = RealViews.transform(this, transform)
fun <T> RRA<T>.transformReal(transform: InvertibleRealTransform) = RealViews.transformReal(this, transform)
fun <T> RRA<T>.affine(transformFromSource: AffineGet) = RealViews.affine(this, transformFromSource)
fun <T> RRA<T>.affineReal(transformFromSource: AffineGet) = RealViews.affineReal(this, transformFromSource)
fun <T> RRA<T>.translate(vararg translation: Double) = affine(Translation(*translation))
fun <T> RRA<T>.translateReal(vararg translation: Double) = affineReal(Translation(*translation))
fun <T> RRA<T>.scale(vararg scale: Double) = affine(Scale(*scale))
fun <T> RRA<T>.scaleReal(vararg scale: Double) = affineReal(Scale(*scale))
fun <T> RRA<T>.scaleAndTranslate(vararg scale: Double, translation: DoubleArray = DoubleArray(scale.size) { 0.0 }) = affine(ScaleAndTranslation(scale, translation))
fun <T> RRA<T>.scaleAndTranslateReal(vararg scale: Double, translation: DoubleArray = DoubleArray(scale.size) { 0.0 }) = affineReal(ScaleAndTranslation(scale, translation))

fun <T> RRA<T>.realInterval(realInterval: RealInterval): RRARI<T> = RealIntervalView(this, realInterval)
fun <T> RRA<T>.realInterval(min: DoubleArray, max: DoubleArray): RRARI<T> = RealIntervalView(this, min, max)
fun <T> RRA<T>.realInterval(min: FloatArray, max: FloatArray): RRARI<T> = RealIntervalView(this, min, max)
fun <T> RRA<T>.realInterval(min: RealLocalizable, max: RealLocalizable): RRARI<T> = RealIntervalView(this, min, max)
fun <T> RRA<T>.realInterval(vararg minMax: Double): RRARI<T> = RealIntervalView(this,*minMax)
fun <T> RRA<T>.realInterval(vararg minMax: Float): RRARI<T> = RealIntervalView(this, *minMax)
operator fun <T> RRA<T>.get(realInterval: RealInterval) = realInterval(realInterval)


private class RealIntervalView<T>(val source: RRA<T>, val realInterval: RealInterval) : RRARI<T>, RRA<T> by source, RealInterval by realInterval {
    constructor(source: RRA<T>, min: DoubleArray, max: DoubleArray) : this(source, FinalRealInterval(min, max))
    constructor(source: RRA<T>, min: FloatArray, max: FloatArray) : this(source, min.doubles, max.doubles)
    constructor(source: RRA<T>, min: RealLocalizable, max: RealLocalizable) : this(source, FinalRealInterval(min, max))
    constructor(source: RRA<T>, vararg minMax: Double) : this(source, minMax.minMaxReal)
    constructor(source: RRA<T>, vararg minMax: Float) : this(source, minMax.minMaxReal)
    override fun numDimensions() = source.numDimensions()
}
