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
import net.imglib2.RandomAccessible
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType

infix fun RandomAccessible<*>.eq(that: RandomAccessible<*>): RandomAccessible<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 == s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 == s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessible<IntegerType<*>>).convert(that as RandomAccessible<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() == s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessible<RealType<*>>).convert(that as RandomAccessible<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() == s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun RandomAccessible<*>.ge(that: RandomAccessible<*>): RandomAccessible<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 <= s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessible<IntegerType<*>>).convert(that as RandomAccessible<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() >= s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessible<RealType<*>>).convert(that as RandomAccessible<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() >= s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun RandomAccessible<*>.le(that: RandomAccessible<*>): RandomAccessible<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 >= s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessible<IntegerType<*>>).convert(that as RandomAccessible<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() <= s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessible<RealType<*>>).convert(that as RandomAccessible<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() <= s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun RandomAccessible<*>.gt(that: RandomAccessible<*>): RandomAccessible<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 > s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 < s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessible<IntegerType<*>>).convert(that as RandomAccessible<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() > s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessible<RealType<*>>).convert(that as RandomAccessible<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() > s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun RandomAccessible<*>.lt(that: RandomAccessible<*>): RandomAccessible<BoolType> {
  val t1 = this.type
  val t2 = that.type
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (this.type is Comparable<*> && that.type is Comparable<*>) {
  if (jc1.isAssignableFrom(jc2))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s1 < s2) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RandomAccessible<Comparable<Any>>).convert(that as RandomAccessible<Comparable<Any>>, BoolType()) { s1, s2, t -> t.set(s2 > s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RandomAccessible<IntegerType<*>>).convert(that as RandomAccessible<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getIntegerLong() < s2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RandomAccessible<RealType<*>>).convert(that as RandomAccessible<RealType<*>>, BoolType()) { s1, s2, t -> t.set(s1.getRealDouble() < s2.getRealDouble()) }
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

@JvmName("comparisonOperator_eq_1")
infix fun <T : Comparable<T>> RandomAccessible<T>.eq(that: T): RandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s == that) }
}

@JvmName("comparisonOperator_eq_1")
infix fun <T : Comparable<T>> T.eq(that: RandomAccessible<T>): RandomAccessible<BoolType> {
  return that eq this
}

@JvmName("comparisonOperator_ge_1")
infix fun <T : Comparable<T>> RandomAccessible<T>.ge(that: T): RandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s >= that) }
}

@JvmName("comparisonOperator_ge_1")
infix fun <T : Comparable<T>> T.ge(that: RandomAccessible<T>): RandomAccessible<BoolType> {
  return that ge this
}

@JvmName("comparisonOperator_le_1")
infix fun <T : Comparable<T>> RandomAccessible<T>.le(that: T): RandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s <= that) }
}

@JvmName("comparisonOperator_le_1")
infix fun <T : Comparable<T>> T.le(that: RandomAccessible<T>): RandomAccessible<BoolType> {
  return that le this
}

@JvmName("comparisonOperator_gt_1")
infix fun <T : Comparable<T>> RandomAccessible<T>.gt(that: T): RandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s > that) }
}

@JvmName("comparisonOperator_gt_1")
infix fun <T : Comparable<T>> T.gt(that: RandomAccessible<T>): RandomAccessible<BoolType> {
  return that gt this
}

@JvmName("comparisonOperator_lt_1")
infix fun <T : Comparable<T>> RandomAccessible<T>.lt(that: T): RandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s < that) }
}

@JvmName("comparisonOperator_lt_1")
infix fun <T : Comparable<T>> T.lt(that: RandomAccessible<T>): RandomAccessible<BoolType> {
  return that lt this
}
