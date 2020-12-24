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
package net.imglib2.imklib

import org.junit.Assert
import kotlin.test.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestSlicing {

    @Test fun `test 1D slicing same interval`() {
        val data = imklib.ints(10) { it }
        val sliced = data[_el]
        Assert.assertArrayEquals(data.dimensionsAsLongArray(), sliced.dimensionsAsLongArray())
        Assert.assertTrue((sliced eq data).all())
    }

    @Test fun `test 1D slicing invert axis`() {
        val data = imklib.ints(10) { it }
        val sliced = data[(-1).step]
        Assert.assertArrayEquals(IntArray(10) { it }.reversedArray(), sliced.toIntArray())
    }

    @Test fun `test 1D slicing every third`() {
        val data = imklib.ints(10) { it }
        val sliced = data[3.step]
        Assert.assertArrayEquals(intArrayOf(0, 3, 6, 9), sliced.toIntArray())
    }

    @Test fun `test 1D slicing every third invert axis`() {
        val data = imklib.ints(10) { it }
        val sliced = data[(-3).step]
        Assert.assertArrayEquals(intArrayOf(9, 6, 3, 0), sliced.toIntArray())
    }

    @Test fun `test 1D slicing start at 3`() {
        val data = imklib.ints(10) { it }
        val sliced = data[3.start]
        Assert.assertArrayEquals(IntArray(7) { it + 3 }, sliced.toIntArray())
    }

    @Test fun `test 1D slicing stop at 7`() {
        val data = imklib.ints(10) { it }
        val sliced = data[7.stop]
        Assert.assertArrayEquals(IntArray(7) { it }, sliced.toIntArray())
    }

    @Test fun `test 1D slicing start=3 stop=7 step=3`() {
        val data = imklib.ints(10) { it }
        val sliced = data[3 sl 7 st 3]
        Assert.assertArrayEquals(intArrayOf(3, 6), sliced.toIntArray())
    }

    @Test fun `test 1D slicing start=3 stop=7 step=-3`() {
        val data = imklib.ints(10) { it }
        val sliced = data[3 sl 7 st -3]
        Assert.assertArrayEquals(intArrayOf(6, 3), sliced.toIntArray())
    }

    @Test fun `slice 3D`() {
        val data = imklib.ints(2, 3, 4) { it }
        val sliced1 = data[Slice(), _el, 3 sl 4]
        val sliced2 = data[_el, 3 sl 4]
        val expected = IntArray(6) { it + 18 }
        Assert.assertArrayEquals(expected, sliced1.toIntArray())
        Assert.assertArrayEquals(expected, sliced2.toIntArray())
    }

    @Test fun `slice 3D invert axis`() {
        val data = imklib.ints(2, 3, 4) { it }
        val sliced = data[(-1).step, (-1).step, 3 sl 4]
        val expected = IntArray(6) { it + 18 }.reversedArray()
        Assert.assertArrayEquals(expected, sliced.toIntArray())
    }

}