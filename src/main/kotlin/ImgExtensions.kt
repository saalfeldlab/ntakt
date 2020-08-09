import net.imglib2.img.array.ArrayImg
import net.imglib2.img.array.ArrayImgs
import net.imglib2.type.NativeType
import net.imglib2.type.logic.BitType
import net.imglib2.type.logic.NativeBoolType
import net.imglib2.type.numeric.ARGBType
import net.imglib2.type.numeric.complex.ComplexDoubleType
import net.imglib2.type.numeric.complex.ComplexFloatType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import java.math.BigInteger

// TODO top level or imgs object?
object imgs {

    fun bits(vararg dim: Long) = ArrayImgs.bits(*dim)
    fun booleans(vararg dim: Long) = ArrayImgs.booleans(*dim)

    fun argbs(vararg dim: Long) = ArrayImgs.argbs(*dim)

    fun bytes(vararg dim: Long) = ArrayImgs.bytes(*dim)
    fun shorts(vararg dim: Long) = ArrayImgs.shorts(*dim)
    fun ints(vararg dim: Long) = ArrayImgs.ints(*dim)
    fun longs(vararg dim: Long) = ArrayImgs.longs(*dim)

    fun unsignedBytes(vararg dim: Long) = ArrayImgs.unsignedBytes(*dim)
    fun unsignedShorts(vararg dim: Long) = ArrayImgs.unsignedShorts(*dim)
    fun unsignedInts(vararg dim: Long) = ArrayImgs.unsignedInts(*dim)
    fun unsignedLongs(vararg dim: Long) = ArrayImgs.unsignedLongs(*dim)

    fun unsigned2Bits(vararg dim: Long) = ArrayImgs.unsigned2Bits(*dim)
    fun unsigned4Bits(vararg dim: Long) = ArrayImgs.unsigned4Bits(*dim)
    fun unsigned12Bits(vararg dim: Long) = ArrayImgs.unsigned12Bits(*dim)
    fun unsigned128Bits(vararg dim: Long) = ArrayImgs.unsigned128Bits(*dim)
    fun unsignedVariableBitLengths(nbits: Int, vararg dim: Long) = ArrayImgs.unsignedVariableBitLengths(nbits, *dim)

    fun floats(vararg dim: Long) = ArrayImgs.floats(*dim)
    fun doubles(vararg dim: Long) = ArrayImgs.doubles(*dim)

    fun complexFloats(vararg dim: Long) = ArrayImgs.complexFloats(*dim)
    fun complexDoubles(vararg dim: Long) = ArrayImgs.complexDoubles(*dim)

    // with initializers
    inline fun <T : NativeType<T>> ArrayImg<T, *>.init(init: (Int, T) -> Unit) = also { it.forEachIndexed { i, t -> init(i, t) } }

    inline fun bits(vararg dim: Long, init: (Int) -> Boolean) = bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun bits(vararg dim: Long, init: (Int, BitType) -> Unit) = bits(*dim).init(init)
    inline fun booleans(vararg dim: Long, init: (Int) -> Boolean) = booleans(*dim) { i, t -> t.set(init(i)) }
    inline fun booleans(vararg dim: Long, init: (Int, NativeBoolType) -> Unit) = booleans(*dim).init(init)

    inline fun argbs(vararg dim: Long, init: (Int) -> Int) = argbs(*dim) { i, t -> t.set(init(i)) }
    inline fun argbs(vararg dim: Long, init: (Int, ARGBType) -> Unit) = argbs(*dim).init(init)

    inline fun bytes(vararg dim: Long, init: (Int) -> Byte) = bytes(*dim) { i, t -> t.set(init(i)) }
    inline fun bytes(vararg dim: Long, init: (Int, ByteType) -> Unit) = bytes(*dim).init(init)
    inline fun shorts(vararg dim: Long, init: (Int) -> Short) = shorts(*dim) { i, t -> t.set(init(i)) }
    inline fun shorts(vararg dim: Long, init: (Int, ShortType) -> Unit) = shorts(*dim).init(init)
    inline fun ints(vararg dim: Long, init: (Int) -> Int) = ints(*dim) { i, t -> t.set(init(i)) }
    inline fun ints(vararg dim: Long, init: (Int, IntType) -> Unit) = ints(*dim).init(init)
    inline fun longs(vararg dim: Long, init: (Int) -> Long) = longs(*dim) { i, t -> t.set(init(i)) }
    inline fun longs(vararg dim: Long, init: (Int, LongType) -> Unit) = longs(*dim).init(init)

    inline fun unsignedBytes(vararg dim: Long, init: (Int) -> Int) = unsignedBytes(*dim) { i, t -> t.set(init(i)) }
    inline fun unsignedBytes(vararg dim: Long, init: (Int, UnsignedByteType) -> Unit) = unsignedBytes(*dim).init(init)
    inline fun unsignedShorts(vararg dim: Long, init: (Int) -> Int) = unsignedShorts(*dim) { i, t -> t.set(init(i)) }
    inline fun unsignedShorts(vararg dim: Long, init: (Int, UnsignedShortType) -> Unit) = unsignedShorts(*dim).init(init)
    inline fun unsignedInts(vararg dim: Long, init: (Int) -> Long) = unsignedInts(*dim) { i, t -> t.set(init(i)) }
    inline fun unsignedInts(vararg dim: Long, init: (Int, UnsignedIntType) -> Unit) = unsignedInts(*dim).init(init)
    inline fun unsignedLongs(vararg dim: Long, init: (Int) -> Long) = unsignedLongs(*dim) { i, t -> t.set(init(i)) }
    inline fun unsignedLongs(vararg dim: Long, init: (Int, UnsignedLongType) -> Unit) = unsignedLongs(*dim).init(init)

    inline fun unsigned2Bits(vararg dim: Long, init: (Int) -> Long) = unsigned2Bits(*dim) { i, t -> t.set(init(i)) }
    inline fun unsigned2Bits(vararg dim: Long, init: (Int, Unsigned2BitType) -> Unit) = unsigned2Bits(*dim).init(init)
    inline fun unsigned4Bits(vararg dim: Long, init: (Int) -> Long) = unsigned4Bits(*dim) { i, t -> t.set(init(i)) }
    inline fun unsigned4Bits(vararg dim: Long, init: (Int, Unsigned4BitType) -> Unit) = unsigned4Bits(*dim).init(init)
    inline fun unsigned12Bits(vararg dim: Long, init: (Int) -> Long) = unsigned12Bits(*dim) { i, t -> t.set(init(i)) }
    inline fun unsigned12Bits(vararg dim: Long, init: (Int, Unsigned12BitType) -> Unit) = unsigned12Bits(*dim).init(init)
    inline fun unsigned128Bits(vararg dim: Long, init: (Int) -> BigInteger) = unsigned128Bits(*dim) { i, t -> t.set(init(i)) }
    inline fun unsigned128Bits(vararg dim: Long, init: (Int, Unsigned128BitType) -> Unit) = unsigned128Bits(*dim).init(init)
    inline fun unsignedVariableBitLengths(nbits: Int, vararg dim: Long, init: (Int) -> Long) = unsignedVariableBitLengths(nbits, *dim) { i, t -> t.set(init(i)) }
    inline fun unsignedVariableBitLengths(nbits: Int, vararg dim: Long, init: (Int, UnsignedVariableBitLengthType) -> Unit) = unsignedVariableBitLengths(nbits, *dim).init(init)

    inline fun floats(vararg dim: Long, init: (Int) -> Float) = floats(*dim) { i, t -> t.set(init(i)) }
    inline fun floats(vararg dim: Long, init: (Int, FloatType) -> Unit) = floats(*dim).init(init)
    inline fun doubles(vararg dim: Long, init: (Int) -> Double) = doubles(*dim) { i, t -> t.set(init(i)) }
    inline fun doubles(vararg dim: Long, init: (Int, DoubleType) -> Unit) = doubles(*dim).init(init)

    inline fun complexFloats(vararg dim: Long, init: (Int, ComplexFloatType) -> Unit) = complexFloats(*dim).init(init)
    inline fun complexDoubles(vararg dim: Long, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(*dim).init(init)
}
