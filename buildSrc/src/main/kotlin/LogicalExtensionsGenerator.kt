import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.jvm.jvmName
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.IntegerType
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

private fun typeCombinationsFor(comparison: Comparison) = mutableListOf<Triple<KClass<*>, KClass<*>, String>>().also {
    val codeBlockBuilder = CodeBlock.builder()
    for ((t1, id1) in arithmeticTypes) {
        val t1IsIntegerType = id1 == identifiers.unsignedInteger || id1 == identifiers.signedInteger
        for ((t2, id2) in arithmeticTypes) {
            val t2IsIntegerType = id2 == identifiers.unsignedInteger || id2 == identifiers.signedInteger
            val converterBody = if (t1 == t2) {
                "s ${comparison.operatorName} that"
            } else {
                if (t1IsIntegerType && t2IsIntegerType)
                    "s.integerLong ${comparison.operatorName} that.integerLong"
                else
                    "s.realDouble ${comparison.operatorName} that.realDouble"
            }
            codeBlockBuilder.addStatement("if (this.type is %T && that is %T) return (this as %T).convert(%T) { s, t -> t.set($converterBody) }", t1, t2, t1, boolTypeClass)
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
            .addStatement("throw·Exception(\"Comparison·operators·not·supported·for·combination·of·voxel·types:·(\$t1,·\$t2)\")")
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

    fun typeCombinations(): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()
        for ((t1, id1) in arithmeticTypes) {
            val t1IsIntegerType = id1 == identifiers.unsignedInteger || id1 == identifiers.signedInteger
            for ((t2, id2) in arithmeticTypes) {
                val t2IsIntegerType = id2 == identifiers.unsignedInteger || id2 == identifiers.signedInteger
                val converterBody = if (t1 == t2) {
                    "s·${comparison.operatorName}·that"
                } else {
                    if (t1IsIntegerType && t2IsIntegerType)
                        "s.integerLong·${comparison.operatorName}·that.integerLong"
                    else
                        "s.realDouble·${comparison.operatorName}·that.realDouble"
                }
                codeBlockBuilder.addStatement("if (this.type is %T && that is %T) return·(this·as·%T).convert(%T())·{·s,·t·->·t.set($converterBody)·}", t1, t2, container.parameterizedBy(t1.asTypeName()), boolTypeClass)
            }
        }
        codeBlockBuilder.addStatement("throw·Exception(\"Comparison·operators·not·supported·for·combination·of·voxel·types:·(\${this.type},·\$that)\")")
        return codeBlockBuilder.build()
    }

    val realTypeStar = RealType::class.asTypeName().parameterizedBy(STAR)
    val producerOfRealTypeStar = WildcardTypeName.producerOf(realTypeStar)

    val funSpecScalar = FunSpec
            .builder(comparison.infixName)
            .addModifiers(KModifier.INFIX)
            .receiver(container.parameterizedBy(producerOfRealTypeStar))
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", realTypeStar)
            .addCode(typeCombinations())
            .build()
    val funSpecScalarReverse = FunSpec
            .builder(comparison.infixName)
            .addModifiers(KModifier.INFIX)
            .receiver(realTypeStar)
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", container.parameterizedBy(producerOfRealTypeStar))
            .addStatement("return·that·${comparison.reverse.infixName}·this")
            .build()
    val funSpecScalarPrimitive = FunSpec
            .builder(comparison.infixName)
            .addModifiers(KModifier.INFIX)
            .receiver(container.parameterizedBy(producerOfRealTypeStar))
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", Number::class)
            .addStatement("return·this·${comparison.infixName}·that.asType()")
            .build()
    val funSpecScalarPrimitiveReverse = FunSpec
            .builder(comparison.infixName)
            .addModifiers(KModifier.INFIX)
            .receiver(Number::class)
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", container.parameterizedBy(producerOfRealTypeStar))
            .addStatement("return·that·${comparison.reverse.infixName}·this")
            .build()

    return this
            .addFunction(funSpecScalar)
            .addFunction(funSpecScalarReverse)
            .addFunction(funSpecScalarPrimitive)
            .addFunction(funSpecScalarPrimitiveReverse)

//    fun FileSpec.Builder.addComparisonWithScalar(
//            jvmName: String,
//            t1: TypeName,
//            t2: TypeName = t1,
//            typeVariableName1: TypeVariableName? = null,
//            typeVariableName2: TypeVariableName? = null,
//            s1get: String = "",
//            s2get: String = s1get,
//            returnStatement: String = "return·this.convert(%T())·{·s,·t·->·t.set(s$s1get·${comparison.operatorName}·that$s2get)·}"
//    ): FileSpec.Builder {
//        val infixFuncContainerScalar = FunSpec
//                .builder(comparison.infixName)
//                .addModifiers(KModifier.INFIX)
//                .let { b -> typeVariableName1?.let { b.addTypeVariable(it) } ?: b }
//                .let { b -> typeVariableName2?.let { b.addTypeVariable(it) } ?: b }
//                .receiver(container.parameterizedBy(t1))
//                .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
//                .addParameter("that", t2)
//                .addStatement(returnStatement, boolTypeClass)
//                .jvmName(jvmName)
//                .build()
//        val infixFuncScalarContainer = FunSpec
//                .builder(comparison.infixName)
//                .addModifiers(KModifier.INFIX)
//                .let { b -> typeVariableName1?.let { b.addTypeVariable(it) } ?: b }
//                .let { b -> typeVariableName2?.let { b.addTypeVariable(it) } ?: b }
//                .receiver(t2)
//                .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
//                .addParameter("that", container.parameterizedBy(t1))
//                .addStatement("return·that·${comparison.reverse.infixName}·this")
//                .jvmName(jvmName)
//                .build()
//        return this
//                .addFunction(infixFuncContainerScalar)
//                .addFunction(infixFuncScalarContainer)
//    }
//
//    val genericT = TypeVariableName("T")
//    val genericU = TypeVariableName("U")
//    val comparableT = Comparable::class.asTypeName().parameterizedBy(genericT)
//    val tComparable = TypeVariableName("T", comparableT)
//    val realTypeStar = RealType::class.asTypeName().parameterizedBy(STAR)
//    val integerTypeStar = IntegerType::class.asTypeName().parameterizedBy(STAR)
//    val realTypeT = RealType::class.asTypeName().parameterizedBy(genericT)
//    val realTypeU = RealType::class.asTypeName().parameterizedBy(genericU)
//    val integerTypeT = IntegerType::class.asTypeName().parameterizedBy(genericT)
//    val integerTypeU = IntegerType::class.asTypeName().parameterizedBy(genericU)
//    val tRealType = TypeVariableName("T", realTypeT)
//    val uRealType = TypeVariableName("U", realTypeU)
//    val tIntegerType = TypeVariableName("T", integerTypeT)
//    val uIntegerType = TypeVariableName("U", integerTypeU)
//
//    val returnAsType = "return·this·${comparison.infixName}·that.asType()"
//
//    var index = 0
//    return this
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = genericT, typeVariableName1 = tComparable)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = realTypeT, t2 = realTypeU, typeVariableName1 = tRealType, typeVariableName2 = uRealType, s1get = ".realDouble")
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = integerTypeT, t2 = integerTypeU, typeVariableName1 = tIntegerType, typeVariableName2 = uIntegerType, s1get = ".integerLong")
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = realTypeT, t2 = Byte::class.asTypeName(), typeVariableName1 = tRealType, returnStatement = returnAsType)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = realTypeT, t2 = Short::class.asTypeName(), typeVariableName1 = tRealType, returnStatement = returnAsType)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = realTypeT, t2 = Int::class.asTypeName(), typeVariableName1 = tRealType, returnStatement = returnAsType)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = realTypeT, t2 = Long::class.asTypeName(), typeVariableName1 = tRealType, returnStatement = returnAsType)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = realTypeT, t2 = Float::class.asTypeName(), typeVariableName1 = tRealType, returnStatement = returnAsType)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = realTypeT, t2 = Double::class.asTypeName(), typeVariableName1 = tRealType, returnStatement = returnAsType)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = integerTypeT, t2 = Byte::class.asTypeName(), typeVariableName1 = tIntegerType, returnStatement = returnAsType)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = integerTypeT, t2 = Short::class.asTypeName(), typeVariableName1 = tIntegerType, returnStatement = returnAsType)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = integerTypeT, t2 = Int::class.asTypeName(), typeVariableName1 = tIntegerType, returnStatement = returnAsType)
//            .addComparisonWithScalar(jvmName = "comparisonInfix_${comparison.infixName}_${index++}", t1 = integerTypeT, t2 = Long::class.asTypeName(), typeVariableName1 = tIntegerType, returnStatement = returnAsType)

//    val comparableAny = Comparable::class.asTypeName().parameterizedBy(Any::class.asTypeName())
//    val integerType = IntegerType::class.asTypeName().parameterizedBy(STAR)
//    val realType = RealType::class.asTypeName().parameterizedBy(STAR)
//    val containerComparableAny = container.parameterizedBy(comparableAny)
//    val containerComparableIntegerType = container.parameterizedBy(integerType)
//    val containerComparableRealType = container.parameterizedBy(realType)
//    val containerStar = container.parameterizedBy(STAR)
//    val any = Any::class.asTypeName()
//    val codeBlock = CodeBlock
//            .builder()
//            .addStatement("val t1 = this.type")
//            .addStatement("val t2 = that")
//            .addStatement("val jc1 = t1::class.java")
//            .addStatement("val jc2 = t2::class.java")
//            .addStatement("if (t1 is Comparable<*> && t2 is Comparable<*>) {")
//            .addStatement("val t2Comparable = t2 as %T", comparableAny)
//            .addStatement(
//                    "if (jc1.isAssignableFrom(jc2)) return·(this·as·%T).convert(%T())·{·s1,·t·->·t.set(s1·${comparison.operatorName}·t2Comparable)·}",
//                    containerComparableAny,
//                    boolTypeClass)
//            .addStatement(
//                    "if (jc2.isAssignableFrom(jc1)) return·(this·as·%T).convert(%T())·{·s1,·t·->·t.set(t2Comparable·${comparison.reverse.operatorName}·s1)·}",
//                    containerComparableAny,
//                    boolTypeClass)
//            .addStatement("}")
//            .addStatement(
//                    "if (t1 is %T && t2 is %T) return·(this·as·%T).convert(%T())·{·s1,·t·->·t.set(s1.getIntegerLong()·${comparison.operatorName}·t2.getIntegerLong())·}",
//                    integerType,
//                    integerType,
//                    containerComparableIntegerType,
//                    boolTypeClass)
//            .addStatement("if (t1 is %T && t2 is %T) return·(this·as·%T).convert(%T())·{·s1,·t·->·t.set(s1.getRealDouble()·${comparison.operatorName}·t2.getRealDouble())·}",
//                    realType,
//                    realType,
//                    containerComparableRealType,
//                    boolTypeClass)
//            .addStatement("if (t2 is %T) return·this·${comparison.infixName}·t2.asType()", Byte::class)
//            .addStatement("if (t2 is %T) return·this·${comparison.infixName}·t2.asType()", Short::class)
//            .addStatement("if (t2 is %T) return·this·${comparison.infixName}·t2.asType()", Int::class)
//            .addStatement("if (t2 is %T) return·this·${comparison.infixName}·t2.asType()", Long::class)
//            .addStatement("if (t2 is %T) return·this·${comparison.infixName}·t2.asType()", Float::class)
//            .addStatement("if (t2 is %T) return·this·${comparison.infixName}·t2.asType()", Double::class)
//            .addStatement("throw Exception(\"Comparison operators not suported for combination of voxel types: (\$t1, \$t2)\")")
//            .build()
//
//    fun infixFuncBuilder(receiver: TypeName, parameter: TypeName) = FunSpec
//            .builder(comparison.infixName)
//            .addModifiers(KModifier.INFIX)
//            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
//            .receiver(receiver)
//            .addParameter("that", parameter)
//
//    return this
//            .addFunction(infixFuncBuilder(containerStar, any).addCode(codeBlock).build())
//            .addFunction(infixFuncBuilder(any, containerStar).addStatement("return that ${comparison.reverse.infixName} this").build())
}