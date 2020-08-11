package net.imglib2.imklib

import net.imglib2.Sampler
import net.imglib2.converter.readwrite.SamplerConverter
import net.imglib2.img.basictypeaccess.ByteAccess as BA
import net.imglib2.img.basictypeaccess.ShortAccess as SA
import net.imglib2.img.basictypeaccess.IntAccess as IA
import net.imglib2.img.basictypeaccess.LongAccess as LA
import net.imglib2.img.basictypeaccess.DoubleAccess as DA
import net.imglib2.img.basictypeaccess.FloatAccess as FA
import net.imglib2.type.numeric.ComplexType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import java.lang.Exception

enum class ComplexPart {
    REAL, IMAGINARY;

    fun <R: RealType<R>> converter(r: R) = ComplexTypeRealTypeConverter(r, this)
}

class ComplexTypeRealTypeConverter<R: RealType<R>>(
        private val r: R,
        private val part: ComplexPart) : SamplerConverter<ComplexType<*>, R> {

    override fun convert(sampler: Sampler<out ComplexType<*>>): R {
        val adapter = when (part) {
            ComplexPart.REAL -> RealSamplerDoubleAdapter(sampler)
            ComplexPart.IMAGINARY -> ImaginarySamplerDoubleAdapter(sampler)
        }
        return when(r) {
            is ByteType -> ByteType(ByteAccess(adapter))
            is ShortType -> ShortType(ShortAccess(adapter))
            is IntType -> IntType(IntAccess(adapter))
            is LongType -> LongType(LongAccess(adapter))
            is UnsignedByteType -> UnsignedByteType(ByteAccess(adapter))
            is UnsignedShortType -> UnsignedShortType(ShortAccess(adapter))
            is UnsignedIntType -> UnsignedIntType(IntAccess(adapter))
            is UnsignedLongType -> UnsignedLongType(LongAccess(adapter))
            is FloatType -> FloatType(FloatAccess(adapter))
            is DoubleType -> DoubleType(DoubleAccess(adapter))
            else -> throw Exception("Unsupported type $r")
        } as R
    }

    private interface SamplerDoubleAdapter {
        fun getRealDouble(): Double
        fun setReal(double: Double)
    }

    private class RealSamplerDoubleAdapter(val sampler: Sampler<out ComplexType<*>>): SamplerDoubleAdapter {
        override fun getRealDouble() = sampler.get().getRealDouble()
        override fun setReal(double: Double) = sampler.get().setReal(double)
    }

    private class ImaginarySamplerDoubleAdapter(val sampler: Sampler<out ComplexType<*>>): SamplerDoubleAdapter {
        override fun getRealDouble() = sampler.get().getImaginaryDouble()
        override fun setReal(double: Double) = sampler.get().setImaginary(double)
    }

    private class ByteAccess(private val adapter: SamplerDoubleAdapter) : BA {
        override fun setValue(index: Int, value: Byte) = adapter.setReal(value.toDouble())
        override fun getValue(index: Int) = adapter.getRealDouble().toByte()
    }

    private class ShortAccess(private val adapter: SamplerDoubleAdapter) : SA {
        override fun setValue(index: Int, value: Short) = adapter.setReal(value.toDouble())
        override fun getValue(index: Int) = adapter.getRealDouble().toShort()
    }

    private class IntAccess(private val adapter: SamplerDoubleAdapter) : IA {
        override fun setValue(index: Int, value: Int) = adapter.setReal(value.toDouble())
        override fun getValue(index: Int) = adapter.getRealDouble().toInt()
    }

    private class LongAccess(private val adapter: SamplerDoubleAdapter) : LA {
        override fun setValue(index: Int, value: Long) = adapter.setReal(value.toDouble())
        override fun getValue(index: Int) = adapter.getRealDouble().toLong()
    }

    private class FloatAccess(private val adapter: SamplerDoubleAdapter) : FA {
        override fun setValue(index: Int, value: Float) = adapter.setReal(value.toDouble())
        override fun getValue(index: Int) = adapter.getRealDouble().toFloat()
    }

    private class DoubleAccess(private val adapter: SamplerDoubleAdapter) : DA {
        override fun setValue(index: Int, value: Double) = adapter.setReal(value)
        override fun getValue(index: Int) = adapter.getRealDouble()
    }
}