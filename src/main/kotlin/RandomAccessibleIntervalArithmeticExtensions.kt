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
import net.imglib2.type.numeric.ComplexType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub
import net.imglib2.RandomAccessibleInterval as RAI

operator fun <T : NumericType<T>> RAI<T>.unaryPlus() = this

@JvmName(name = "plusGeneric_Type_Add")
operator fun <T> RAI<T>.plus(that: RAI<T>): RAI<T> where T : Type<T>, T : Add<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusGeneric_NumericType")
operator fun <T : NumericType<T>> RAI<T>.plus(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusGeneric_ComplexType")
operator fun <T : ComplexType<T>> RAI<T>.plus(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusGeneric_IntegerType")
operator fun <T : IntegerType<T>> RAI<T>.plus(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusGeneric_RealType")
operator fun <T : RealType<T>> RAI<T>.plus(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusComplexWildcard")
operator fun RAI<out ComplexType<*>>.plus(that: RAI<out ComplexType<*>>): RAI<out ComplexType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.plusComplex(this, that) as? RAI<out
    ComplexType<*>> ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "plusIntegerWildcard")
operator fun RAI<out IntegerType<*>>.plus(that: RAI<out IntegerType<*>>): RAI<out IntegerType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.plusInteger(this, that) as? RAI<out
    IntegerType<*>> ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "plusRealWildcard")
operator fun RAI<out RealType<*>>.plus(that: RAI<out RealType<*>>): RAI<out RealType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.plusReal(this, that) as? RAI<out RealType<*>>
    ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

operator fun <T : NumericType<T>> RAI<T>.unaryMinus() =
    convert(type) { s, t -> t.set(s); t.mul(-1.0) }

@JvmName(name = "minusGeneric_Type_Sub")
operator fun <T> RAI<T>.minus(that: RAI<T>): RAI<T> where T : Type<T>, T : Sub<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusGeneric_NumericType")
operator fun <T : NumericType<T>> RAI<T>.minus(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusGeneric_ComplexType")
operator fun <T : ComplexType<T>> RAI<T>.minus(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusGeneric_IntegerType")
operator fun <T : IntegerType<T>> RAI<T>.minus(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusGeneric_RealType")
operator fun <T : RealType<T>> RAI<T>.minus(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusComplexWildcard")
operator fun RAI<out ComplexType<*>>.minus(that: RAI<out ComplexType<*>>): RAI<out ComplexType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.minusComplex(this, that) as? RAI<out
    ComplexType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "minusIntegerWildcard")
operator fun RAI<out IntegerType<*>>.minus(that: RAI<out IntegerType<*>>): RAI<out IntegerType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.minusInteger(this, that) as? RAI<out
    IntegerType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "minusRealWildcard")
operator fun RAI<out RealType<*>>.minus(that: RAI<out RealType<*>>): RAI<out RealType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.minusReal(this, that) as? RAI<out RealType<*>>
    ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesGeneric_Type_Mul")
operator fun <T> RAI<T>.times(that: RAI<T>): RAI<T> where T : Type<T>, T : Mul<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesGeneric_NumericType")
operator fun <T : NumericType<T>> RAI<T>.times(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesGeneric_ComplexType")
operator fun <T : ComplexType<T>> RAI<T>.times(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesGeneric_IntegerType")
operator fun <T : IntegerType<T>> RAI<T>.times(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesGeneric_RealType")
operator fun <T : RealType<T>> RAI<T>.times(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesComplexWildcard")
operator fun RAI<out ComplexType<*>>.times(that: RAI<out ComplexType<*>>): RAI<out ComplexType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.timesComplex(this, that) as? RAI<out
    ComplexType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesIntegerWildcard")
operator fun RAI<out IntegerType<*>>.times(that: RAI<out IntegerType<*>>): RAI<out IntegerType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.timesInteger(this, that) as? RAI<out
    IntegerType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesRealWildcard")
operator fun RAI<out RealType<*>>.times(that: RAI<out RealType<*>>): RAI<out RealType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.timesReal(this, that) as? RAI<out RealType<*>>
    ?:
    error("Arithmetic operator * (times) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divGeneric_Type_Div")
operator fun <T> RAI<T>.div(that: RAI<T>): RAI<T> where T : Type<T>, T : Div<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divGeneric_NumericType")
operator fun <T : NumericType<T>> RAI<T>.div(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divGeneric_ComplexType")
operator fun <T : ComplexType<T>> RAI<T>.div(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divGeneric_IntegerType")
operator fun <T : IntegerType<T>> RAI<T>.div(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divGeneric_RealType")
operator fun <T : RealType<T>> RAI<T>.div(that: RAI<T>): RAI<T> {
  return RandomAccessibleIntervalArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divComplexWildcard")
operator fun RAI<out ComplexType<*>>.div(that: RAI<out ComplexType<*>>): RAI<out ComplexType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.divComplex(this, that) as? RAI<out
    ComplexType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divIntegerWildcard")
operator fun RAI<out IntegerType<*>>.div(that: RAI<out IntegerType<*>>): RAI<out IntegerType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.divInteger(this, that) as? RAI<out
    IntegerType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divRealWildcard")
operator fun RAI<out RealType<*>>.div(that: RAI<out RealType<*>>): RAI<out RealType<*>> =
    RandomAccessibleIntervalArithmeticExtensionsJava.divReal(this, that) as? RAI<out RealType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${type::class} and ${(that as RAI<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")
