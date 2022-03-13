import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.internal.AbstractTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskContainer
import org.gradle.kotlin.dsl.get
import java.io.File
import java.nio.file.Files

class ArithmeticExtensionsPlugin : NtaktPlugin(
    ArithmeticExtensionsTask.generateAllExtensionsName,
    GenerateAllArithmeticExtensions::class.java,
    GenerateArithmeticPlusExtensionsTask.name to GenerateArithmeticPlusExtensionsTask::class.java,
    GenerateArithmeticMinusExtensionsTask.name to GenerateArithmeticMinusExtensionsTask::class.java,
    GenerateArithmeticTimesExtensionsTask.name to GenerateArithmeticTimesExtensionsTask::class.java,
    GenerateArithmeticDivExtensionsTask.name to GenerateArithmeticDivExtensionsTask::class.java,
    GenerateArithmeticExtensionHelperTask.name to GenerateArithmeticExtensionHelperTask::class.java,
    GenerateArithmeticScalarExtensionsTask.name to GenerateArithmeticScalarExtensionsTask::class.java
)

private open class GenerateAllArithmeticExtensions : GenerateAllExtensionsBase(ArithmeticExtensionsTask.group)

open class ExtensionWithHeaderTask(extensionsIdentifier: String) : AbstractTask() {
    @Input
    var header: String? = null

    @Input
    protected val typeFileMapping: Map<String, Pair<String, File>> = getTypeFileMapping(extensionsIdentifier)

    // Why do we need to annotate this? Build fails without this annotation:
    // * What went wrong:
    //Execution failed for task ':buildSrc:validatePlugins'.
    //> Plugin validation failed. See https://docs.gradle.org/6.3/userguide/more_about_tasks.html#sec:task_input_output_annotations for more information on how to annotate task properties.
    //   > Warning: Type 'ExtensionsTask': property 'typeFileMapping' is not annotated with an input or output annotation.
    //   > Warning: Type 'GenerateArithmeticExtensionsTask': property 'typeFileMapping' is not annotated with an input or output annotation.
    //   > Warning: Type 'GenerateConverterExtensionsTask': property 'typeFileMapping' is not annotated with an input or output annotation.
    // this annotation has to be on a fun, not a val
    // https://docs.gradle.org/current/userguide/custom_plugins.html#sec:working_with_files_in_custom_tasks_and_plugins
    @OutputFile
    fun getFileRA() = typeFileMapping["RA"]?.second
    @OutputFile
    fun getFileRAI() = typeFileMapping["RAI"]?.second
    @OutputFile
    fun getJavaFileRA() = getFilePathFor("${typeFileMapping["RA"]?.first}Java")
    @OutputFile
    fun getJavaFileRAI() = getFilePathFor("${typeFileMapping["RAI"]?.first}Java")

    val String.withHeader get() = header?.let { "$it$this" } ?: this
}

open class ArithmeticExtensionsTask(private val operator: arithmetics.Operator) : ExtensionWithHeaderTask("$arithmetic${operator.operation.capitalize()}") {

    init {
        group = Companion.group
    }

    open fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating arithmetic plus extensions for $`as` ($name)")
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(
                name.second.toPath(),
                generateArithmeticExtensions(`as`, name.first, operator).withHeader.toByteArray())
            generateArithmeticExtensionsJava(`as`, "${name.first}Java", operator).writeSourceFile(header)
        }
    }


    companion object {
        const val generateAllExtensionsName = "generateAllArithmeticExtensions"
        const val group = "ntakt extensions"
        private const val arithmetic = "Arithmetic"
    }

}