import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.jvm.jvmName
import net.imglib2.RandomAccessibleInterval
import net.imglib2.img.array.ArrayImgs
import net.imglib2.type.Type
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.IntegerType
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
        arrayOf("eq", "==", "=="),
        arrayOf("ge", ">=", "<="),
        arrayOf("le", "<=", ">="),
        arrayOf("gt", ">", "<"),
        arrayOf("lt", "<", ">")
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
        comparisons.fold(this) { b, c -> b.addComparisonWithContainer(container, c[0], c[1], c[2]) }

private fun FileSpec.Builder.addComparisonWithContainer(container: ClassName, infixName: String, operatorName: String, reverseOperatorName: String): FileSpec.Builder {

    val containerComparableAny = container.parameterizedBy(Comparable::class.asTypeName().parameterizedBy(Any::class.asTypeName()))
    val containerComparableIntegerType = container.parameterizedBy(IntegerType::class.asTypeName().parameterizedBy(STAR))
    val containerComparableRealType = container.parameterizedBy(RealType::class.asTypeName().parameterizedBy(STAR))
    val codeBlock = CodeBlock
            .builder()
            .addStatement("val t1 = this.type")
            .addStatement("val t2 = that.type")
            .addStatement("val jc1 = t1::class.java")
            .addStatement("val jc2 = t2::class.java")
            .addStatement("if (this.type is Comparable<*> && that.type is Comparable<*>) {")
            .addStatement(
                    "if (jc1.isAssignableFrom(jc2)) return·(this·as·%T).convert(that·as·%T,·%T())·{·s1,·s2,·t·->·t.set(s1·$operatorName·s2)·}",
                    containerComparableAny,
                    containerComparableAny,
                    boolTypeClass)
            .addStatement(
                    "if (jc2.isAssignableFrom(jc1)) return·(this·as·%T).convert(that·as·%T,·%T())·{·s1,·s2,·t·->·t.set(s2·$reverseOperatorName·s1)·}",
                    containerComparableAny,
                    containerComparableAny,
                    boolTypeClass)
            .addStatement("}")
            .addStatement(
                    "if (t1 is IntegerType<*> && t2 is IntegerType<*>) return·(this·as·%T).convert(that·as·%T,·%T())·{·s1,·s2,·t·->·t.set(s1.getIntegerLong()·$operatorName·s2.getIntegerLong())·}",
                    containerComparableIntegerType,
                    containerComparableIntegerType,
                    boolTypeClass)
            .addStatement(
                    "if (t1 is RealType<*> && t2 is RealType<*>) return·(this·as·%T).convert(that·as·%T,·%T())·{·s1,·s2,·t·->·t.set(s1.getRealDouble()·$operatorName·s2.getRealDouble())·}",
                    containerComparableRealType,
                    containerComparableRealType,
                    boolTypeClass)
            .addStatement("throw Exception(\"Comparison operators not suported for combination of voxel types: (\$t1, \$t2)\")")
            .build()
    val infixFunc = FunSpec
            .builder(infixName)
            .addModifiers(KModifier.INFIX)
            .receiver(container.parameterizedBy(STAR))
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", container.parameterizedBy(STAR))
            .addCode(codeBlock)
            .build()

    return this.addFunction(infixFunc)
}

private fun FileSpec.Builder.addComparisonsWithScalar(container: ClassName) =
        comparisons.fold(this) { b, c -> b.addComparisonWithScalar(container, c[0], c[1]) }

private fun FileSpec.Builder.addComparisonWithScalar(container: ClassName, infixName: String, operatorName: String): FileSpec.Builder {

    fun FileSpec.Builder.addComparisonWithScalar(
            jvmName: String,
            t1: TypeName,
            t2: TypeName = t1,
            typeVariableName: TypeVariableName? = null,
            s1get: String = "",
            s2get: String = s1get
    ): FileSpec.Builder {
        val infixFuncContainerScalar = FunSpec
                .builder(infixName)
                .addModifiers(KModifier.INFIX)
                .let { b -> typeVariableName?.let { b.addTypeVariable(it) } ?: b }
                .receiver(container.parameterizedBy(t1))
                .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
                .addParameter("that", t2)
                .addStatement("return·this.convert(%T())·{·s,·t·->·t.set(s$s1get·$operatorName·that$s2get)·}", boolTypeClass)
                .jvmName(jvmName)
                .build()
        val infixFuncScalarContainer = FunSpec
                .builder(infixName)
                .addModifiers(KModifier.INFIX)
                .let { b -> typeVariableName?.let { b.addTypeVariable(it) } ?: b }
                .receiver(t2)
                .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
                .addParameter("that", container.parameterizedBy(t1))
                .addStatement("return·that·$infixName·this")
                .jvmName(jvmName)
                .build()
        return this
                .addFunction(infixFuncContainerScalar)
                .addFunction(infixFuncScalarContainer)
    }

    val genericT = TypeVariableName("T")
    val typeOfT = Comparable::class.asTypeName().parameterizedBy(genericT)
    val boundedT = TypeVariableName("T", typeOfT)

    return this
            .addComparisonWithScalar(jvmName = "comparisonOperator_${infixName}_1", t1 = genericT, typeVariableName = boundedT)
//            .addComparisonWithScalar(jvmName = "comparisonOperator_${infixName}_2", t1 = RealType::class.asTypeName().parameterizedBy(STAR), s1get = ".getRealDouble()")
//            .addComparisonWithScalar(jvmName = "comparisonOperator_${infixName}_3", t1 = IntegerType::class.asTypeName().parameterizedBy(STAR), s1get = ".getIntegerLong()")
}

fun main() {
val a: Comparable<*> = 1
val b: Comparable<*> = 2
    println((a as Comparable<Any>).compareTo(b as Comparable<Any>))
}