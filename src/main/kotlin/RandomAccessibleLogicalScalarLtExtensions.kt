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

// auto-generated, do not modify!

@file:Suppress("UNCHECKED_CAST")

package net.imglib2.imklib

import kotlin.Number
import kotlin.Suppress
import net.imglib2.RandomAccessible
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.ByteType
import net.imglib2.type.numeric.integer.IntType
import net.imglib2.type.numeric.integer.LongType
import net.imglib2.type.numeric.integer.ShortType
import net.imglib2.type.numeric.integer.UnsignedByteType
import net.imglib2.type.numeric.integer.UnsignedIntType
import net.imglib2.type.numeric.integer.UnsignedLongType
import net.imglib2.type.numeric.integer.UnsignedShortType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType

infix fun RandomAccessible<out RealType<*>>.lt(that: RealType<*>): RandomAccessible<BoolType> {
    return when {
        this.type is DoubleType && that is DoubleType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s < that) }
        this.type is DoubleType && that is FloatType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is DoubleType && that is LongType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is DoubleType && that is IntType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is DoubleType && that is ShortType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is DoubleType && that is ByteType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is DoubleType && that is UnsignedLongType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is DoubleType && that is UnsignedIntType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is DoubleType && that is UnsignedShortType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is DoubleType && that is UnsignedByteType -> this.asType(DoubleType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is FloatType && that is DoubleType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is FloatType && that is FloatType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s < that) }
        this.type is FloatType && that is LongType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is FloatType && that is IntType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is FloatType && that is ShortType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is FloatType && that is ByteType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is FloatType && that is UnsignedLongType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is FloatType && that is UnsignedIntType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is FloatType && that is UnsignedShortType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is FloatType && that is UnsignedByteType -> this.asType(FloatType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is LongType && that is DoubleType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is LongType && that is FloatType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is LongType && that is LongType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s < that) }
        this.type is LongType && that is IntType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is LongType && that is ShortType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is LongType && that is ByteType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is LongType && that is UnsignedLongType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is LongType && that is UnsignedIntType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is LongType && that is UnsignedShortType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is LongType && that is UnsignedByteType -> this.asType(LongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is IntType && that is DoubleType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is IntType && that is FloatType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is IntType && that is LongType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is IntType && that is IntType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s < that) }
        this.type is IntType && that is ShortType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is IntType && that is ByteType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is IntType && that is UnsignedLongType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is IntType && that is UnsignedIntType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is IntType && that is UnsignedShortType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is IntType && that is UnsignedByteType -> this.asType(IntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ShortType && that is DoubleType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is ShortType && that is FloatType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is ShortType && that is LongType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ShortType && that is IntType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ShortType && that is ShortType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s < that) }
        this.type is ShortType && that is ByteType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ShortType && that is UnsignedLongType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ShortType && that is UnsignedIntType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ShortType && that is UnsignedShortType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ShortType && that is UnsignedByteType -> this.asType(ShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ByteType && that is DoubleType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is ByteType && that is FloatType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is ByteType && that is LongType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ByteType && that is IntType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ByteType && that is ShortType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ByteType && that is ByteType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s < that) }
        this.type is ByteType && that is UnsignedLongType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ByteType && that is UnsignedIntType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ByteType && that is UnsignedShortType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is ByteType && that is UnsignedByteType -> this.asType(ByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedLongType && that is DoubleType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is UnsignedLongType && that is FloatType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is UnsignedLongType && that is LongType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedLongType && that is IntType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedLongType && that is ShortType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedLongType && that is ByteType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedLongType && that is UnsignedLongType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s < that) }
        this.type is UnsignedLongType && that is UnsignedIntType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedLongType && that is UnsignedShortType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedLongType && that is UnsignedByteType -> this.asType(UnsignedLongType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedIntType && that is DoubleType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is UnsignedIntType && that is FloatType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is UnsignedIntType && that is LongType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedIntType && that is IntType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedIntType && that is ShortType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedIntType && that is ByteType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedIntType && that is UnsignedLongType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedIntType && that is UnsignedIntType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s < that) }
        this.type is UnsignedIntType && that is UnsignedShortType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedIntType && that is UnsignedByteType -> this.asType(UnsignedIntType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedShortType && that is DoubleType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is UnsignedShortType && that is FloatType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is UnsignedShortType && that is LongType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedShortType && that is IntType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedShortType && that is ShortType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedShortType && that is ByteType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedShortType && that is UnsignedLongType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedShortType && that is UnsignedIntType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedShortType && that is UnsignedShortType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s < that) }
        this.type is UnsignedShortType && that is UnsignedByteType -> this.asType(UnsignedShortType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedByteType && that is DoubleType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is UnsignedByteType && that is FloatType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
        this.type is UnsignedByteType && that is LongType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedByteType && that is IntType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedByteType && that is ShortType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedByteType && that is ByteType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedByteType && that is UnsignedLongType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedByteType && that is UnsignedIntType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedByteType && that is UnsignedShortType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        this.type is UnsignedByteType && that is UnsignedByteType -> this.asType(UnsignedByteType()).convert(BoolType()) { s, t -> t.set(s < that) }
        else -> throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
    }
}

infix fun RealType<*>.lt(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
    return that gt this
}

infix fun RandomAccessible<out RealType<*>>.lt(that: Number): RandomAccessible<BoolType> {
    return this lt that.asType()
}

infix fun Number.lt(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
    return that gt this
}
