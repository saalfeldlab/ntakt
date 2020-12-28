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

infix fun RandomAccessible<out RealType<*>>.gt(that: RandomAccessible<out RealType<*>>):
        RandomAccessible<BoolType> {
    return when {
        this.type is DoubleType && that.type is DoubleType -> this.asType(DoubleType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        this.type is DoubleType && that.type is FloatType -> this.asType(DoubleType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is DoubleType && that.type is LongType -> this.asType(DoubleType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is DoubleType && that.type is IntType -> this.asType(DoubleType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is DoubleType && that.type is ShortType -> this.asType(DoubleType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is DoubleType && that.type is ByteType -> this.asType(DoubleType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is DoubleType && that.type is UnsignedLongType -> this.asType(DoubleType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is DoubleType && that.type is UnsignedIntType -> this.asType(DoubleType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is DoubleType && that.type is UnsignedShortType -> this.asType(DoubleType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is DoubleType && that.type is UnsignedByteType -> this.asType(DoubleType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is FloatType && that.type is DoubleType -> this.asType(FloatType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is FloatType && that.type is FloatType -> this.asType(FloatType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        this.type is FloatType && that.type is LongType -> this.asType(FloatType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is FloatType && that.type is IntType -> this.asType(FloatType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is FloatType && that.type is ShortType -> this.asType(FloatType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is FloatType && that.type is ByteType -> this.asType(FloatType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is FloatType && that.type is UnsignedLongType -> this.asType(FloatType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is FloatType && that.type is UnsignedIntType -> this.asType(FloatType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is FloatType && that.type is UnsignedShortType -> this.asType(FloatType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is FloatType && that.type is UnsignedByteType -> this.asType(FloatType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is LongType && that.type is DoubleType -> this.asType(LongType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is LongType && that.type is FloatType -> this.asType(LongType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is LongType && that.type is LongType -> this.asType(LongType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        this.type is LongType && that.type is IntType -> this.asType(LongType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is LongType && that.type is ShortType -> this.asType(LongType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is LongType && that.type is ByteType -> this.asType(LongType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is LongType && that.type is UnsignedLongType -> this.asType(LongType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is LongType && that.type is UnsignedIntType -> this.asType(LongType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is LongType && that.type is UnsignedShortType -> this.asType(LongType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is LongType && that.type is UnsignedByteType -> this.asType(LongType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is IntType && that.type is DoubleType -> this.asType(IntType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is IntType && that.type is FloatType -> this.asType(IntType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is IntType && that.type is LongType -> this.asType(IntType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is IntType && that.type is IntType -> this.asType(IntType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        this.type is IntType && that.type is ShortType -> this.asType(IntType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is IntType && that.type is ByteType -> this.asType(IntType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is IntType && that.type is UnsignedLongType -> this.asType(IntType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is IntType && that.type is UnsignedIntType -> this.asType(IntType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is IntType && that.type is UnsignedShortType -> this.asType(IntType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is IntType && that.type is UnsignedByteType -> this.asType(IntType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ShortType && that.type is DoubleType -> this.asType(ShortType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is ShortType && that.type is FloatType -> this.asType(ShortType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is ShortType && that.type is LongType -> this.asType(ShortType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ShortType && that.type is IntType -> this.asType(ShortType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ShortType && that.type is ShortType -> this.asType(ShortType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        this.type is ShortType && that.type is ByteType -> this.asType(ShortType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ShortType && that.type is UnsignedLongType -> this.asType(ShortType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ShortType && that.type is UnsignedIntType -> this.asType(ShortType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ShortType && that.type is UnsignedShortType -> this.asType(ShortType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ShortType && that.type is UnsignedByteType -> this.asType(ShortType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ByteType && that.type is DoubleType -> this.asType(ByteType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is ByteType && that.type is FloatType -> this.asType(ByteType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is ByteType && that.type is LongType -> this.asType(ByteType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ByteType && that.type is IntType -> this.asType(ByteType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ByteType && that.type is ShortType -> this.asType(ByteType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ByteType && that.type is ByteType -> this.asType(ByteType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        this.type is ByteType && that.type is UnsignedLongType -> this.asType(ByteType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ByteType && that.type is UnsignedIntType -> this.asType(ByteType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ByteType && that.type is UnsignedShortType -> this.asType(ByteType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is ByteType && that.type is UnsignedByteType -> this.asType(ByteType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedLongType && that.type is DoubleType -> this.asType(UnsignedLongType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is UnsignedLongType && that.type is FloatType -> this.asType(UnsignedLongType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is UnsignedLongType && that.type is LongType -> this.asType(UnsignedLongType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedLongType && that.type is IntType -> this.asType(UnsignedLongType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedLongType && that.type is ShortType -> this.asType(UnsignedLongType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedLongType && that.type is ByteType -> this.asType(UnsignedLongType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedLongType && that.type is UnsignedLongType -> this.asType(UnsignedLongType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        this.type is UnsignedLongType && that.type is UnsignedIntType -> this.asType(UnsignedLongType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedLongType && that.type is UnsignedShortType -> this.asType(UnsignedLongType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedLongType && that.type is UnsignedByteType -> this.asType(UnsignedLongType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedIntType && that.type is DoubleType -> this.asType(UnsignedIntType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is UnsignedIntType && that.type is FloatType -> this.asType(UnsignedIntType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is UnsignedIntType && that.type is LongType -> this.asType(UnsignedIntType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedIntType && that.type is IntType -> this.asType(UnsignedIntType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedIntType && that.type is ShortType -> this.asType(UnsignedIntType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedIntType && that.type is ByteType -> this.asType(UnsignedIntType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedIntType && that.type is UnsignedLongType -> this.asType(UnsignedIntType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedIntType && that.type is UnsignedIntType -> this.asType(UnsignedIntType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        this.type is UnsignedIntType && that.type is UnsignedShortType -> this.asType(UnsignedIntType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedIntType && that.type is UnsignedByteType -> this.asType(UnsignedIntType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedShortType && that.type is DoubleType -> this.asType(UnsignedShortType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is UnsignedShortType && that.type is FloatType -> this.asType(UnsignedShortType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is UnsignedShortType && that.type is LongType -> this.asType(UnsignedShortType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedShortType && that.type is IntType -> this.asType(UnsignedShortType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedShortType && that.type is ShortType -> this.asType(UnsignedShortType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedShortType && that.type is ByteType -> this.asType(UnsignedShortType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedShortType && that.type is UnsignedLongType -> this.asType(UnsignedShortType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedShortType && that.type is UnsignedIntType -> this.asType(UnsignedShortType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedShortType && that.type is UnsignedShortType -> this.asType(UnsignedShortType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        this.type is UnsignedShortType && that.type is UnsignedByteType -> this.asType(UnsignedShortType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedByteType && that.type is DoubleType -> this.asType(UnsignedByteType()).convert(that.asType(DoubleType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is UnsignedByteType && that.type is FloatType -> this.asType(UnsignedByteType()).convert(that.asType(FloatType()), BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
        this.type is UnsignedByteType && that.type is LongType -> this.asType(UnsignedByteType()).convert(that.asType(LongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedByteType && that.type is IntType -> this.asType(UnsignedByteType()).convert(that.asType(IntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedByteType && that.type is ShortType -> this.asType(UnsignedByteType()).convert(that.asType(ShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedByteType && that.type is ByteType -> this.asType(UnsignedByteType()).convert(that.asType(ByteType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedByteType && that.type is UnsignedLongType -> this.asType(UnsignedByteType()).convert(that.asType(UnsignedLongType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedByteType && that.type is UnsignedIntType -> this.asType(UnsignedByteType()).convert(that.asType(UnsignedIntType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedByteType && that.type is UnsignedShortType -> this.asType(UnsignedByteType()).convert(that.asType(UnsignedShortType()), BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        this.type is UnsignedByteType && that.type is UnsignedByteType -> this.asType(UnsignedByteType()).convert(that.asType(UnsignedByteType()), BoolType()) { s1, s2, t -> t.set(s1 > s2) }
        else -> throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, ${that.type})")
    }
}
