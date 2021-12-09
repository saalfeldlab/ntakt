import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val compileKotlin: KotlinCompile by tasks
val compileTestKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions.jvmTarget = "1.8"
compileTestKotlin.kotlinOptions.jvmTarget = compileKotlin.kotlinOptions.jvmTarget

plugins {
    kotlin("jvm") version "1.4.31"

    // generate documentation
    id("org.jetbrains.dokka") version "1.4.20"

    // add support for building CLI application
    application

    // publish to maven (only local repo for now)
    `maven-publish`

    // code generation
    extensions

    // gradle header plugin
    id("com.github.hierynomus.license") version "0.15.0"

    // code coverage
    jacoco

}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.scijava.org/content/groups/public") }
    mavenLocal()
}

dependencies {
    // kotlin std lib
    implementation(kotlin("stdlib"))

    // ntakt
    api("org.ntakt:ntakt-core:0.1.0-SNAPSHOT")
    api("org.ntakt:ntakt-arithmetic:0.1.0-SNAPSHOT")
    api("org.ntakt:ntakt-logical:0.1.0-SNAPSHOT")

    // imglib2
    api("net.imglib2:imglib2:5.10.0")
    api("net.imglib2:imglib2-realtransform:3.0.0")
    api("net.imglib2:imglib2-cache:1.0.0-beta-14")

    // VolatileViews
    api("sc.fiji:bigdataviewer-vistools:1.0.0-beta-21")

    // n5
    api("org.janelia.saalfeldlab:n5:2.2.1")
    api("org.janelia.saalfeldlab:n5-hdf5:1.1.0")
    api("org.janelia.saalfeldlab:n5-imglib2:3.5.1")

    // code generation
    implementation("com.squareup:kotlinpoet:1.6.0")

    // image io
    implementation("ome:bio-formats_plugins:6.5.0")

    // tests
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
}

application {
    // Define the main class for the application.
     mainClass.set("NtaktExampleKt")
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

tasks.test {
    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
}

tasks.jacocoTestReport {
    dependsOn(tasks.test) // tests are required to run before generating the report
    reports {
        xml.isEnabled = true
        csv.isEnabled = true
        xml.destination = file("${buildDir}/jacoco.xml")
        csv.destination = file("${buildDir}/jacoco.csv")
        html.destination = file("${buildDir}/jacocoHtml")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
            pom {
                name.set("ntakt")
                url.set("https://github.com/saalfeldlab/ntakt")
                inceptionYear.set("2020")
                licenses {
                    license {
                        name.set("Simplified BSD License")
                        distribution.set("repo")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/saalfeldlab/ntakt")
                    developerConnection.set("scm:git:git@github.com:saalfeldlab/ntakt")
                    tag.set("HEAD")
                    url.set("https://github.com/saalfeldlab/ntakt")
                }
                ciManagement {
                    system.set("Travis CI")
                    url.set("https://travis-ci.com/saalfeldlab/ntakt")
                }
                repositories {
                    add(maven("https://maven.scijava.org/content/groups/public"))
                }
                withXml {
                    asNode()
                            .appendNode("repositories")
                            .appendNode("repository").also {
                                it.appendNode("id", "scijava.public")
                                it.appendNode("url", "https://maven.scijava.org/content/groups/public")
                            }
//                            .appendNode("scijava.public", "https://maven.scijava.org/content/groups/public")
                }
            }
        }
    }
}


