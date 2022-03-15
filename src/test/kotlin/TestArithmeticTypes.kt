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