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

import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import kotlin.reflect.KClass


object ArithmeticTypes {

    object ResultType {
        @JvmStatic
        operator fun get(t1: RealType<*>, t2: RealType<*>) = get(t1::class, t2::class)

        @JvmStatic
        operator fun get(c1: KClass<out RealType<*>>, c2: KClass<out RealType<*>>): RealType<*> {
            fun checkType(t: KClass<out RealType<*>>) = require(t in arithmeticTypesMap) { "Type $t not supported. Supported types: ${arithmeticTypesMap.keys}"}
            checkType(c1)
            checkType(c2)

            val returnType = if (c1 == c2) c1 else arithmeticTypeCombinationsMap[c1 to c2]!!

            return arithmeticTypesConstructorsMap[returnType]!!()
        }
    }

    private object identifiers {
        const val complex = "complex"
        const val real = "real"
        const val signedInteger = "signedInteger"
        const val unsignedInteger = "unsignedInteger"
    }

    private val arithmeticTypes = with (identifiers) {
        arrayOf<Pair<KClass<*>, String>>(
            // TOOD complex types not implemented yet
//            ComplexDoubleType::class to complex,
//            ComplexFloatType::class to complex,
            DoubleType::class to real,
            FloatType::class to real,
            LongType::class to signedInteger,
            IntType::class to signedInteger,
            ShortType::class to signedInteger,
            ByteType::class to signedInteger,
            UnsignedLongType::class to unsignedInteger,
            UnsignedIntType::class to unsignedInteger,
            UnsignedShortType::class to unsignedInteger,
            UnsignedByteType::class to unsignedInteger
        )
    }

    private val arithmeticTypesMap = arithmeticTypes.toMap()

    private val arithmeticTypesConstructors = arrayOf<Pair<KClass<*>, () -> RealType<*>>>(
        // TOOD complex types not implemented yet
//            ComplexDoubleType::class to complex,
//            ComplexFloatType::class to complex,
        DoubleType::class to { DoubleType() },
        FloatType::class to { FloatType() },
        LongType::class to { LongType() },
        IntType::class to { IntType() },
        ShortType::class to { ShortType() },
        ByteType::class to { ByteType() },
        UnsignedLongType::class to { UnsignedLongType() },
        UnsignedIntType::class to { UnsignedIntType() },
        UnsignedShortType::class to { UnsignedShortType() },
        UnsignedByteType::class to { UnsignedByteType() }
    )

    private val arithmeticTypesConstructorsMap = arithmeticTypesConstructors.toMap()

    private val signedIntegers = arithmeticTypes.filter { it.second == identifiers.signedInteger }.map { it.first }
    private val unsignedIntegers = arithmeticTypes.filter { it.second == identifiers.unsignedInteger }.map { it.first }

    private val arithmeticTypeCombinations = mutableListOf<Triple<KClass<*>, KClass<*>, KClass<*>>>().also {
        for (i in arithmeticTypes.indices) {
            val (kc1, c1) = arithmeticTypes[i]
            for (k in i + 1 until arithmeticTypes.size) {
                val (kc2, c2) = arithmeticTypes[k]
                val o = if (c1 == identifiers.signedInteger && c2 == identifiers.unsignedInteger) {
                    val idx1 = signedIntegers.indexOf(kc1)
                    val idx2 = unsignedIntegers.indexOf(kc2)
                    if (idx1 < idx2) signedIntegers[idx1] else signedIntegers[Integer.max(idx2 - 1, 0)]
                } else
                    kc1
                it += Triple(kc1, kc2, o)
            }
        }
    }

    val arithmeticTypeCombinationsMap = arithmeticTypeCombinations
        .flatMap { listOf((it.first to it.second) to it.third, (it.second to it.first) to it.third) }
        .toMap()
}