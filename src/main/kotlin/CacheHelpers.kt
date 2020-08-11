package net.imglib2.imklib

import net.imglib2.RandomAccessibleInterval as RAI
import net.imglib2.cache.LoaderCache
import net.imglib2.cache.img.CachedCellImg
import net.imglib2.cache.img.RandomAccessibleCacheLoader
import net.imglib2.img.basictypeaccess.AccessFlags
import net.imglib2.img.basictypeaccess.array.ArrayDataAccess
import net.imglib2.img.basictypeaccess.array.ByteArray as BA
import net.imglib2.img.basictypeaccess.array.ShortArray as SA
import net.imglib2.img.basictypeaccess.array.IntArray as IA
import net.imglib2.img.basictypeaccess.array.LongArray as LA
import net.imglib2.img.basictypeaccess.array.FloatArray as FA
import net.imglib2.img.basictypeaccess.array.DoubleArray as DA
import net.imglib2.img.basictypeaccess.volatiles.VolatileArrayDataAccess
import net.imglib2.img.basictypeaccess.volatiles.array.*
import net.imglib2.img.cell.Cell
import net.imglib2.img.cell.CellGrid
import net.imglib2.imklib.isZeroMin
import net.imglib2.imklib.plus
import net.imglib2.imklib.type
import net.imglib2.imklib.zeroMin
import net.imglib2.type.NativeType
import net.imglib2.type.numeric.complex.ComplexDoubleType
import net.imglib2.type.numeric.complex.ComplexFloatType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import java.lang.Exception

private fun <T: NativeType<T>, A: ArrayDataAccess<A>, VA: VolatileArrayDataAccess<VA>> createCellImg(
        rai: RAI<T>,
        grid: CellGrid,
        loaderCache: LoaderCache<Long, Cell<VA>>): CachedCellImg<T, VA> {
    require((rai.dimensionsAsLongArray() zip grid.imgDimensions).all { it.first == it.second })
    val loader = RandomAccessibleCacheLoader.get<T, A, VA>(grid, rai, AccessFlags.setOf(AccessFlags.VOLATILE))
    // TODO can we do this without creating the cell at 0? RandomAccessibleCacheLoader could expose its creator
    return CachedCellImg<T, VA>(grid, rai.type, loaderCache.withLoader(loader), loader[0].data)
}

fun <T: NativeType<T>> cacheRAI(
        rai: RAI<T>,
        blockSize: IntArray,
        loaderCache: LoaderCache<Long, Cell<VolatileArrayDataAccess<*>>>): RAI<T> {
    require(blockSize.size == rai.nDim || blockSize.size == 1)
    val blockSize = if (blockSize.size == rai.nDim) blockSize else IntArray(rai.nDim) { blockSize[0] }
    val grid = CellGrid(rai.dimensionsAsLongArray(), blockSize)
    val cached = when (rai.type) {
        is ByteType -> createCellImg<ByteType, BA, VolatileByteArray>(rai.zeroMin as RAI<ByteType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileByteArray>>)
        is ShortType -> createCellImg<ShortType, SA, VolatileShortArray>(rai.zeroMin as RAI<ShortType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileShortArray>>)
        is IntType -> createCellImg<IntType, IA, VolatileIntArray>(rai.zeroMin as RAI<IntType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileIntArray>>)
        is LongType -> createCellImg<LongType, LA, VolatileLongArray>(rai.zeroMin as RAI<LongType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileLongArray>>)
        is UnsignedByteType -> createCellImg<ByteType, BA, VolatileByteArray>(rai.zeroMin as RAI<ByteType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileByteArray>>)
        is UnsignedShortType -> createCellImg<ShortType, SA, VolatileShortArray>(rai.zeroMin as RAI<ShortType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileShortArray>>)
        is UnsignedIntType -> createCellImg<IntType, IA, VolatileIntArray>(rai.zeroMin as RAI<IntType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileIntArray>>)
        is UnsignedLongType -> createCellImg<LongType, LA, VolatileLongArray>(rai.zeroMin as RAI<LongType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileLongArray>>)
        is FloatType -> createCellImg<FloatType, FA, VolatileFloatArray>(rai.zeroMin as RAI<FloatType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileFloatArray>>)
        is DoubleType -> createCellImg<DoubleType, DA, VolatileDoubleArray>(rai.zeroMin as RAI<DoubleType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileDoubleArray>>)
        is ComplexFloatType -> createCellImg<FloatType, FA, VolatileFloatArray>(rai.zeroMin as RAI<FloatType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileFloatArray>>)
        is ComplexDoubleType -> createCellImg<DoubleType, DA, VolatileDoubleArray>(rai.zeroMin as RAI<DoubleType>, grid, loaderCache as LoaderCache<Long, Cell<VolatileDoubleArray>>)
        else -> throw Exception("Cannot cache images with type `${rai.type}' (${rai.type::class}).")
    } as RAI<T>
    return if (rai.isZeroMin) cached else (cached + rai.minAsPoint())
}