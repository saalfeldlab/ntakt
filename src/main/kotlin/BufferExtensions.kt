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

import net.imglib2.img.basictypeaccess.nio.ByteBufferAccess
import net.imglib2.img.basictypeaccess.nio.DoubleBufferAccess
import net.imglib2.img.basictypeaccess.nio.FloatBufferAccess
import net.imglib2.img.basictypeaccess.nio.IntBufferAccess
import net.imglib2.img.basictypeaccess.nio.LongBufferAccess
import net.imglib2.img.basictypeaccess.nio.ShortBufferAccess
import java.nio.ByteBuffer
import java.nio.DoubleBuffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
import java.nio.LongBuffer
import java.nio.ShortBuffer


fun ByteBuffer.asAccess(isValid: Boolean = true) = ByteBufferAccess(this, isValid)
fun ShortBuffer.asAccess(isValid: Boolean = true) = ShortBufferAccess(this, isValid)
fun IntBuffer.asAccess(isValid: Boolean = true) = IntBufferAccess(this, isValid)
fun LongBuffer.asAccess(isValid: Boolean = true) = LongBufferAccess(this, isValid)
fun FloatBuffer.asAccess(isValid: Boolean = true) = FloatBufferAccess(this, isValid)
fun DoubleBuffer.asAccess(isValid: Boolean = true) = DoubleBufferAccess(this, isValid)

fun ByteBuffer.asShortAccess(isValid: Boolean = true): ShortBufferAccess = ShortBufferAccess(this, isValid)
fun ByteBuffer.asIntAccess(isValid: Boolean = true): IntBufferAccess = IntBufferAccess(this, isValid)
fun ByteBuffer.asLongAccess(isValid: Boolean = true): LongBufferAccess = LongBufferAccess(this, isValid)
fun ByteBuffer.asFloatAccess(isValid: Boolean = true): FloatBufferAccess = FloatBufferAccess(this, isValid)
fun ByteBuffer.asDoubleAccess(isValid: Boolean = true): DoubleBufferAccess = DoubleBufferAccess(this, isValid)
