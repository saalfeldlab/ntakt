plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://maven.scijava.org/content/groups/public")
}

dependencies {
    // imglib2
    implementation("net.imglib2:imglib2:5.10.0")

    // code generation
    implementation("com.squareup:kotlinpoet:1.6.0")
    implementation("com.squareup:javapoet:1.13.0")
}