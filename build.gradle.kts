plugins {
    kotlin("jvm") version "1.3.72"

    // add support for building CLI application
    application

    // publish to maven (only local repo for now)
    `maven-publish`
}

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

publishing {
    publications {
        create<MavenPublication>("maven") { from(components["kotlin"]) }
    }
}
