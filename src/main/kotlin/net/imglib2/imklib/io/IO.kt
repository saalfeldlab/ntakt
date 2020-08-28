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
package net.imglib2.imklib.net.imglib2.imklib.io

import loci.formats.FormatTools
import loci.formats.ImageReader
import net.imglib2.RandomAccessibleInterval
import net.imglib2.img.array.ArrayImgs
import net.imglib2.imklib.net.imglib2.imklib.access.*
import net.imglib2.type.numeric.RealType
import net.imglib2.view.Views
import java.nio.ByteBuffer
import java.nio.ByteOrder

object io {

    fun open(source: String): RandomAccessibleInterval<RealType<*>> {
        val reader = ImageReader()
        reader.setId(source)
        val w = reader.sizeX.toLong()
        val h = reader.sizeY.toLong()
        val slices = (0 until reader.imageCount).map {
            if (reader.isRGB)
                ArrayImgs.ints(IntBufferAccess(reader.readAsBuffer(it)), w, h) as RandomAccessibleInterval<RealType<*>>
            else
                when (reader.pixelType) {
                    FormatTools.INT8 -> ArrayImgs.bytes(ByteBufferAccess(reader.readAsBuffer(it)), w, h)
                    FormatTools.INT16 -> ArrayImgs.shorts(ShortBufferAccess(reader.readAsBuffer(it)), w, h)
                    FormatTools.INT32 -> ArrayImgs.ints(IntBufferAccess(reader.readAsBuffer(it)), w, h)
                    FormatTools.UINT8 -> ArrayImgs.unsignedBytes(ByteBufferAccess(reader.readAsBuffer(it)), w, h)
                    FormatTools.UINT16 -> ArrayImgs.unsignedShorts(ShortBufferAccess(reader.readAsBuffer(it)), w, h)
                    FormatTools.UINT32 -> ArrayImgs.unsignedInts(IntBufferAccess(reader.readAsBuffer(it)), w, h)
                    FormatTools.FLOAT -> ArrayImgs.floats(FloatBufferAccess(reader.readAsBuffer(it)), w, h)
                    FormatTools.DOUBLE -> ArrayImgs.doubles(DoubleBufferAccess(reader.readAsBuffer(it)), w, h)
                    else -> error("Pixel type not supported: ${reader.pixelType}")
                } as RandomAccessibleInterval<RealType<*>>
        }
        return if (slices.size == 1) slices[0] else Views.stack(slices)
    }

    private fun ImageReader.readAsBuffer(index: Int)
            = ByteBuffer.wrap(reader.openBytes(index)).order(if (reader.isLittleEndian) ByteOrder.LITTLE_ENDIAN else ByteOrder.BIG_ENDIAN)

    val n5 = net.imglib2.imklib.net.imglib2.imklib.io.n5.n5
}