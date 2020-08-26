package net.imglib2.imklib.net.imglib2.imklib.access

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