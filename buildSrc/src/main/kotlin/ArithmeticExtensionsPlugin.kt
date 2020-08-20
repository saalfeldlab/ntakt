import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.OutputFile
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.invoke
import java.io.File
import java.nio.file.Files

private open class GenerateArithmeticExtensionsTask : DefaultTask() {

    private val outputDir = File("src/main/kotlin")
    private val outputName = "ArithmeticExtensions"
    private val outputFile = outputDir.resolve("$outputName.kt")
    // this annotation has to be on a fun, not a val
    // https://docs.gradle.org/current/userguide/custom_plugins.html#sec:working_with_files_in_custom_tasks_and_plugins
    @OutputFile
    fun getOutputFile () = outputFile

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        println("generating arithmetic extensions")
        Files.write(outputFile.toPath(), generateSource(outputName).toByteArray())
    }

}


class ArithmeticExtensionsPlugin : Plugin<Project> {

    override fun apply(project: Project): Unit = project.run {

        tasks.register(generateArithmeticExtensionsName, GenerateArithmeticExtensionsTask::class.java)
        tasks["compileKotlin"].dependsOn(tasks[generateArithmeticExtensionsName])
    }
}

private const val generateArithmeticExtensionsName = "generateArithmeticExtensions"
private const val deleteArithmeticExtensionsName = "deletearithmeticExtensions"
