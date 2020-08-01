package net.imklib2

import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType


class RealTypeExtensions {
    companion object {
        // createWithValue
        fun <T: RealType<T>> T.createWithValue(value: Byte) = createVariable().also { it.setReal(value.toDouble()) }
        fun <T: RealType<T>> T.createWithValue(value: Short) = createVariable().also { it.setReal(value.toDouble()) }
        fun <T: RealType<T>> T.createWithValue(value: Int) = createVariable().also { it.setReal(value.toDouble()) }
        fun <T: RealType<T>> T.createWithValue(value: Long) = createVariable().also { it.setReal(value.toDouble()) }
        fun <T: RealType<T>> T.createWithValue(value: Float) = createVariable().also { it.setReal(value) }
        fun <T: RealType<T>> T.createWithValue(value: Double) = createVariable().also { it.setReal(value) }

        // conversion
        val <T: RealType<T>> T.floatType get() = when(this) {
            is FloatType -> copy()
            else -> FloatType(realFloat)
        }
        val <T: RealType<T>> T.doubleType get() = when(this) {
            is DoubleType -> copy()
            else -> DoubleType(realDouble)
        }

        // add
        operator fun <T: RealType<T>> T.plusAssign(value: T) = add(value)
        operator fun <T: RealType<T>> T.plus(value: T) = copy().also { it += value }
        operator fun <T: RealType<T>> T.plusAssign(value: Byte) = setReal(realDouble + value)
        operator fun <T: RealType<T>> T.plus(value: Byte) = createWithValue(value).also { it += this }
        operator fun <T: RealType<T>> T.plusAssign(value: Short) = setReal(realDouble + value)
        operator fun <T: RealType<T>> T.plus(value: Short) = createWithValue(value).also { it += this }
        operator fun <T: RealType<T>> T.plusAssign(value: Int) = setReal(realDouble + value)
        operator fun <T: RealType<T>> T.plus(value: Int) = createWithValue(value).also { it += this }
        operator fun <T: RealType<T>> T.plusAssign(value: Long) = setReal(realDouble + value)
        operator fun <T: RealType<T>> T.plus(value: Long) = createWithValue(value).also { it += this }
        operator fun <T: RealType<T>> T.plusAssign(value: Float) = setReal(realDouble + value)
        operator fun <T: RealType<T>> T.plus(value: Float) = createWithValue(value).also { it += this }
        operator fun <T: RealType<T>> T.plusAssign(value: Double) = setReal(realDouble + value)
        operator fun <T: RealType<T>> T.plus(value: Double) = createWithValue(value).also { it += this }

        // subtract
        operator fun <T: RealType<T>> T.minusAssign(value: Byte) = setReal(realDouble - value)
        operator fun <T: RealType<T>> T.minus(value: Byte) = copy().also { it -= value }
        operator fun <T: RealType<T>> T.minusAssign(value: Short) = setReal(realDouble - value)
        operator fun <T: RealType<T>> T.minus(value: Short) = copy().also { it -= value }
        operator fun <T: RealType<T>> T.minusAssign(value: Int) = setReal(realDouble - value)
        operator fun <T: RealType<T>> T.minus(value: Int) = copy().also { it -= value }
        operator fun <T: RealType<T>> T.minusAssign(value: Long) = setReal(realDouble - value)
        operator fun <T: RealType<T>> T.minus(value: Long) = copy().also { it -= value }
        operator fun <T: RealType<T>> T.minusAssign(value: Float) = setReal(realDouble - value)
        operator fun <T: RealType<T>> T.minus(value: Float) = copy().also { it -= value }
        operator fun <T: RealType<T>> T.minusAssign(value: Double) = setReal(realDouble - value)
        operator fun <T: RealType<T>> T.minus(value: Double) = copy().also { it -= value }

        // multiply
        operator fun <T: RealType<T>> T.timesAssign(value: Byte) = mul(value.toDouble())
        operator fun <T: RealType<T>> T.times(value: Byte) = copy().also { it *= value }
        operator fun <T: RealType<T>> T.timesAssign(value: Short) = mul(value.toDouble())
        operator fun <T: RealType<T>> T.times(value: Short) = copy().also { it *= value }
        operator fun <T: RealType<T>> T.timesAssign(value: Int) = mul(value.toDouble())
        operator fun <T: RealType<T>> T.times(value: Int) = copy().also { it *= value }
        operator fun <T: RealType<T>> T.timesAssign(value: Long) = mul(value.toDouble())
        operator fun <T: RealType<T>> T.times(value: Long) = copy().also { it *= value }
        operator fun <T: RealType<T>> T.timesAssign(value: Float) = mul(value)
        operator fun <T: RealType<T>> T.times(value: Float) = copy().also { it *= value }
        operator fun <T: RealType<T>> T.timesAssign(value: Double) = mul(value)
        operator fun <T: RealType<T>> T.times(value: Double) = copy().also { it *= value }

        // divide
        operator fun <T: RealType<T>> T.divAssign(value: Byte) = setReal(realDouble / value)
        operator fun <T: RealType<T>> T.div(value: Byte) = copy().also { it /= value }
        operator fun <T: RealType<T>> T.divAssign(value: Short) = setReal(realDouble / value)
        operator fun <T: RealType<T>> T.div(value: Short) = copy().also { it /= value }
        operator fun <T: RealType<T>> T.divAssign(value: Int) = setReal(realDouble / value)
        operator fun <T: RealType<T>> T.div(value: Int) = copy().also { it /= value }
        operator fun <T: RealType<T>> T.divAssign(value: Long) = setReal(realDouble / value)
        operator fun <T: RealType<T>> T.div(value: Long) = copy().also { it /= value }
        operator fun <T: RealType<T>> T.divAssign(value: Float) = setReal(realDouble / value)
        operator fun <T: RealType<T>> T.div(value: Float) = copy().also { it /= value }
        operator fun <T: RealType<T>> T.divAssign(value: Double) = setReal(realDouble / value)
        operator fun <T: RealType<T>> T.div(value: Double) = copy().also { it /= value }
    }
}

class IntegerTypeExtensions {
    companion object {
        // createWithValue
        fun <T: IntegerType<T>> T.createWithValue(value: Byte) = createVariable().also { it.setInteger(value.toInt()) }
        fun <T: IntegerType<T>> T.createWithValue(value: Short) = createVariable().also { it.setInteger(value.toInt()) }
        fun <T: IntegerType<T>> T.createWithValue(value: Int) = createVariable().also { it.setInteger(value) }
        fun <T: IntegerType<T>> T.createWithValue(value: Long) = createVariable().also { it.setInteger(value) }

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
        operator fun <T: IntegerType<T>> T.plusAssign(value: Byte) = setInteger(integerLong + value)
        operator fun <T: IntegerType<T>> T.plus(value: Byte) = copy().also { it += value }
        operator fun <T: IntegerType<T>> T.plusAssign(value: Short) = setInteger(integerLong + value)
        operator fun <T: IntegerType<T>> T.plus(value: Short) = copy().also { it += value }
        operator fun <T: IntegerType<T>> T.plusAssign(value: Int) = setInteger(integerLong + value)
        operator fun <T: IntegerType<T>> T.plus(value: Int) = copy().also { it += value }
        operator fun <T: IntegerType<T>> T.plusAssign(value: Long) = setInteger(integerLong + value)
        operator fun <T: IntegerType<T>> T.plus(value: Long) = copy().also { it += value }

        // subtract
        operator fun <T: IntegerType<T>> T.minusAssign(value: Byte) = setInteger(integerLong - value)
        operator fun <T: IntegerType<T>> T.minus(value: Byte) = copy().also { it -= value }
        operator fun <T: IntegerType<T>> T.minusAssign(value: Short) = setInteger(integerLong - value)
        operator fun <T: IntegerType<T>> T.minus(value: Short) = copy().also { it -= value }
        operator fun <T: IntegerType<T>> T.minusAssign(value: Int) = setInteger(integerLong - value)
        operator fun <T: IntegerType<T>> T.minus(value: Int) = copy().also { it -= value }
        operator fun <T: IntegerType<T>> T.minusAssign(value: Long) = setInteger(integerLong - value)
        operator fun <T: IntegerType<T>> T.minus(value: Long) = copy().also { it -= value }

        // multiply
        operator fun <T: IntegerType<T>> T.timesAssign(value: Byte) = setInteger(integerLong * value)
        operator fun <T: IntegerType<T>> T.times(value: Byte) = copy().also { it *= value }
        operator fun <T: IntegerType<T>> T.timesAssign(value: Short) = setInteger(integerLong * value)
        operator fun <T: IntegerType<T>> T.times(value: Short) = copy().also { it *= value }
        operator fun <T: IntegerType<T>> T.timesAssign(value: Int) = setInteger(integerLong * value)
        operator fun <T: IntegerType<T>> T.times(value: Int) = copy().also { it *= value }
        operator fun <T: IntegerType<T>> T.timesAssign(value: Long) = setInteger(integerLong * value)
        operator fun <T: IntegerType<T>> T.times(value: Long) = copy().also { it *= value }

        // divide
        operator fun <T: IntegerType<T>> T.divAssign(value: Byte) = setInteger(integerLong / value)
        operator fun <T: IntegerType<T>> T.div(value: Byte) = copy().also { it /= value }
        operator fun <T: IntegerType<T>> T.divAssign(value: Short) = setInteger(integerLong / value)
        operator fun <T: IntegerType<T>> T.div(value: Short) = copy().also { it /= value }
        operator fun <T: IntegerType<T>> T.divAssign(value: Int) = setInteger(integerLong / value)
        operator fun <T: IntegerType<T>> T.div(value: Int) = copy().also { it /= value }
        operator fun <T: IntegerType<T>> T.divAssign(value: Long) = setInteger(integerLong / value)
        operator fun <T: IntegerType<T>> T.div(value: Long) = copy().also { it /= value }
    }

}