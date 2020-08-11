package net.imglib2.imklib

import net.imglib2.realtransform.*
import net.imglib2.view.Views
import net.imglib2.RealRandomAccessible as RRA

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
