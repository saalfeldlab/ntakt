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
package org.ntakt.io.n5

import net.imglib2.img.Img
import net.imglib2.type.NativeType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import org.janelia.saalfeldlab.n5.DataType
import org.janelia.saalfeldlab.n5.N5FSReader
import org.janelia.saalfeldlab.n5.N5Reader
import org.janelia.saalfeldlab.n5.hdf5.N5HDF5Reader
import org.janelia.saalfeldlab.n5.imglib2.N5Utils

object n5 {
    fun <T> openFS(container: String, dataset: String, defaultValue: T? = null) where T: NativeType<T> = open(container.fsReader, dataset, defaultValue)
    fun <T> openHDF5(container: String, dataset: String, defaultValue: T? = null) where T: NativeType<T> = open(container.hdf5Reader, dataset, defaultValue)
    fun <T> open(container: N5Reader, dataset: String, defaultValue: T? = null) where T: NativeType<T>
            = if (defaultValue == null) N5Utils.openVolatile<T>(container, dataset) else N5Utils.openVolatile(container, dataset, defaultValue)

    fun openUntypedFS(container: String, dataset: String) = openUntyped(container.fsReader, dataset)
    fun openUntypedHDF5(container: String, dataset: String) = openUntyped(container.hdf5Reader, dataset)
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


}

fun <T> N5Reader.open(dataset: String, defaultValue: T? = null) where T: NativeType<T> = n5.open(this, dataset, defaultValue)
fun N5Reader.openUntyped(dataset: String) = n5.openUntyped(this, dataset)

val String.fsReader get() = N5FSReader(this)
val String.hdf5Reader get() = N5HDF5Reader(this)
