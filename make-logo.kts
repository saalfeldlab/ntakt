#!/usr/bin/env kscript

@file:MavenRepository("scijava", "https://maven.scijava.org/content/groups/public")
@file:DependsOn("org.ntakt:ntakt:0.1.0-SNAPSHOT")
//COMPILER_OPTS -jvm-target 1.8

import java.io.File
import javax.imageio.ImageIO

import org.ntakt.*

fun ByteArray.asImg(vararg dims: Int) = ntakt.bytes(*dims) { this[it] }
val scale = IntArray(2) { 30 }
val translation = scale.map { it / 2.0 }.toDoubleArray()
val numSteps = 5
val offset = 11L
val startBrightness = 0.2
val stopBrightness = 1.0
val gap = 1
val padding = longArrayOf(55, 100)


val letters = mapOf(
    'n' to byteArrayOf(1, 1, 1, 1, 0, 1, 1, 0, 1).asImg(3, 3),
    't' to byteArrayOf(1, 1, 1, 0, 1, 0, 0, 1, 0).asImg(3, 3),
    'a' to byteArrayOf(0, 1, 0, 1, 0, 1, 1, 1, 1).asImg(3, 3),
    '.' to byteArrayOf(0, 0, 1).asImg(1, 3),
    'k' to byteArrayOf(1, 0, 1, 1, 1, 0, 1, 0, 1).asImg(3, 3)
)

val text = "nta.kt"
val height = text.map { letters[it]!!.dim(1) * scale[1] }.max()!! + offset * (numSteps - 1)
val width = text.map { letters[it]!!.dim(0) * scale[0] }.sum() + gap * (text.length - 1) + offset * (numSteps - 1)

val target = ntakt.argbs(width, height)

for (n in 0 until numSteps) {
    val brightness = startBrightness + (stopBrightness - startBrightness) / numSteps * n
    val color = (255 * brightness).toInt()
    val colorGray = (255 shl 24) or (color shl 8) // or (color shl 8) or (color shl 16)
    val min = LongArray(2) { (numSteps - 1 - n) * offset }

    for (t in text) {
        val max = LongArray(2) { min[it] + scale[it] * letters[t]!!.dim(it) - 1 }

        val scaled = letters[t]!!.extendZero().interpolatedNearestNeighbor.scaleAndTranslate(scale = scale.map { it.toDouble() }.toDoubleArray(), translation = translation)
        ntakt.loop(target[min, max].zeroMin, scaled) { a, b -> if (b.integer == 1) a.set(colorGray) }

        min[0] = max[0] + 1 + gap
    }
}

ntakt.io.writeARGB(target, "ntakt-no-padding.png")
ntakt.io.writeARGB(target.expandZero(*padding), "ntakt.png")

val bdv = target.expandZero(*padding).show("ntakt")

