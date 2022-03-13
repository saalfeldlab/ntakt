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

package org.ntakt;

import static org.ntakt.RandomAccessibleIntervalConverterExtensionsKt.asType;
import static org.ntakt.RandomAccessibleIntervalConverterExtensionsKt.convert;
import static org.ntakt.RandomAccessibleIntervalExtensionsKt.getType;

import net.imglib2.RandomAccessibleInterval;
import net.imglib2.type.numeric.RealType;

public class RandomAccessibleIntervalArithmeticPlusExtensionsJava {
  public static <T extends net.imglib2.type.Type<T> & net.imglib2.type.operators.Add<T>> RandomAccessibleInterval<T> plusGeneric(
      final RandomAccessibleInterval<T> thiz, final RandomAccessibleInterval<T> that) {
    return convert(thiz, that, getType(thiz), BiConverterPlus.Companion.instance());
  }

  public static RandomAccessibleInterval<? extends RealType> plus(
      final RandomAccessibleInterval<? extends RealType> thiz,
      final RandomAccessibleInterval<? extends RealType> that) {
    final RealType rt1 = getType(thiz);
    final RealType rt2 = getType(that);
    final RealType resultType = ArithmeticTypes.ResultType.get(rt1, rt2);
    return plusGeneric(asType(thiz, resultType), asType(that, resultType));
  }
}
