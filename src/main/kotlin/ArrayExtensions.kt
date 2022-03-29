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

fun ByteArray.asShortArray() = ShortArray(size) { this[it].toShort() }

fun ByteArray.asIntArray() = IntArray(size) { this[it].toInt() }
fun ShortArray.asIntArray() = IntArray(size) { this[it].toInt() }

fun ByteArray.asLongArray() = LongArray(size) { this[it].toLong() }
fun ShortArray.asLongArray() = LongArray(size) { this[it].toLong() }
fun IntArray.asLongArray() = LongArray(size) { this[it].toLong() }

fun ByteArray.asFloatArray() = FloatArray(size) { this[it].toFloat() }
fun ShortArray.asFloatArray() = FloatArray(size) { this[it].toFloat() }
fun IntArray.asFloatArray() = FloatArray(size) { this[it].toFloat() }
fun LongArray.asFloatArray() = FloatArray(size) { this[it].toFloat() }

fun ByteArray.asDoubleArray() = DoubleArray(size) { this[it].toDouble() }
fun ShortArray.asDoubleArray() = DoubleArray(size) { this[it].toDouble() }
fun IntArray.asDoubleArray() = DoubleArray(size) { this[it].toDouble() }
fun LongArray.asDoubleArray() = DoubleArray(size) { this[it].toDouble() }
fun FloatArray.asDoubleArray() = DoubleArray(size) { this[it].toDouble() }

// accesses
fun BooleanArray.asAccess() = VolatileBooleanArray(this, true)
fun CharArray.asAccess() = VolatileCharArray(this, true)
fun ByteArray.asAccess() = VolatileByteArray(this, true)
fun ShortArray.asAccess() = VolatileShortArray(this, true)
fun IntArray.asAccess() = VolatileIntArray(this, true)
fun LongArray.asAccess() = VolatileLongArray(this, true)
fun FloatArray.asAccess() = VolatileFloatArray(this, true)
fun DoubleArray.asAccess() = VolatileDoubleArray(this, true)