import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import java.io.File
import java.nio.file.Files


open class GenerateArithmeticExtensionsTask : ArithmeticExtensionsTask() {

    @org.gradle.api.tasks.TaskAction
    override fun runTask() = super.runTask()

	@Input
	override var header: String? = null

    companion object {
        const val name = "generateArithmeticExtensions"
    }
}

open class GenerateArithmeticScalarExtensionsTask : ExtensionWithHeaderTask("ArithmeticScalar") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in getTypeFileMapping("ArithmeticScalar")) {
            Files.write(name.second.toPath(), generateArithmeticScalarExtensions(`as`, name.first).withHeader().toByteArray())
        }
    }

    companion object {
        const val name = "generateArithmeticScalarExtensions"
    }

}

open class GenerateArithmeticExtensionHelperTask : NtaktExtensionsTask(ArithmeticExtensionsTask.group) {

    @Input
    override var header: String? = null

    @Input
    fun getClassName(): String = "ArtithmeticExtensionsHelper"

    @OutputFile
    fun getOutputFile(): File = outputDir.resolve("${getClassName()}.kt")

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        println("generating arithmetic extensions helper")
        Files.write(getOutputFile().toPath(), makeArithmeticBiConverters(getClassName()).withHeader().toByteArray())
    }

    companion object {
        const val name = "generateArithmeticExtensionHelperTask"
    }

}
