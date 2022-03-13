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

import net.imglib2.EuclideanSpace
import net.imglib2.Interval
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI
import net.imglib2.RealPoint
import net.imglib2.RealRandomAccess
import net.imglib2.RealInterval
import net.imglib2.RealRandomAccessible as RRA
import net.imglib2.RealRandomAccessibleRealInterval as RRARI
import net.imglib2.util.ConstantUtils


fun <T> T.constantRandomAccessible(nDim: Int) = ConstantUtils.constantRandomAccessible(this, nDim)
fun <T> T.constantRandomAccessible(space: EuclideanSpace) = constantRandomAccessible(space.nDim)
fun <T> T.constantRandomAccessibleInterval(interval: Interval) = ConstantUtils.constantRandomAccessibleInterval(this, interval)
fun <T> T.constantRealRandomAccessible(nDim: Int) = object : RRA<T> {
    override fun numDimensions() = nDim
    override fun realRandomAccess(interval: RealInterval?) = realRandomAccess()
    override fun realRandomAccess() = ConstantRealRandomAcccess(nDim, this@constantRealRandomAccessible)
}
fun <T> T.constantRealRandomAccessible(space: EuclideanSpace) = constantRealRandomAccessible(space.nDim)
fun <T> T.constantRealRandomAccessibleRealInterval(realInterval: RealInterval): RRARI<T> =
    object : RRARI<T>, RealInterval by realInterval {
        override fun realRandomAccess() = ConstantRealRandomAcccess<T>(nDim, this@constantRealRandomAccessibleRealInterval)
        override fun realRandomAccess(realInterval: RealInterval?) = realRandomAccess()
    }

fun <T> T.constant(ra: RA<*>) = constantRandomAccessible(ra)
fun <T> T.constant(rai: RAI<*>) = constantRandomAccessibleInterval(rai)
fun <T> T.constant(rra: RRA<*>) = constantRealRandomAccessible(rra)
fun <T> T.constant(rrari: RRARI<*>) = constantRealRandomAccessibleRealInterval(rrari)

private class ConstantRealRandomAcccess<T>(nDim: Int, private val constant: T) : RealPoint(nDim), RealRandomAccess<T> {
    override fun get() = constant
    override fun copyRealRandomAccess() = ConstantRealRandomAcccess(numDimensions(), constant).also { it.setPosition(this) }
    override fun copy() = copyRealRandomAccess()
}