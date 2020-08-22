import com.squareup.kotlinpoet.asTypeName
import net.imglib2.IterableInterval
import net.imglib2.RandomAccessible
import net.imglib2.RandomAccessibleInterval
import net.imglib2.RealRandomAccessible
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import org.gradle.api.tasks.OutputFile
import java.io.File
import kotlin.reflect.KClass

object identifiers {
    const val complex = "complex"
    const val real = "real"
    const val signedInteger = "signedInteger"
    const val unsignedInteger = "unsignedInteger"
}

val arithmeticTypes = with (identifiers) {
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

val outputDir = File("src/main/kotlin")

val containers = mapOf(
        "RA" to RandomAccessible::class.asTypeName(),
        "RAI" to RandomAccessibleInterval::class.asTypeName(),
        "RRA" to RealRandomAccessible::class.asTypeName(),
        "II" to IterableInterval::class.asTypeName())

val extensionTypes = arrayOf(
        "RandomAccessible",
        "RandomAccessibleInterval"
//        "RealRandomAccessible"
//        "IterableInterval"
)
val extensionTypeToAbbreviationMapping = extensionTypes.associateBy({ it }, { it.filter { it.isUpperCase() } })
val abbreviationToExtensionTypeMapping = extensionTypes.associateBy({ it.filter { it.isUpperCase() } }, { it })

fun getTypeFileMapping(extensionIdentifier: String) = abbreviationToExtensionTypeMapping
        .mapValues { "${it.value}${extensionIdentifier}Extensions" }
        .mapValues { (it.value to outputDir.resolve("${it.value}.kt")) }