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

private enum class Comparison(val infixName: String, val operatorName: String, private val reverseId: String? = null) {

    EQ("eq", "=="),
    GE("ge", ">=", "LE"),
    LE("le", "<=", "GE"),
    GT("gt", ">", "LT"),
    LT("lt", "<", "GT");

    private lateinit var _reverse: Comparison

    val reverse: Comparison
        get() {
            if (!this::_reverse.isInitialized)
                _reverse = reverseId?.let { valueOf(it) } ?: this
            return _reverse
        }
}



fun generateLogicalExtensions(`as`: String, fileName: String): String {
    val container = containers[`as`] ?: error("Key `$`as`' not present in $containers")
    val kotlinFile = FileSpec
            .builder("net.imglib2.imklib", fileName)
            .addComparisonsWithContainer(container)
            .addComparisonsWithScalar(container)
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

private fun FileSpec.Builder.addComparisonsWithContainer(container: ClassName) =
        Comparison.values().fold(this) { b, c -> b.addComparisonWithContainer(container, c) }

private fun FileSpec.Builder.addComparisonWithContainer(container: ClassName, comparison: Comparison): FileSpec.Builder {

    val containerComparableAny = container.parameterizedBy(Comparable::class.asTypeName().parameterizedBy(Any::class.asTypeName()))
    val containerComparableIntegerType = container.parameterizedBy(IntegerType::class.asTypeName().parameterizedBy(STAR))
    val containerComparableRealType = container.parameterizedBy(RealType::class.asTypeName().parameterizedBy(STAR))
    val codeBlock = CodeBlock
            .builder()
            .addStatement("val t1 = this.type")
            .addStatement("val t2 = that.type")
            .addStatement("val jc1 = t1::class.java")
            .addStatement("val jc2 = t2::class.java")
            .addStatement("if (t1 is Comparable<*> && t1 is Comparable<*>) {")
            .addStatement(
                    "if (jc1.isAssignableFrom(jc2)) return·(this·as·%T).convert(that·as·%T,·%T())·{·s1,·s2,·t·->·t.set(s1·${comparison.operatorName}·s2)·}",
                    containerComparableAny,
                    containerComparableAny,
                    boolTypeClass)
            .addStatement(
                    "if (jc2.isAssignableFrom(jc1)) return·(this·as·%T).convert(that·as·%T,·%T())·{·s1,·s2,·t·->·t.set(s2·${comparison.reverse.operatorName}·s1)·}",
                    containerComparableAny,
                    containerComparableAny,
                    boolTypeClass)
            .addStatement("}")
            .addStatement(
                    "if (t1 is IntegerType<*> && t2 is IntegerType<*>) return·(this·as·%T).convert(that·as·%T,·%T())·{·s1,·s2,·t·->·t.set(s1.getIntegerLong()·${comparison.operatorName}·s2.getIntegerLong())·}",
                    containerComparableIntegerType,
                    containerComparableIntegerType,
                    boolTypeClass)
            .addStatement(
                    "if (t1 is RealType<*> && t2 is RealType<*>) return·(this·as·%T).convert(that·as·%T,·%T())·{·s1,·s2,·t·->·t.set(s1.getRealDouble()·${comparison.operatorName}·s2.getRealDouble())·}",
                    containerComparableRealType,
                    containerComparableRealType,
                    boolTypeClass)
            .addStatement("throw Exception(\"Comparison operators not suported for combination of voxel types: (\$t1, \$t2)\")")
            .build()
    val infixFunc = FunSpec
            .builder(comparison.infixName)
            .addModifiers(KModifier.INFIX)
            .receiver(container.parameterizedBy(STAR))
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", container.parameterizedBy(STAR))
            .addCode(codeBlock)
            .build()

    return this.addFunction(infixFunc)
}

private fun FileSpec.Builder.addComparisonsWithScalar(container: ClassName) =
        Comparison.values().fold(this) { b, c -> b.addComparisonWithScalar(container, c) }

private fun FileSpec.Builder.addComparisonWithScalar(container: ClassName, comparison: Comparison): FileSpec.Builder {
    val comparableAny = Comparable::class.asTypeName().parameterizedBy(Any::class.asTypeName())
    val integerType = IntegerType::class.asTypeName().parameterizedBy(STAR)
    val realType = RealType::class.asTypeName().parameterizedBy(STAR)
    val containerComparableAny = container.parameterizedBy(comparableAny)
    val containerComparableIntegerType = container.parameterizedBy(integerType)
    val containerComparableRealType = container.parameterizedBy(realType)
    val containerStar = container.parameterizedBy(STAR)
    val any = Any::class.asTypeName()
    val codeBlock = CodeBlock
            .builder()
            .addStatement("val t1 = this.type")
            .addStatement("val t2 = that")
            .addStatement("val jc1 = t1::class.java")
            .addStatement("val jc2 = t2::class.java")
            .addStatement("if (t1 is Comparable<*> && t2 is Comparable<*>) {")
            .addStatement("val t2Comparable = t2 as %T", comparableAny)
            .addStatement(
                    "if (jc1.isAssignableFrom(jc2)) return·(this·as·%T).convert(%T())·{·s1,·t·->·t.set(s1·${comparison.operatorName}·t2Comparable)·}",
                    containerComparableAny,
                    boolTypeClass)
            .addStatement(
                    "if (jc2.isAssignableFrom(jc1)) return·(this·as·%T).convert(%T())·{·s1,·t·->·t.set(t2Comparable·${comparison.reverse.operatorName}·s1)·}",
                    containerComparableAny,
                    boolTypeClass)
            .addStatement("}")
            .addStatement(
                    "if (t1 is %T && t2 is %T) return·(this·as·%T).convert(%T())·{·s1,·t·->·t.set(s1.getIntegerLong()·${comparison.operatorName}·t2.getIntegerLong())·}",
                    integerType,
                    integerType,
                    containerComparableIntegerType,
                    boolTypeClass)
            .addStatement("if (t1 is %T && t2 is %T) return·(this·as·%T).convert(%T())·{·s1,·t·->·t.set(s1.getRealDouble()·${comparison.operatorName}·t2.getRealDouble())·}",
                    realType,
                    realType,
                    containerComparableRealType,
                    boolTypeClass)
            .addStatement("throw Exception(\"Comparison operators not suported for combination of voxel types: (\$t1, \$t2)\")")
            .build()

    fun infixFuncBuilder(receiver: TypeName, parameter: TypeName) = FunSpec
            .builder(comparison.infixName)
            .addModifiers(KModifier.INFIX)
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .receiver(receiver)
            .addParameter("that", parameter)

    return this
            .addFunction(infixFuncBuilder(containerStar, any).addCode(codeBlock).build())
            .addFunction(infixFuncBuilder(any, containerStar).addStatement("return that ${comparison.reverse.infixName} this").build())
}