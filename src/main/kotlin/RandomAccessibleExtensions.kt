package net.imglib2.imklib

import net.imglib2.Interval
import net.imglib2.Localizable
import net.imglib2.Sampler
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI
import net.imglib2.converter.BiConverter
import net.imglib2.converter.ComplexImaginaryFloatConverter
import net.imglib2.converter.Converter
import net.imglib2.converter.Converters
import net.imglib2.converter.readwrite.SamplerConverter
import net.imglib2.interpolation.InterpolatorFactory
import net.imglib2.interpolation.randomaccess.LanczosInterpolatorFactory
import net.imglib2.interpolation.randomaccess.NLinearInterpolatorARGBFactory
import net.imglib2.interpolation.randomaccess.NLinearInterpolatorFactory
import net.imglib2.interpolation.randomaccess.NearestNeighborInterpolatorFactory
import net.imglib2.loops.LoopBuilder
import net.imglib2.type.Type
import net.imglib2.type.numeric.*
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.util.ConstantUtils
import net.imglib2.view.Views
import java.util.function.BiConsumer
import kotlin.math.E

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

val <T: Type<T>> RA<T>.type get() = randomAccess().get().createVariable()

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
