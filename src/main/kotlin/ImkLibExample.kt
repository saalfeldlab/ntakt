import net.imglib2.img.array.ArrayImgs
import net.imglib2.view.Views
import net.imklib2.*

fun main() {
    val im1 = ArrayImgs.doubles(doubleArrayOf(1.0, 2.0), 1L, 2L)
    val im2 = ArrayImgs.doubles(doubleArrayOf(2.0, -3.0), 1L, 2L)
    val sum = im1 + im2
    Views.flatIterable(sum).forEach { println(it) }
    val example1D = ArrayImgs.doubles(DoubleArray(100) { it.toDouble() }, 100)
    val mean = 50.0
    val variance = 30.0
    val exponent = (((example1D - mean) `**` 2.0) * -1.0) / (variance * variance)
    val bellCurve = exponent.exp()
    print(Views.flatIterable(bellCurve).joinToString(", "))
}