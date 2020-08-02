import net.imglib2.img.array.ArrayImgs
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.view.Views
import net.imklib2.*

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
}