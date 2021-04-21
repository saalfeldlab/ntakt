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

import net.imglib2.img.basictypeaccess.*

fun ByteAccess.bytes(vararg dim: Long) = ntakt.bytes(this, *dim)
fun ByteAccess.bytes(vararg dim: Int) = ntakt.bytes(this, *dim)
fun ShortAccess.shorts(vararg dim: Long) = ntakt.shorts(this, *dim)
fun ShortAccess.shorts(vararg dim: Int) = ntakt.shorts(this, *dim)
fun IntAccess.ints(vararg dim: Long) = ntakt.ints(this, *dim)
fun IntAccess.ints(vararg dim: Int) = ntakt.ints(this, *dim)
fun LongAccess.longs(vararg dim: Long) = ntakt.longs(this, *dim)
fun LongAccess.longs(vararg dim: Int) = ntakt.longs(this, *dim)

fun ByteAccess.unsignedBytes(vararg dim: Long) = ntakt.unsignedBytes(this, *dim)
fun ByteAccess.unsignedBytes(vararg dim: Int) = ntakt.unsignedBytes(this, *dim)
fun ShortAccess.unsignedShorts(vararg dim: Long) = ntakt.unsignedShorts(this, *dim)
fun ShortAccess.unsignedShorts(vararg dim: Int) = ntakt.unsignedShorts(this, *dim)
fun IntAccess.unsignedInts(vararg dim: Long) = ntakt.unsignedInts(this, *dim)
fun IntAccess.unsignedInts(vararg dim: Int) = ntakt.unsignedInts(this, *dim)
fun LongAccess.unsignedLongs(vararg dim: Long) = ntakt.unsignedLongs(this, *dim)
fun LongAccess.unsignedLongs(vararg dim: Int) = ntakt.unsignedLongs(this, *dim)

fun FloatAccess.floats(vararg dim: Long) = ntakt.floats(this, *dim)
fun FloatAccess.floats(vararg dim: Int) = ntakt.floats(this, *dim)
fun DoubleAccess.doubles(vararg dim: Long) = ntakt.doubles(this, *dim)
fun DoubleAccess.doubles(vararg dim: Int) = ntakt.doubles(this, *dim)

fun FloatAccess.complexFloats(vararg dim: Long) = ntakt.complexFloats(this, *dim)
fun FloatAccess.complexFloats(vararg dim: Int) = ntakt.complexFloats(this, *dim)
fun DoubleAccess.complexDoubles(vararg dim: Long) = ntakt.complexDoubles(this, *dim)
fun DoubleAccess.complexDoubles(vararg dim: Int) = ntakt.complexDoubles(this, *dim)