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
import net.imglib2.RealRandomAccessibleRealInterval as RRARI

operator fun <T : NumericType<T>> RRARI<T>.unaryPlus() = this

@JvmName(name = "plusGeneric")
operator fun <T> RRARI<T>.plus(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Add<T> {
  return RealRandomAccessibleRealIntervalArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusIntegerWildcard")
operator fun RRARI<out IntegerType<*>>.plus(that: RRARI<out IntegerType<*>>): RRARI<out
    IntegerType<*>> = RealRandomAccessibleRealIntervalArithmeticExtensionsJava.plusInteger(this,
    that) as? RRARI<out IntegerType<*>> ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "plusRealWildcard")
operator fun RRARI<out RealType<*>>.plus(that: RRARI<out RealType<*>>): RRARI<out RealType<*>> =
    RealRandomAccessibleRealIntervalArithmeticExtensionsJava.plusReal(this, that) as? RRARI<out
    RealType<*>> ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

operator fun <T : NumericType<T>> RRARI<T>.unaryMinus() =
    convert(type) { s, t -> t.set(s); t.mul(-1.0) }

@JvmName(name = "minusGeneric")
operator fun <T> RRARI<T>.minus(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Sub<T> {
  return RealRandomAccessibleRealIntervalArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusIntegerWildcard")
operator fun RRARI<out IntegerType<*>>.minus(that: RRARI<out IntegerType<*>>): RRARI<out
    IntegerType<*>> = RealRandomAccessibleRealIntervalArithmeticExtensionsJava.minusInteger(this,
    that) as? RRARI<out IntegerType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "minusRealWildcard")
operator fun RRARI<out RealType<*>>.minus(that: RRARI<out RealType<*>>): RRARI<out RealType<*>> =
    RealRandomAccessibleRealIntervalArithmeticExtensionsJava.minusReal(this, that) as? RRARI<out
    RealType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesGeneric")
operator fun <T> RRARI<T>.times(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Mul<T> {
  return RealRandomAccessibleRealIntervalArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesIntegerWildcard")
operator fun RRARI<out IntegerType<*>>.times(that: RRARI<out IntegerType<*>>): RRARI<out
    IntegerType<*>> = RealRandomAccessibleRealIntervalArithmeticExtensionsJava.timesInteger(this,
    that) as? RRARI<out IntegerType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesRealWildcard")
operator fun RRARI<out RealType<*>>.times(that: RRARI<out RealType<*>>): RRARI<out RealType<*>> =
    RealRandomAccessibleRealIntervalArithmeticExtensionsJava.timesReal(this, that) as? RRARI<out
    RealType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divGeneric")
operator fun <T> RRARI<T>.div(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Div<T> {
  return RealRandomAccessibleRealIntervalArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divIntegerWildcard")
operator fun RRARI<out IntegerType<*>>.div(that: RRARI<out IntegerType<*>>): RRARI<out
    IntegerType<*>> = RealRandomAccessibleRealIntervalArithmeticExtensionsJava.divInteger(this,
    that) as? RRARI<out IntegerType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divRealWildcard")
operator fun RRARI<out RealType<*>>.div(that: RRARI<out RealType<*>>): RRARI<out RealType<*>> =
    RealRandomAccessibleRealIntervalArithmeticExtensionsJava.divReal(this, that) as? RRARI<out
    RealType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")
