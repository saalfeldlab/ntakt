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

import kotlin.Any
import kotlin.Comparable
import kotlin.Number
import net.imglib2.RealRandomAccessibleRealInterval
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.IntegerType
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

infix fun RealRandomAccessibleRealInterval<*>.eq(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t1 is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 == s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() == s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(that as RealRandomAccessibleRealInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() == s2.getRealDouble()) }
  throw Exception("Comparison operators not supported for combination of voxel types: ($t1, $t2)")
}

infix fun RealRandomAccessibleRealInterval<*>.ge(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t1 is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 <= s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() >= s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(that as RealRandomAccessibleRealInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() >= s2.getRealDouble()) }
  throw Exception("Comparison operators not supported for combination of voxel types: ($t1, $t2)")
}

infix fun RealRandomAccessibleRealInterval<*>.le(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t1 is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 >= s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() <= s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(that as RealRandomAccessibleRealInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() <= s2.getRealDouble()) }
  throw Exception("Comparison operators not supported for combination of voxel types: ($t1, $t2)")
}

infix fun RealRandomAccessibleRealInterval<*>.gt(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t1 is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 < s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() > s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(that as RealRandomAccessibleRealInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() > s2.getRealDouble()) }
  throw Exception("Comparison operators not supported for combination of voxel types: ($t1, $t2)")
}

infix fun RealRandomAccessibleRealInterval<*>.lt(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t1 is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(that as RealRandomAccessibleRealInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 > s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() < s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(that as RealRandomAccessibleRealInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() < s2.getRealDouble()) }
  throw Exception("Comparison operators not supported for combination of voxel types: ($t1, $t2)")
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.eq(that: RealType<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is FloatType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is LongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is IntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s == that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s == that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
}

infix fun RealType<*>.eq(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that eq this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.eq(that: Number):
    RealRandomAccessibleRealInterval<BoolType> {
  return this eq that.asType()
}

infix fun Number.eq(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that eq this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.ge(that: RealType<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is FloatType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is LongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is IntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s >= that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
}

infix fun RealType<*>.ge(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that le this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.ge(that: Number):
    RealRandomAccessibleRealInterval<BoolType> {
  return this ge that.asType()
}

infix fun Number.ge(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that le this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.le(that: RealType<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is FloatType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is LongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is IntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s <= that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
}

infix fun RealType<*>.le(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that ge this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.le(that: Number):
    RealRandomAccessibleRealInterval<BoolType> {
  return this le that.asType()
}

infix fun Number.le(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that ge this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.gt(that: RealType<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is FloatType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is LongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is IntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s > that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s > that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
}

infix fun RealType<*>.gt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that lt this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.gt(that: Number):
    RealRandomAccessibleRealInterval<BoolType> {
  return this gt that.asType()
}

infix fun Number.gt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that lt this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.lt(that: RealType<*>):
    RealRandomAccessibleRealInterval<BoolType> {
  if (this.type is DoubleType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is DoubleType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is DoubleType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<DoubleType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is FloatType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is FloatType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<FloatType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is LongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is LongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is LongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is LongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is LongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<LongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is IntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is IntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is IntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is IntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<IntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is ShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is ShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is ShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is ByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is ByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is ByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is ByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<ByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedLongType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedLongType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is UnsignedLongType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedLongType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedLongType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedIntType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedIntType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is UnsignedIntType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedIntType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedIntType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedShortType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedShortType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedShortType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s < that) }
  if (this.type is UnsignedShortType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedShortType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is DoubleType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedByteType && that is FloatType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
  if (this.type is UnsignedByteType && that is LongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is IntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is ShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is ByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedLongType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedIntType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedShortType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
  if (this.type is UnsignedByteType && that is UnsignedByteType)
      return (this as RealRandomAccessibleRealInterval<UnsignedByteType>).convert(BoolType()) { s, t -> t.set(s < that) }
  throw Exception("Comparison operators not supported for combination of voxel types: (${this.type}, $that)")
}

infix fun RealType<*>.lt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that gt this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.lt(that: Number):
    RealRandomAccessibleRealInterval<BoolType> {
  return this lt that.asType()
}

infix fun Number.lt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
    RealRandomAccessibleRealInterval<BoolType> {
  return that gt this
}
