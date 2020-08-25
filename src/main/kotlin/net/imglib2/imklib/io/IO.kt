package net.imglib2.imklib.net.imglib2.imklib.io

import io.scif.SCIFIO
import io.scif.img.ImgOpener
import net.imglib2.img.Img
import net.imglib2.type.NativeType
import net.imglib2.type.numeric.RealType

object io {
    fun <T> open(source: String, type: T) where T: RealType<T>, T: NativeType<T> = ImgOpener(defaultScifio.context).openImgs(source, type)[0].img
    fun open(source: String): Img<out RealType<*>> = ImgOpener(defaultScifio.context).openImgs(source)[0].img as Img<out RealType<*>>

    private lateinit var _defaultScifio: SCIFIO
    private val defaultScifio: SCIFIO
        get() {
            if (!this::_defaultScifio.isInitialized)
                _defaultScifio = SCIFIO()
            return _defaultScifio
        }
}