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
import kotlin.jvm.JvmName
import net.imglib2.RandomAccessibleInterval
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType

infix fun RandomAccessibleInterval<*>.eq(that: RandomAccessibleInterval<*>):
    RandomAccessibleInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 == s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessibleInterval<IntegerType<*>>).convert(that as RandomAccessibleInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() == s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessibleInterval<RealType<*>>).convert(that as RandomAccessibleInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() == s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun RandomAccessibleInterval<*>.ge(that: RandomAccessibleInterval<*>):
    RandomAccessibleInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 <= s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessibleInterval<IntegerType<*>>).convert(that as RandomAccessibleInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() >= s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessibleInterval<RealType<*>>).convert(that as RandomAccessibleInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() >= s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun RandomAccessibleInterval<*>.le(that: RandomAccessibleInterval<*>):
    RandomAccessibleInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 >= s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessibleInterval<IntegerType<*>>).convert(that as RandomAccessibleInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() <= s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessibleInterval<RealType<*>>).convert(that as RandomAccessibleInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() <= s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun RandomAccessibleInterval<*>.gt(that: RandomAccessibleInterval<*>):
    RandomAccessibleInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 < s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessibleInterval<IntegerType<*>>).convert(that as RandomAccessibleInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() > s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessibleInterval<RealType<*>>).convert(that as RandomAccessibleInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() > s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun RandomAccessibleInterval<*>.lt(that: RandomAccessibleInterval<*>):
    RandomAccessibleInterval<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessibleInterval<Comparable<Any>>).convert(that as RandomAccessibleInterval<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 > s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessibleInterval<IntegerType<*>>).convert(that as RandomAccessibleInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() < s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessibleInterval<RealType<*>>).convert(that as RandomAccessibleInterval<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() < s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

@JvmName("comparisonOperator_eq_1")
infix fun <T : Comparable<T>> RandomAccessibleInterval<T>.eq(that: T):
    RandomAccessibleInterval<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s == that) }
}

@JvmName("comparisonOperator_eq_1")
infix fun <T : Comparable<T>> T.eq(that: RandomAccessibleInterval<T>):
    RandomAccessibleInterval<BoolType> {
  return that eq this
}

@JvmName("comparisonOperator_ge_1")
infix fun <T : Comparable<T>> RandomAccessibleInterval<T>.ge(that: T):
    RandomAccessibleInterval<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s >= that) }
}

@JvmName("comparisonOperator_ge_1")
infix fun <T : Comparable<T>> T.ge(that: RandomAccessibleInterval<T>):
    RandomAccessibleInterval<BoolType> {
  return that ge this
}

@JvmName("comparisonOperator_le_1")
infix fun <T : Comparable<T>> RandomAccessibleInterval<T>.le(that: T):
    RandomAccessibleInterval<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s <= that) }
}

@JvmName("comparisonOperator_le_1")
infix fun <T : Comparable<T>> T.le(that: RandomAccessibleInterval<T>):
    RandomAccessibleInterval<BoolType> {
  return that le this
}

@JvmName("comparisonOperator_gt_1")
infix fun <T : Comparable<T>> RandomAccessibleInterval<T>.gt(that: T):
    RandomAccessibleInterval<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s > that) }
}

@JvmName("comparisonOperator_gt_1")
infix fun <T : Comparable<T>> T.gt(that: RandomAccessibleInterval<T>):
    RandomAccessibleInterval<BoolType> {
  return that gt this
}

@JvmName("comparisonOperator_lt_1")
infix fun <T : Comparable<T>> RandomAccessibleInterval<T>.lt(that: T):
    RandomAccessibleInterval<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s < that) }
}

@JvmName("comparisonOperator_lt_1")
infix fun <T : Comparable<T>> T.lt(that: RandomAccessibleInterval<T>):
    RandomAccessibleInterval<BoolType> {
  return that lt this
}
