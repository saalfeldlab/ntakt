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

import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI
import net.imglib2.Interval
import net.imglib2.RealLocalizable
import net.imglib2.img.array.ArrayImg
import net.imglib2.img.array.ArrayImgs
import net.imglib2.img.basictypeaccess.*
import net.imglib2.loops.LoopBuilder
import net.imglib2.position.FunctionRealRandomAccessible
import net.imglib2.type.BooleanType
import net.imglib2.type.NativeType
import net.imglib2.type.numeric.complex.ComplexDoubleType
import net.imglib2.type.numeric.complex.ComplexFloatType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.operators.SetOne
import net.imglib2.type.operators.SetZero
import java.math.BigInteger
import java.util.function.BiConsumer
import java.util.function.Supplier
import org.ntakt.io.io as _io

@Suppress("unused")
object ntakt {

    // ArrayImg convenience constructors

    fun bits(vararg dim: Long) = ArrayImgs.bits(*dim)!!
    fun bits(vararg dim: Int) = bits(*dim.asLongArray())
    fun booleans(vararg dim: Long) = ArrayImgs.booleans(*dim)!!
    fun booleans(vararg dim: Int) = booleans(*dim.asLongArray())
    fun <A: LongAccess> bits(access: A, vararg dim: Long) = ArrayImgs.bits(access, *dim)
    fun <A: LongAccess> bits(access: A, vararg dim: Int) = bits(access, *dim.asLongArray())
    fun <A: BooleanAccess> booleans(access: A, vararg dim: Long) = ArrayImgs.booleans(access, *dim)
    fun <A: BooleanAccess> booleans(access: A, vararg dim: Int) = booleans(access, *dim.asLongArray())

    fun argbs(vararg dim: Long) = ArrayImgs.argbs(*dim)!!
    fun argbs(vararg dim: Int) = argbs(*dim.asLongArray())
    fun <A: IntAccess> argbs(access: A, vararg dim: Long) = ArrayImgs.argbs(access, *dim)
    fun <A: IntAccess> argbs(access: A, vararg dim: Int) = argbs(access, *dim.asLongArray())

    fun bytes(vararg dim: Long) = ArrayImgs.bytes(*dim)!!
    fun bytes(vararg dim: Int) = bytes(*dim.asLongArray())
    fun shorts(vararg dim: Long) = ArrayImgs.shorts(*dim)!!
    fun shorts(vararg dim: Int) = shorts(*dim.asLongArray())
    fun ints(vararg dim: Long) = ArrayImgs.ints(*dim)!!
    fun ints(vararg dim: Int) = ints(*dim.asLongArray())
    fun longs(vararg dim: Long) = ArrayImgs.longs(*dim)!!
    fun longs(vararg dim: Int) = longs(*dim.asLongArray())
    fun <A: ByteAccess> bytes(access: A, vararg dim: Long) = ArrayImgs.bytes(access, *dim)
    fun <A: ByteAccess> bytes(access: A, vararg dim: Int) = bytes(access, *dim.asLongArray())
    fun <A: ShortAccess> shorts(access: A, vararg dim: Long) = ArrayImgs.shorts(access, *dim)
    fun <A: ShortAccess> shorts(access: A, vararg dim: Int) = shorts(access, *dim.asLongArray())
    fun <A: IntAccess> ints(access: A, vararg dim: Long) = ArrayImgs.ints(access, *dim)
    fun <A: IntAccess> ints(access: A, vararg dim: Int) = ints(access, *dim.asLongArray())
    fun <A: LongAccess> longs(access: A, vararg dim: Long) = ArrayImgs.longs(access, *dim)
    fun <A: LongAccess> longs(access: A, vararg dim: Int) = longs(access, *dim.asLongArray())

    fun unsignedBytes(vararg dim: Long) = ArrayImgs.unsignedBytes(*dim)!!
    fun unsignedBytes(vararg dim: Int) = unsignedBytes(*dim.asLongArray())
    fun unsignedShorts(vararg dim: Long) = ArrayImgs.unsignedShorts(*dim)!!
    fun unsignedShorts(vararg dim: Int) = unsignedShorts(*dim.asLongArray())
    fun unsignedInts(vararg dim: Long) = ArrayImgs.unsignedInts(*dim)!!
    fun unsignedInts(vararg dim: Int) = unsignedInts(*dim.asLongArray())
    fun unsignedLongs(vararg dim: Long) = ArrayImgs.unsignedLongs(*dim)!!
    fun unsignedLongs(vararg dim: Int) = unsignedLongs(*dim.asLongArray())
    fun <A: ByteAccess> unsignedBytes(access: A, vararg dim: Long) = ArrayImgs.unsignedBytes(access, *dim)
    fun <A: ByteAccess> unsignedBytes(access: A, vararg dim: Int) = unsignedBytes(access, *dim.asLongArray())
    fun <A: ShortAccess> unsignedShorts(access: A, vararg dim: Long) = ArrayImgs.unsignedShorts(access, *dim)
    fun <A: ShortAccess> unsignedShorts(access: A, vararg dim: Int) = unsignedShorts(access, *dim.asLongArray())
    fun <A: IntAccess> unsignedInts(access: A, vararg dim: Long) = ArrayImgs.unsignedInts(access, *dim)
    fun <A: IntAccess> unsignedInts(access: A, vararg dim: Int) = unsignedInts(access, *dim.asLongArray())
    fun <A: LongAccess> unsignedLongs(access: A, vararg dim: Long) = ArrayImgs.unsignedLongs(access, *dim)
    fun <A: LongAccess> unsignedLongs(access: A, vararg dim: Int) = unsignedLongs(access, *dim.asLongArray())

    fun unsigned2Bits(vararg dim: Long) = ArrayImgs.unsigned2Bits(*dim)!!
    fun unsigned2Bits(vararg dim: Int) = unsigned2Bits(*dim.asLongArray())
    fun unsigned4Bits(vararg dim: Long) = ArrayImgs.unsigned4Bits(*dim)!!
    fun unsigned4Bits(vararg dim: Int) = unsigned4Bits(*dim.asLongArray())
    fun unsigned12Bits(vararg dim: Long) = ArrayImgs.unsigned12Bits(*dim)!!
    fun unsigned12Bits(vararg dim: Int) = unsigned12Bits(*dim.asLongArray())
    fun unsigned128Bits(vararg dim: Long) = ArrayImgs.unsigned128Bits(*dim)!!
    fun unsigned128Bits(vararg dim: Int) = unsigned128Bits(*dim.asLongArray())
    fun unsignedVariableBitLengths(nbits: Int, vararg dim: Long) = ArrayImgs.unsignedVariableBitLengths(nbits, *dim)!!
    fun unsignedVariableBitLengths(nbits: Int, vararg dim: Int) = unsignedVariableBitLengths(nbits, *dim.asLongArray())
    fun <A: LongAccess> unsigned2Bits(access: A, vararg dim: Long) = ArrayImgs.unsigned2Bits(access, *dim)
    fun <A: LongAccess> unsigned2Bits(access: A, vararg dim: Int) = unsigned2Bits(access, *dim.asLongArray())
    fun <A: LongAccess> unsigned4Bits(access: A, vararg dim: Long) = ArrayImgs.unsigned4Bits(access, *dim)
    fun <A: LongAccess> unsigned4Bits(access: A, vararg dim: Int) = unsigned4Bits(access, *dim.asLongArray())
    fun <A: LongAccess> unsigned128Bits(access: A, vararg dim: Long) = ArrayImgs.unsigned128Bits(access, *dim)
    fun <A: LongAccess> unsigned128Bits(access: A, vararg dim: Int) = unsigned128Bits(access, *dim.asLongArray())
    fun <A: LongAccess> unsignedVariableBitLengths(access: A, nbits: Int, vararg dim: Long) = ArrayImgs.unsignedVariableBitLengths(access, nbits, *dim)
    fun <A: LongAccess> unsignedVariableBitLengths(access: A, nbits: Int, vararg dim: Int) = unsignedVariableBitLengths(access, nbits, *dim.asLongArray())

    fun floats(vararg dim: Long) = ArrayImgs.floats(*dim)!!
    fun floats(vararg dim: Int) = floats(*dim.asLongArray())
    fun doubles(vararg dim: Long) = ArrayImgs.doubles(*dim)!!
    fun doubles(vararg dim: Int) = doubles(*dim.asLongArray())
    fun <A: FloatAccess> floats(access: A, vararg dim: Long) = ArrayImgs.floats(access, *dim)
    fun <A: FloatAccess> floats(access: A, vararg dim: Int) = floats(access, *dim.asLongArray())
    fun <A: DoubleAccess> doubles(access: A, vararg dim: Long) = ArrayImgs.doubles(access, *dim)
    fun <A: DoubleAccess> doubles(access: A, vararg dim: Int) = doubles(access, *dim.asLongArray())

    fun complexFloats(vararg dim: Long) = ArrayImgs.complexFloats(*dim)!!
    fun complexFloats(vararg dim: Int) = complexFloats(*dim.asLongArray())
    fun complexDoubles(vararg dim: Long) = ArrayImgs.complexDoubles(*dim)!!
    fun complexDoubles(vararg dim: Int) = complexDoubles(*dim.asLongArray())
    fun <A: FloatAccess> complexFloats(access: A, vararg dim: Long) = ArrayImgs.complexFloats(access, *dim)
    fun <A: FloatAccess> complexFloats(access: A, vararg dim: Int) = complexFloats(access, *dim.asLongArray())
    fun <A: DoubleAccess> complexDoubles(access: A, vararg dim: Long) = ArrayImgs.complexDoubles(access, *dim)
    fun <A: DoubleAccess> complexDoubles(access: A, vararg dim: Int) = complexDoubles(access, *dim.asLongArray())

    // with initializers
    inline fun <T : NativeType<T>> ArrayImg<T, *>.init(init: (Int, T) -> Unit) = also { it.forEachIndexed { i, t -> init(i, t) } }

    inline fun bits(vararg dim: Long, init: (Int) -> Boolean) = bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun bits(vararg dim: Int, init: (Int) -> Boolean) = bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun booleans(vararg dim: Long, init: (Int) -> Boolean) = booleans(*dim).init { i, t -> t.set(init(i)) }
    inline fun booleans(vararg dim: Int, init: (Int) -> Boolean) = booleans(*dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> bits(access: A, vararg dim: Long, init: (Int) -> Boolean) = bits(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> bits(access: A, vararg dim: Int, init: (Int) -> Boolean) = bits(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: BooleanAccess> booleans(access: A, vararg dim: Long, init: (Int) -> Boolean) = booleans(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: BooleanAccess> booleans(access: A, vararg dim: Int, init: (Int) -> Boolean) = booleans(access, *dim).init { i, t -> t.set(init(i)) }

    inline fun argbs(vararg dim: Long, init: (Int) -> Int) = argbs(*dim).init { i, t -> t.set(init(i)) }
    inline fun argbs(vararg dim: Int, init: (Int) -> Int) = argbs(*dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> argbs(access: A, vararg dim: Long, init: (Int) -> Int) = argbs(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> argbs(access: A, vararg dim: Int, init: (Int) -> Int) = argbs(access, *dim).init { i, t -> t.set(init(i)) }

    inline fun bytes(vararg dim: Long, init: (Int) -> Byte) = bytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun bytes(vararg dim: Int, init: (Int) -> Byte) = bytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun shorts(vararg dim: Long, init: (Int) -> Short) = shorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun shorts(vararg dim: Int, init: (Int) -> Short) = shorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun ints(vararg dim: Long, init: (Int) -> Int) = ints(*dim).init { i, t -> t.set(init(i)) }
    inline fun ints(vararg dim: Int, init: (Int) -> Int) = ints(*dim).init { i, t -> t.set(init(i)) }
    inline fun longs(vararg dim: Long, init: (Int) -> Long) = longs(*dim).init { i, t -> t.set(init(i)) }
    inline fun longs(vararg dim: Int, init: (Int) -> Long) = longs(*dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ByteAccess> bytes(access: A, vararg dim: Long, init: (Int) -> Byte) = bytes(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ByteAccess> bytes(access: A, vararg dim: Int, init: (Int) -> Byte) = bytes(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ShortAccess> shorts(access: A, vararg dim: Long, init: (Int) -> Short) = shorts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ShortAccess> shorts(access: A, vararg dim: Int, init: (Int) -> Short) = shorts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> ints(access: A, vararg dim: Long, init: (Int) -> Int) = ints(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> ints(access: A, vararg dim: Int, init: (Int) -> Int) = ints(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> longs(access: A, vararg dim: Long, init: (Int) -> Long) = longs(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> longs(access: A, vararg dim: Int, init: (Int) -> Long) = longs(access, *dim).init { i, t -> t.set(init(i)) }

    inline fun unsignedBytes(vararg dim: Long, init: (Int) -> Int) = unsignedBytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedBytes(vararg dim: Int, init: (Int) -> Int) = unsignedBytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedShorts(vararg dim: Long, init: (Int) -> Int) = unsignedShorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedShorts(vararg dim: Int, init: (Int) -> Int) = unsignedShorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedInts(vararg dim: Long, init: (Int) -> Long) = unsignedInts(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedInts(vararg dim: Int, init: (Int) -> Long) = unsignedInts(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedLongs(vararg dim: Long, init: (Int) -> Long) = unsignedLongs(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedLongs(vararg dim: Int, init: (Int) -> Long) = unsignedLongs(*dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ByteAccess> unsignedBytes(access: A, vararg dim: Long, init: (Int) -> Int) = unsignedBytes(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ByteAccess> unsignedBytes(access: A, vararg dim: Int, init: (Int) -> Int) = unsignedBytes(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ShortAccess> unsignedShorts(access: A, vararg dim: Long, init: (Int) -> Int) = unsignedShorts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ShortAccess> unsignedShorts(access: A, vararg dim: Int, init: (Int) -> Int) = unsignedShorts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> unsignedInts(access: A, vararg dim: Long, init: (Int) -> Long) = unsignedInts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> unsignedInts(access: A, vararg dim: Int, init: (Int) -> Long) = unsignedInts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsignedLongs(access: A, vararg dim: Long, init: (Int) -> Long) = unsignedLongs(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsignedLongs(access: A, vararg dim: Int, init: (Int) -> Long) = unsignedLongs(access, *dim).init { i, t -> t.set(init(i)) }

    inline fun unsigned2Bits(vararg dim: Long, init: (Int) -> Long) = unsigned2Bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsigned2Bits(vararg dim: Int, init: (Int) -> Long) = unsigned2Bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsigned4Bits(vararg dim: Long, init: (Int) -> Long) = unsigned4Bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsigned4Bits(vararg dim: Int, init: (Int) -> Long) = unsigned4Bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsigned12Bits(vararg dim: Long, init: (Int) -> Long) = unsigned12Bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsigned12Bits(vararg dim: Int, init: (Int) -> Long) = unsigned12Bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsigned128Bits(vararg dim: Long, init: (Int) -> BigInteger) = unsigned128Bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsigned128Bits(vararg dim: Int, init: (Int) -> BigInteger) = unsigned128Bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedVariableBitLengths(nbits: Int, vararg dim: Long, init: (Int) -> Long) = unsignedVariableBitLengths(nbits, *dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedVariableBitLengths(nbits: Int, vararg dim: Int, init: (Int) -> Long) = unsignedVariableBitLengths(nbits, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsigned2Bits(access: A, vararg dim: Long, init: (Int) -> Long) = unsigned2Bits(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsigned2Bits(access: A, vararg dim: Int, init: (Int) -> Long) = unsigned2Bits(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsigned4Bits(access: A, vararg dim: Long, init: (Int) -> Long) = unsigned4Bits(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsigned4Bits(access: A, vararg dim: Int, init: (Int) -> Long) = unsigned4Bits(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsigned128Bits(access: A, vararg dim: Long, init: (Int) -> BigInteger) = unsigned128Bits(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsigned128Bits(access: A, vararg dim: Int, init: (Int) -> BigInteger) = unsigned128Bits(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsignedVariableBitLengths(access: A, nbits: Int, vararg dim: Long, init: (Int) -> Long) = unsignedVariableBitLengths(access, nbits, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> unsignedVariableBitLengths(access: A, nbits: Int, vararg dim: Int, init: (Int) -> Long) = unsignedVariableBitLengths(access, nbits, *dim).init { i, t -> t.set(init(i)) }

    inline fun floats(vararg dim: Long, init: (Int) -> Float) = floats(*dim).init { i, t -> t.set(init(i)) }
    inline fun floats(vararg dim: Int, init: (Int) -> Float) = floats(*dim).init { i, t -> t.set(init(i)) }
    inline fun doubles(vararg dim: Long, init: (Int) -> Double) = doubles(*dim).init { i, t -> t.set(init(i)) }
    inline fun doubles(vararg dim: Int, init: (Int) -> Double) = doubles(*dim).init { i, t -> t.set(init(i)) }
    inline fun <A: FloatAccess> floats(access: A, vararg dim: Long, init: (Int) -> Float) = floats(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: FloatAccess> floats(access: A, vararg dim: Int, init: (Int) -> Float) = floats(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: DoubleAccess> doubles(access: A, vararg dim: Long, init: (Int) -> Double) = doubles(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: DoubleAccess> doubles(access: A, vararg dim: Int, init: (Int) -> Double) = doubles(access, *dim).init { i, t -> t.set(init(i)) }

    inline fun complexFloats(vararg dim: Long, init: (Int, ComplexFloatType) -> Unit) = complexFloats(*dim).init(init)
    inline fun complexFloats(vararg dim: Int, init: (Int, ComplexFloatType) -> Unit) = complexFloats(*dim).init(init)
    inline fun complexDoubles(vararg dim: Long, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(*dim).init(init)
    inline fun complexDoubles(vararg dim: Int, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(*dim).init(init)
    inline fun <A: FloatAccess> complexFloats(access: A, vararg dim: Long, init: (Int, ComplexFloatType) -> Unit) = complexFloats(access, *dim).init(init)
    inline fun <A: FloatAccess> complexFloats(access: A, vararg dim: Int, init: (Int, ComplexFloatType) -> Unit) = complexFloats(access, *dim).init(init)
    inline fun <A: DoubleAccess> complexDoubles(access: A, vararg dim: Long, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(access, *dim).init(init)
    inline fun <A: DoubleAccess> complexDoubles(access: A, vararg dim: Int, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(access, *dim).init(init)

    // ArrayImg convenience constructors with type aliases
    fun int8s(vararg dim: Long) = bytes(*dim)
    fun int8s(vararg dim: Int) = bytes(*dim.asLongArray())
    fun int16s(vararg dim: Long) = shorts(*dim)
    fun int16s(vararg dim: Int) = shorts(*dim.asLongArray())
    fun int32s(vararg dim: Long) = ints(*dim)
    fun int32s(vararg dim: Int) = ints(*dim.asLongArray())
    fun int64s(vararg dim: Long) = longs(*dim)
    fun int64s(vararg dim: Int) = longs(*dim.asLongArray())
    fun <A: ByteAccess> int8s(access: A, vararg dim: Long) = bytes(access, *dim)
    fun <A: ByteAccess> int8s(access: A, vararg dim: Int) = bytes(access, *dim.asLongArray())
    fun <A: ShortAccess> int16s(access: A, vararg dim: Long) = shorts(access, *dim)
    fun <A: ShortAccess> int16s(access: A, vararg dim: Int) = shorts(access, *dim.asLongArray())
    fun <A: IntAccess> int32s(access: A, vararg dim: Long) = ints(access, *dim)
    fun <A: IntAccess> int32s(access: A, vararg dim: Int) = ints(access, *dim.asLongArray())
    fun <A: LongAccess> int64s(access: A, vararg dim: Long) = longs(access, *dim)
    fun <A: LongAccess> int64s(access: A, vararg dim: Int) = longs(access, *dim.asLongArray())

    fun uint8s(vararg dim: Long) = unsignedBytes(*dim)
    fun uint8s(vararg dim: Int) = unsignedBytes(*dim.asLongArray())
    fun uint16s(vararg dim: Long) = unsignedShorts(*dim)
    fun uint16s(vararg dim: Int) = unsignedShorts(*dim.asLongArray())
    fun uint32s(vararg dim: Long) = unsignedInts(*dim)
    fun uint32s(vararg dim: Int) = unsignedInts(*dim.asLongArray())
    fun uint64s(vararg dim: Long) = unsignedLongs(*dim)
    fun uint64s(vararg dim: Int) = unsignedLongs(*dim.asLongArray())
    fun <A: ByteAccess> uint8s(access: A, vararg dim: Long) = unsignedBytes(access, *dim)
    fun <A: ByteAccess> uint8s(access: A, vararg dim: Int) = unsignedBytes(access, *dim.asLongArray())
    fun <A: ShortAccess> uint16s(access: A, vararg dim: Long) = unsignedShorts(access, *dim)
    fun <A: ShortAccess> uint16s(access: A, vararg dim: Int) = unsignedShorts(access, *dim.asLongArray())
    fun <A: IntAccess> uint32s(access: A, vararg dim: Long) = unsignedInts(access, *dim)
    fun <A: IntAccess> uint32s(access: A, vararg dim: Int) = unsignedInts(access, *dim.asLongArray())
    fun <A: LongAccess> uint64s(access: A, vararg dim: Long) = unsignedLongs(access, *dim)
    fun <A: LongAccess> uint64s(access: A, vararg dim: Int) = unsignedLongs(access, *dim.asLongArray())

    fun float32s(vararg dim: Long) = floats(*dim)
    fun float32s(vararg dim: Int) = floats(*dim.asLongArray())
    fun float64s(vararg dim: Long) = doubles(*dim)
    fun float64s(vararg dim: Int) = doubles(*dim.asLongArray())
    fun <A: FloatAccess> float32s(access: A, vararg dim: Long) = floats(access, *dim)
    fun <A: FloatAccess> float32s(access: A, vararg dim: Int) = floats(access, *dim.asLongArray())
    fun <A: DoubleAccess> float64s(access: A, vararg dim: Long) = doubles(access, *dim)
    fun <A: DoubleAccess> float64s(access: A, vararg dim: Int) = doubles(access, *dim.asLongArray())

    fun complex64s(vararg dim: Long) = complexFloats(*dim)
    fun complex64s(vararg dim: Int) = complexFloats(*dim.asLongArray())
    fun complex128s(vararg dim: Long) = complexDoubles(*dim)
    fun complex128s(vararg dim: Int) = complexDoubles(*dim.asLongArray())
    fun <A: FloatAccess> complex64s(access: A, vararg dim: Long) = complexFloats(access, *dim)
    fun <A: FloatAccess> complex64s(access: A, vararg dim: Int) = complexFloats(access, *dim.asLongArray())
    fun <A: DoubleAccess> complex128s(access: A, vararg dim: Long) = complexDoubles(access, *dim)
    fun <A: DoubleAccess> complex128s(access: A, vararg dim: Int) = complexDoubles(access, *dim.asLongArray())

    inline fun int8s(vararg dim: Long, init: (Int) -> Byte) = bytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun int8s(vararg dim: Int, init: (Int) -> Byte) = bytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun int16s(vararg dim: Long, init: (Int) -> Short) = shorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun int16s(vararg dim: Int, init: (Int) -> Short) = shorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun int32s(vararg dim: Long, init: (Int) -> Int) = ints(*dim).init { i, t -> t.set(init(i)) }
    inline fun int32s(vararg dim: Int, init: (Int) -> Int) = ints(*dim).init { i, t -> t.set(init(i)) }
    inline fun int64s(vararg dim: Long, init: (Int) -> Long) = longs(*dim).init { i, t -> t.set(init(i)) }
    inline fun int64s(vararg dim: Int, init: (Int) -> Long) = longs(*dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ByteAccess> int8s(access: A, vararg dim: Long, init: (Int) -> Byte) = bytes(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ByteAccess> int8s(access: A, vararg dim: Int, init: (Int) -> Byte) = bytes(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ShortAccess> int16s(access: A, vararg dim: Long, init: (Int) -> Short) = shorts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ShortAccess> int16s(access: A, vararg dim: Int, init: (Int) -> Short) = shorts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> int32s(access: A, vararg dim: Long, init: (Int) -> Int) = ints(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> int32s(access: A, vararg dim: Int, init: (Int) -> Int) = ints(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> int64s(access: A, vararg dim: Long, init: (Int) -> Long) = longs(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> int64s(access: A, vararg dim: Int, init: (Int) -> Long) = longs(access, *dim).init { i, t -> t.set(init(i)) }

    inline fun uint8s(vararg dim: Long, init: (Int) -> Int) = unsignedBytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun uint8s(vararg dim: Int, init: (Int) -> Int) = unsignedBytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun uint16s(vararg dim: Long, init: (Int) -> Int) = unsignedShorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun uint16s(vararg dim: Int, init: (Int) -> Int) = unsignedShorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun uint32s(vararg dim: Long, init: (Int) -> Long) = unsignedInts(*dim).init { i, t -> t.set(init(i)) }
    inline fun uint32s(vararg dim: Int, init: (Int) -> Long) = unsignedInts(*dim).init { i, t -> t.set(init(i)) }
    inline fun uint64s(vararg dim: Long, init: (Int) -> Long) = unsignedLongs(*dim).init { i, t -> t.set(init(i)) }
    inline fun uint64s(vararg dim: Int, init: (Int) -> Long) = unsignedLongs(*dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ByteAccess> uint8s(access: A, vararg dim: Long, init: (Int) -> Int) = unsignedBytes(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ByteAccess> uint8s(access: A, vararg dim: Int, init: (Int) -> Int) = unsignedBytes(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ShortAccess> uint16s(access: A, vararg dim: Long, init: (Int) -> Int) = unsignedShorts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: ShortAccess> uint16s(access: A, vararg dim: Int, init: (Int) -> Int) = unsignedShorts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> uint32s(access: A, vararg dim: Long, init: (Int) -> Long) = unsignedInts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: IntAccess> uint32s(access: A, vararg dim: Int, init: (Int) -> Long) = unsignedInts(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> uint64s(access: A, vararg dim: Long, init: (Int) -> Long) = unsignedLongs(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: LongAccess> uint64s(access: A, vararg dim: Int, init: (Int) -> Long) = unsignedLongs(access, *dim).init { i, t -> t.set(init(i)) }

    inline fun float32s(vararg dim: Long, init: (Int) -> Float) = floats(*dim).init { i, t -> t.set(init(i)) }
    inline fun float32s(vararg dim: Int, init: (Int) -> Float) = floats(*dim).init { i, t -> t.set(init(i)) }
    inline fun float64s(vararg dim: Long, init: (Int) -> Double) = doubles(*dim).init { i, t -> t.set(init(i)) }
    inline fun float64s(vararg dim: Int, init: (Int) -> Double) = doubles(*dim).init { i, t -> t.set(init(i)) }
    inline fun <A: FloatAccess> float32s(access: A, vararg dim: Long, init: (Int) -> Float) = floats(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: FloatAccess> float32s(access: A, vararg dim: Int, init: (Int) -> Float) = floats(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: DoubleAccess> float64s(access: A, vararg dim: Long, init: (Int) -> Double) = doubles(access, *dim).init { i, t -> t.set(init(i)) }
    inline fun <A: DoubleAccess> float64s(access: A, vararg dim: Int, init: (Int) -> Double) = doubles(access, *dim).init { i, t -> t.set(init(i)) }

    inline fun complex64s(vararg dim: Long, init: (Int, ComplexFloatType) -> Unit) = complexFloats(*dim).init(init)
    inline fun complex64s(vararg dim: Int, init: (Int, ComplexFloatType) -> Unit) = complexFloats(*dim).init(init)
    inline fun complex128s(vararg dim: Long, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(*dim).init(init)
    inline fun complex128s(vararg dim: Int, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(*dim).init(init)
    inline fun <A: FloatAccess> complex64s(access: A, vararg dim: Long, init: (Int, ComplexFloatType) -> Unit) = complexFloats(access, *dim).init(init)
    inline fun <A: FloatAccess> complex64s(access: A, vararg dim: Int, init: (Int, ComplexFloatType) -> Unit) = complexFloats(access, *dim).init(init)
    inline fun <A: DoubleAccess> complex128s(access: A, vararg dim: Long, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(access, *dim).init(init)
    inline fun <A: DoubleAccess> complex128s(access: A, vararg dim: Int, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(access, *dim).init(init)


    // virtual constant RA & RAI
    fun <T> constant(constant: T, numDimensions: Int) = constant.constantRandomAccessible(numDimensions)
    fun <T> constant(constant: T, interval: Interval) = constant.constantRandomAccessibleInterval(interval)

    fun <T: SetZero> zeros(type: T, numDimensions: Int) = type.also { it.setZero() }.let { constant(it, numDimensions) }
    fun <T: SetZero> zeros(type: T, interval: Interval) = type.also { it.setZero() }.let { constant(it, interval) }
    fun <T: SetZero> zeros(type: T, vararg dimensions: Long) = zeros(type, dimensions.interval)
    fun zeros(numDimensions: Int) = zeros(DoubleType(), numDimensions)
    fun zeros(interval: Interval) = zeros(DoubleType(), interval)

    fun <T: SetOne> ones(type: T, numDimensions: Int) = type.also { it.setOne() }.let { constant(it, numDimensions) }
    fun <T: SetOne> ones(type: T, interval: Interval) = type.also { it.setOne() }.let { constant(it, interval) }
    fun <T: SetOne> ones(type: T, vararg dimensions: Long) = ones(type, dimensions.interval)
    fun ones(numDimensions: Int) = ones(DoubleType(), numDimensions)
    fun ones(interval: Interval) = ones(DoubleType(), interval)

    // state-less function
    fun <T> function(n: Int, typeSupplier: Supplier<T>, f: BiConsumer<RealLocalizable, in T>) = FunctionRealRandomAccessible(n, f, typeSupplier)
    inline fun <T> function(n: Int, typeSupplier: Supplier<T>, crossinline f: (RealLocalizable, T) -> Unit) = function(n, typeSupplier, BiConsumer { t, u -> f(t, u) })
    inline fun <T> function(n: Int, crossinline  typeSupplier: () -> T, crossinline  f: (RealLocalizable, T) -> Unit) = function(n, Supplier { typeSupplier() }, f)

    // stateful function
    fun <T> function(n: Int, typeSupplier: Supplier<T>, f: Supplier<BiConsumer<RealLocalizable, in T>>) = FunctionRealRandomAccessible(n, f, typeSupplier)
    @JvmName("functionBiconsumer") inline fun <T> function(n: Int, typeSupplier: Supplier<T>, crossinline f: () -> BiConsumer<RealLocalizable, in T>) = function(n, typeSupplier, Supplier { f() })
    @JvmName("functionLambda")inline fun <T> function(n: Int, typeSupplier: Supplier<T>, crossinline f: () -> (RealLocalizable, T) -> Unit) = function(n, typeSupplier, { BiConsumer<RealLocalizable, T> { t, u -> f()(t, u) } } as () -> BiConsumer<RealLocalizable, in T>)
    inline fun <T> function(n: Int, crossinline  typeSupplier: () -> T, crossinline  f: () -> (RealLocalizable, T) -> Unit) = function(n, Supplier { typeSupplier() }, f)

    val io = _io
    val types = org.ntakt.types

    fun <T: BooleanType<T>> where(rai: RAI<T>) = rai.where()

    infix fun <T> RA<T>.asRAI(interval: Interval) = this as? RAI<T> ?: this[interval]
    fun <A> loop(a: RAI<A>) = LoopBuilder.setImages(a)
    fun <A, B> loop(a: RAI<A>, b: RA<B>) = LoopBuilder.setImages(a, b asRAI a)
    fun <A, B, C> loop(a: RAI<A>, b: RA<B>, c: RA<C>) = LoopBuilder.setImages(a, b asRAI a, c asRAI a)
    fun <A, B, C, D> loop(a: RAI<A>, b: RA<B>, c: RA<C>, d: RA<D>) = LoopBuilder.setImages(a, b asRAI a, c asRAI a, d asRAI a)
    fun <A, B, C, D, E> loop(a: RAI<A>, b: RA<B>, c: RA<C>, d: RA<D>, e: RA<E>) = LoopBuilder
        .setImages(a, b asRAI a, c asRAI a, d asRAI a, e asRAI a)
    fun <A, B, C, D, E, F> loop(a: RAI<A>, b: RA<B>, c: RA<C>, d: RA<D>, e: RA<E>, f: RA<F>) = LoopBuilder
        .setImages(a, b asRAI a, c asRAI a, d asRAI a, e asRAI a, f asRAI a)

    inline fun <A> loop(a: RAI<A>, crossinline action: (A) -> Unit) = loop(a).forEachPixel { _a -> action(_a) }
    inline fun <A, B> loop(a: RAI<A>, b: RA<B>, crossinline action: (A, B) -> Unit) = loop(a, b).forEachPixel { _a, _b -> action(_a, _b) }
    inline fun <A, B, C> loop(a: RAI<A>, b: RA<B>, c: RA<C>, crossinline action: (A, B, C) -> Unit) = loop(a, b, c).forEachPixel { _a, _b, _c -> action(_a, _b, _c) }
    inline fun <A, B, C, D> loop(a: RAI<A>, b: RA<B>, c: RA<C>, d: RA<D>, crossinline action: (A, B, C, D) -> Unit) = loop(a, b, c, d)
        .forEachPixel { _a, _b, _c, _d -> action(_a, _b, _c, _d) }
    inline fun <A, B, C, D, E> loop(a: RAI<A>, b: RA<B>, c: RA<C>, d: RA<D>, e: RA<E>, crossinline action: (A, B, C, D, E) -> Unit) = loop(a, b, c, d, e)
        .forEachPixel { _a, _b, _c, _d, _e -> action(_a, _b, _c, _d, _e) }
    inline fun <A, B, C, D, E, F> loop(a: RAI<A>, b: RA<B>, c: RA<C>, d: RA<D>, e: RA<E>, f: RA<F>, crossinline action: (A, B, C, D, E, F) -> Unit) = loop(a, b, c, d, e, f)
        .forEachPixel { _a, _b, _c, _d, _e, _f -> action(_a, _b, _c, _d, _e, _f) }

}
