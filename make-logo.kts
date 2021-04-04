#!/usr/bin/env kscript

@file:MavenRepository("scijava", "https://maven.scijava.org/content/groups/public")
@file:DependsOn("org.ntakt:ntakt:0.1.0-SNAPSHOT")
@file:DependsOn("net.imglib2:imglib2-ij:2.0.0-beta-46")
//COMPILER_OPTS -jvm-target 1.8

import java.io.File
import javax.imageio.ImageIO

import ij.io.FileSaver
import net.imglib2.display.screenimage.awt.ARGBScreenImage
import net.imglib2.img.display.imagej.ImageJFunctions
import org.ntakt.*

fun ByteArray.asImg(vararg dims: Int) = ntakt.bytes(*dims) { this[it] }
val scale = 30
val numSteps = 5
val offset = 11L
val startBrightness = 0.2
val stopBrightness = 1.0
val gap = 1
val frameX = 55L
val frameY = 100L


val letterToPixels = mapOf(
    'n' to byteArrayOf(1, 1, 1, 1, 0, 1, 1, 0, 1).asImg(3, 3),
    't' to byteArrayOf(1, 1, 1, 0, 1, 0, 0, 1, 0).asImg(3, 3),
    'a' to byteArrayOf(0, 1, 0, 1, 0, 1, 1, 1, 1).asImg(3, 3),
    '.' to byteArrayOf(0, 0, 1).asImg(1, 3),
    'k' to byteArrayOf(1, 0, 1, 1, 1, 0, 1, 0, 1).asImg(3, 3)
)

println(letterToPixels)


val text = "nta.kt"
val height = text.map { letterToPixels[it]!!.dimension(1) * scale }.max()!! + offset * (numSteps - 1)
val width = text.map { letterToPixels[it]!!.dimension(0) * scale }.sum() + gap * (text.length - 1) + offset * (numSteps - 1)

val targetFramed = ntakt.argbs(width + 2*frameX, height + 2*frameY)
val target = targetFramed[longArrayOf(frameX, frameY), longArrayOf(width, height)].zeroMin

for (n in 0 until numSteps) {
    val brightness = startBrightness + (stopBrightness - startBrightness) / numSteps * n
    val color = (255 * brightness).toInt()
    val colorGray = (255 shl 24) or (color shl 8) // or (color shl 8) or (color shl 16)
    val bottom: Long = (numSteps - 1 - n) * offset
    var left: Long = (numSteps -1 - n) * offset

    for (t in text) {
        val top = bottom + scale * letterToPixels[t]!!.dimension(1)
        val right = left + letterToPixels[t]!!.dimension(0) * scale
        val min = longArrayOf(left, bottom)
        val max = longArrayOf(right - 1, top - 1)

        val scaled = letterToPixels[t]!!.extendZero().interpolatedNearestNeighbor.scaleAndTranslate(
            scale = DoubleArray(2) { scale.toDouble() },
            translation = DoubleArray(2) { scale / 2.0 }
        )
        ntakt.loop(target[min, max].zeroMin, scaled) { a, b -> if (b.integer == 1) a.set(colorGray) }

        left = right + gap
    }
}

val wrapped = ImageJFunctions.wrapRGB(targetFramed, "ntakt")
FileSaver(wrapped).saveAsPng("ntakt-ij.png")

val wrapped2 = ARGBScreenImage(targetFramed.dimension(0).toInt(), targetFramed.dimension(1).toInt(), targetFramed.update(null))
ImageIO.write(wrapped2.image(), "png", File("ntakt.png"))
ImageIO.write(ARGBScreenImage(width.toInt(), height.toInt()).also { target.writeInto(it) }.image(), "png", File("ntakt-no-frame.png"))

targetFramed.show("ntakt")
