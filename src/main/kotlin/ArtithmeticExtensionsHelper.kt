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

package org.ntakt

import kotlin.String
import kotlin.jvm.JvmStatic
import net.imglib2.converter.BiConverter
import net.imglib2.type.Type
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub

class BiConverterPlus<T> : BiConverter<T, T, T> where T : Add<T>, T : Type<T> {
  override fun convert(
    s1: T,
    s2: T,
    t: T
  ) {
    t.set(s1)
    t += s2
  }

  companion object {
    @JvmStatic
    fun <T> instance(): BiConverterPlus<T> where T : Add<T>, T : Type<T> {
      return BiConverterPlus<T>()
    }
  }
}

class BiConverterMinus<T> : BiConverter<T, T, T> where T : Sub<T>, T : Type<T> {
  override fun convert(
    s1: T,
    s2: T,
    t: T
  ) {
    t.set(s1)
    t -= s2
  }

  companion object {
    @JvmStatic
    fun <T> instance(): BiConverterMinus<T> where T : Sub<T>, T : Type<T> {
      return BiConverterMinus<T>()
    }
  }
}

class BiConverterTimes<T> : BiConverter<T, T, T> where T : Mul<T>, T : Type<T> {
  override fun convert(
    s1: T,
    s2: T,
    t: T
  ) {
    t.set(s1)
    t *= s2
  }

  companion object {
    @JvmStatic
    fun <T> instance(): BiConverterTimes<T> where T : Mul<T>, T : Type<T> {
      return BiConverterTimes<T>()
    }
  }
}

class BiConverterDiv<T> : BiConverter<T, T, T> where T : Div<T>, T : Type<T> {
  override fun convert(
    s1: T,
    s2: T,
    t: T
  ) {
    t.set(s1)
    t /= s2
  }

  companion object {
    @JvmStatic
    fun <T> instance(): BiConverterDiv<T> where T : Div<T>, T : Type<T> {
      return BiConverterDiv<T>()
    }
  }
}

object ArithmeticConverters {
  @JvmStatic
  operator fun <T : NumericType<T>> get(operator: String): BiConverter<T, T, T> {
    return when (operator.toLowerCase()) {
      "plus" -> BiConverterPlus.instance<T>()
      "minus" -> BiConverterMinus.instance<T>()
      "times" -> BiConverterTimes.instance<T>()
      "div" -> BiConverterDiv.instance<T>()
      else -> error("Operator not supported: $operator")
    }
  }

  @JvmStatic
  operator fun <T : NumericType<T>> get(operator: String, type: T): BiConverter<T, T, T> =
      get(operator)
}
