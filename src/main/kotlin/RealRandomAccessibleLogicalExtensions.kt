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

import kotlin.Comparable
import net.imglib2.RealRandomAccessible
import net.imglib2.type.logic.BoolType

infix fun <T : Comparable<T>> RealRandomAccessible<T>.eq(that: RealRandomAccessible<T>):
    RealRandomAccessible<BoolType> {
  return this.convert(that, BoolType()) { s1, s2, t -> t.set(s1 == s2) }
}

infix fun <T : Comparable<T>> RealRandomAccessible<T>.ge(that: RealRandomAccessible<T>):
    RealRandomAccessible<BoolType> {
  return this.convert(that, BoolType()) { s1, s2, t -> t.set(s1 >= s2) }
}

infix fun <T : Comparable<T>> RealRandomAccessible<T>.le(that: RealRandomAccessible<T>):
    RealRandomAccessible<BoolType> {
  return this.convert(that, BoolType()) { s1, s2, t -> t.set(s1 <= s2) }
}

infix fun <T : Comparable<T>> RealRandomAccessible<T>.gt(that: RealRandomAccessible<T>):
    RealRandomAccessible<BoolType> {
  return this.convert(that, BoolType()) { s1, s2, t -> t.set(s1 > s2) }
}

infix fun <T : Comparable<T>> RealRandomAccessible<T>.lt(that: RealRandomAccessible<T>):
    RealRandomAccessible<BoolType> {
  return this.convert(that, BoolType()) { s1, s2, t -> t.set(s1 < s2) }
}

infix fun <T : Comparable<T>> RealRandomAccessible<T>.eq(that: T): RealRandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s == that) }
}

infix fun <T : Comparable<T>> T.eq(that: RealRandomAccessible<T>): RealRandomAccessible<BoolType> {
  return that eq this
}

infix fun <T : Comparable<T>> RealRandomAccessible<T>.ge(that: T): RealRandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s >= that) }
}

infix fun <T : Comparable<T>> T.ge(that: RealRandomAccessible<T>): RealRandomAccessible<BoolType> {
  return that ge this
}

infix fun <T : Comparable<T>> RealRandomAccessible<T>.le(that: T): RealRandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s <= that) }
}

infix fun <T : Comparable<T>> T.le(that: RealRandomAccessible<T>): RealRandomAccessible<BoolType> {
  return that le this
}

infix fun <T : Comparable<T>> RealRandomAccessible<T>.gt(that: T): RealRandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s > that) }
}

infix fun <T : Comparable<T>> T.gt(that: RealRandomAccessible<T>): RealRandomAccessible<BoolType> {
  return that gt this
}

infix fun <T : Comparable<T>> RealRandomAccessible<T>.lt(that: T): RealRandomAccessible<BoolType> {
  return this.convert(BoolType()) { s, t -> t.set(s < that) }
}

infix fun <T : Comparable<T>> T.lt(that: RealRandomAccessible<T>): RealRandomAccessible<BoolType> {
  return that lt this
}
