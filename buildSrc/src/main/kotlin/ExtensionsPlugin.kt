import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.internal.AbstractTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskContainer
import org.gradle.kotlin.dsl.get
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

class ExtensionsPlugin : Plugin<Project> {

    private val licenseFilePath = Paths.get("LICENSE")
    private var licenseString: String? = if (Files.exists(licenseFilePath)) Files.readAllLines(licenseFilePath).joinToString("\n") else null
    private val licenseCommented = licenseString
            ?.let { it.split("\n").map { if (it.isEmpty()) " *" else " * $it" }.joinToString("\n") }
            ?.let { "/**\n$it\n */" }
    private val headerString = listOf(licenseCommented, "// auto-generated, do not modify!\n\n").filterNotNull().joinToString("\n\n")


    override fun apply(project: Project): Unit = project.run {
        tasks.register(GenerateAllExtensions.name, GenerateAllExtensions::class.java)
        tasks["compileKotlin"].dependsOn(tasks[GenerateAllExtensions.name])
        tasks.registerExtension(GenerateConverterExtensionsTask.name, GenerateConverterExtensionsTask::class.java)
        tasks.registerExtension(GenerateArithmeticPlusExtensionsTask.name, GenerateArithmeticPlusExtensionsTask::class.java)
        tasks.registerExtension(GenerateArithmeticMinusExtensionsTask.name, GenerateArithmeticMinusExtensionsTask::class.java)
        tasks.registerExtension(GenerateArithmeticTimesExtensionsTask.name, GenerateArithmeticTimesExtensionsTask::class.java)
        tasks.registerExtension(GenerateArithmeticDivExtensionsTask.name, GenerateArithmeticDivExtensionsTask::class.java)
        tasks.registerExtension(GenerateArithmeticExtensionHelperTask.name, GenerateArithmeticExtensionHelperTask::class.java)
        // TODO register class that triggers all arithmetic extensions
        // tasks.registerExtension("generateArithmeticExtensions")
        tasks.registerExtension(GenerateArithmeticScalarExtensionsTask.name, GenerateArithmeticScalarExtensionsTask::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskContainerEQ.name, GenerateLogicalExtensionsTaskContainerEQ::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskContainerGE.name, GenerateLogicalExtensionsTaskContainerGE::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskContainerLE.name, GenerateLogicalExtensionsTaskContainerLE::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskContainerGT.name, GenerateLogicalExtensionsTaskContainerGT::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskContainerLT.name, GenerateLogicalExtensionsTaskContainerLT::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskScalarEQ.name, GenerateLogicalExtensionsTaskScalarEQ::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskScalarGE.name, GenerateLogicalExtensionsTaskScalarGE::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskScalarLE.name, GenerateLogicalExtensionsTaskScalarLE::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskScalarGT.name, GenerateLogicalExtensionsTaskScalarGT::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskScalarLT.name, GenerateLogicalExtensionsTaskScalarLT::class.java)
        tasks.registerExtension(GenerateLogicalExtensionsTaskChoose.name, GenerateLogicalExtensionsTaskChoose::class.java)
    }

    private fun <T: Task> TaskContainer.registerExtension(name: String, type: Class<T>) {
        register(name, type)
        this[GenerateAllExtensions.name].dependsOn(this[name])
        this[name].takeIf { it is ExtensionsTask }?.let { it as ExtensionsTask }?.let { it.header = headerString }
        this[name].takeIf { it is GenerateArithmeticExtensionHelperTask }?.let { it as GenerateArithmeticExtensionHelperTask }?.let { it.header = headerString }
    }
}

private open class GenerateAllExtensions : DefaultTask() {

    init {
        group = ExtensionsTask.group
    }

    companion object {
        const val name = "generateAllExtensions"
    }
}

open class ExtensionsTask(extensionsIdentifier: String) : AbstractTask() {

    init {
        group = Companion.group
    }

    @Input
    var header: String? = null

    // Why do we need to annotate this? Build fails without this annotation:
    // * What went wrong:
    //Execution failed for task ':buildSrc:validatePlugins'.
    //> Plugin validation failed. See https://docs.gradle.org/6.3/userguide/more_about_tasks.html#sec:task_input_output_annotations for more information on how to annotate task properties.
    //   > Warning: Type 'ExtensionsTask': property 'typeFileMapping' is not annotated with an input or output annotation.
    //   > Warning: Type 'GenerateArithmeticExtensionsTask': property 'typeFileMapping' is not annotated with an input or output annotation.
    //   > Warning: Type 'GenerateConverterExtensionsTask': property 'typeFileMapping' is not annotated with an input or output annotation.
    @Input
    protected val typeFileMapping: Map<String, Pair<String, File>> = getTypeFileMapping(extensionsIdentifier)
    // this annotation has to be on a fun, not a val
    // https://docs.gradle.org/current/userguide/custom_plugins.html#sec:working_with_files_in_custom_tasks_and_plugins
    @OutputFile
    fun getFileRA() = typeFileMapping["RA"]?.second
    @OutputFile
    fun getFileRAI() = typeFileMapping["RAI"]?.second

    val String.withHeader get() = header?.let { "$it$this" } ?: this


    companion object {
        const val group = "ImkLib extensions"
    }

}