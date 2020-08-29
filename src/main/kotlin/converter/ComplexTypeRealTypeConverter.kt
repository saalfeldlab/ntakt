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
package net.imglib2.imklib.converter

import net.imglib2.Sampler
import net.imglib2.converter.readwrite.SamplerConverter
import net.imglib2.type.numeric.complex.ComplexDoubleType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.img.basictypeaccess.FloatAccess
import net.imglib2.img.basictypeaccess.DoubleAccess
import net.imglib2.type.numeric.complex.ComplexFloatType
import net.imglib2.type.numeric.real.FloatType

enum class ComplexPart {
    REAL, IMAGINARY;
}

object ComplexRealConverters {
    val realDouble = ComplexDoubleTypeDoubleTypeConverter(ComplexPart.REAL)
    val imaginaryDouble = ComplexDoubleTypeDoubleTypeConverter(ComplexPart.IMAGINARY)
    val realFloat = ComplexFloatTypeFloatTypeConverter(ComplexPart.REAL)
    val imaginaryFloat = ComplexFloatTypeFloatTypeConverter(ComplexPart.IMAGINARY)
}

class ComplexDoubleTypeDoubleTypeConverter(private val complexPart: ComplexPart) : SamplerConverter<ComplexDoubleType, DoubleType> {
    override fun convert(sampler: Sampler<out ComplexDoubleType>): DoubleType {
        val access = when(complexPart) {
            ComplexPart.REAL -> RealAccess(sampler)
            ComplexPart.IMAGINARY -> ImaginaryAccess(sampler)
        }
        return DoubleType(access)
    }

    private class RealAccess(private val sampler: Sampler<out ComplexDoubleType>) : DoubleAccess {
        override fun getValue(index: Int) = sampler.get().realDouble
        override fun setValue(index: Int, value: Double) = sampler.get().setReal(value)
    }

    private class ImaginaryAccess(private val sampler: Sampler<out ComplexDoubleType>) : DoubleAccess {
        override fun getValue(index: Int) = sampler.get().imaginaryDouble
        override fun setValue(index: Int, value: Double) = sampler.get().setImaginary(value)
    }

}

class ComplexFloatTypeFloatTypeConverter(private val complexPart: ComplexPart) : SamplerConverter<ComplexFloatType, FloatType> {
    override fun convert(sampler: Sampler<out ComplexFloatType>): FloatType {
        val access = when(complexPart) {
            ComplexPart.REAL -> RealAccess(sampler)
            ComplexPart.IMAGINARY -> ImaginaryAccess(sampler)
        }
        return FloatType(access)
    }

    private class RealAccess(private val sampler: Sampler<out ComplexFloatType>) : FloatAccess {
        override fun getValue(index: Int) = sampler.get().realFloat
        override fun setValue(index: Int, value: Float) = sampler.get().setReal(value)
    }

    private class ImaginaryAccess(private val sampler: Sampler<out ComplexFloatType>) : FloatAccess {
        override fun getValue(index: Int) = sampler.get().imaginaryFloat
        override fun setValue(index: Int, value: Float) = sampler.get().setImaginary(value)
    }

}

