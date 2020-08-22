plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("arighmetic-extensions-plugin") {
            id = "arithmetic-extensions"
            implementationClass = "ArithmeticExtensionsPlugin"
        }
        register("converter-extensions-plugin") {
            id = "converter-extensions"
            implementationClass = "ConverterExtensionsPlugin"
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
}