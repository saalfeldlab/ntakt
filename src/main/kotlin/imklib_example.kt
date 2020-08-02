package net.imklib2

import net.imglib2.img.array.ArrayImgs
import net.imglib2.view.Views

fun main() {
    val im1 = ArrayImgs.doubles(doubleArrayOf(1.0, 2.0), 1L, 2L)
    val im2 = ArrayImgs.doubles(doubleArrayOf(2.0, -3.0), 1L, 2L)
    val sum = im1 + im2
    Views.flatIterable(sum).forEach { println(it) }
}