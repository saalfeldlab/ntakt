package net.imglib2.imklib.net.imglib2.imklib.io

import io.scif.SCIFIO
import io.scif.img.ImgOpener
import loci.formats.FormatTools
import loci.formats.ImageReader
import net.imglib2.RandomAccessibleInterval
import net.imglib2.img.Img
import net.imglib2.img.array.ArrayImgs
import net.imglib2.img.basictypeaccess.ByteAccess
import net.imglib2.imklib.net.imglib2.imklib.access.*
import net.imglib2.type.NativeType
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

    private lateinit var _defaultScifio: SCIFIO
    private val defaultScifio: SCIFIO
        get() {
            if (!this::_defaultScifio.isInitialized)
                _defaultScifio = SCIFIO()
            return _defaultScifio
        }
}

fun main() {
     io.open("/home/zottel/Pictures/Screenshot_20200822_102323.png").also { println(it) }
}