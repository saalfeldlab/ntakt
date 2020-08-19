import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.OutputFile
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.invoke
import java.io.File
import java.nio.file.Files


class ArithmeticExtensionsPlugin : Plugin<Project> {

    private val outputDir = File("src/main/kotlin")
    private val outputName = "ArithmeticExtensions"
    @OutputFile // TODO for some reason this annotation does not add outputFile to the clean set;
    val outputFile = outputDir.resolve("$outputName.kt")

    override fun apply(project: Project): Unit = project.run {

        tasks {
            register(generateArithmeticExtensionsName) {
                group = "Code Generation"
                description = "Generates arithmetic extension source files."
                doLast { println("Generating arithmetic extensions"); Files.write(outputFile.toPath(), generateSource(outputName).toByteArray()) }
            }
        }
        tasks["compileKotlin"].dependsOn(tasks[generateArithmeticExtensionsName])
    }
}

private const val generateArithmeticExtensionsName = "generateArithmeticExtensions"
private const val deleteArithmeticExtensionsName = "deletearithmeticExtensions"
