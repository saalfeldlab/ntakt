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
import net.imglib2.RealRandomAccessible as RRA

operator fun <T : NumericType<T>> RRA<T>.unaryPlus() = this

@JvmName(name = "plusGeneric_Type_Add")
operator fun <T> RRA<T>.plus(that: RRA<T>): RRA<T> where T : Type<T>, T : Add<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusGeneric_NumericType")
operator fun <T : NumericType<T>> RRA<T>.plus(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusGeneric_ComplexType")
operator fun <T : ComplexType<T>> RRA<T>.plus(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusGeneric_IntegerType")
operator fun <T : IntegerType<T>> RRA<T>.plus(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusGeneric_RealType")
operator fun <T : RealType<T>> RRA<T>.plus(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.plusGeneric(this, that)
}

@JvmName(name = "plusComplexWildcard")
operator fun RRA<out ComplexType<*>>.plus(that: RRA<out ComplexType<*>>): RRA<out ComplexType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.plusComplex(this, that) as? RRA<out ComplexType<*>>
    ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "plusIntegerWildcard")
operator fun RRA<out IntegerType<*>>.plus(that: RRA<out IntegerType<*>>): RRA<out IntegerType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.plusInteger(this, that) as? RRA<out IntegerType<*>>
    ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "plusRealWildcard")
operator fun RRA<out RealType<*>>.plus(that: RRA<out RealType<*>>): RRA<out RealType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.plusReal(this, that) as? RRA<out RealType<*>> ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

operator fun <T : NumericType<T>> RRA<T>.unaryMinus() =
    convert(type) { s, t -> t.set(s); t.mul(-1.0) }

@JvmName(name = "minusGeneric_Type_Sub")
operator fun <T> RRA<T>.minus(that: RRA<T>): RRA<T> where T : Type<T>, T : Sub<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusGeneric_NumericType")
operator fun <T : NumericType<T>> RRA<T>.minus(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusGeneric_ComplexType")
operator fun <T : ComplexType<T>> RRA<T>.minus(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusGeneric_IntegerType")
operator fun <T : IntegerType<T>> RRA<T>.minus(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusGeneric_RealType")
operator fun <T : RealType<T>> RRA<T>.minus(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.minusGeneric(this, that)
}

@JvmName(name = "minusComplexWildcard")
operator fun RRA<out ComplexType<*>>.minus(that: RRA<out ComplexType<*>>): RRA<out ComplexType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.minusComplex(this, that) as? RRA<out
    ComplexType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "minusIntegerWildcard")
operator fun RRA<out IntegerType<*>>.minus(that: RRA<out IntegerType<*>>): RRA<out IntegerType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.minusInteger(this, that) as? RRA<out
    IntegerType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "minusRealWildcard")
operator fun RRA<out RealType<*>>.minus(that: RRA<out RealType<*>>): RRA<out RealType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.minusReal(this, that) as? RRA<out RealType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesGeneric_Type_Mul")
operator fun <T> RRA<T>.times(that: RRA<T>): RRA<T> where T : Type<T>, T : Mul<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesGeneric_NumericType")
operator fun <T : NumericType<T>> RRA<T>.times(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesGeneric_ComplexType")
operator fun <T : ComplexType<T>> RRA<T>.times(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesGeneric_IntegerType")
operator fun <T : IntegerType<T>> RRA<T>.times(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesGeneric_RealType")
operator fun <T : RealType<T>> RRA<T>.times(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.timesGeneric(this, that)
}

@JvmName(name = "timesComplexWildcard")
operator fun RRA<out ComplexType<*>>.times(that: RRA<out ComplexType<*>>): RRA<out ComplexType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.timesComplex(this, that) as? RRA<out
    ComplexType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesIntegerWildcard")
operator fun RRA<out IntegerType<*>>.times(that: RRA<out IntegerType<*>>): RRA<out IntegerType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.timesInteger(this, that) as? RRA<out
    IntegerType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "timesRealWildcard")
operator fun RRA<out RealType<*>>.times(that: RRA<out RealType<*>>): RRA<out RealType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.timesReal(this, that) as? RRA<out RealType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divGeneric_Type_Div")
operator fun <T> RRA<T>.div(that: RRA<T>): RRA<T> where T : Type<T>, T : Div<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divGeneric_NumericType")
operator fun <T : NumericType<T>> RRA<T>.div(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divGeneric_ComplexType")
operator fun <T : ComplexType<T>> RRA<T>.div(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divGeneric_IntegerType")
operator fun <T : IntegerType<T>> RRA<T>.div(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divGeneric_RealType")
operator fun <T : RealType<T>> RRA<T>.div(that: RRA<T>): RRA<T> {
  return RealRandomAccessibleArithmeticExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divComplexWildcard")
operator fun RRA<out ComplexType<*>>.div(that: RRA<out ComplexType<*>>): RRA<out ComplexType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.divComplex(this, that) as? RRA<out ComplexType<*>>
    ?:
    error("Arithmetic operator / (div) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divIntegerWildcard")
operator fun RRA<out IntegerType<*>>.div(that: RRA<out IntegerType<*>>): RRA<out IntegerType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.divInteger(this, that) as? RRA<out IntegerType<*>>
    ?:
    error("Arithmetic operator / (div) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divRealWildcard")
operator fun RRA<out RealType<*>>.div(that: RRA<out RealType<*>>): RRA<out RealType<*>> =
    RealRandomAccessibleArithmeticExtensionsJava.divReal(this, that) as? RRA<out RealType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${type::class} and ${(that as RRA<*>).type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")
