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

import net.imglib2.type.logic.BoolType
import kotlin.test.Test
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI
import net.imglib2.RealRandomAccessible as RRA
import net.imglib2.RealRandomAccessibleRealInterval as RRARI
import net.imglib2.type.numeric.real.DoubleType
import org.junit.Assert
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLogicalExtensions {

    open class Comp1(val v1: Int) : Comparable<Comp1> {
        override fun compareTo(other: Comp1): Int {
            println("Comparing $this to $other")
            val comp = v1.compareTo(other.v1)
            println("Comparison is $comp")
            return comp
        }

        override fun toString(): String = "${this::class.simpleName}: v1=$v1"
    }

    class Comp2(v1: Int) : Comp1(v1)

    val oneInt = 1
    val oneDouble = 1.0

    val rai1 = imklib.ints(3) { it }
    val rai2 = imklib.ints(3) { oneInt }
    val raiEq = booleanArrayOf(false, true, false)
    val raiGe = booleanArrayOf(false, true, true)
    val raiLe = booleanArrayOf(true, true, false)
    val raiGt = booleanArrayOf(false, false, true)
    val raiLt = booleanArrayOf(true, false, false)

    val ra1 = rai1.extendBorder()
    val ra2 = imklib.constant(oneInt.asType(), 1)
    val raEq = arrayOf(-1 to false, 1 to true, 3 to false)
    val raGe = arrayOf(-1 to false, 1 to true, 3 to true)
    val raLe = arrayOf(-1 to true, 1 to true, 3 to false)
    val raGt = arrayOf(-1 to false, 1 to false, 3 to true)
    val raLt = arrayOf(-1 to true, 1 to false, 3 to false)

    val rra1 = imklib.function(1, { DoubleType() }) { p, t -> t.set(p.getDoublePosition(0)) }
    val rra2 = imklib.function(1, { DoubleType() }) { _, t -> t.setOne()}
    val rraEq = arrayOf(-1e6 to false, 0.9 to false, 1.0 to true, 1.1 to false, 1e6 to false)
    val rraGe = arrayOf(-1e6 to false, 0.9 to false, 1.0 to true, 1.1 to true, 1e6 to true)
    val rraLe = arrayOf(-1e6 to true, 0.9 to true, 1.0 to true, 1.1 to false, 1e6 to false)
    val rraGt = arrayOf(-1e6 to false, 0.9 to false, 1.0 to false, 1.1 to true, 1e6 to true)
    val rraLt = arrayOf(-1e6 to true, 0.9 to true, 1.0 to false, 1.1 to false, 1e6 to false)

    val rrari1 = rra1.realInterval(-1e7, 1e7)
    val rrari2 = rra2.realInterval(-1e7, 1e7)
    val rrariEq = rraEq
    val rrariGe = rraGe
    val rrariLe = rraLe
    val rrariGt = rraGt
    val rrariLt = rraLt

    // RAI
    @Test fun `test rai eq rai`() = assertRai(raiEq, rai1 eq rai2)
    @Test fun `test rai eq rai longs`() = assertRai(raiEq, rai1 eq rai2.asLongs())
    @Test fun `test rai eq rai doubles`() = assertRai(raiEq, rai1 eq rai2.asDoubles())
    @Test fun `test rai eq scalar`() = assertRai(raiEq, rai1 eq oneInt.asType())
    @Test fun `test scalar eq rai`() = assertRai(raiEq, oneInt.asType() eq rai1)

    @Test fun `test rai ge rai`() = assertRai(raiGe, rai1 ge rai2)
    @Test fun `test rai ge scalar`() = assertRai(raiGe, rai1 ge oneInt.asType())
    @Test fun `test scalar le rai`() = assertRai(raiGe, oneInt.asType() le rai1)

    @Test fun `test rai le rai`() = assertRai(raiLe, rai1 le rai2)
    @Test fun `test rai le scalar`() = assertRai(raiLe, rai1 le oneInt.asType())
    @Test fun `test scalar ge rai`() = assertRai(raiLe, oneInt.asType() ge rai1)

    @Test fun `test rai gt rai`() = assertRai(raiGt, rai1 gt rai2)
    @Test fun `test rai gt scalar`() = assertRai(raiGt, rai1 gt oneInt.asType())
    @Test fun `test scalar lt rai`() = assertRai(raiGt, oneInt.asType() lt rai1)

    @Test fun `test rai lt rai`() = assertRai(raiLt, rai1 lt rai2)
    @Test fun `test rai lt scalar`() = assertRai(raiLt, rai1 lt oneInt.asType())
    @Test fun `test scalar gt rai`() = assertRai(raiLt, oneInt.asType() gt rai1)

    private fun assertRai(expected: BooleanArray, actual: RAI<BoolType>) {
        Assert.assertTrue(rai1.contains(actual))
        Assert.assertTrue(rai2.contains(actual))
        Assert.assertTrue(actual.contains(rai1))
        Assert.assertTrue(actual.contains(rai2))

        Assert.assertArrayEquals(expected, actual.flatIterable.map { it.get() }.toBooleanArray())
    }

    // RA
    @Test fun `test ra eq ra`() = assertRa(ra1 eq ra2, *raEq)
    @Test fun `test ra eq scalar`() = assertRa(ra1 eq oneInt.asType(), *raEq)
    @Test fun `test scalar eq ra`() = assertRa(oneInt.asType() eq ra1, *raEq)

    @Test fun `test ra ge ra`() = assertRa(ra1 ge ra2, *raGe)
    @Test fun `test ra ge scalar`() = assertRa(ra1 ge oneInt.asType(), *raGe)
    @Test fun `test scalar le ra`() = assertRa(oneInt.asType() le ra1, *raGe)

    @Test fun `test ra le ra`() = assertRa(ra1 le ra2, *raLe)
    @Test fun `test ra le scalar`() = assertRa(ra1 le oneInt.asType(), *raLe)
    @Test fun `test scalar ge ra`() = assertRa(oneInt.asType() ge ra1, *raLe)

    @Test fun `test ra gt ra`() = assertRa(ra1 gt ra2, *raGt)
    @Test fun `test ra gt scalar`() = assertRa(ra1 gt oneInt.asType(), *raGt)
    @Test fun `test scalar lt ra`() = assertRa(oneInt.asType() lt ra1, *raGt)

    @Test fun `test ra lt ra`() = assertRa(ra1 lt ra2, *raLt)
    @Test fun `test ra lt scalar`() = assertRa(ra1 lt oneInt.asType(), *raLt)
    @Test fun `test scalar gt ra`() = assertRa(oneInt.asType() gt ra1, *raLt)

    private fun assertRa(actual: RA<BoolType>, vararg expected: Pair<Int, Boolean>) {
        for ((idx, e) in expected.withIndex())
            Assert.assertEquals("Mismatch at index $idx", e.second, actual[e.first].get())
    }

    // RRA
    @Test fun `test rra eq rra`() = assertRra(rra1 eq rra2, *rraEq)
    @Test fun `test rra eq scalar`() = assertRra(rra1 eq oneDouble.asType(), *rraEq)
    @Test fun `test scalar eq rra`() = assertRra(oneDouble.asType() eq rra1, *rraEq)

    @Test fun `test rra ge rra`() = assertRra(rra1 ge rra2, *rraGe)
    @Test fun `test rra ge scalar`() = assertRra(rra1 ge oneDouble.asType(), *rraGe)
    @Test fun `test scalar le rra`() = assertRra(oneDouble.asType() le rra1, *rraGe)

    @Test fun `test rra le rra`() = assertRra(rra1 le rra2, *rraLe)
    @Test fun `test rra le scalar`() = assertRra(rra1 le oneDouble.asType(), *rraLe)
    @Test fun `test scalar ge rra`() = assertRra(oneDouble.asType() ge rra1, *rraLe)

    @Test fun `test rra gt rra`() = assertRra(rra1 gt rra2, *rraGt)
    @Test fun `test rra gt scalar`() = assertRra(rra1 gt oneDouble.asType(), *rraGt)
    @Test fun `test scalar lt rra`() = assertRra(oneDouble.asType() lt rra1, *rraGt)

    @Test fun `test rra lt rra`() = assertRra(rra1 lt rra2, *rraLt)
    @Test fun `test rra lt scalar`() = assertRra(rra1 lt oneDouble.asType(), *rraLt)
    @Test fun `test scalar gt rra`() = assertRra(oneDouble.asType() gt rra1, *rraLt)

    private fun assertRra(actual: RRA<BoolType>, vararg expected: Pair<Double, Boolean>) {
        for ((idx, e) in expected.withIndex())
            Assert.assertEquals("Mismatch at index $idx", e.second, actual[e.first].get())
    }

    // RRA
    @Test fun `test rrari eq rrari`() = assertRrari(rrari1 eq rrari2, *rrariEq)
    @Test fun `test rrari eq scalar`() = assertRrari(rrari1 eq oneDouble.asType(), *rrariEq)
    @Test fun `test scalar eq rrari`() = assertRrari(oneDouble.asType() eq rrari1, *rrariEq)

    @Test fun `test rrari ge rrari`() = assertRrari(rrari1 ge rrari2, *rrariGe)
    @Test fun `test rrari ge scalar`() = assertRrari(rrari1 ge oneDouble.asType(), *rrariGe)
    @Test fun `test scalar le rrari`() = assertRrari(oneDouble.asType() le rrari1, *rrariGe)

    @Test fun `test rrari le rrari`() = assertRrari(rrari1 le rrari2, *rrariLe)
    @Test fun `test rrari le scalar`() = assertRrari(rrari1 le oneDouble.asType(), *rrariLe)
    @Test fun `test scalar ge rrari`() = assertRrari(oneDouble.asType() ge rrari1, *rrariLe)

    @Test fun `test rrari gt rrari`() = assertRrari(rrari1 gt rrari2, *rrariGt)
    @Test fun `test rrari gt scalar`() = assertRrari(rrari1 gt oneDouble.asType(), *rrariGt)
    @Test fun `test scalar lt rrari`() = assertRrari(oneDouble.asType() lt rrari1, *rrariGt)

    @Test fun `test rrari lt rrari`() = assertRrari(rrari1 lt rrari2, *rrariLt)
    @Test fun `test rrari lt scalar`() = assertRrari(rrari1 lt oneDouble.asType(), *rrariLt)
    @Test fun `test scalar gt rrari`() = assertRrari(oneDouble.asType() gt rrari1, *rrariLt)

    private fun assertRrari(actual: RRARI<BoolType>, vararg expected: Pair<Double, Boolean>) {
        for ((idx, e) in expected.withIndex())
            Assert.assertEquals("Mismatch at index $idx", e.second, actual[e.first].get())
    }

//    @Test fun `test assignable comparable`() = Assert.assertTrue((imklib.constant(Comp1(1), 1) eq imklib.constant(Comp2(1), 1)).randomAccess().get().get())

}

