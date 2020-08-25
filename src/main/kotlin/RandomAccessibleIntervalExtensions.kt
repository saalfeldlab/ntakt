package net.imglib2.imklib

import bdv.util.volatiles.VolatileViews
import net.imglib2.Localizable
import net.imglib2.cache.LoaderCache
import net.imglib2.cache.ref.SoftRefLoaderCache
import net.imglib2.img.ImgFactory
import net.imglib2.img.basictypeaccess.volatiles.VolatileArrayDataAccess
import net.imglib2.img.cell.Cell
import net.imglib2.type.NativeType
import net.imglib2.type.Type
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import net.imglib2.util.Util
import net.imglib2.view.Views
import kotlin.math.E
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
//fun <C: ComplexType<C>, R: RealType<R>> RAI<C>.real(type: R) = convert(ComplexPart.REAL.converter(type))
//fun <C: ComplexType<C>, R: RealType<R>> RAI<C>.imaginary(type: R) = convert(ComplexPart.IMAGINARY.converter(type))
//val <C: ComplexType<C>> RAI<C>.real get() = real(DoubleType())
//val <C: ComplexType<C>> RAI<C>.imaginary get() = imaginary(DoubleType())

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
