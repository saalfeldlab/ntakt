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

package org.ntakt

import kotlin.Suppress
import kotlin.jvm.JvmName
import net.imglib2.type.Type
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.operators.Sub
import net.imglib2.RandomAccessibleInterval as RAI

operator fun <T : NumericType<T>> RAI<T>.unaryMinus() =
    convert(type) { s, t -> t.set(s); t.mul(-1.0) }

@JvmName(name = "minusGeneric")
operator fun <T> RAI<T>.minus(that: RAI<T>): RAI<T> where T : Type<T>, T : Sub<T> {
  return RandomAccessibleIntervalArithmeticMinusExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusIntegerWildcard")
operator fun RAI<out IntegerType<*>>.minus(that: RAI<out IntegerType<*>>): RAI<out IntegerType<*>> =
    RandomAccessibleIntervalArithmeticMinusExtensionsJava.minusInteger(this, that) as? RAI<out
    IntegerType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "minusRealWildcard")
operator fun RAI<out RealType<*>>.minus(that: RAI<out RealType<*>>): RAI<out RealType<*>> =
    RandomAccessibleIntervalArithmeticMinusExtensionsJava.minusReal(this, that) as? RAI<out
    RealType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")