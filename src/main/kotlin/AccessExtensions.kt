package org.ntakt

import net.imglib2.img.basictypeaccess.*

fun ByteAccess.bytes(vararg dim: Long) = ntakt.bytes(this, *dim)
fun ByteAccess.bytes(vararg dim: Int) = ntakt.bytes(this, *dim)
fun ShortAccess.shorts(vararg dim: Long) = ntakt.shorts(this, *dim)
fun ShortAccess.shorts(vararg dim: Int) = ntakt.shorts(this, *dim)
fun IntAccess.ints(vararg dim: Long) = ntakt.ints(this, *dim)
fun IntAccess.ints(vararg dim: Int) = ntakt.ints(this, *dim)
fun LongAccess.longs(vararg dim: Long) = ntakt.longs(this, *dim)
fun LongAccess.longs(vararg dim: Int) = ntakt.longs(this, *dim)

fun ByteAccess.unsignedBytes(vararg dim: Long) = ntakt.unsignedBytes(this, *dim)
fun ByteAccess.unsignedBytes(vararg dim: Int) = ntakt.unsignedBytes(this, *dim)
fun ShortAccess.unsignedShorts(vararg dim: Long) = ntakt.unsignedShorts(this, *dim)
fun ShortAccess.unsignedShorts(vararg dim: Int) = ntakt.unsignedShorts(this, *dim)
fun IntAccess.unsignedInts(vararg dim: Long) = ntakt.unsignedInts(this, *dim)
fun IntAccess.unsignedInts(vararg dim: Int) = ntakt.unsignedInts(this, *dim)
fun LongAccess.unsignedLongs(vararg dim: Long) = ntakt.unsignedLongs(this, *dim)
fun LongAccess.unsignedLongs(vararg dim: Int) = ntakt.unsignedLongs(this, *dim)

fun FloatAccess.floats(vararg dim: Long) = ntakt.floats(this, *dim)
fun FloatAccess.floats(vararg dim: Int) = ntakt.floats(this, *dim)
fun DoubleAccess.doubles(vararg dim: Long) = ntakt.doubles(this, *dim)
fun DoubleAccess.doubles(vararg dim: Int) = ntakt.doubles(this, *dim)

fun FloatAccess.complexFloats(vararg dim: Long) = ntakt.complexFloats(this, *dim)
fun FloatAccess.complexFloats(vararg dim: Int) = ntakt.complexFloats(this, *dim)
fun DoubleAccess.complexDoubles(vararg dim: Long) = ntakt.complexDoubles(this, *dim)
fun DoubleAccess.complexDoubles(vararg dim: Int) = ntakt.complexDoubles(this, *dim)