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

import net.imglib2.RealLocalizable
import net.imglib2.RealRandomAccessibleRealInterval
import net.imglib2.position.FunctionRealRandomAccessible
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType as RT
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI
import net.imglib2.RealRandomAccessible as RRA
import net.imglib2.RealRandomAccessibleRealInterval as RRARI
import org.junit.Assert
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestContainerArithmetics {

    @Test fun `test RA + RA`() = testRA(2.0, 3.0) { ra1, ra2 -> ra1 + ra2 }
    @Test fun `test RA - RA`() = testRA(1.0, 0.0) { ra1, ra2 -> ra1 - ra2 }
    @Test fun `test Ra * RA`() = testRA(2.0, 2.0) { ra1, ra2 -> ra1 * ra2 }
    @Test fun `test RA div RA`() = testRA(2.0, 0.5) { ra1, ra2 -> ra1 / ra2 }

    @Test fun `test RAI + RAI`() = testRAI(2.0, 3.0) { ra1, ra2 -> ra1 + ra2 }
    @Test fun `test RAI - RAI`() = testRAI(1.0, 0.0) { ra1, ra2 -> ra1 - ra2 }
    @Test fun `test RAI * RAI`() = testRAI(2.0, 2.0) { ra1, ra2 -> ra1 * ra2 }
    @Test fun `test RAI div RAI`() = testRAI(2.0, 0.5) { ra1, ra2 -> ra1 / ra2 }

    @Test fun `test RRA + RRA`() = testRRA(2.0, 3.0) { ra1, ra2 -> ra1 + ra2 }
    @Test fun `test RRA - RRA`() = testRRA(1.0, 0.0) { ra1, ra2 -> ra1 - ra2 }
    @Test fun `test RRA * RRA`() = testRRA(2.0, 2.0) { ra1, ra2 -> ra1 * ra2 }
    @Test fun `test RRA div RRA`() = testRRA(2.0, 0.5) { ra1, ra2 -> ra1 / ra2 }

    @Test fun `test RRARI + RRARI`() = testRRARI(2.0, 3.0) { ra1, ra2 -> ra1 + ra2 }
    @Test fun `test RRARI - RRARI`() = testRRARI(1.0, 0.0) { ra1, ra2 -> ra1 - ra2 }
    @Test fun `test RRARI * RRARI`() = testRRARI(2.0, 2.0) { ra1, ra2 -> ra1 * ra2 }
    @Test fun `test RRARI div RRARI`() = testRRARI(2.0, 0.5) { ra1, ra2 -> ra1 / ra2 }


    private inline fun testRA(t2Value: Double, expected: Double, operator: (RA<RT<*>>, RA<RT<*>>) -> RA<RT<*>>) {
        for ((i, t1) in types.realTypes.withIndex()) {
            val c1 = ntakt.constant(t1.createVariable().also { it.setOne() }, 1)
            for (k in i until types.realTypes.size) {
                val t2 = types.realTypes[k]
                val c2 = ntakt.constant(t2.createVariable().also { it.setReal(t2Value) }, 1)
                val c3 = operator(c1, c2)
                val v = c3.randomAccess().get()
                when (v) {
                    is IntegerType<*> -> Assert.assertEquals(expected.toLong(), v.getIntegerLong())
                    else -> Assert.assertEquals(expected, v.getRealDouble(), 0.0)
                }
            }
        }
    }


    private inline fun testRAI(t2Value: Double, expected: Double, operator: (RAI<RT<*>>, RAI<RT<*>>) -> RAI<RT<*>>) {
        for ((i, t1) in types.realTypes.withIndex()) {
            val c1 = ntakt.constant(t1.createVariable().also { it.setOne() }, longArrayOf(1L).interval)
            for (k in i until types.realTypes.size) {
                val t2 = types.realTypes[k]
                val c2 = ntakt.constant(t2.createVariable().also { it.setReal(t2Value) }, longArrayOf(1L).interval)
                val c3 = operator(c1, c2)
                val v = c3.randomAccess().get()
                when (v) {
                    is IntegerType<*> -> Assert.assertEquals(expected.toLong(), v.getIntegerLong())
                    else -> Assert.assertEquals(expected, v.getRealDouble(), 0.0)
                }
            }
        }
    }


    private inline fun testRRA(t2Value: Double, expected: Double, operator: (RRA<RT<*>>, RRA<RT<*>>) -> RRA<RT<*>>) {
        for ((i, t1) in types.realTypes.withIndex()) {
            val c1 = ntakt.function(1, { t1.createVariable() }) { p, t -> t.setOne() }
            for (k in i until types.realTypes.size) {
                val t2 = types.realTypes[k]
                val c2 = ntakt.function(1, { t2.createVariable() }) { p, t -> t.setReal(t2Value) }
                val c3 = operator(c1, c2)
                val v = c3.realRandomAccess().get()
                when (v) {
                    is IntegerType<*> -> Assert.assertEquals(expected.toLong(), v.getIntegerLong())
                    else -> Assert.assertEquals(expected, v.getRealDouble(), 0.0)
                }
            }
        }
    }


    private inline fun testRRARI(t2Value: Double, expected: Double, operator: (RRARI<RT<*>>, RRARI<RT<*>>) -> RRARI<RT<*>>) {
        for ((i, t1) in types.realTypes.withIndex()) {
            val c1 = function({ t1.createVariable() }) { p, t -> t.setOne() }
            for (k in i until types.realTypes.size) {
                val t2 = types.realTypes[k]
                val c2 = function({ t2.createVariable() }) { p, t -> t.setReal(t2Value) }
                val c3 = operator(c1, c2)
                val v = c3.realRandomAccess().get()
                when (v) {
                    is IntegerType<*> -> Assert.assertEquals(expected.toLong(), v.getIntegerLong())
                    else -> Assert.assertEquals(expected, v.getRealDouble(), 0.0)
                }
            }
        }
    }

}

private class FunctionRealInterval<T>(
        private val function: FunctionRealRandomAccessible<T>,
        private vararg val minMax: Double): RealRandomAccessibleRealInterval<T>, net.imglib2.RealRandomAccessible<T> by function {
    init {
        require(function.numDimensions() * 2 == minMax.size)
    }
    override fun realMin(d: Int): Double = minMax[d]
    override fun realMax(d: Int): Double = minMax[d + function.numDimensions()]
}

private inline fun <T> function(
        crossinline typeSupplier: () -> T,
        crossinline f: (RealLocalizable, T) -> Unit) = function(0.0, 1.0, typeSupplier = typeSupplier, f = f)

private inline fun <T> function(
        vararg minMax: Double,
        crossinline typeSupplier: () -> T,
        crossinline f: (RealLocalizable, T) -> Unit) = FunctionRealInterval(ntakt.function(minMax.size / 2, typeSupplier, f), *minMax)