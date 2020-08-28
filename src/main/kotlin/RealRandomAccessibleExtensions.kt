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

import net.imglib2.realtransform.*
import net.imglib2.type.Type
import net.imglib2.type.numeric.RealType
import net.imglib2.view.Views
import net.imglib2.RealRandomAccessible as RRA

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
