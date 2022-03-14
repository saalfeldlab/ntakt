import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import java.io.File

class LogicalExtensionsPlugin : NtaktPlugin(
    LogicalExtensionsTask.generateAllExtensionsName,
    GenerateAllLogicalExtensions::class.java,
    GenerateLogicalExtensionsTaskContainerEQ.name to GenerateLogicalExtensionsTaskContainerEQ::class.java,
    GenerateLogicalExtensionsTaskContainerGE.name to GenerateLogicalExtensionsTaskContainerGE::class.java,
    GenerateLogicalExtensionsTaskContainerLE.name to GenerateLogicalExtensionsTaskContainerLE::class.java,
    GenerateLogicalExtensionsTaskContainerGT.name to GenerateLogicalExtensionsTaskContainerGT::class.java,
    GenerateLogicalExtensionsTaskContainerLT.name to GenerateLogicalExtensionsTaskContainerLT::class.java,
    GenerateLogicalExtensionsTaskScalarEQ.name to GenerateLogicalExtensionsTaskScalarEQ::class.java,
    GenerateLogicalExtensionsTaskScalarGE.name to GenerateLogicalExtensionsTaskScalarGE::class.java,
    GenerateLogicalExtensionsTaskScalarLE.name to GenerateLogicalExtensionsTaskScalarLE::class.java,
    GenerateLogicalExtensionsTaskScalarGT.name to GenerateLogicalExtensionsTaskScalarGT::class.java,
    GenerateLogicalExtensionsTaskScalarLT.name to GenerateLogicalExtensionsTaskScalarLT::class.java,
    GenerateLogicalExtensionsTaskChoose.name to GenerateLogicalExtensionsTaskChoose::class.java
)

private open class GenerateAllLogicalExtensions : GenerateAllExtensionsBase(LogicalExtensionsTask.group)

open class LogicalExtensionsTask(extensionsIdentifier: String) : NtaktExtensionsTask(Companion.group) {

    @Input
    override var header: String? = null

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

    companion object {
        const val generateAllExtensionsName = "generateAllLogicalExtensions"
        const val group = "ntakt logical extensions"
    }

}