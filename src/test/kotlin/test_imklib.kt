package net.imklib2

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