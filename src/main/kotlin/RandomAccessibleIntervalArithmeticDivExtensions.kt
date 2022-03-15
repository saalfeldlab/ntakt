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
import net.imglib2.type.numeric.RealType
import net.imglib2.type.operators.Div
import net.imglib2.RandomAccessibleInterval as RAI

@JvmName(name = "divGeneric")
operator fun <T> RAI<T>.div(that: RAI<T>): RAI<T> where T : Type<T>, T : Div<T> {
  return RandomAccessibleIntervalArithmeticDivExtensionsJava.divGeneric(this, that)
}

@JvmName(name = "divIntegerWildcard")
operator fun RAI<out IntegerType<*>>.div(that: RAI<out IntegerType<*>>): RAI<out IntegerType<*>> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.divInteger(this, that) as? RAI<out
    IntegerType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "divRealWildcard")
operator fun RAI<out RealType<*>>.div(that: RAI<out RealType<*>>): RAI<out RealType<*>> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.divReal(this, that) as? RAI<out RealType<*>>
    ?:
    error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")