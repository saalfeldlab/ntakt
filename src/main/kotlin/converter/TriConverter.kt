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
package org.ntakt.converter

import net.imglib2.*
import net.imglib2.RandomAccessible as RA
import net.imglib2.RandomAccessibleInterval as RAI
import net.imglib2.RealRandomAccessible as RRA
import net.imglib2.RealRandomAccessibleRealInterval as RRARI


interface TriConverter<A, B, C, T> {

    fun convert(a: A, b: B, c: C, t: T)

    private class TriConvertedRAI<A, B, C, T>(
            private val sourceA: RAI<A>,
            private val sourceB: RAI<B>,
            private val sourceC: RAI<C>,
            private val t: () -> T,
            private val converter: () -> TriConverter<A, B, C, T>) : RAI<T>, View, Interval by sourceA {

        override fun randomAccess(): RandomAccess<T> = IntegerDomainAccess(
                sourceA.randomAccess(),
                sourceB.randomAccess(),
                sourceC.randomAccess(),
                converter,
                t)

        override fun randomAccess(interval: Interval): RandomAccess<T> = IntegerDomainAccess(
                sourceA.randomAccess(interval),
                sourceB.randomAccess(interval),
                sourceC.randomAccess(interval),
                converter,
                t)
    }

    private class TriConvertedRA<A, B, C, T>(
            private val sourceA: RA<A>,
            private val sourceB: RA<B>,
            private val sourceC: RA<C>,
            private val t: () -> T,
            private val converter: () -> TriConverter<A, B, C, T>) : RA<T>, View, EuclideanSpace by sourceA {

        override fun randomAccess() = IntegerDomainAccess(
                sourceA.randomAccess(),
                sourceB.randomAccess(),
                sourceC.randomAccess(),
                converter,
                t)

        override fun randomAccess(interval: Interval) = IntegerDomainAccess(
                sourceA.randomAccess(interval),
                sourceB.randomAccess(interval),
                sourceC.randomAccess(interval),
                converter,
                t)
    }

    private class TriConvertedRRARI<A, B, C, T>(
            private val sourceA: RRARI<A>,
            private val sourceB: RRARI<B>,
            private val sourceC: RRARI<C>,
            private val t: () -> T,
            private val converter: () -> TriConverter<A, B, C, T>) : RRARI<T>, View, RealInterval by sourceA {

        override fun realRandomAccess(): RealRandomAccess<T> = RealDomainAccess(
                sourceA.realRandomAccess(),
                sourceB.realRandomAccess(),
                sourceC.realRandomAccess(),
                converter,
                t)

        override fun realRandomAccess(interval: RealInterval): RealRandomAccess<T> = RealDomainAccess(
                sourceA.realRandomAccess(interval),
                sourceB.realRandomAccess(interval),
                sourceC.realRandomAccess(interval),
                converter,
                t)
    }

    private class TriConvertedRRA<A, B, C, T>(
            private val sourceA: RRA<A>,
            private val sourceB: RRA<B>,
            private val sourceC: RRA<C>,
            private val t: () -> T,
            private val converter: () -> TriConverter<A, B, C, T>) : RRA<T>, View, EuclideanSpace by sourceA {

        override fun realRandomAccess(): RealRandomAccess<T> = RealDomainAccess(
                sourceA.realRandomAccess(),
                sourceB.realRandomAccess(),
                sourceC.realRandomAccess(),
                converter,
                t)

        override fun realRandomAccess(interval: RealInterval): RealRandomAccess<T> = RealDomainAccess(
                sourceA.realRandomAccess(interval),
                sourceB.realRandomAccess(interval),
                sourceC.realRandomAccess(interval),
                converter,
                t)
    }

    private class IntegerDomainAccess<A, B, C, T> (
            private val sourceA: RandomAccess<A>,
            private val sourceB: RandomAccess<B>,
            private val sourceC: RandomAccess<C>,
            private val makeConverter: () -> TriConverter<A, B, C, T>,
            private val makeT: () -> T) : RandomAccess<T>, Localizable by sourceA {

        private val converter = makeConverter()
        private val t = makeT()


        override fun fwd(d: Int) {
            sourceA.fwd(d)
            sourceB.fwd(d)
            sourceC.fwd(d)
        }

        override fun bck(d: Int) {
            sourceA.bck(d)
            sourceB.bck(d)
            sourceC.bck(d)
        }

        override fun move(distance: Int, d: Int) {
            sourceA.move(distance, d)
            sourceB.move(distance, d)
            sourceC.move(distance, d)
        }

        override fun move(distance: Long, d: Int) {
            sourceA.move(distance, d)
            sourceB.move(distance, d)
            sourceC.move(distance, d)
        }

        override fun move(localizable: Localizable) {
            sourceA.move(localizable)
            sourceB.move(localizable)
            sourceC.move(localizable)
        }

        override fun move(distance: IntArray) {
            sourceA.move(distance)
            sourceB.move(distance)
            sourceC.move(distance)
        }

        override fun move(distance: LongArray) {
            sourceA.move(distance)
            sourceB.move(distance)
            sourceC.move(distance)
        }

        override fun setPosition(localizable: Localizable) {
            sourceA.setPosition(localizable)
            sourceB.setPosition(localizable)
            sourceC.setPosition(localizable)
        }

        override fun setPosition(position: IntArray) {
            sourceA.setPosition(position)
            sourceB.setPosition(position)
            sourceC.setPosition(position)
        }

        override fun setPosition(position: LongArray) {
            sourceA.setPosition(position)
            sourceB.setPosition(position)
            sourceC.setPosition(position)
        }

        override fun setPosition(position: Int, d: Int) {
            sourceA.setPosition(position, d)
            sourceB.setPosition(position, d)
            sourceC.setPosition(position, d)
        }

        override fun setPosition(position: Long, d: Int) {
            sourceA.setPosition(position, d)
            sourceB.setPosition(position, d)
            sourceC.setPosition(position, d)
        }

        override fun get(): T = t.also { converter.convert(sourceA.get(), sourceB.get(), sourceC.get(), it) }

        override fun copyRandomAccess(): RandomAccess<T> = IntegerDomainAccess(sourceA, sourceB, sourceC, makeConverter, makeT)
        override fun copy() = copyRandomAccess()
    }



    private class RealDomainAccess<A, B, C, T> (
            private val sourceA: RealRandomAccess<A>,
            private val sourceB: RealRandomAccess<B>,
            private val sourceC: RealRandomAccess<C>,
            private val makeConverter: () -> TriConverter<A, B, C, T>,
            private val makeT: () -> T) : RealRandomAccess<T>, RealLocalizable by sourceA {

        private val converter = makeConverter()
        private val t = makeT()


        override fun fwd(d: Int) {
            sourceA.fwd(d)
            sourceB.fwd(d)
            sourceC.fwd(d)
        }

        override fun bck(d: Int) {
            sourceA.bck(d)
            sourceB.bck(d)
            sourceC.bck(d)
        }

        override fun move(distance: Int, d: Int) {
            sourceA.move(distance, d)
            sourceB.move(distance, d)
            sourceC.move(distance, d)
        }

        override fun move(distance: Long, d: Int) {
            sourceA.move(distance, d)
            sourceB.move(distance, d)
            sourceC.move(distance, d)
        }

        override fun move(distance: Float, d: Int) {
            sourceA.move(distance, d)
            sourceB.move(distance, d)
            sourceC.move(distance, d)
        }

        override fun move(distance: Double, d: Int) {
            sourceA.move(distance, d)
            sourceB.move(distance, d)
            sourceC.move(distance, d)
        }

        override fun move(localizable: Localizable) {
            sourceA.move(localizable)
            sourceB.move(localizable)
            sourceC.move(localizable)
        }

        override fun move(localizable: RealLocalizable) {
            sourceA.move(localizable)
            sourceB.move(localizable)
            sourceC.move(localizable)
        }

        override fun move(distance: IntArray) {
            sourceA.move(distance)
            sourceB.move(distance)
            sourceC.move(distance)
        }

        override fun move(distance: LongArray) {
            sourceA.move(distance)
            sourceB.move(distance)
            sourceC.move(distance)
        }

        override fun move(distance: FloatArray) {
            sourceA.move(distance)
            sourceB.move(distance)
            sourceC.move(distance)
        }

        override fun move(distance: DoubleArray) {
            sourceA.move(distance)
            sourceB.move(distance)
            sourceC.move(distance)
        }

        override fun setPosition(localizable: Localizable) {
            sourceA.setPosition(localizable)
            sourceB.setPosition(localizable)
            sourceC.setPosition(localizable)
        }

        override fun setPosition(localizable: RealLocalizable) {
            sourceA.setPosition(localizable)
            sourceB.setPosition(localizable)
            sourceC.setPosition(localizable)
        }

        override fun setPosition(position: IntArray) {
            sourceA.setPosition(position)
            sourceB.setPosition(position)
            sourceC.setPosition(position)
        }

        override fun setPosition(position: LongArray) {
            sourceA.setPosition(position)
            sourceB.setPosition(position)
            sourceC.setPosition(position)
        }

        override fun setPosition(position: FloatArray) {
            sourceA.setPosition(position)
            sourceB.setPosition(position)
            sourceC.setPosition(position)
        }

        override fun setPosition(position: DoubleArray) {
            sourceA.setPosition(position)
            sourceB.setPosition(position)
            sourceC.setPosition(position)
        }

        override fun setPosition(position: Int, d: Int) {
            sourceA.setPosition(position, d)
            sourceB.setPosition(position, d)
            sourceC.setPosition(position, d)
        }

        override fun setPosition(position: Long, d: Int) {
            sourceA.setPosition(position, d)
            sourceB.setPosition(position, d)
            sourceC.setPosition(position, d)
        }

        override fun setPosition(position: Float, d: Int) {
            sourceA.setPosition(position, d)
            sourceB.setPosition(position, d)
            sourceC.setPosition(position, d)
        }

        override fun setPosition(position: Double, d: Int) {
            sourceA.setPosition(position, d)
            sourceB.setPosition(position, d)
            sourceC.setPosition(position, d)
        }

        override fun get(): T = t.also { converter.convert(sourceA.get(), sourceB.get(), sourceC.get(), it) }

        override fun copyRealRandomAccess(): RealRandomAccess<T> = RealDomainAccess(sourceA, sourceB, sourceC, makeConverter, makeT)
        override fun copy() = copyRealRandomAccess()
    }

    companion object {
        inline fun <A, B, C, T> asConverter(crossinline converter: (A, B, C, T) -> Unit) = object : TriConverter<A, B, C, T> {
            override fun convert(a: A, b: B, c: C, t: T) = converter(a, b, c, t)
        }

        fun <A, B, C, T> convert(a: RA<A>, b: RA<B>, c: RA<C>, t: () -> T, converter: () -> TriConverter<A, B, C, T>): RA<T> = TriConvertedRA(a, b, c, t, converter)
        fun <A, B, C, T> convert(a: RAI<A>, b: RAI<B>, c: RAI<C>, t: () -> T, converter: () -> TriConverter<A, B, C, T>): RAI<T> = TriConvertedRAI(a, b, c, t, converter)
        fun <A, B, C, T> convert(a: RRA<A>, b: RRA<B>, c: RRA<C>, t: () -> T, converter: () -> TriConverter<A, B, C, T>): RRA<T> = TriConvertedRRA(a, b, c, t, converter)
        fun <A, B, C, T> convert(a: RRARI<A>, b: RRARI<B>, c: RRARI<C>, t: () -> T, converter: () -> TriConverter<A, B, C, T>): RRARI<T> = TriConvertedRRARI(a, b, c, t, converter)

        fun <A, B, C, T> convert(a: RA<A>, b: RA<B>, c: RA<C>, t: () -> T, converter: TriConverter<A, B, C, T>): RA<T> = convert(a, b, c, t) { -> converter }
        fun <A, B, C, T> convert(a: RAI<A>, b: RAI<B>, c: RAI<C>, t: () -> T, converter: TriConverter<A, B, C, T>): RAI<T> = convert(a, b, c, t) { -> converter }
        fun <A, B, C, T> convert(a: RRA<A>, b: RRA<B>, c: RRA<C>, t: () -> T, converter: TriConverter<A, B, C, T>): RRA<T> = convert(a, b, c, t) { -> converter }
        fun <A, B, C, T> convert(a: RRARI<A>, b: RRARI<B>, c: RRARI<C>, t: () -> T, converter: TriConverter<A, B, C, T>): RRARI<T> = convert(a, b, c, t) { -> converter }

        inline fun <A, B, C, T> convert(a: RA<A>, b: RA<B>, c: RA<C>, noinline t: () -> T, crossinline converter: (A, B, C, T) -> Unit): RA<T> = convert(a, b, c, t, asConverter(converter))
        inline fun <A, B, C, T> convert(a: RAI<A>, b: RAI<B>, c: RAI<C>, noinline t: () -> T, crossinline converter: (A, B, C, T) -> Unit): RAI<T> = convert(a, b, c, t, asConverter(converter))
        inline fun <A, B, C, T> convert(a: RRA<A>, b: RRA<B>, c: RRA<C>, noinline t: () -> T, crossinline converter: (A, B, C, T) -> Unit): RRA<T> = convert(a, b, c, t, asConverter(converter))
        inline fun <A, B, C, T> convert(a: RRARI<A>, b: RRARI<B>, c: RRARI<C>, noinline t: () -> T, crossinline converter: (A, B, C, T) -> Unit): RRARI<T> = convert(a, b, c, t, asConverter(converter))
    }
}