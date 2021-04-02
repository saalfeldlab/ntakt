import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.*
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub
import org.gradle.api.tasks.OutputFile
import java.io.File
import kotlin.reflect.KClass

val packageName = "org.ntakt"

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

val primitiveTypes = arrayOf(
        Byte::class,
        Short::class,
        Int::class,
        Long::class,
        Float::class,
        Double::class
)

val outputDir = File("src/main/kotlin")

val containers = mapOf(
        "RA" to RandomAccessible::class.asTypeName(),
        "RAI" to RandomAccessibleInterval::class.asTypeName(),
        "RRA" to RealRandomAccessible::class.asTypeName(),
        "RRARI" to RealRandomAccessibleRealInterval::class.asTypeName()
//        "II" to IterableInterval::class.asTypeName())
)

val extensionTypes = arrayOf(
        "RandomAccessible",
        "RandomAccessibleInterval",
        "RealRandomAccessible",
        "RealRandomAccessibleRealInterval"
//        "IterableInterval"
)
val extensionTypeToAbbreviationMapping = extensionTypes.associateBy({ it }, { it.filter { it.isUpperCase() } })
val abbreviationToExtensionTypeMapping = extensionTypes.associateBy({ it.filter { it.isUpperCase() } }, { it })

fun getTypeFileMapping(extensionIdentifier: String) = abbreviationToExtensionTypeMapping
        .mapValues { "${it.value}${extensionIdentifier}Extensions" }
        .mapValues { (it.value to outputDir.resolve("${it.value}.kt")) }

object arithmetics {
    data class OperatorName(val name: String, val operatorName: String, val type: KClass<*>)

    val operatorNames = arrayOf(
            OperatorName("plus", "+", Add::class),
            OperatorName("minus", "-", Sub::class),
            OperatorName("times", "*", Mul::class),
            OperatorName("div", "/", Div::class))
}

fun TypeVariableName.recursiveGeneric(vararg type: KClass<*>) = recursiveGeneric(*type.map { it.asTypeName() }.toTypedArray())
fun TypeVariableName.recursiveGeneric(vararg type: ClassName) = TypeVariableName(name, type.map { it.parameterizedBy(this) })
fun String.genericAndBounded(vararg type: KClass<*>) = genericAndBounded(*type.map { it.asTypeName() }.toTypedArray())
fun String.genericAndBounded(vararg type: ClassName) = TypeVariableName(this).let { it to it.recursiveGeneric(*type) }

fun typedFuncSpecBuilder(name: String, receiver: TypeName, vararg typeVariable: TypeVariableName)
        = FunSpec.builder(name).receiver(receiver).addTypeVariables(typeVariable.map { it })