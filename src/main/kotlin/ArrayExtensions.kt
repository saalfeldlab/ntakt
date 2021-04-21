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
package org.ntakt

import net.imglib2.img.basictypeaccess.volatiles.array.*

val ByteArray.shorts get() = ShortArray(size) { this[it].toShort() }

val ByteArray.ints get() = IntArray(size) { this[it].toInt() }
val ShortArray.ints get() = IntArray(size) { this[it].toInt() }

val ByteArray.longs get() = LongArray(size) { this[it].toLong() }
val ShortArray.longs get() = LongArray(size) { this[it].toLong() }
val IntArray.longs get() = LongArray(size) { this[it].toLong() }

val ByteArray.floats get() = FloatArray(size) { this[it].toFloat() }
val ShortArray.floats get() = FloatArray(size) { this[it].toFloat() }
val IntArray.floats get() = FloatArray(size) { this[it].toFloat() }
val LongArray.floats get() = FloatArray(size) { this[it].toFloat() }

val ByteArray.doubles get() = DoubleArray(size) { this[it].toDouble() }
val ShortArray.doubles get() = DoubleArray(size) { this[it].toDouble() }
val IntArray.doubles get() = DoubleArray(size) { this[it].toDouble() }
val LongArray.doubles get() = DoubleArray(size) { this[it].toDouble() }
val FloatArray.doubles get() = DoubleArray(size) { this[it].toDouble() }

// accesses
val BooleanArray.access get() = VolatileBooleanArray(this, true)
val CharArray.access get() = VolatileCharArray(this, true)
val ByteArray.access get() = VolatileByteArray(this, true)
val ShortArray.access get() = VolatileShortArray(this, true)
val IntArray.access get() = VolatileIntArray(this, true)
val LongArray.access get() = VolatileLongArray(this, true)
val FloatArray.access get() = VolatileFloatArray(this, true)
val DoubleArray.access get() = VolatileDoubleArray(this, true)