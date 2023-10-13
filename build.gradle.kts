import ntakt.GenerateCode

plugins {
    // build time extremely slow with Kotlin 1.5.20+
    embeddedKotlin("jvm") //"1.4.32"

    // generate documentation
    id("org.jetbrains.dokka") version "1.6.10"

    // add support for building CLI application
    application

    // publish to maven (only local repo for now)
    `maven-publish`

    // gradle header plugin
    id("com.github.hierynomus.license") version "0.16.1"

//    `jvm-test-suite`

    // code coverage
    jacoco
}

sourceSets.main {
    java.srcDir("src/generatedMainJava")
    kotlin.srcDir("src/generatedMainKotlin")
}

kotlin.jvmToolchain(8)

//testing.suites {
//    val test by getting(JvmTestSuite::class) { useJUnitJupiter() }
//}

repositories {
    mavenCentral()
    maven("https://maven.scijava.org/content/groups/public")
    mavenLocal()
}

dependencies {
    // kotlin std lib, implicit
    //    implementation(kotlin("stdlib"))

    // imglib2
    api("net.imglib2:imglib2:5.13.0")
    api("net.imglib2:imglib2-realtransform:3.0.0")
    api("net.imglib2:imglib2-cache:1.0.0-beta-14")

    // VolatileViews
    api("sc.fiji:bigdataviewer-vistools:1.0.0-beta-21")

    // n5
    api("org.janelia.saalfeldlab:n5:2.2.1")
    api("org.janelia.saalfeldlab:n5-hdf5:1.1.0")
    api("org.janelia.saalfeldlab:n5-imglib2:3.5.1")

    // image io
    implementation("ome:bio-formats_plugins:6.5.0")

    // tests
    testImplementation(embeddedKotlin("test"))
    testImplementation(embeddedKotlin("test-junit"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

application {
    // Define the main class for the application.
    mainClass = "NtaktExampleKt"
}

tasks {
    register<Copy>("publishToFiji") {
        dependsOn("jar")
        val fijiAppDir = project.properties["fiji.app.dir"]
        if (fijiAppDir == null)
            println("Fiji app dir not defined. Specify -Pfiji.app.dir=/path/to/Fiji.app")
        else {
            from("build/libs/${project.name}-${project.version}.jar")
            destinationDir = File("$fijiAppDir/jars")
        }
    }

    test {
        finalizedBy(jacocoTestReport) // report is always generatedMain after tests run
    }

    jacocoTestReport {
        dependsOn(test) // tests are required to run before generating the report
        reports {
            xml.required = true
            csv.required = true
            xml.outputLocation = file("${layout.buildDirectory}/jacoco.xml")
            csv.outputLocation = file("${layout.buildDirectory}/jacoco.csv")
            html.outputLocation = file("${layout.buildDirectory}/jacocoHtml")
        }
    }

    val generateCode by registering(GenerateCode::class)
    kotlin.sourceSets.main { kotlin.srcDir(generateCode) }
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
                }
            }
        }
    }
}


