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

import net.imglib2.*
import net.imglib2.img.array.ArrayImgs
import net.imglib2.type.numeric.integer.IntType
import org.junit.Assert
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ImkLibTest {

    val reference: RandomAccessibleInterval<IntType> = ArrayImgs
        .ints(IntArray(6) { it + 1 }, 2, 3)
        .translate( 1, -2)

    @Test
    fun `test Interval min`() {
        Assert.assertArrayEquals(longArrayOf(1, -2), reference.minAsLongs)
        Assert.assertArrayEquals(intArrayOf(1, -2), reference.minAsInts)
        Assert.assertEquals(Point(1, -2), reference.minAsPoint)
        Assert.assertArrayEquals(doubleArrayOf(1.0, -2.0), reference.minAsDoubles, 0.0)
        Assert.assertArrayEquals(floatArrayOf(1.0F, -2.0F), reference.minAsFloats, 0.0F)
        Assert.assertEquals(RealPoint(1.0, -2.0), reference.minAsRealPoint)
    }

    @Test
    fun `test Interval max`() {
        Assert.assertArrayEquals(longArrayOf(2, 0), reference.maxAsLongs)
        Assert.assertArrayEquals(intArrayOf(2, 0), reference.maxAsInts)
        Assert.assertEquals(Point(2, 0), reference.maxAsPoint)
        Assert.assertArrayEquals(doubleArrayOf(2.0, 0.0), reference.maxAsDoubles, 0.0)
        Assert.assertArrayEquals(floatArrayOf(2.0F, 0.0F), reference.maxAsFloats, 0.0F)
        Assert.assertEquals(RealPoint(2.0, 0.0), reference.maxAsRealPoint)
    }

    @Test
    fun `test Interval union and intersection`() {
        val i1 = FinalInterval.createMinMax(1, 2, 5, 4)
        i1 union i1
        i1 intersect i1
        Point(1, 2) in i1
        longArrayOf(1, 2) in i1
        FinalRealInterval.createMinMax(1.0, 2.0, 5.0, 4.0) union i1
    }
}