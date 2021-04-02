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

import kotlin.Byte
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.math.E
import net.imglib2.RealRandomAccessible
import net.imglib2.type.numeric.RealType

operator fun <T : RealType<T>> RealRandomAccessible<T>.plus(value: T) =
    convert(type) { s, t -> t.set(s); t += value }

operator fun <T : RealType<T>> RealRandomAccessible<T>.plus(value: Byte) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.plus(value: Short) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.plus(value: Int) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.plus(value: Long) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.plus(value: Float) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.plus(value: Double) =
    this + type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.minus(value: T) =
    convert(type) { s, t -> t.set(s); t -= value }

operator fun <T : RealType<T>> RealRandomAccessible<T>.minus(value: Byte) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.minus(value: Short) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.minus(value: Int) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.minus(value: Long) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.minus(value: Float) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.minus(value: Double) =
    this - type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.times(value: T) =
    convert(type) { s, t -> t.set(s); t *= value }

operator fun <T : RealType<T>> RealRandomAccessible<T>.times(value: Byte) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.times(value: Short) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.times(value: Int) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.times(value: Long) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.times(value: Float) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.times(value: Double) =
    this * type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.div(value: T) =
    convert(type) { s, t -> t.set(s); t /= value }

operator fun <T : RealType<T>> RealRandomAccessible<T>.div(value: Byte) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.div(value: Short) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.div(value: Int) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.div(value: Long) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.div(value: Float) =
    this / type.also { it.setTo(value) }

operator fun <T : RealType<T>> RealRandomAccessible<T>.div(value: Double) =
    this / type.also { it.setTo(value) }

fun <T : RealType<T>> RealRandomAccessible<T>.pow(exponent: T) = convert(type) { s, t -> t.set(s);
    t.pow(exponent) }

infix fun <T : RealType<T>> RealRandomAccessible<T>.`**`(exponent: T) = pow(exponent)

fun <T : RealType<T>> RealRandomAccessible<T>.pow(exponent: RealRandomAccessible<T>) =
    convert(exponent, type) { s, t, u -> t.set(s); t.pow(u) }

infix fun <T : RealType<T>> RealRandomAccessible<T>.`**`(exponent: RealRandomAccessible<T>) =
    pow(exponent)

fun <T : RealType<T>> RealRandomAccessible<T>.pow(exponent: Double) = convert(type) { s, t ->
    t.set(s); t.pow(exponent) }

infix fun <T : RealType<T>> RealRandomAccessible<T>.`**`(exponent: Double) = pow(exponent)

fun <T : RealType<T>> RealRandomAccessible<T>.pow(exponent: Float) = convert(type) { s, t ->
    t.set(s); t.pow(exponent) }

infix fun <T : RealType<T>> RealRandomAccessible<T>.`**`(exponent: Float) = pow(exponent)

fun <T : RealType<T>> RealRandomAccessible<T>.exp(base: T) = convert(type) { s, t -> t.set(s);
    t.exp(base) }

fun <T : RealType<T>> RealRandomAccessible<T>.exp(exponent: RealRandomAccessible<T>) =
    convert(exponent, type) { s, t, u -> t.set(s); t.exp(u) }

fun <T : RealType<T>> RealRandomAccessible<T>.exp(base: Double = E) = convert(type) { s, t ->
    t.set(s); t.exp(base) }

fun <T : RealType<T>> RealRandomAccessible<T>.exp(base: Float) = convert(type) { s, t -> t.set(s);
    t.exp(base) }
