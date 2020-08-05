import net.imglib2.Interval
import net.imglib2.Localizable
import net.imglib2.Point
import net.imglib2.img.array.ArrayImgs
import net.imglib2.view.Views
import net.imglib2.imklib.*
import net.imglib2.util.Intervals

// backtick functions work with unicode characters as well:
infix fun Localizable.`∈`(interval: Interval) = this in interval

fun main() {
    val im1 = ArrayImgs.doubles(doubleArrayOf(1.0, 2.0), 1L, 2L)
    val im2 = ArrayImgs.doubles(doubleArrayOf(2.0, -3.0), 1L, 2L)
    val sum = im1 + im2
    Views.flatIterable(sum).forEach { println(it) }
    val n = 100
    val example1D = ArrayImgs.doubles(DoubleArray(n) { it.toDouble() }, n.toLong())
    val mean = n / 2.0
    val std = n / 3.0
    val exponent = -((example1D - mean) `**` 2.0) / (std * std)
    val bellCurve = exponent.exp()
    println(bellCurve.flatIterable.joinToString(", "))
    println((bellCurve * 255).asUnsignedBytes.flatIterable.joinToString(", "))

    val largeValue = 11123456789
    val longImg = ArrayImgs.longs(1L)
    val largeValueImg = longImg + largeValue
    val largeValueImgFloat = longImg.asFloats + largeValue
    println("${longImg.joinToString()} ${largeValueImg.flatIterable.joinToString()} ${largeValueImgFloat.flatIterable.joinToString()}")

    val im1Extended = im1.extendZero()
    val extendedSum1 = im1 + im1Extended
    val extendedSum2 = im1Extended + im1
    println("${im1.flatIterable.joinToString(", ")} -- ${extendedSum1.flatIterable.joinToString(", ")} -- ${extendedSum2.flatIterable.joinToString(", ")}")

    println("(1) ∈ [2, 3]: ${Point(1L) `∈` Intervals.createMinMax(2, 3)}")

    // gradient:
    val img = ArrayImgs.doubles(doubleArrayOf(0.0, 0.1, 0.3, 0.7, 2.8, 0.7, 0.3, 0.1, 0.0), 9)
    val offset = Point(1L)
    val gradient = (img.extendZero() + offset) - (img.extendZero() - offset)
    println("Gradient: [${gradient[img].flatIterable.joinToString(", ")}]")

    // complex -> real/imaginary
    val complex = ArrayImgs.complexDoubles(2, 3)
    complex.forEachIndexed { index, t -> t.setComplexNumber(index.toDouble(), -index.toDouble()) }
    println("Complex: [${complex.joinToString(", ")}]")
    println("Real: [${complex.real.flatIterable.joinToString(", ")}]")
    println("Imaginary: [${complex.imaginary.flatIterable.joinToString(", ")}]")
    complex.real.iterable.forEach { it *= -2 }
    complex.imaginary.iterable.forEach { it *= -3 }
    println("Complex: [${complex.joinToString(", ")}]")
    println("Real: [${complex.real.flatIterable.joinToString(", ")}]")
    println("Imaginary: [${complex.imaginary.flatIterable.joinToString(", ")}]")
}