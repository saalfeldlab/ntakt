package net.imglib2.imklib.net.imglib2.imklib.io

import net.imglib2.imklib.*
import net.imglib2.img.Img
import net.imglib2.type.NativeType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import org.janelia.saalfeldlab.n5.DataType
import org.janelia.saalfeldlab.n5.N5FSReader
import org.janelia.saalfeldlab.n5.N5Reader
import org.janelia.saalfeldlab.n5.imglib2.N5Utils

object n5 {
    fun <T> openFS(container: String, dataset: String, defaultValue: T? = null) where T: NativeType<T> = open(container.fsReader, dataset, defaultValue)
    fun <T> open(container: N5Reader, dataset: String, defaultValue: T? = null) where T: NativeType<T>
            = if (defaultValue == null) N5Utils.open<T>(container, dataset) else N5Utils.open(container, dataset, defaultValue)

    fun openUntypedFS(container: String, dataset: String) = openUntyped(container.fsReader, dataset)
    fun openUntyped(container: N5Reader, dataset: String) = container.getDatasetAttributes(dataset).dataType.let {
        when(it) {
            DataType.INT8 -> open<ByteType>(container, dataset)
            DataType.INT16 -> open<ShortType>(container, dataset)
            DataType.INT32 -> open<IntType>(container, dataset)
            DataType.INT64 -> open<LongType>(container, dataset)
            DataType.UINT8 -> open<UnsignedByteType>(container, dataset)
            DataType.UINT16 -> open<UnsignedShortType>(container, dataset)
            DataType.UINT32 -> open<UnsignedIntType>(container, dataset)
            DataType.UINT64 -> open<UnsignedLongType>(container, dataset)
            DataType.FLOAT32 -> open<FloatType>(container, dataset)
            DataType.FLOAT64 -> open<DoubleType>(container, dataset)
            else -> error("Unsupported DataType: $it")
        } as Img<out RealType<*>>
    }

//    private fun abc123() {
//        openUntypedFS("abc", "123")
//    }

    private val String.fsReader get() = N5FSReader(this)

}