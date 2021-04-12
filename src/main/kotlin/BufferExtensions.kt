package org.ntakt

import org.ntakt.access.*
import java.nio.*

val ByteBuffer.access get() = ByteBufferAccess(this)
val ShortBuffer.access get() = ShortBufferAccess(this)
val IntBuffer.access get() = IntBufferAccess(this)
val LongBuffer.access get() = LongBufferAccess(this)
val FloatBuffer.access get() = FloatBufferAccess(this)
val DoubleBuffer.access get() = DoubleBufferAccess(this)