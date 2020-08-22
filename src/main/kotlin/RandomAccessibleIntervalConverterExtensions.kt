package net.imglib2.imklib

import kotlin.Unit
import net.imglib2.converter.BiConverter
import net.imglib2.converter.Converter
import net.imglib2.converter.Converters
import net.imglib2.converter.readwrite.SamplerConverter
import net.imglib2.type.Type
import net.imglib2.RandomAccessibleInterval as RAI

fun <T, U : Type<U>> RAI<T>.convert(u: U, converter: Converter<T, U>) =
    Converters.convert(this, converter, u)

inline fun <T, U : Type<U>> RAI<T>.convert(u: U, crossinline converter: (T, U) -> Unit) =
    convert(u, Converter { a, b -> converter(a, b) })

fun <T, U, V : Type<V>> RAI<T>.convert(
  that: RAI<U>,
  v: V,
  converter: BiConverter<T, U, V>
) = Converters.convert(this, that, converter, v)

inline fun <T, U, V : Type<V>> RAI<T>.convert(
  that: RAI<U>,
  v: V,
  crossinline converter: (
    T,
    U,
    V
  ) -> Unit
) = convert(that, v, BiConverter { a, b, c -> converter(a, b, c) })

fun <T, U : Type<U>> RAI<T>.convert(converter: SamplerConverter<T, U>) =
    Converters.convert(this, converter)
