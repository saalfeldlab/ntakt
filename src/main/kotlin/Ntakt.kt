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
import net.imglib2.loops.LoopBuilder
import net.imglib2.position.FunctionRealRandomAccessible
import net.imglib2.type.BooleanType
import net.imglib2.type.NativeType
import net.imglib2.type.numeric.ARGBType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.complex.ComplexDoubleType
import net.imglib2.type.numeric.complex.ComplexFloatType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.type.operators.SetOne
import net.imglib2.type.operators.SetZero
import net.imglib2.util.ConstantUtils
import java.math.BigInteger
import java.util.function.BiConsumer
import java.util.function.Consumer
import java.util.function.Supplier
import org.ntakt.io.io as _io

private fun IntArray.toLongArray() = LongArray(size) { this[it].toLong() }

object ntakt {

    fun bits(vararg dim: Long) = ArrayImgs.bits(*dim)!!
    fun bits(vararg dim: Int) = bits(*dim.toLongArray())
    fun booleans(vararg dim: Long) = ArrayImgs.booleans(*dim)!!
    fun booleans(vararg dim: Int) = booleans(*dim.toLongArray())

    fun argbs(vararg dim: Long) = ArrayImgs.argbs(*dim)!!
    fun argbs(vararg dim: Int) = argbs(*dim.toLongArray())

    fun bytes(vararg dim: Long) = ArrayImgs.bytes(*dim)!!
    fun bytes(vararg dim: Int) = bytes(*dim.toLongArray())
    fun shorts(vararg dim: Long) = ArrayImgs.shorts(*dim)!!
    fun shorts(vararg dim: Int) = shorts(*dim.toLongArray())
    fun ints(vararg dim: Long) = ArrayImgs.ints(*dim)!!
    fun ints(vararg dim: Int) = ints(*dim.toLongArray())
    fun longs(vararg dim: Long) = ArrayImgs.longs(*dim)!!
    fun longs(vararg dim: Int) = longs(*dim.toLongArray())

    fun unsignedBytes(vararg dim: Long) = ArrayImgs.unsignedBytes(*dim)!!
    fun unsignedBytes(vararg dim: Int) = unsignedBytes(*dim.toLongArray())
    fun unsignedShorts(vararg dim: Long) = ArrayImgs.unsignedShorts(*dim)!!
    fun unsignedShorts(vararg dim: Int) = unsignedShorts(*dim.toLongArray())
    fun unsignedInts(vararg dim: Long) = ArrayImgs.unsignedInts(*dim)!!
    fun unsignedInts(vararg dim: Int) = unsignedInts(*dim.toLongArray())
    fun unsignedLongs(vararg dim: Long) = ArrayImgs.unsignedLongs(*dim)!!
    fun unsignedLongs(vararg dim: Int) = unsignedLongs(*dim.toLongArray())

    fun unsigned2Bits(vararg dim: Long) = ArrayImgs.unsigned2Bits(*dim)!!
    fun unsigned2Bits(vararg dim: Int) = unsigned2Bits(*dim.toLongArray())
    fun unsigned4Bits(vararg dim: Long) = ArrayImgs.unsigned4Bits(*dim)!!
    fun unsigned4Bits(vararg dim: Int) = unsigned4Bits(*dim.toLongArray())
    fun unsigned12Bits(vararg dim: Long) = ArrayImgs.unsigned12Bits(*dim)!!
    fun unsigned12Bits(vararg dim: Int) = unsigned12Bits(*dim.toLongArray())
    fun unsigned128Bits(vararg dim: Long) = ArrayImgs.unsigned128Bits(*dim)!!
    fun unsigned128Bits(vararg dim: Int) = unsigned128Bits(*dim.toLongArray())
    fun unsignedVariableBitLengths(nbits: Int, vararg dim: Long) = ArrayImgs.unsignedVariableBitLengths(nbits, *dim)!!
    fun unsignedVariableBitLengths(nbits: Int, vararg dim: Int) = unsignedVariableBitLengths(nbits, *dim.toLongArray())

    fun floats(vararg dim: Long) = ArrayImgs.floats(*dim)!!
    fun floats(vararg dim: Int) = floats(*dim.toLongArray())
    fun doubles(vararg dim: Long) = ArrayImgs.doubles(*dim)!!
    fun doubles(vararg dim: Int) = doubles(*dim.toLongArray())

    fun complexFloats(vararg dim: Long) = ArrayImgs.complexFloats(*dim)!!
    fun complexFloats(vararg dim: Int) = complexFloats(*dim.toLongArray())
    fun complexDoubles(vararg dim: Long) = ArrayImgs.complexDoubles(*dim)!!
    fun complexDoubles(vararg dim: Int) = complexDoubles(*dim.toLongArray())

    // with initializers
    inline fun <T : NativeType<T>> ArrayImg<T, *>.init(init: (Int, T) -> Unit) = also { it.forEachIndexed { i, t -> init(i, t) } }

    inline fun bits(vararg dim: Long, init: (Int) -> Boolean) = bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun bits(vararg dim: Int, init: (Int) -> Boolean) = bits(*dim).init { i, t -> t.set(init(i)) }
    inline fun booleans(vararg dim: Long, init: (Int) -> Boolean) = booleans(*dim).init { i, t -> t.set(init(i)) }
    inline fun booleans(vararg dim: Int, init: (Int) -> Boolean) = booleans(*dim).init { i, t -> t.set(init(i)) }

    inline fun argbs(vararg dim: Long, init: (Int) -> Int) = argbs(*dim).init { i, t -> t.set(init(i)) }
    inline fun argbs(vararg dim: Int, init: (Int) -> Int) = argbs(*dim).init { i, t -> t.set(init(i)) }

    inline fun bytes(vararg dim: Long, init: (Int) -> Byte) = bytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun bytes(vararg dim: Int, init: (Int) -> Byte) = bytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun shorts(vararg dim: Long, init: (Int) -> Short) = shorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun shorts(vararg dim: Int, init: (Int) -> Short) = shorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun ints(vararg dim: Long, init: (Int) -> Int) = ints(*dim).init { i, t -> t.set(init(i)) }
    inline fun ints(vararg dim: Int, init: (Int) -> Int) = ints(*dim).init { i, t -> t.set(init(i)) }
    inline fun longs(vararg dim: Long, init: (Int) -> Long) = longs(*dim).init { i, t -> t.set(init(i)) }
    inline fun longs(vararg dim: Int, init: (Int) -> Long) = longs(*dim).init { i, t -> t.set(init(i)) }

    inline fun unsignedBytes(vararg dim: Long, init: (Int) -> Int) = unsignedBytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedBytes(vararg dim: Int, init: (Int) -> Int) = unsignedBytes(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedShorts(vararg dim: Long, init: (Int) -> Int) = unsignedShorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedShorts(vararg dim: Int, init: (Int) -> Int) = unsignedShorts(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedInts(vararg dim: Long, init: (Int) -> Long) = unsignedInts(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedInts(vararg dim: Int, init: (Int) -> Long) = unsignedInts(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedLongs(vararg dim: Long, init: (Int) -> Long) = unsignedLongs(*dim).init { i, t -> t.set(init(i)) }
    inline fun unsignedLongs(vararg dim: Int, init: (Int) -> Long) = unsignedLongs(*dim).init { i, t -> t.set(init(i)) }

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

    inline fun floats(vararg dim: Long, init: (Int) -> Float) = floats(*dim).init { i, t -> t.set(init(i)) }
    inline fun floats(vararg dim: Int, init: (Int) -> Float) = floats(*dim).init { i, t -> t.set(init(i)) }
    inline fun doubles(vararg dim: Long, init: (Int) -> Double) = doubles(*dim).init { i, t -> t.set(init(i)) }
    inline fun doubles(vararg dim: Int, init: (Int) -> Double) = doubles(*dim).init { i, t -> t.set(init(i)) }

    inline fun complexFloats(vararg dim: Long, init: (Int, ComplexFloatType) -> Unit) = complexFloats(*dim).init(init)
    inline fun complexFloats(vararg dim: Int, init: (Int, ComplexFloatType) -> Unit) = complexFloats(*dim).init(init)
    inline fun complexDoubles(vararg dim: Long, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(*dim).init(init)
    inline fun complexDoubles(vararg dim: Int, init: (Int, ComplexDoubleType) -> Unit) = complexDoubles(*dim).init(init)


    // virtual constant RA & RAI
    fun <T> constant(constant: T, numDimensions: Int) = ConstantUtils.constantRandomAccessible(constant, numDimensions)
    fun <T> constant(constant: T, interval: Interval) = ConstantUtils.constantRandomAccessibleInterval(constant, interval)

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

    object types {
        val argb get() = ARGBType()
        val byte get() = ByteType()
        val short get() = ShortType()
        val int get() = IntType()
        val long get() = LongType()
        val unsignedByte get() = UnsignedByteType()
        val unsignedShort get() = UnsignedShortType()
        val unsignedInt get() = UnsignedIntType()
        val unsignedLong get() = UnsignedLongType()
        val float get() = FloatType()
        val double get() = DoubleType()

        val realTypes get() = arrayOf<RealType<*>>(byte, short, int, long, unsignedByte, unsignedShort, unsignedInt, unsignedLong, float, double)
    }

    fun <T: BooleanType<T>> where(rai: RAI<T>) = rai.where()

    infix fun <T> RA<T>.`as rai`(interval: Interval) = this as? RAI<T> ?: this[interval]
    inline fun <A> loop(rai: RAI<A>, crossinline action: (A) -> Unit) = LoopBuilder
        .setImages(rai)
        .forEachPixel(Consumer { a -> action(a) })
    inline fun <A, B> loop(rai1: RAI<A>, ra2: RA<B>, crossinline action: (A, B) -> Unit) = LoopBuilder
        .setImages(rai1, ra2 `as rai` rai1)
        .forEachPixel(BiConsumer { a, b -> action(a, b) })
    inline fun <A, B, C> loop(rai1: RAI<A>, ra2: RA<B>, ra3: RA<C>, crossinline action: (A, B, C) -> Unit) = LoopBuilder
        .setImages(rai1, ra2 `as rai` rai1, ra3 `as rai` rai1)
        .forEachPixel(LoopBuilder.TriConsumer { a, b, c -> action(a, b, c) })
    inline fun <A, B, C, D> loop(rai1: RAI<A>, ra2: RA<B>, ra3: RA<C>, ra4: RA<D>, crossinline action: (A, B, C, D) -> Unit) = LoopBuilder
        .setImages(rai1, ra2 `as rai` rai1, ra3 `as rai` rai1, ra4 `as rai` rai1)
        .forEachPixel(LoopBuilder.FourConsumer { a, b, c, d -> action(a, b, c, d) })
    inline fun <A, B, C, D, E> loop(rai1: RAI<A>, ra2: RA<B>, ra3: RA<C>, ra4: RA<D>, ra5: RA<E>, crossinline action: (A, B, C, D, E) -> Unit) = LoopBuilder
        .setImages(rai1, ra2 `as rai` rai1, ra3 `as rai` rai1, ra4 `as rai` rai1, ra5 `as rai` rai1)
        .forEachPixel(LoopBuilder.FiveConsumer { a, b, c, d, e -> action(a, b, c, d, e) })
    inline fun <A, B, C, D, E, F> loop(rai1: RAI<A>, ra2: RA<B>, ra3: RA<C>, ra4: RA<D>, ra5: RA<E>, ra6: RA<F>, crossinline action: (A, B, C, D, E, F) -> Unit) = LoopBuilder
        .setImages(rai1, ra2 `as rai` rai1, ra3 `as rai` rai1, ra4 `as rai` rai1, ra5 `as rai` rai1, ra6 `as rai` rai1)
        .forEachPixel(LoopBuilder.SixConsumer { a, b, c, d, e, f -> action(a, b, c, d, e, f) })

}
