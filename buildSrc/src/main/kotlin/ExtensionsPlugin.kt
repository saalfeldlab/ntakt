import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.internal.AbstractTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskContainer
import org.gradle.kotlin.dsl.get

class ExtensionsPlugin : Plugin<Project> {
    override fun apply(project: Project): Unit = project.run {
        tasks.register(GenerateAllExtensions.name, GenerateAllExtensions::class.java)
        tasks["compileKotlin"].dependsOn(tasks[GenerateAllExtensions.name])
        tasks.registerExtension(GenerateConverterExtensionsTask.name, GenerateConverterExtensionsTask::class.java)
        tasks.registerExtension(GenerateArithmeticExtensionsTask.name, GenerateArithmeticExtensionsTask::class.java)
    }

    private fun <T: Task> TaskContainer.registerExtension(name: String, type: Class<T>) {
        register(name, type)
        this[GenerateAllExtensions.name].dependsOn(this[name])
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

    // Why do we need to annotate this? Build fails without this annotation:
    // * What went wrong:
    //Execution failed for task ':buildSrc:validatePlugins'.
    //> Plugin validation failed. See https://docs.gradle.org/6.3/userguide/more_about_tasks.html#sec:task_input_output_annotations for more information on how to annotate task properties.
    //   > Warning: Type 'ExtensionsTask': property 'typeFileMapping' is not annotated with an input or output annotation.
    //   > Warning: Type 'GenerateArithmeticExtensionsTask': property 'typeFileMapping' is not annotated with an input or output annotation.
    //   > Warning: Type 'GenerateConverterExtensionsTask': property 'typeFileMapping' is not annotated with an input or output annotation.
    @Input
    protected val typeFileMapping = getTypeFileMapping(extensionsIdentifier)
    // this annotation has to be on a fun, not a val
    // https://docs.gradle.org/current/userguide/custom_plugins.html#sec:working_with_files_in_custom_tasks_and_plugins
    @OutputFile
    fun getFileRA() = typeFileMapping["RA"]?.second
    @OutputFile
    fun getFileRAI() = typeFileMapping["RAI"]?.second


    companion object {
        const val group = "ImkLib extensions"
    }

}