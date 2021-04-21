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
package org.ntakt

import net.imglib2.type.Type
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.ByteType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub
import kotlin.math.E
import kotlin.math.pow

// RealType
fun <T: RealType<T>> T.setTo(value: Byte) = if (this is IntegerType<*>) this.setInteger(value.toInt()) else setReal(value.toDouble())
fun <T: RealType<T>> T.setTo(value: Short) = if (this is IntegerType<*>) this.setInteger(value.toInt()) else setReal(value.toDouble())
fun <T: RealType<T>> T.setTo(value: Int) = if (this is IntegerType<*>) this.setInteger(value) else setReal(value.toDouble())
fun <T: RealType<T>> T.setTo(value: Long) = if (this is IntegerType<*>) this.setInteger(value) else setReal(value.toDouble())
fun <T: RealType<T>> T.setTo(value: Float) = setReal(value)
fun <T: RealType<T>> T.setTo(value: Double) = setReal(value)

// createWithValue
fun <T: RealType<T>> T.createWithValue(value: Byte) = createVariable().also { it.setTo(value) }
fun <T: RealType<T>> T.createWithValue(value: Short) = createVariable().also { it.setTo(value) }
fun <T: RealType<T>> T.createWithValue(value: Int) = createVariable().also { it.setTo(value) }
fun <T: RealType<T>> T.createWithValue(value: Long) = createVariable().also { it.setTo(value) }
fun <T: RealType<T>> T.createWithValue(value: Float) = createVariable().also { it.setTo(value) }
fun <T: RealType<T>> T.createWithValue(value: Double) = createVariable().also { it.setTo(value) }

fun <T: RealType<T>> Byte.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Short.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Int.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Long.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Float.asType(type: T) = type.createWithValue(this)
fun <T: RealType<T>> Double.asType(type: T) = type.createWithValue(this)

fun Number.asType(): RealType<*> = when (this) {
    is Byte -> asType()
    is Short -> asType()
    is Int -> asType()
    is Long -> asType()
    is Float -> asType()
    is Double -> asType()
    else -> throw IllegalArgumentException("Type ${this::class} not supported")
}

fun Float.asType() = asType(FloatType())
fun Double.asType() = asType(DoubleType())

// conversion
val <T: RealType<T>> T.floatType get() = when(this) {
    is FloatType -> copy()
    else -> FloatType(realFloat)
}
val <T: RealType<T>> T.doubleType get() = when(this) {
    is DoubleType -> copy()
    else -> DoubleType(realDouble)
}

// add
operator fun <T: Add<T>> T.plusAssign(value: T) = add(value)
operator fun <T> T.plus(value: T) where T : Add<T>, T: Type<T> = copy().also { it += value }
// T + primitive type
operator fun <T: RealType<T>> T.plusAssign(value: Byte) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Byte) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Short) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Short) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Int) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Int) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Long) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Long) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Float) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Float) = createWithValue(value).also { it += this }
operator fun <T: RealType<T>> T.plusAssign(value: Double) = setReal(realDouble + value)
operator fun <T: RealType<T>> T.plus(value: Double) = createWithValue(value).also { it += this }
// primitive type + T
operator fun <T: RealType<T>> Byte.plus(value: T) = value + this
operator fun <T: RealType<T>> Short.plus(value: T) = value + this
operator fun <T: RealType<T>> Int.plus(value: T) = value + this
operator fun <T: RealType<T>> Long.plus(value: T) = value + this
operator fun <T: RealType<T>> Float.plus(value: T) = value + this
operator fun <T: RealType<T>> Double.plus(value: T) = value + this

// subtract
operator fun <T: Sub<T>> T.minusAssign(value: T) = sub(value)
operator fun <T> T.minus(value: T) where T : Sub<T>, T: Type<T> = copy().also { it -= value }
// T - primitive type
operator fun <T: RealType<T>> T.minusAssign(value: Byte) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Byte) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Short) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Short) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Int) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Int) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Long) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Long) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Float) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Float) = copy().also { it -= value }
operator fun <T: RealType<T>> T.minusAssign(value: Double) = setReal(realDouble - value)
operator fun <T: RealType<T>> T.minus(value: Double) = copy().also { it -= value }
// primitive type - T
operator fun <T: RealType<T>> Byte.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Short.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Int.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Long.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Float.minus(value: T) = asType(value) - value
operator fun <T: RealType<T>> Double.minus(value: T) = asType(value) - value

// multiply
operator fun <T: Mul<T>> T.timesAssign(value: T) = mul(value)
operator fun <T> T.times(value: T) where T : Mul<T>, T: Type<T> = copy().also { it *= value }
// T * primitive type
operator fun <T: RealType<T>> T.timesAssign(value: Byte) = mul(value.toDouble())
operator fun <T: RealType<T>> T.times(value: Byte) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Short) = mul(value.toDouble())
operator fun <T: RealType<T>> T.times(value: Short) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Int) = mul(value.toDouble())
operator fun <T: RealType<T>> T.times(value: Int) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Long) = mul(value.toDouble())
operator fun <T: RealType<T>> T.times(value: Long) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Float) = mul(value)
operator fun <T: RealType<T>> T.times(value: Float) = copy().also { it *= value }
operator fun <T: RealType<T>> T.timesAssign(value: Double) = mul(value)
operator fun <T: RealType<T>> T.times(value: Double) = copy().also { it *= value }
// primitive type * T
operator fun <T: RealType<T>> Byte.times(value: T) = value * this
operator fun <T: RealType<T>> Short.times(value: T) = value * this
operator fun <T: RealType<T>> Int.times(value: T) = value * this
operator fun <T: RealType<T>> Long.times(value: T) = value * this
operator fun <T: RealType<T>> Float.times(value: T) = value * this
operator fun <T: RealType<T>> Double.times(value: T) = value * this

// divide
operator fun <T: Div<T>> T.divAssign(value: T) = div(value)
// T / primitive type
operator fun <T: RealType<T>> T.divAssign(value: Byte) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Byte) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Short) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Short) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Int) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Int) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Long) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Long) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Float) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Float) = copy().also { it /= value }
operator fun <T: RealType<T>> T.divAssign(value: Double) = setReal(realDouble / value)
operator fun <T: RealType<T>> T.div(value: Double) = copy().also { it /= value }
// primitive Type / T
operator fun <T: RealType<T>> Byte.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Short.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Int.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Long.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Float.div(value: T) = asType(value).also { it /= value }
operator fun <T: RealType<T>> Double.div(value: T) = asType(value).also { it /= value }

// power
fun <T: RealType<T>> T.pow(exponent: Float) = setReal(realFloat.pow(exponent))
fun <T: RealType<T>> T.pow(exponent: Int) = setReal(realDouble.pow(exponent))
fun <T: RealType<T>> Double.pow(exponent: T) = pow(exponent.realDouble)
fun <T: RealType<T>> Float.pow(exponent: T) = pow(exponent.realFloat)
fun <T: RealType<T>> Int.pow(exponent: T) = toDouble().pow(exponent.realDouble)
fun <T: RealType<T>> T.pow(exponent: RealType<*>) = pow(exponent.getRealDouble())
fun <T: RealType<T>> T.pow(exponent: IntegerType<*>) = pow(exponent.getInteger())
infix fun <T: RealType<T>> T.`**`(exponent: Double) = copy().also { pow(exponent) }
infix fun <T: RealType<T>> T.`**`(exponent: Float) = copy().also { pow(exponent) }
infix fun <T: RealType<T>> T.`**`(exponent: RealType<*>) = copy().also { pow(exponent) }
infix fun <T: RealType<T>> T.`**`(exponent: IntegerType<*>) = copy().also { pow(exponent) }

// exp
fun <T: RealType<T>> T.exp(base: Double = E) = setReal(base.pow(realDouble))
fun <T: RealType<T>> T.exp(base: Float = E.toFloat()) = setReal(base.pow(realFloat))
fun <T: RealType<T>> T.exp(base: RealType<*>) = setReal(base.getRealDouble().pow(realDouble))
