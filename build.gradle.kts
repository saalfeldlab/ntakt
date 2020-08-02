plugins {
    kotlin("jvm") version "1.3.72"

    // add support for building CLI application
    application
}

// group = "net.imglib2"
// version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // kotlin std lib
    implementation(kotlin("stdlib"))

    // imglib2
    api("net.imglib2:imglib2:5.10.0")

    // tests
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
}

application {
    // Define the main class for the application.
    mainClassName = "ImkLibExampleKt"
}
