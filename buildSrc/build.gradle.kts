plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("core-extensions-plugin") {
            id = "core-extensions"
            implementationClass = "CoreExtensionsPlugin"
        }
        register("logical-extensions-plugin") {
            id = "logical-extensions"
            implementationClass = "LogicalExtensionsPlugin"
        }
        register("arithmetic-extensions-plugin") {
            id = "arithmetic-extensions"
            implementationClass = "ArithmeticExtensionsPlugin"
        }
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.scijava.org/content/groups/public") }
}

dependencies {
    // imglib2
    implementation("net.imglib2:imglib2:5.10.0")

    // code generation
    implementation("com.squareup:kotlinpoet:1.6.0")
    implementation("com.squareup:javapoet:1.13.0")
}