import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName

plugins {
    kotlin("jvm") version "1.3.72"

    // add support for building CLI application
    application

    // publish to maven (only local repo for now)
    `maven-publish`
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.scijava.org/content/groups/public") }
}

dependencies {
    // kotlin std lib
    implementation(kotlin("stdlib"))

    // imglib2
    api("net.imglib2:imglib2:5.10.0")
    api("net.imglib2:imglib2-realtransform:3.0.0")
    api("net.imglib2:imglib2-cache:1.0.0-beta-14")

    // code generation
    implementation("com.squareup:kotlinpoet:1.6.0")

    // tests
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
}

application {
    // Define the main class for the application.
     mainClassName = "ImkLibExampleKt"
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("net.imglib2:imglib2:5.10.0")
        classpath("com.squareup:kotlinpoet:1.6.0")
    }
}

open class SourceGenerator : DefaultTask() {

    private val numericTypes = arrayOf(
//        ARGBType::class,
            net.imglib2.type.numeric.integer.ByteType::class,
//        ShortType::class,
//        IntType::class,
//        LongType::class,
//        UnsignedByteType::class,
//        UnsignedShortType::class,
//        UnsignedIntType::class,
//        UnsignedLongType::class,
            net.imglib2.type.numeric.real.FloatType::class,
            net.imglib2.type.numeric.real.DoubleType::class
//        ComplexFloatType::class,
//        ComplexDoubleType::class
    )

    private val numericTypePairs = arrayOf(
//        Triple(ComplexDoubleType::class, ComplexFloatType::class, ComplexDoubleType::class),
//        Triple(ComplexDoubleType::class, RealType::class, ComplexDoubleType::class),
//        Triple(ComplexFloatType::class, RealType::class, ComplexDoubleType::class),
            Triple(net.imglib2.type.numeric.real.DoubleType::class, net.imglib2.type.numeric.real.FloatType::class, net.imglib2.type.numeric.real.DoubleType::class)
//        Triple(DoubleType::class, IntegerType::class, DoubleType::class),
//        Triple(FloatType::class, IntegerType::class, FloatType::class),
//        Triple(LongType::class, IntegerType::class, LongType::class)
    )

    private val names = arrayOf("plus" to "+", "minus" to "-", "times" to "*", "div" to "/")

    private val containers = arrayOf(net.imglib2.RandomAccessible::class) //, RandomAccessibleInterval::class, RealRandomAccessible::class)

    private val outputDir = File("src/main/kotlin")
    private val outputName = "ArithmeticExtensions"
    private val outputFile = outputDir.resolve("$outputName.kt")

    @org.gradle.api.tasks.TaskAction
    fun generateSource() {
        val kotlinFile =  com.squareup.kotlinpoet.FileSpec.builder("net.imglib2.imklib", outputName)
        for (container in containers) {
            for ((name, operator) in names) {
                var index = 0
                for (type in numericTypes)
                    kotlinFile.addFunction(generatePlusSameGenericTypes(name = name, operator = operator, container = container, t = type, jvmName = "${name}_${++index}"))

                for ((t1, t2, o) in numericTypePairs) {
                    kotlinFile.addFunction(generatePlusConverting(name, operator, container, t1, t2, o, false, jvmName = "${name}_${++index}"))
                    kotlinFile.addFunction(generatePlusConverting(name, operator, container, t2, t1, o, true, jvmName = "${name}_${++index}"))
                }
            }
        }
        StringBuilder().let { sb ->
                kotlinFile.build().writeTo(sb)
                outputFile.outputStream().use { it.write(sb.toString().toByteArray()) }
        }
        println("Hello generating code!")
    }

    private fun generatePlusSameGenericTypes(name: String, operator: String, container: kotlin.reflect.KClass<*>, t: kotlin.reflect.KClass<*>, jvmName: String): com.squareup.kotlinpoet.FunSpec {

        return com.squareup.kotlinpoet.FunSpec
                .builder(name)
                .addAnnotation(com.squareup.kotlinpoet.AnnotationSpec.builder(JvmName::class).addMember("name = %S", jvmName).build())
                .addModifiers(com.squareup.kotlinpoet.KModifier.OPERATOR)
                .receiver(container.asTypeName().parameterizedBy(t.asTypeName()))
                .addParameter("that", container.asTypeName().parameterizedBy(t.asTypeName()))
                .returns(container.asTypeName().parameterizedBy(t.asTypeName()))
                .addStatement("return convert(that, ${t.simpleName}()) { t, u, v -> v.set(t); v ${operator}= u }")
                .build()
        //.receiver(accessible::class.asTypeName().tag(t1::class))
    }

    private fun generatePlusConverting(name: String, operator: String, container: kotlin.reflect.KClass<*>, t1: kotlin.reflect.KClass<*>, t2: kotlin.reflect.KClass<*>, o: kotlin.reflect.KClass<*>, isReverse: Boolean, jvmName: String): com.squareup.kotlinpoet.FunSpec {
        val p1 = com.squareup.kotlinpoet.TypeVariableName.invoke(t1.simpleName!!)
        val builder = com.squareup.kotlinpoet.TypeSpec.classBuilder(container.asClassName()).addTypeVariable(p1)

        return com.squareup.kotlinpoet.FunSpec
                .builder(name)
                .addAnnotation(com.squareup.kotlinpoet.AnnotationSpec.builder(JvmName::class).addMember("name = %S", jvmName).build())
                .addModifiers(com.squareup.kotlinpoet.KModifier.OPERATOR)
                .receiver(container.asTypeName().parameterizedBy(t1.asTypeName()))
                .addParameter("that", container.asTypeName().parameterizedBy(t2.asTypeName()))
                .returns(container.asTypeName().parameterizedBy(o.asTypeName()))
                .also { if (isReverse) it.addStatement("return that $operator this") else it.addStatement("return asType(${t1.simpleName}()) $operator that.asType(${t1.simpleName}())")}
                .build()
        //.receiver(accessible::class.asTypeName().tag(t1::class))
    }

}

tasks.register("publishToFiji", Copy::class) {
    dependsOn("jar")
    val fijiAppDir = project.properties["fiji.app.dir"]
    if (fijiAppDir == null)
        println("Fiji app dir not defined. Specify -Pfiji.app.dir=/path/to/Fiji.app")
    else {
        from("build/libs/${project.name}-${project.version}.jar")
        destinationDir = File("$fijiAppDir/jars")
    }
}

tasks.register("generateSource", SourceGenerator::class) {

}

tasks["compileKotlin"].dependsOn(tasks["generateSource"])

publishing {
    publications {
        create<MavenPublication>("maven") { from(components["kotlin"]) }
    }
}
