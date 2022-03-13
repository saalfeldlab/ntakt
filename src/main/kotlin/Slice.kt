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

interface Slicing {

    data class Slice(
        val start: Long? = null,
        val stop: Long? = null,
        val step: Long? = null
    ) : Slicing {
        init {
            require(step === null || step != 0L) { "Invalid step: $step" }
        }

        fun withStart(start: Long?) = Slice(start = start, stop = stop, step = step)
        fun withStop(stop: Long?) = Slice(start = start, stop = stop, step = step)
        fun withStep(step: Long?) = Slice(start = start, stop = stop, step = step)
    }

    class Ellipsis private constructor() : Slicing {
        override fun toString() = this::class.simpleName ?: "Ellipsis"
        companion object {
            val instance = Ellipsis()
        }
    }

    data class Position(val pos: Long): Slicing
}

fun slice(start: Long? = null, stop: Long? = null, step: Long? = null) = Slicing.Slice(start = start, stop = stop, step = step)

infix fun Int.sl(stop: Int) = toLong() sl stop
infix fun Int.sl(stop: Long) = toLong() sl stop
infix fun Long.sl(stop: Int) = sl(stop.toLong())
infix fun Long.sl(stop: Long) = Slicing.Slice(start=this, stop=stop)

val Int.start get() = toLong().start
val Int.stop get() = toLong().stop
val Int.step get() = toLong().step
val Long.start get() = Slicing.Slice(start=this)
val Long.stop get() = Slicing.Slice(stop=this)
val Long.step get() = Slicing.Slice(step=this)

infix fun Slicing.Slice.st(step: Int) = st(step.toLong())
infix fun Slicing.Slice.st(step: Long) = Slicing.Slice(start=start, stop=stop, step=step)


val _el = Slicing.Ellipsis.instance

val Int.pos get() = toLong().pos
val Long.pos get() = Slicing.Position(this)
