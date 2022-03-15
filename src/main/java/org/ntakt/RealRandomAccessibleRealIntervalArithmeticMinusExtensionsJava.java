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

import static org.ntakt.RealRandomAccessibleRealIntervalConverterExtensionsKt.asType;
import static org.ntakt.RealRandomAccessibleRealIntervalConverterExtensionsKt.convert;
import static org.ntakt.RealRandomAccessibleRealIntervalExtensionsKt.getType;

import net.imglib2.RealRandomAccessibleRealInterval;
import net.imglib2.type.numeric.IntegerType;
import net.imglib2.type.numeric.RealType;

public class RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava {
  public static <T extends net.imglib2.type.Type<T> & net.imglib2.type.operators.Sub<T>> RealRandomAccessibleRealInterval<T> minusGeneric(
      final RealRandomAccessibleRealInterval<T> thiz,
      final RealRandomAccessibleRealInterval<T> that) {
    return convert(thiz, that, getType(thiz), BiConverterMinus.Companion.instance());
  }

  public static RealRandomAccessibleRealInterval<? extends IntegerType> minusInteger(
      final RealRandomAccessibleRealInterval<? extends IntegerType> thiz,
      final RealRandomAccessibleRealInterval<? extends IntegerType> that) {
    final IntegerType rt1 = getType(thiz);
    final IntegerType rt2 = getType(that);
    final IntegerType resultType = ArithmeticTypes.ResultType.get(rt1, rt2);
    return minusGeneric(asType(thiz, resultType), asType(that, resultType));
  }

  public static RealRandomAccessibleRealInterval<? extends RealType> minusReal(
      final RealRandomAccessibleRealInterval<? extends RealType> thiz,
      final RealRandomAccessibleRealInterval<? extends RealType> that) {
    final RealType rt1 = getType(thiz);
    final RealType rt2 = getType(that);
    final RealType resultType = ArithmeticTypes.ResultType.get(rt1, rt2);
    return minusGeneric(asType(thiz, resultType), asType(that, resultType));
  }
}