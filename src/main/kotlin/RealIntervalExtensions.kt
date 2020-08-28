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

import net.imglib2.RealInterval
import net.imglib2.RealLocalizable
import net.imglib2.RealPoint
import net.imglib2.util.Intervals

val RealInterval.minAsDoubles: DoubleArray get() = minAsDoubleArray()
val RealInterval.maxAsDoubles: DoubleArray get() = maxAsDoubleArray()
val RealInterval.minAsFloats: FloatArray get() = FloatArray(numDimensions()) { realMin(it).toFloat() }
val RealInterval.maxAsFloats: FloatArray get() = FloatArray(numDimensions()) { realMax(it).toFloat() }
val RealInterval.minAsRealPoint: RealPoint get() = minAsRealPoint()
// TODO wait for imglib/imglib2#292 before reverting back to maxAsRealPoint()
val RealInterval.maxAsRealPoint: RealPoint get() = RealPoint(numDimensions()).also { realMax(it) }

infix fun RealInterval.intersect(that: RealInterval) = Intervals.intersect(this, that)
infix fun RealInterval.union(that: RealInterval) = Intervals.union(this, that)
operator fun RealInterval.contains(that: RealInterval) = Intervals.contains(this, that)
operator fun RealInterval.contains(location: RealLocalizable) = Intervals.contains(this, location)
operator fun RealInterval.contains(location: FloatArray) = containsAll(*location)
operator fun RealInterval.contains(location: DoubleArray) = containsAll(*location)
fun RealInterval.containsAll(vararg location: Float): Boolean {
    for (d in 0 until numDimensions()) {
        val p = location[d]
        if (p < realMin(d) || p > realMax(d))
            return false
    }
    return true
}
fun RealInterval.containsAll(vararg location: Double): Boolean {
    for (d in 0 until numDimensions()) {
        val p = location[d]
        if (p < realMin(d) || p > realMax(d))
            return false
    }
    return true
}