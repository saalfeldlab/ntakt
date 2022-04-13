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
@file:Suppress("ClassName")

package org.ntakt.io

import loci.formats.FormatTools
import loci.formats.ImageReader
import net.imglib2.display.screenimage.awt.ARGBScreenImage
import net.imglib2.type.numeric.ARGBType
import net.imglib2.type.numeric.RealType
import net.imglib2.view.Views
import org.ntakt.*
import java.awt.image.BufferedImage
import java.awt.image.DataBufferInt
import java.io.File
import java.net.URL
import java.nio.ByteBuffer
import java.nio.ByteOrder
import javax.imageio.ImageIO
import net.imglib2.RandomAccessibleInterval as RAI

@Suppress("unused")
object io {

    fun open(source: String): RAI<RealType<*>> {
        val reader = ImageReader()
        reader.setId(source)
        val w = reader.sizeX.toLong()
        val h = reader.sizeY.toLong()
        val slices = (0 until reader.imageCount).map {

			@Suppress("UNCHECKED_CAST")
			if (reader.isRGB)
				reader.readAsBuffer(it).asIntBuffer().asAccess().ints(w, h) as RAI<RealType<*>>
			else
				when (reader.pixelType) {
					FormatTools.INT8 -> reader.readAsBuffer(it).asAccess().bytes(w, h)
					FormatTools.INT16 -> reader.readAsBuffer(it).asShortBuffer().asAccess().shorts(w, h)
					FormatTools.INT32 -> reader.readAsBuffer(it).asIntBuffer().asAccess().ints(w, h)
					FormatTools.UINT8 -> reader.readAsBuffer(it).asAccess().unsignedBytes(w, h)
					FormatTools.UINT16 -> reader.readAsBuffer(it).asShortBuffer().asAccess().unsignedShorts(w, h)
					FormatTools.UINT32 -> reader.readAsBuffer(it).asIntBuffer().asAccess().unsignedInts(w, h)
					FormatTools.FLOAT -> reader.readAsBuffer(it).asFloatBuffer().asAccess().floats(w, h)
					FormatTools.DOUBLE -> reader.readAsBuffer(it).asDoubleBuffer().asAccess().doubles(w, h)
					else -> error("Pixel type not supported: ${reader.pixelType}")
				} as RAI<RealType<*>>
		}
        return if (slices.size == 1) slices[0] else Views.stack(slices)
    }

    private fun ImageReader.readAsBuffer(index: Int)
            = ByteBuffer.wrap(reader.openBytes(index)).order(if (reader.isLittleEndian) ByteOrder.LITTLE_ENDIAN else ByteOrder.BIG_ENDIAN)

    fun openARGB(path: File): RAI<ARGBType> = ImageIO.read(path).toRaiARGB()
    fun openARGB(url: URL): RAI<ARGBType> = ImageIO.read(url).toRaiARGB()
    fun openARGB(pathOrUrl: String): RAI<ARGBType> {
        val isURL = try {
            URL(pathOrUrl).toURI()
            true
        } catch (e: Exception) {
            false
        }
        return if (isURL) openARGB(URL(pathOrUrl)) else openARGB(File(pathOrUrl))
    }

    fun writeARGB(rai: RAI<ARGBType>, path: String, formatName: String? = null) = writeARGB(rai, File(path), formatName)
    fun writeARGB(rai: RAI<ARGBType>, path: File, formatName: String? = null) =
        ImageIO.write(rai.asScreenImage().image(), formatName ?: path.extension, path)

    private fun BufferedImage.toRaiARGB(): RAI<ARGBType> {
        val data = when (val buffer = raster.dataBuffer) {
            is DataBufferInt -> buffer.data
            else -> IntArray(width * height).also { getRGB(0,0, width, height, it, 0, width) }
        }
        return ARGBScreenImage(width, height, data)
    }

    private fun RAI<ARGBType>.asScreenImage() = this as? ARGBScreenImage ?: copyToScreenImage()
    private fun RAI<ARGBType>.copyToScreenImage(): ARGBScreenImage {
        require(nDim == 2)
        return ARGBScreenImage(dim(0).toInt(), dim(1).toInt()).also { zeroMin.writeInto(it) }
    }

    val n5 = org.ntakt.io.n5.n5
}