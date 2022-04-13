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
@file:Suppress("ClassName")

package org.ntakt

import net.imglib2.type.numeric.ARGBType
import net.imglib2.type.numeric.ComplexType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.complex.ComplexDoubleType
import net.imglib2.type.numeric.complex.ComplexFloatType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType


@Suppress("MemberVisibilityCanBePrivate", "unused")
object types {
    val argb get() = ARGBType()
    val byte get() = ByteType()
    val short get() = ShortType()
    val int get() = IntType()
    val long get() = LongType()
    val unsignedByte get() = UnsignedByteType()
    val unsignedShort get() = UnsignedShortType()
    val unsignedInt get() = UnsignedIntType()
    val unsignedLong get() = UnsignedLongType()
    val float get() = FloatType()
    val double get() = DoubleType()
    val complexFloat get() = ComplexFloatType()
    val complexDouble get() = ComplexDoubleType()

    // aliases
    val int8 get() = byte
    val int16 get() = short
    val int32 get() = int
    val int64 get() = long
    val uint8 get() = unsignedByte
    val uint16 get() = unsignedShort
    val uint32 get() = unsignedInt
    val uint64 get() = unsignedLong
    val float32 get() = float
    val float64 get() = double
    val complex64 get() = complexFloat
    val complex128 get() = complexDouble

    val signedIntTypes get() = arrayOf<IntegerType<*>>(int8, int16, int32, int64)
    val unsignedIntTypes get() = arrayOf<IntegerType<*>>(uint8, uint16, uint32, uint64)
    val intTypes get() = signedIntTypes + unsignedIntTypes
    @Suppress("USELESS_CAST")
	val realTypes get() = intTypes.map { it as RealType<*> }.toTypedArray() + arrayOf<RealType<*>>(float32, float64)
    @Suppress("USELESS_CAST")
	val complexTypes get() = realTypes.map { it as ComplexType<*> }.toTypedArray() + arrayOf<ComplexType<*>>(complex64, complex128)
}