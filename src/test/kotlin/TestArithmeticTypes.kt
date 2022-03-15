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

import net.imglib2.type.NativeType
import net.imglib2.type.numeric.ComplexType
import net.imglib2.util.Fraction
import org.junit.Assert
import kotlin.test.Test

class TestArithmeticTypes {
	@Test
	fun `test result type`() {
		for (t1 in types.complexTypes) {
			for (t2 in types.complexTypes) {
				val r = ArithmeticTypes.ResultType[t1, t2]
				Assert.assertEquals(expectedResultTypeIdentifier(t1, t2), ArithmeticTypes.Identifiers[r])
				Assert.assertTrue(
					"Target type entities per pixel ${r.entitiesPerPixel.frac} is not larger or equal to max(${t1.entitiesPerPixel.frac}, ${t2.entitiesPerPixel.frac}).",
					r.entitiesPerPixel >= max(t1.entitiesPerPixel, t2.entitiesPerPixel)
				)
			}
		}
	}
}

private fun ComplexType<*>.isUnsignedInteger() = ArithmeticTypes.Identifiers.unsignedInteger == ArithmeticTypes.Identifiers[this]
private fun ComplexType<*>.isSignedInteger() = ArithmeticTypes.Identifiers.signedInteger == ArithmeticTypes.Identifiers[this]
private fun ComplexType<*>.isInteger() = isUnsignedInteger() || isSignedInteger()
private fun ComplexType<*>.isReal() = ArithmeticTypes.Identifiers.real == ArithmeticTypes.Identifiers[this] || isInteger()
private fun ComplexType<*>.asNativeType() = this as NativeType<*>
private val ComplexType<*>.entitiesPerPixel get() = asNativeType().entitiesPerPixel
private operator fun Fraction.compareTo(other: Fraction) = this.ratio.compareTo(other.ratio)
private fun max(f1: Fraction, f2: Fraction) = if (f1 >= f2) f1 else f2
private val Fraction.frac get() = "$numerator/$denominator"

private fun expectedResultTypeIdentifier(t1: ComplexType<*>, t2: ComplexType<*>) = when {
	t1.isUnsignedInteger() && t2.isUnsignedInteger() -> ArithmeticTypes.Identifiers.unsignedInteger
	t1.isInteger() && t2.isInteger() -> ArithmeticTypes.Identifiers.signedInteger
	t1.isReal() && t2.isReal() -> ArithmeticTypes.Identifiers.real
	else -> ArithmeticTypes.Identifiers.complex
}