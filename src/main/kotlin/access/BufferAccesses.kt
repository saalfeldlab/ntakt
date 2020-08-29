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
package net.imglib2.imklib.access

import net.imglib2.img.basictypeaccess.volatiles.*
import java.nio.*

class ByteBufferAccess(private val buffer: ByteBuffer, private val isValid: Boolean = true) : VolatileByteAccess {
    override fun getValue(index: Int) = buffer[index]
    override fun setValue(index: Int, value: Byte) {
        buffer.put(index, value)
    }
    override fun isValid() = isValid
}

class ShortBufferAccess(private val buffer: ShortBuffer, private val isValid: Boolean = true) : VolatileShortAccess {
    constructor(buffer: ByteBuffer, isValid: Boolean = true) : this(buffer.asShortBuffer(), isValid)
    override fun getValue(index: Int) = buffer[index]
    override fun setValue(index: Int, value: Short) {
        buffer.put(index, value)
    }
    override fun isValid() = isValid
}

class IntBufferAccess(private val buffer: IntBuffer, private val isValid: Boolean = true) : VolatileIntAccess {
    constructor(buffer: ByteBuffer, isValid: Boolean = true) : this(buffer.asIntBuffer(), isValid)
    override fun getValue(index: Int) = buffer[index]
    override fun setValue(index: Int, value: Int) {
        buffer.put(index, value)
    }
    override fun isValid() = isValid
}

class LongBufferAccess(private val buffer: LongBuffer, private val isValid: Boolean = true) : VolatileLongAccess {
    constructor(buffer: ByteBuffer, isValid: Boolean = true) : this(buffer.asLongBuffer(), isValid)
    override fun getValue(index: Int) = buffer[index]
    override fun setValue(index: Int, value: Long) {
        buffer.put(index, value)
    }
    override fun isValid() = isValid
}

class FloatBufferAccess(private val buffer: FloatBuffer, private val isValid: Boolean = true) : VolatileFloatAccess {
    constructor(buffer: ByteBuffer, isValid: Boolean = true) : this(buffer.asFloatBuffer(), isValid)
    override fun getValue(index: Int) = buffer[index]
    override fun setValue(index: Int, value: Float) {
        buffer.put(index, value)
    }
    override fun isValid() = isValid
}

class DoubleBufferAccess(private val buffer: DoubleBuffer, private val isValid: Boolean = true) : VolatileDoubleAccess {
    constructor(buffer: ByteBuffer, isValid: Boolean = true) : this(buffer.asDoubleBuffer(), isValid)
    override fun getValue(index: Int) = buffer[index]
    override fun setValue(index: Int, value: Double) {
        buffer.put(index, value)
    }
    override fun isValid() = isValid
}