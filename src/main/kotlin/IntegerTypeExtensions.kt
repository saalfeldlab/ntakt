package net.imglib2.imklib

import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.integer.*

// createWithValue
fun <T: IntegerType<T>> T.createWithValue(value: Byte) = createVariable().also { it.setTo(value) }
fun <T: IntegerType<T>> T.createWithValue(value: Short) = createVariable().also { it.setTo(value) }
fun <T: IntegerType<T>> T.createWithValue(value: Int) = createVariable().also { it.setTo(value) }
fun <T: IntegerType<T>> T.createWithValue(value: Long) = createVariable().also { it.setTo(value) }

fun <T: IntegerType<T>> Byte.asType(type: T) = type.createWithValue(this)
fun <T: IntegerType<T>> Short.asType(type: T) = type.createWithValue(this)
fun <T: IntegerType<T>> Int.asType(type: T) = type.createWithValue(this)
fun <T: IntegerType<T>> Long.asType(type: T) = type.createWithValue(this)

fun Byte.asType() = asType(ByteType())
fun Short.asType() = asType(ShortType())
fun Int.asType() = asType(IntType())
fun Long.asType() = asType(LongType())

fun Byte.asUnsignedType() = asType(UnsignedByteType())
fun Short.asUnsignedType() = asType(UnsignedShortType())
fun Int.asUnsignedType() = asType(UnsignedIntType())
fun Long.asUnsignedType() = asType(UnsignedLongType())

// conversion
val <T: IntegerType<T>> T.byteType get() = when(this) {
    is ByteType -> copy()
    else -> ByteType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.unsignedByteType get() = when(this) {
    is UnsignedByteType -> copy()
    else -> UnsignedByteType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.shortType get() = when(this) {
    is ShortType -> copy()
    else -> ShortType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.unsignedShortType get() = when(this) {
    is UnsignedShortType -> copy()
    else -> UnsignedShortType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.intType get() = when(this) {
    is IntType -> copy()
    else -> IntType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.unsignedIntType get() = when(this) {
    is UnsignedIntType -> copy()
    else -> UnsignedIntType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.longType get() = when(this) {
    is LongType -> copy()
    else -> LongType().also { it.setInteger(integerLong) }
}
val <T: IntegerType<T>> T.unsignedLongType get() = when(this) {
    is UnsignedLongType -> copy()
    else -> UnsignedLongType().also { it.setInteger(integerLong) }
}

// add
// T + primitive type
operator fun <T: IntegerType<T>> T.plusAssign(value: Byte) = setInteger(integerLong + value)
operator fun <T: IntegerType<T>> T.plus(value: Byte) = copy().also { it += value }
operator fun <T: IntegerType<T>> T.plusAssign(value: Short) = setInteger(integerLong + value)
operator fun <T: IntegerType<T>> T.plus(value: Short) = copy().also { it += value }
operator fun <T: IntegerType<T>> T.plusAssign(value: Int) = setInteger(integerLong + value)
operator fun <T: IntegerType<T>> T.plus(value: Int) = copy().also { it += value }
operator fun <T: IntegerType<T>> T.plusAssign(value: Long) = setInteger(integerLong + value)
operator fun <T: IntegerType<T>> T.plus(value: Long) = copy().also { it += value }
// primitive type + T
operator fun <T: IntegerType<T>> Byte.plus(value: T) = value + this
operator fun <T: IntegerType<T>> Short.plus(value: T) = value + this
operator fun <T: IntegerType<T>> Int.plus(value: T) = value + this
operator fun <T: IntegerType<T>> Long.plus(value: T) = value + this

// subtract
// T - primitive type
operator fun <T: IntegerType<T>> T.minusAssign(value: Byte) = setInteger(integerLong - value)
operator fun <T: IntegerType<T>> T.minus(value: Byte) = copy().also { it -= value }
operator fun <T: IntegerType<T>> T.minusAssign(value: Short) = setInteger(integerLong - value)
operator fun <T: IntegerType<T>> T.minus(value: Short) = copy().also { it -= value }
operator fun <T: IntegerType<T>> T.minusAssign(value: Int) = setInteger(integerLong - value)
operator fun <T: IntegerType<T>> T.minus(value: Int) = copy().also { it -= value }
operator fun <T: IntegerType<T>> T.minusAssign(value: Long) = setInteger(integerLong - value)
operator fun <T: IntegerType<T>> T.minus(value: Long) = copy().also { it -= value }
// primitive type - T
operator fun <T: IntegerType<T>> Byte.minus(value: T) = asType(value) - value
operator fun <T: IntegerType<T>> Short.minus(value: T) = asType(value) - value
operator fun <T: IntegerType<T>> Int.minus(value: T) = asType(value) - value
operator fun <T: IntegerType<T>> Long.minus(value: T) = asType(value) - value

// multiply
// T * primitive type
operator fun <T: IntegerType<T>> T.timesAssign(value: Byte) = setInteger(integerLong * value)
operator fun <T: IntegerType<T>> T.times(value: Byte) = copy().also { it *= value }
operator fun <T: IntegerType<T>> T.timesAssign(value: Short) = setInteger(integerLong * value)
operator fun <T: IntegerType<T>> T.times(value: Short) = copy().also { it *= value }
operator fun <T: IntegerType<T>> T.timesAssign(value: Int) = setInteger(integerLong * value)
operator fun <T: IntegerType<T>> T.times(value: Int) = copy().also { it *= value }
operator fun <T: IntegerType<T>> T.timesAssign(value: Long) = setInteger(integerLong * value)
operator fun <T: IntegerType<T>> T.times(value: Long) = copy().also { it *= value }
// primitive type * T
operator fun <T: IntegerType<T>> Byte.times(value: T) = value * this
operator fun <T: IntegerType<T>> Short.times(value: T) = value * this
operator fun <T: IntegerType<T>> Int.times(value: T) = value * this
operator fun <T: IntegerType<T>> Long.times(value: T) = value * this

// divide
// T / primtive type
operator fun <T: IntegerType<T>> T.divAssign(value: Byte) = setInteger(integerLong / value)
operator fun <T: IntegerType<T>> T.div(value: Byte) = copy().also { it /= value }
operator fun <T: IntegerType<T>> T.divAssign(value: Short) = setInteger(integerLong / value)
operator fun <T: IntegerType<T>> T.div(value: Short) = copy().also { it /= value }
operator fun <T: IntegerType<T>> T.divAssign(value: Int) = setInteger(integerLong / value)
operator fun <T: IntegerType<T>> T.div(value: Int) = copy().also { it /= value }
operator fun <T: IntegerType<T>> T.divAssign(value: Long) = setInteger(integerLong / value)
operator fun <T: IntegerType<T>> T.div(value: Long) = copy().also { it /= value }
// primitive type / T
operator fun <T: IntegerType<T>> Byte.div(value: T) = asType(value).also { it /= value }
operator fun <T: IntegerType<T>> Short.div(value: T) = asType(value).also { it /= value }
operator fun <T: IntegerType<T>> Int.div(value: T) = asType(value).also { it /= value }
operator fun <T: IntegerType<T>> Long.div(value: T) = asType(value).also { it /= value }