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
import kotlin.Byte
import kotlin.Comparable
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import net.imglib2.RealRandomAccessibleRealInterval
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType

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
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
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
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
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
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
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
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
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
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun RealRandomAccessibleRealInterval<*>.eq(that: Any):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t2 is Comparable<*>) {
  val t2Comparable = t2 as Comparable<Any>
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(s1 == t2Comparable) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(t2Comparable == s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getIntegerLong() == t2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getRealDouble() == t2.getRealDouble()) }
  if (t2 is Byte) return this eq t2.asType()
  if (t2 is Short) return this eq t2.asType()
  if (t2 is Int) return this eq t2.asType()
  if (t2 is Long) return this eq t2.asType()
  if (t2 is Float) return this eq t2.asType()
  if (t2 is Double) return this eq t2.asType()
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun Any.eq(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> = that eq this

infix fun RealRandomAccessibleRealInterval<*>.ge(that: Any):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t2 is Comparable<*>) {
  val t2Comparable = t2 as Comparable<Any>
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(s1 >= t2Comparable) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(t2Comparable <= s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getIntegerLong() >= t2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getRealDouble() >= t2.getRealDouble()) }
  if (t2 is Byte) return this ge t2.asType()
  if (t2 is Short) return this ge t2.asType()
  if (t2 is Int) return this ge t2.asType()
  if (t2 is Long) return this ge t2.asType()
  if (t2 is Float) return this ge t2.asType()
  if (t2 is Double) return this ge t2.asType()
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun Any.ge(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> = that le this

infix fun RealRandomAccessibleRealInterval<*>.le(that: Any):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t2 is Comparable<*>) {
  val t2Comparable = t2 as Comparable<Any>
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(s1 <= t2Comparable) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(t2Comparable >= s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getIntegerLong() <= t2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getRealDouble() <= t2.getRealDouble()) }
  if (t2 is Byte) return this le t2.asType()
  if (t2 is Short) return this le t2.asType()
  if (t2 is Int) return this le t2.asType()
  if (t2 is Long) return this le t2.asType()
  if (t2 is Float) return this le t2.asType()
  if (t2 is Double) return this le t2.asType()
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun Any.le(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> = that ge this

infix fun RealRandomAccessibleRealInterval<*>.gt(that: Any):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t2 is Comparable<*>) {
  val t2Comparable = t2 as Comparable<Any>
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(s1 > t2Comparable) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(t2Comparable < s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getIntegerLong() > t2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getRealDouble() > t2.getRealDouble()) }
  if (t2 is Byte) return this gt t2.asType()
  if (t2 is Short) return this gt t2.asType()
  if (t2 is Int) return this gt t2.asType()
  if (t2 is Long) return this gt t2.asType()
  if (t2 is Float) return this gt t2.asType()
  if (t2 is Double) return this gt t2.asType()
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun Any.gt(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> = that lt this

infix fun RealRandomAccessibleRealInterval<*>.lt(that: Any):
    RealRandomAccessibleRealInterval<BoolType> {
  val t1 = this.type
  val t2 = that
  val jc1 = t1::class.java
  val jc2 = t2::class.java
  if (t1 is Comparable<*> && t2 is Comparable<*>) {
  val t2Comparable = t2 as Comparable<Any>
  if (jc1.isAssignableFrom(jc2))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(s1 < t2Comparable) }
  if (jc2.isAssignableFrom(jc1))
      return (this as RealRandomAccessibleRealInterval<Comparable<Any>>).convert(BoolType()) { s1, t -> t.set(t2Comparable > s1) }
  }
  if (t1 is IntegerType<*> && t2 is IntegerType<*>)
      return (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getIntegerLong() < t2.getIntegerLong()) }
  if (t1 is RealType<*> && t2 is RealType<*>)
      return (this as RealRandomAccessibleRealInterval<RealType<*>>).convert(BoolType()) { s1, t -> t.set(s1.getRealDouble() < t2.getRealDouble()) }
  if (t2 is Byte) return this lt t2.asType()
  if (t2 is Short) return this lt t2.asType()
  if (t2 is Int) return this lt t2.asType()
  if (t2 is Long) return this lt t2.asType()
  if (t2 is Float) return this lt t2.asType()
  if (t2 is Double) return this lt t2.asType()
  throw Exception("Comparison operators not suported for combination of voxel types: ($t1, $t2)")
}

infix fun Any.lt(that: RealRandomAccessibleRealInterval<*>):
    RealRandomAccessibleRealInterval<BoolType> = that gt this
