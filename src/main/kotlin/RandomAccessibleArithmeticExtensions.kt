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
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub
import net.imglib2.RandomAccessible as RA

operator fun <T : NumericType<T>> RA<T>.unaryPlus() = this

@JvmName(name = "plusGeneric")
operator fun <T> RA<T>.plus(that: RA<T>): RA<T> where T : Type<T>, T : Add<T> {
  return RandomAccessibleArithmeticPlusExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusIntegerWildcard")
operator fun RA<out IntegerType<*>>.plus(that: RA<out IntegerType<*>>): RA<out IntegerType<*>> =
    RandomAccessibleArithmeticPlusExtensionsJava.plusInteger(this, that) as? RA<out IntegerType<*>>
    ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "plusRealWildcard")
operator fun RA<out RealType<*>>.plus(that: RA<out RealType<*>>): RA<out RealType<*>> =
    RandomAccessibleArithmeticPlusExtensionsJava.plusReal(this, that) as? RA<out RealType<*>> ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

operator fun <T : NumericType<T>> RA<T>.unaryMinus() = convert(type) { s, t -> t.set(s); t.mul(-1.0)
    }

@JvmName(name = "minusGeneric")
operator fun <T> RA<T>.minus(that: RA<T>): RA<T> where T : Type<T>, T : Sub<T> {
  return RandomAccessibleArithmeticMinusExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusIntegerWildcard")
operator fun RA<out IntegerType<*>>.minus(that: RA<out IntegerType<*>>): RA<out IntegerType<*>> =
    RandomAccessibleArithmeticMinusExtensionsJava.minusInteger(this, that) as? RA<out
    IntegerType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "minusRealWildcard")
operator fun RA<out RealType<*>>.minus(that: RA<out RealType<*>>): RA<out RealType<*>> =
    RandomAccessibleArithmeticMinusExtensionsJava.minusReal(this, that) as? RA<out RealType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesGeneric")
operator fun <T> RA<T>.times(that: RA<T>): RA<T> where T : Type<T>, T : Mul<T> {
  return RandomAccessibleArithmeticTimesExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesIntegerWildcard")
operator fun RA<out IntegerType<*>>.times(that: RA<out IntegerType<*>>): RA<out IntegerType<*>> =
    RandomAccessibleArithmeticTimesExtensionsJava.timesInteger(this, that) as? RA<out
    IntegerType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesRealWildcard")
operator fun RA<out RealType<*>>.times(that: RA<out RealType<*>>): RA<out RealType<*>> =
    RandomAccessibleArithmeticTimesExtensionsJava.timesReal(this, that) as? RA<out RealType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divGeneric")
operator fun <T> RA<T>.div(that: RA<T>): RA<T> where T : Type<T>, T : Div<T> {
  return RandomAccessibleArithmeticDivExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divIntegerWildcard")
operator fun RA<out IntegerType<*>>.div(that: RA<out IntegerType<*>>): RA<out IntegerType<*>> =
    RandomAccessibleArithmeticDivExtensionsJava.divInteger(this, that) as? RA<out IntegerType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divRealWildcard")
operator fun RA<out RealType<*>>.div(that: RA<out RealType<*>>): RA<out RealType<*>> =
    RandomAccessibleArithmeticDivExtensionsJava.divReal(this, that) as? RA<out RealType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")
