import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.type.BooleanType
import net.imglib2.type.Type
import net.imglib2.type.logic.BoolType
import net.imglib2.type.numeric.IntegerType
import net.imglib2.type.numeric.RealType

private val boolTypeClass = BoolType::class
private val booleanTypeWildcard = BooleanType::class.asTypeName().parameterizedBy(STAR)
private val booleantTypeWildcardProducer = WildcardTypeName.producerOf(booleanTypeWildcard)

enum class Comparison(val infixName: String, val operatorName: String, private val reverseId: String? = null) {

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
		.builder("org.ntakt", fileName)
		.indent("    ")
		.addAnnotation(AnnotationSpec.builder(Suppress::class).addMember("%S", "UNCHECKED_CAST").build())
		.addComparisonsWithContainer(container)
		.addComparisonsWithScalar(container)
		.addChoose(container)
    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}
private fun FileSpec.Builder.addComparisonsWithContainer(container: ClassName): FileSpec.Builder = Comparison.values().fold(this) { b, c ->
	b.addComparisonWithContainer(container, c)
}

private fun FileSpec.Builder.addComparisonWithContainer(container: ClassName, comparison: Comparison): FileSpec.Builder {

    val integerTypeName = IntegerType::class.asTypeName()

    fun typeCombinations(): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()
        codeBlockBuilder.addStatement("return·when·{").indent()
        codeBlockBuilder.addStatement(
            "this.type·is·%T·&&·that.type·is·%T·->·(this as %T).convert(that·as·%T,·%T())·{·s1,·s2,·t·->·t.set(s1.integerLong·${comparison.operatorName}·s2.integerLong)·}",
            integerTypeName, integerTypeName, container.parameterizedBy(integerTypeName.parameterizedBy(STAR)), container.parameterizedBy(integerTypeName.parameterizedBy(STAR)), boolTypeClass
        )
        codeBlockBuilder.addStatement(
            "else·->·convert(that,·%T())·{·s1,·s2,·t·->·t.set(s1.realDouble·${comparison.operatorName}·s2.realDouble)·}",
            boolTypeClass
        )
//        for ((t1, id1) in arithmeticTypes) {
//            val t1IsIntegerType = id1 == identifiers.unsignedInteger || id1 == identifiers.signedInteger
//            for ((t2, id2) in arithmeticTypes) {
//                val t2IsIntegerType = id2 == identifiers.unsignedInteger || id2 == identifiers.signedInteger
//                val converterBody = if (t1 == t2) {
//                    "s1·${comparison.operatorName}·s2"
//                } else {
//                    if (t1IsIntegerType && t2IsIntegerType)
//                        "s1.integerLong·${comparison.operatorName}·s2.integerLong"
//                    else
//                        "s1.realDouble·${comparison.operatorName}·s2.realDouble"
//                }
//                codeBlockBuilder.addStatement(
//                        "this.type·is·%T·&&·that.type·is·%T·->·this.asType(%T()).convert(that.asType(%T()),·%T())·{·s1,·s2,·t·->·t.set($converterBody)·}",
//                        t1, t2, t1, t2, boolTypeClass)
//            }
//        }
//        codeBlockBuilder.addStatement("else·->·throw·Exception(\"Comparison·operators·not·supported·for·combination·of·voxel·types:·(\${this.type},·\${that.type})\")")
        codeBlockBuilder.unindent().addStatement("}")
        return codeBlockBuilder.build()
    }

    val realTypeStar = RealType::class.asTypeName().parameterizedBy(STAR)
    val producerOfRealTypeStar = WildcardTypeName.producerOf(realTypeStar)

    val funSpec = FunSpec
            .builder(comparison.infixName)
            .addModifiers(KModifier.INFIX)
            .receiver(container.parameterizedBy(producerOfRealTypeStar))
            .returns(container.parameterizedBy(boolTypeClass.asTypeName()))
            .addParameter("that", container.parameterizedBy(producerOfRealTypeStar))
            .addCode(typeCombinations())
            .build()

    return this
            .addFunction(funSpec)
}

private fun FileSpec.Builder.addComparisonsWithScalar(container: ClassName): FileSpec.Builder = Comparison.values().fold(this) { b, c ->
	b.addComparisonWithScalar(container, c)
}

private fun FileSpec.Builder.addComparisonWithScalar(container: ClassName, comparison: Comparison): FileSpec.Builder {

    val integerTypeName = IntegerType::class.asTypeName()

    fun typeCombinations(): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()
        codeBlockBuilder.addStatement("return·when·{").indent()
        codeBlockBuilder.addStatement(
            "this.type·is·%T·&&·that·is·%T·->·(this·as·%T).convert(%T())·{·s,·t·->·t.set(s.integerLong·${comparison.operatorName}·that.integerLong)·}",
            integerTypeName, integerTypeName, container.parameterizedBy(integerTypeName.parameterizedBy(STAR)), boolTypeClass
        )
        codeBlockBuilder.addStatement(
            "else·->·convert(%T())·{·s,·t·->·t.set(s.realDouble·${comparison.operatorName}·that.realDouble)·}",
            boolTypeClass
        )
//        for ((t1, id1) in arithmeticTypes) {
//            val t1IsIntegerType = id1 == identifiers.unsignedInteger || id1 == identifiers.signedInteger
//            for ((t2, id2) in arithmeticTypes) {
//                val t2IsIntegerType = id2 == identifiers.unsignedInteger || id2 == identifiers.signedInteger
//                val converterBody = if (t1 == t2) {
//                    "s·${comparison.operatorName}·that"
//                } else {
//                    if (t1IsIntegerType && t2IsIntegerType)
//                        "s.integerLong·${comparison.operatorName}·that.integerLong"
//                    else
//                        "s.realDouble·${comparison.operatorName}·that.realDouble"
//                }
//                codeBlockBuilder.addStatement(
//                        "this.type·is·%T·&&·that·is·%T·->·this.asType(%T()).convert(%T())·{·s,·t·->·t.set($converterBody)·}",
//                        t1, t2, t1, boolTypeClass)
//            }
//        }
//        codeBlockBuilder.addStatement("else·->·throw·Exception(\"Comparison·operators·not·supported·for·combination·of·voxel·types:·(\${this.type},·\$that)\")")
        codeBlockBuilder.unindent().addStatement("}")
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
}

fun FileSpec.Builder.addChoose(container: ClassName): FileSpec.Builder {
    val genericT = TypeVariableName("T")
    val typeOfT = Type::class.asTypeName().parameterizedBy(genericT)
    val boundedT = TypeVariableName("T", typeOfT)
    val parameterizedContainer = container.parameterizedBy(genericT)
    addImport("org.ntakt.converter", "TriConverter")
    val funSpecContainerContainer = FunSpec
            .builder("choose")
            .receiver(container.parameterizedBy(booleantTypeWildcardProducer))
            .addParameter("chooseOnTrue", parameterizedContainer)
            .addParameter("chooseOnFalse", parameterizedContainer)
            .addTypeVariable(boundedT)
            .returns(parameterizedContainer)
            .addStatement("return·TriConverter.convert(this,·chooseOnTrue,·chooseOnFalse,·{·chooseOnTrue.type.createVariable()·})·{·a:·%T,·b:·T,·c:·T,·t:·T·-> t.set(if·(a.get())·b·else·c)·} ", booleanTypeWildcard)
            .build()
    val funSpecConstantConstant = FunSpec
            .builder("choose")
            .receiver(container.parameterizedBy(booleantTypeWildcardProducer))
            .addParameter("chooseOnTrue", genericT)
            .addParameter("chooseOnFalse", genericT)
            .addTypeVariable(boundedT)
            .returns(parameterizedContainer)
            .addStatement("return·this.choose(chooseOnTrue.constant(this), chooseOnFalse.constant(this))")
            .build()
    return this
            .addFunction(funSpecContainerContainer)
            .addFunction(funSpecConstantConstant)
}