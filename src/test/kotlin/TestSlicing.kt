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

import io.minio.errors.InvalidArgumentException
import org.junit.Assert
import kotlin.test.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestSlicing {

    @Test fun `test 1D slicing same interval`() {
        val data = ntakt.ints(10) { it }
        val sliced1 = data[_el]
        val sliced2 = data[0 sl 10 st 1]
        Assert.assertArrayEquals(data.dimensionsAsLongArray(), sliced1.dimensionsAsLongArray())
        Assert.assertArrayEquals(data.dimensionsAsLongArray(), sliced2.dimensionsAsLongArray())
        Assert.assertTrue((sliced1 eq data).all())
        Assert.assertTrue((sliced2 eq data).all())
    }

    @Test fun `test 1D slicing invert axis`() {
        val data = ntakt.ints(10) { it }
        val sliced = data[(-1).step]
        Assert.assertArrayEquals(IntArray(10) { it }.reversedArray(), sliced.toIntArray())
    }

    @Test fun `test 1D slicing every third`() {
        val data = ntakt.ints(10) { it }
        val sliced = data[3.step]
        Assert.assertArrayEquals(intArrayOf(0, 3, 6, 9), sliced.toIntArray())
    }

    @Test fun `test 1D slicing every third invert axis`() {
        val data = ntakt.ints(10) { it }
        val sliced = data[(-3).step]
        Assert.assertArrayEquals(intArrayOf(9, 6, 3, 0), sliced.toIntArray())
    }

    @Test fun `test 1D slicing start at 3`() {
        val data = ntakt.ints(10) { it }
        val sliced1 = data[3.start]
        val sliced2 = data[(-7).start]
        Assert.assertArrayEquals(IntArray(7) { it + 3 }, sliced1.toIntArray())
        Assert.assertArrayEquals(IntArray(7) { it + 3 }, sliced2.toIntArray())
    }

    @Test fun `test 1D slicing stop at 7`() {
        val data = ntakt.ints(10) { it }
        val sliced1 = data[7.stop]
        val sliced2 = data[(-3).stop]
        Assert.assertArrayEquals(IntArray(7) { it }, sliced1.toIntArray())
        Assert.assertArrayEquals(IntArray(7) { it }, sliced2.toIntArray())
    }

    @Test fun `test 1D slicing start=3 stop=7 step=3`() {
        val data = ntakt.ints(10) { it }
        val sliced1 = data[3 sl 7 st 3]
        val sliced2 = data[3 sl -3 st 3]
        val sliced3 = data[-7 sl -3 st 3]
        Assert.assertArrayEquals(intArrayOf(3, 6), sliced1.toIntArray())
        Assert.assertArrayEquals(intArrayOf(3, 6), sliced2.toIntArray())
        Assert.assertArrayEquals(intArrayOf(3, 6), sliced3.toIntArray())
    }

    @Test fun `test 1D slicing start=3 stop=7 step=-3`() {
        val data = ntakt.ints(10) { it }
        val sliced1 = data[3 sl 7 st -3]
        val sliced2 = data[3 sl -3 st -3]
        val sliced3 = data[-7 sl -3 st -3]
        Assert.assertArrayEquals(intArrayOf(6, 3), sliced1.toIntArray())
        Assert.assertArrayEquals(intArrayOf(6, 3), sliced2.toIntArray())
        Assert.assertArrayEquals(intArrayOf(6, 3), sliced3.toIntArray())
    }

    @Test fun `test 1D slicing empty`() {
        val data = ntakt.ints(10) { it }
        val sliced1 = data[10.start]
        val sliced2 = data[0.stop]
        val sliced3 = data[3 sl 2]
        val sliced4 = data[7 sl -3]
        Assert.assertTrue(sliced1.isEmpty)
        Assert.assertTrue(sliced2.isEmpty)
        Assert.assertTrue(sliced3.isEmpty)
        Assert.assertTrue(sliced4.isEmpty)
    }

    @Test fun `slice 3D`() {
        val data = ntakt.ints(2, 3, 4) { it }
        val sliced1 = data[slice(), _el, 3 sl 4]
        val sliced2 = data[_el, 3 sl 4]
        val expected = IntArray(6) { it + 18 }
        Assert.assertArrayEquals(expected, sliced1.toIntArray())
        Assert.assertArrayEquals(expected, sliced2.toIntArray())
    }

    @Test fun `slice 3D invert axis`() {
        val data = ntakt.ints(2, 3, 4) { it }
        val sliced = data[(-1).step, (-1).step, 3 sl 4]
        val expected = IntArray(6) { it + 18 }.reversedArray()
        Assert.assertArrayEquals(expected, sliced.toIntArray())
    }

    @Test fun `test 3D slicing empty`() {
        val data = ntakt.ints(2, 3, 4) { it }
        val sliced1 = data[0.stop]
        val sliced2 = data[slice(), 0.stop]
        val sliced3 = data[_el, 0.stop]
        Assert.assertTrue(sliced1.isEmpty)
        Assert.assertTrue(sliced2.isEmpty)
        Assert.assertTrue(sliced3.isEmpty)
    }

    @Test fun `test 3D slicing with pos aka hyperSlice`() {
        val data = ntakt.ints(2, 3, 4) { it }
        val sliced1 = data[0.pos]
        val sliced2 = data[slice(), 1.pos]
        val sliced3 = data[_el, 2.pos]
        Assert.assertEquals(2, sliced1.numDimensions())
        Assert.assertEquals(2, sliced2.numDimensions())
        Assert.assertEquals(2, sliced3.numDimensions())
        Assert.assertArrayEquals(longArrayOf(3, 4), sliced1.dimensionsAsLongArray())
        Assert.assertArrayEquals(longArrayOf(2, 4), sliced2.dimensionsAsLongArray())
        Assert.assertArrayEquals(longArrayOf(2, 3), sliced3.dimensionsAsLongArray())
        Assert.assertArrayEquals(IntArray(12) { it * 2 }, sliced1.toIntArray())
        Assert.assertArrayEquals(intArrayOf(2, 3, 8, 9, 14, 15 ,20, 21), sliced2.toIntArray())
        Assert.assertArrayEquals(IntArray(6) { it + 12 }, sliced3.toIntArray())
    }

    @Test fun `test 3D slicing with pos and slice`() {
        val data = ntakt.ints(2, 3, 4) { it }
        val sliced1 = data[(-2).pos, 2.step]
        val sliced2 = data[_el, (-2).pos, 3.step]
        val sliced3 = data[1 sl 2, _el, (-2).pos]
        Assert.assertEquals(2, sliced1.numDimensions())
        Assert.assertEquals(2, sliced2.numDimensions())
        Assert.assertEquals(2, sliced3.numDimensions())
        Assert.assertArrayEquals(longArrayOf(2, 4), sliced1.dimensionsAsLongArray())
        Assert.assertArrayEquals(longArrayOf(2, 2), sliced2.dimensionsAsLongArray())
        Assert.assertArrayEquals(longArrayOf(1, 3), sliced3.dimensionsAsLongArray())
        Assert.assertArrayEquals(intArrayOf(0, 4, 6, 10, 12, 16, 18, 22), sliced1.toIntArray())
        Assert.assertArrayEquals(intArrayOf(2, 3, 20, 21), sliced2.toIntArray())
        Assert.assertArrayEquals(IntArray(3) { 13 + 2 * it }, sliced3.toIntArray())
    }

    @Test fun `test errors`() {
        data class FailSlice(val nothing: Unit = Unit): Slicing
        val data = ntakt.ints(3, 4) { it }
        val slicings = listOf(
            arrayOf(FailSlice()),
            arrayOf(_el, _el),
            arrayOf(1.pos, 2 sl 3, 4.step),
            arrayOf((-4).pos),
            arrayOf(4.pos),
            arrayOf(-4 sl 3),
            arrayOf(0 sl -4),
            arrayOf(4 sl 3),
            arrayOf(3 sl 4)
        )
        for (slicing in slicings) {
            try {
                data.get(*slicing)
                Assert.fail("Expected ${IllegalArgumentException::class.simpleName} for invalid slicing ${slicing.toList()}.")
            } catch (e: IllegalArgumentException) {
                // expected exception, uncomment for logging:
                // println(e.message)
            }
        }
    }

}