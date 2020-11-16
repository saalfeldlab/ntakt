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

package net.imglib2.imklib

import kotlin.Number
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

infix fun RandomAccessible<out RealType<*>>.eq(that: RandomAccessible<out RealType<*>>):
    RandomAccessible<BoolType> {
  if (this.type is DoubleType && that.type is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (this.type is DoubleType && that.type is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is DoubleType && that.type is LongType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is DoubleType && that.type is IntType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is DoubleType && that.type is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is DoubleType && that.type is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is FloatType && that.type is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is FloatType && that.type is FloatType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (this.type is FloatType && that.type is LongType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is FloatType && that.type is IntType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is FloatType && that.type is ShortType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is FloatType && that.type is ByteType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is LongType && that.type is DoubleType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is LongType && that.type is FloatType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is LongType && that.type is LongType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (this.type is LongType && that.type is IntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is LongType && that.type is ShortType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is LongType && that.type is ByteType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is IntType && that.type is DoubleType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is IntType && that.type is FloatType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is IntType && that.type is LongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is IntType && that.type is IntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (this.type is IntType && that.type is ShortType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is IntType && that.type is ByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ShortType && that.type is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is ShortType && that.type is FloatType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is ShortType && that.type is LongType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ShortType && that.type is IntType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ShortType && that.type is ShortType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (this.type is ShortType && that.type is ByteType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ByteType && that.type is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is ByteType && that.type is FloatType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is ByteType && that.type is LongType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ByteType && that.type is IntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ByteType && that.type is ShortType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ByteType && that.type is ByteType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (this.type is ByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedLongType>, BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (this.type is UnsignedLongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedIntType>, BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (this.type is UnsignedIntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedShortType>, BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (this.type is UnsignedShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedByteType>, BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, ${that.type})")
}

infix fun RandomAccessible<out RealType<*>>.ge(that: RandomAccessible<out RealType<*>>):
    RandomAccessible<BoolType> {
  if (this.type is DoubleType && that.type is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (this.type is DoubleType && that.type is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is DoubleType && that.type is LongType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is DoubleType && that.type is IntType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is DoubleType && that.type is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is DoubleType && that.type is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is FloatType && that.type is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is FloatType && that.type is FloatType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (this.type is FloatType && that.type is LongType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is FloatType && that.type is IntType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is FloatType && that.type is ShortType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is FloatType && that.type is ByteType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is LongType && that.type is DoubleType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is LongType && that.type is FloatType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is LongType && that.type is LongType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (this.type is LongType && that.type is IntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is LongType && that.type is ShortType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is LongType && that.type is ByteType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is IntType && that.type is DoubleType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is IntType && that.type is FloatType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is IntType && that.type is LongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is IntType && that.type is IntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (this.type is IntType && that.type is ShortType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is IntType && that.type is ByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ShortType && that.type is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is ShortType && that.type is FloatType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is ShortType && that.type is LongType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ShortType && that.type is IntType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ShortType && that.type is ShortType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (this.type is ShortType && that.type is ByteType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ByteType && that.type is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is ByteType && that.type is FloatType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is ByteType && that.type is LongType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ByteType && that.type is IntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ByteType && that.type is ShortType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ByteType && that.type is ByteType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (this.type is ByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedLongType>, BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (this.type is UnsignedLongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedIntType>, BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (this.type is UnsignedIntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedShortType>, BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (this.type is UnsignedShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedByteType>, BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, ${that.type})")
}

infix fun RandomAccessible<out RealType<*>>.le(that: RandomAccessible<out RealType<*>>):
    RandomAccessible<BoolType> {
  if (this.type is DoubleType && that.type is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (this.type is DoubleType && that.type is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is DoubleType && that.type is LongType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is DoubleType && that.type is IntType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is DoubleType && that.type is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is DoubleType && that.type is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is FloatType && that.type is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is FloatType && that.type is FloatType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (this.type is FloatType && that.type is LongType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is FloatType && that.type is IntType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is FloatType && that.type is ShortType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is FloatType && that.type is ByteType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is LongType && that.type is DoubleType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is LongType && that.type is FloatType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is LongType && that.type is LongType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (this.type is LongType && that.type is IntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is LongType && that.type is ShortType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is LongType && that.type is ByteType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is IntType && that.type is DoubleType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is IntType && that.type is FloatType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is IntType && that.type is LongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is IntType && that.type is IntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (this.type is IntType && that.type is ShortType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is IntType && that.type is ByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ShortType && that.type is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is ShortType && that.type is FloatType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is ShortType && that.type is LongType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ShortType && that.type is IntType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ShortType && that.type is ShortType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (this.type is ShortType && that.type is ByteType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ByteType && that.type is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is ByteType && that.type is FloatType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is ByteType && that.type is LongType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ByteType && that.type is IntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ByteType && that.type is ShortType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ByteType && that.type is ByteType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (this.type is ByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedLongType>, BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (this.type is UnsignedLongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedIntType>, BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (this.type is UnsignedIntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedShortType>, BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (this.type is UnsignedShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedByteType>, BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, ${that.type})")
}

infix fun RandomAccessible<out RealType<*>>.gt(that: RandomAccessible<out RealType<*>>):
    RandomAccessible<BoolType> {
  if (this.type is DoubleType && that.type is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (this.type is DoubleType && that.type is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is DoubleType && that.type is LongType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is DoubleType && that.type is IntType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is DoubleType && that.type is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is DoubleType && that.type is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is FloatType && that.type is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is FloatType && that.type is FloatType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (this.type is FloatType && that.type is LongType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is FloatType && that.type is IntType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is FloatType && that.type is ShortType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is FloatType && that.type is ByteType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is LongType && that.type is DoubleType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is LongType && that.type is FloatType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is LongType && that.type is LongType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (this.type is LongType && that.type is IntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is LongType && that.type is ShortType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is LongType && that.type is ByteType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is IntType && that.type is DoubleType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is IntType && that.type is FloatType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is IntType && that.type is LongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is IntType && that.type is IntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (this.type is IntType && that.type is ShortType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is IntType && that.type is ByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ShortType && that.type is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is ShortType && that.type is FloatType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is ShortType && that.type is LongType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ShortType && that.type is IntType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ShortType && that.type is ShortType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (this.type is ShortType && that.type is ByteType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ByteType && that.type is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is ByteType && that.type is FloatType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is ByteType && that.type is LongType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ByteType && that.type is IntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ByteType && that.type is ShortType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ByteType && that.type is ByteType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (this.type is ByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<FloatType>, BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedLongType>, BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (this.type is UnsignedLongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<FloatType>, BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedIntType>, BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (this.type is UnsignedIntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<FloatType>, BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<IntType>, BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedShortType>, BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (this.type is UnsignedShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<FloatType>, BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedByteType>, BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, ${that.type})")
}

infix fun RandomAccessible<out RealType<*>>.lt(that: RandomAccessible<out RealType<*>>):
    RandomAccessible<BoolType> {
  if (this.type is DoubleType && that.type is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (this.type is DoubleType && that.type is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is DoubleType && that.type is LongType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is DoubleType && that.type is IntType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is DoubleType && that.type is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is DoubleType && that.type is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is DoubleType && that.type is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is FloatType && that.type is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is FloatType && that.type is FloatType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (this.type is FloatType && that.type is LongType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is FloatType && that.type is IntType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is FloatType && that.type is ShortType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is FloatType && that.type is ByteType)
      return (this as RandomAccessible<FloatType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is FloatType && that.type is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is LongType && that.type is DoubleType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is LongType && that.type is FloatType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is LongType && that.type is LongType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (this.type is LongType && that.type is IntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is LongType && that.type is ShortType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is LongType && that.type is ByteType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is LongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is IntType && that.type is DoubleType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is IntType && that.type is FloatType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is IntType && that.type is LongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is IntType && that.type is IntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (this.type is IntType && that.type is ShortType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is IntType && that.type is ByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is IntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(that as RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ShortType && that.type is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is ShortType && that.type is FloatType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is ShortType && that.type is LongType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ShortType && that.type is IntType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ShortType && that.type is ShortType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (this.type is ShortType && that.type is ByteType)
      return (this as RandomAccessible<ShortType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ByteType && that.type is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is ByteType && that.type is FloatType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<FloatType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is ByteType && that.type is LongType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ByteType && that.type is IntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ByteType && that.type is ShortType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ByteType && that.type is ByteType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (this.type is ByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(that as RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is ByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<FloatType>, BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is UnsignedLongType && that.type is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedLongType>, BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (this.type is UnsignedLongType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedLongType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<FloatType>, BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is UnsignedIntType && that.type is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedIntType>, BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (this.type is UnsignedIntType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedIntType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<FloatType>, BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is UnsignedShortType && that.type is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<IntType>, BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedShortType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedShortType>, BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (this.type is UnsignedShortType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(that as
      RandomAccessible<UnsignedByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<DoubleType>,
      BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<FloatType>, BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
  if (this.type is UnsignedByteType && that.type is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<LongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as RandomAccessible<IntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<ByteType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedLongType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedIntType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedShortType>,
      BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
  if (this.type is UnsignedByteType && that.type is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(that as
      RandomAccessible<UnsignedByteType>, BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, ${that.type})")
}

infix fun RandomAccessible<out RealType<*>>.eq(that: RealType<*>): RandomAccessible<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is FloatType && that is LongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is LongType && that is IntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is IntType && that is ShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s == that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
}

infix fun RealType<*>.eq(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
  return that eq this
}

infix fun RandomAccessible<out RealType<*>>.eq(that: Number): RandomAccessible<BoolType> {
  return this eq that.asType()
}

infix fun Number.eq(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
  return that eq this
}

infix fun RandomAccessible<out RealType<*>>.ge(that: RealType<*>): RandomAccessible<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is FloatType && that is LongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is LongType && that is IntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is IntType && that is ShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
}

infix fun RealType<*>.ge(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
  return that le this
}

infix fun RandomAccessible<out RealType<*>>.ge(that: Number): RandomAccessible<BoolType> {
  return this ge that.asType()
}

infix fun Number.ge(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
  return that le this
}

infix fun RandomAccessible<out RealType<*>>.le(that: RealType<*>): RandomAccessible<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is FloatType && that is LongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is LongType && that is IntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is IntType && that is ShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
}

infix fun RealType<*>.le(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
  return that ge this
}

infix fun RandomAccessible<out RealType<*>>.le(that: Number): RandomAccessible<BoolType> {
  return this le that.asType()
}

infix fun Number.le(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
  return that ge this
}

infix fun RandomAccessible<out RealType<*>>.gt(that: RealType<*>): RandomAccessible<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is FloatType && that is LongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is LongType && that is IntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is IntType && that is ShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s > that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
}

infix fun RealType<*>.gt(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
  return that lt this
}

infix fun RandomAccessible<out RealType<*>>.gt(that: Number): RandomAccessible<BoolType> {
  return this gt that.asType()
}

infix fun Number.gt(that: RandomAccessible<out RealType<*>>): RandomAccessible<BoolType> {
  return that lt this
}

infix fun RandomAccessible<out RealType<*>>.lt(that: RealType<*>): RandomAccessible<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RandomAccessible<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is FloatType && that is LongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RandomAccessible<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is LongType && that is IntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RandomAccessible<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is IntType && that is ShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RandomAccessible<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RandomAccessible<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RandomAccessible<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RandomAccessible<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s < that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
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
