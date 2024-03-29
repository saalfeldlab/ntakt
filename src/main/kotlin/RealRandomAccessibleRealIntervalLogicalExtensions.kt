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

// auto-generated, do not modify!

@file:Suppress("UNCHECKED_CAST")

package org.ntakt

import kotlin.Number
import kotlin.Suppress
import net.imglib2.RealRandomAccessibleRealInterval
import net.imglib2.type.BooleanType
import net.imglib2.type.Type
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType
import org.ntakt.converter.TriConverter

infix fun RealRandomAccessibleRealInterval<out
        RealType<*>>.eq(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that.type is IntegerType -> (this as
                RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.integerLong == s2.integerLong) }
        else -> convert(that, BoolType()) { s1, s2, t -> t.set(s1.realDouble == s2.realDouble) }
    }
}

infix fun RealRandomAccessibleRealInterval<out
        RealType<*>>.ge(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that.type is IntegerType -> (this as
                RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.integerLong >= s2.integerLong) }
        else -> convert(that, BoolType()) { s1, s2, t -> t.set(s1.realDouble >= s2.realDouble) }
    }
}

infix fun RealRandomAccessibleRealInterval<out
        RealType<*>>.le(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that.type is IntegerType -> (this as
                RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.integerLong <= s2.integerLong) }
        else -> convert(that, BoolType()) { s1, s2, t -> t.set(s1.realDouble <= s2.realDouble) }
    }
}

infix fun RealRandomAccessibleRealInterval<out
        RealType<*>>.gt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that.type is IntegerType -> (this as
                RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.integerLong > s2.integerLong) }
        else -> convert(that, BoolType()) { s1, s2, t -> t.set(s1.realDouble > s2.realDouble) }
    }
}

infix fun RealRandomAccessibleRealInterval<out
        RealType<*>>.lt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that.type is IntegerType -> (this as
                RealRandomAccessibleRealInterval<IntegerType<*>>).convert(that as RealRandomAccessibleRealInterval<IntegerType<*>>, BoolType()) { s1, s2, t -> t.set(s1.integerLong < s2.integerLong) }
        else -> convert(that, BoolType()) { s1, s2, t -> t.set(s1.realDouble < s2.realDouble) }
    }
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.eq(that: RealType<*>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that is IntegerType -> (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s, t -> t.set(s.integerLong == that.integerLong) }
        else -> convert(BoolType()) { s, t -> t.set(s.realDouble == that.realDouble) }
    }
}

infix fun RealType<*>.eq(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that eq this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.eq(that: Number):
        RealRandomAccessibleRealInterval<BoolType> {
    return this eq that.asType()
}

infix fun Number.eq(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that eq this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.ge(that: RealType<*>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that is IntegerType -> (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s, t -> t.set(s.integerLong >= that.integerLong) }
        else -> convert(BoolType()) { s, t -> t.set(s.realDouble >= that.realDouble) }
    }
}

infix fun RealType<*>.ge(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that le this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.ge(that: Number):
        RealRandomAccessibleRealInterval<BoolType> {
    return this ge that.asType()
}

infix fun Number.ge(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that le this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.le(that: RealType<*>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that is IntegerType -> (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s, t -> t.set(s.integerLong <= that.integerLong) }
        else -> convert(BoolType()) { s, t -> t.set(s.realDouble <= that.realDouble) }
    }
}

infix fun RealType<*>.le(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that ge this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.le(that: Number):
        RealRandomAccessibleRealInterval<BoolType> {
    return this le that.asType()
}

infix fun Number.le(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that ge this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.gt(that: RealType<*>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that is IntegerType -> (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s, t -> t.set(s.integerLong > that.integerLong) }
        else -> convert(BoolType()) { s, t -> t.set(s.realDouble > that.realDouble) }
    }
}

infix fun RealType<*>.gt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that lt this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.gt(that: Number):
        RealRandomAccessibleRealInterval<BoolType> {
    return this gt that.asType()
}

infix fun Number.gt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that lt this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.lt(that: RealType<*>):
        RealRandomAccessibleRealInterval<BoolType> {
    return when {
        this.type is IntegerType && that is IntegerType -> (this as RealRandomAccessibleRealInterval<IntegerType<*>>).convert(BoolType()) { s, t -> t.set(s.integerLong < that.integerLong) }
        else -> convert(BoolType()) { s, t -> t.set(s.realDouble < that.realDouble) }
    }
}

infix fun RealType<*>.lt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that gt this
}

infix fun RealRandomAccessibleRealInterval<out RealType<*>>.lt(that: Number):
        RealRandomAccessibleRealInterval<BoolType> {
    return this lt that.asType()
}

infix fun Number.lt(that: RealRandomAccessibleRealInterval<out RealType<*>>):
        RealRandomAccessibleRealInterval<BoolType> {
    return that gt this
}

fun <T : Type<T>> RealRandomAccessibleRealInterval<out
        BooleanType<*>>.choose(chooseOnTrue: RealRandomAccessibleRealInterval<T>,
        chooseOnFalse: RealRandomAccessibleRealInterval<T>): RealRandomAccessibleRealInterval<T> {
    return TriConverter.convert(this, chooseOnTrue, chooseOnFalse, { chooseOnTrue.type.createVariable() }) { a: BooleanType<*>, b: T, c: T, t: T ->
            t.set(if (a.get()) b else c) } 
}

fun <T : Type<T>> RealRandomAccessibleRealInterval<out BooleanType<*>>.choose(chooseOnTrue: T,
        chooseOnFalse: T): RealRandomAccessibleRealInterval<T> {
    return this.choose(chooseOnTrue.constant(this), chooseOnFalse.constant(this))
}
