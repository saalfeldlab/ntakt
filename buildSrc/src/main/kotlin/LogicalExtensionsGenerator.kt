import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.type.Type
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import java.lang.Integer.max
import kotlin.reflect.KClass

private val signedIntegers = arithmeticTypes.filter { it.second == identifiers.signedInteger }.map { it.first }
private val unsignedIntegers = arithmeticTypes.filter { it.second == identifiers.unsignedInteger }.map { it.first }
private val boolTypeClass = BoolType::class

private val arithmeticTypeCombinations = mutableListOf<Triple<KClass<*>, KClass<*>, KClass<*>>>().also {
    for (i in arithmeticTypes.indices) {
        val (kc1, c1) = arithmeticTypes[i]
        for (k in i + 1 until arithmeticTypes.size) {
            val (kc2, c2) = arithmeticTypes[k]
            val o = if (c1 == identifiers.signedInteger && c2 == identifiers.unsignedInteger) {
                val idx1 = signedIntegers.indexOf(kc1)
                val idx2 = unsignedIntegers.indexOf(kc2)
                if (idx1 < idx2) signedIntegers[idx1] else signedIntegers[max(idx2 - 1, 0)]
            } else
                kc1
            it += Triple(kc1, kc2, o)
        }
    }
}

private val comparisons = arrayOf(
        "eq" to "==",
        "ge" to ">=",
        "le" to "<=",
        "gt" to ">",
        "lt" to "<"
)



fun generateLogicalExtensions(`as`: String, fileName: String): String {
    val container = containers[`as`] ?: error("Key `$`as`' not present in $containers")
    val kotlinFile = FileSpec
            .builder("net.imglib2.imklib", fileName)
            .addComparisonsWithContainer(container)
            .addComparisonsWithScalar(container)
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

private fun FileSpec.Builder.addComparisonsWithContainer(container: ClassName) =
        comparisons.fold(this) { b, c -> b.addComparisonWithContainer(container, c.first, c.second) }

private fun FileSpec.Builder.addComparisonWithContainer(container: ClassName, infixName: String, operatorName: String): FileSpec.Builder {
    val genericT = TypeVariableName("T")
    val typeOfT = Comparable::class.asTypeName().parameterizedBy(genericT)
    val boundedT = TypeVariableName("T", typeOfT)
    val parameterizedContainer = container.parameterizedBy(genericT)
    val infixFunc = FunSpec
            .builder(infixName)
            .addModifiers(KModifier.INFIX)
            .addTypeVariable(boundedT)
            .receiver(parameterizedContainer)
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", parameterizedContainer)
            .addStatement("return·this.convert(that, %T())·{·s1,·s2,·t·->·t.set(s1·$operatorName·s2)·}", boolTypeClass)
            .build()
    return this.addFunction(infixFunc)
}

private fun FileSpec.Builder.addComparisonsWithScalar(container: ClassName) =
        comparisons.fold(this) { b, c -> b.addComparisonWithScalar(container, c.first, c.second) }

private fun FileSpec.Builder.addComparisonWithScalar(container: ClassName, infixName: String, operatorName: String): FileSpec.Builder {
    val genericT = TypeVariableName("T")
    val typeOfT = Comparable::class.asTypeName().parameterizedBy(genericT)
    val boundedT = TypeVariableName("T", typeOfT)
    val parameterizedContainer = container.parameterizedBy(genericT)
    val infixFuncContainerScalar = FunSpec
            .builder(infixName)
            .addModifiers(KModifier.INFIX)
            .addTypeVariable(boundedT)
            .receiver(parameterizedContainer)
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", boundedT)
            .addStatement("return·this.convert(%T())·{·s,·t·->·t.set(s·$operatorName·that)·}", boolTypeClass)
            .build()
    val infixFuncScalarContainer = FunSpec
            .builder(infixName)
            .addModifiers(KModifier.INFIX)
            .addTypeVariable(boundedT)
            .receiver(boundedT)
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", parameterizedContainer)
            .addStatement("return·that·$infixName·this")
            .build()
    return this
            .addFunction(infixFuncContainerScalar)
            .addFunction(infixFuncScalarContainer)
}