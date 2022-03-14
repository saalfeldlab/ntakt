import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import java.io.File
import java.nio.file.Files


open class GenerateArithmeticPlusExtensionsTask : ArithmeticExtensionsTask(arithmetics.Operator.PLUS) {

    @org.gradle.api.tasks.TaskAction
    override fun runTask() = super.runTask()

	@Input
	override var header: String? = null

    companion object {
        const val name = "generateArithmeticPlusExtensions"
    }
}

open class GenerateArithmeticMinusExtensionsTask : ArithmeticExtensionsTask(arithmetics.Operator.MINUS) {

    @org.gradle.api.tasks.TaskAction
    override fun runTask() = super.runTask()

    companion object {
        const val name = "generateArithmeticMinusExtensions"
    }
}

open class GenerateArithmeticTimesExtensionsTask : ArithmeticExtensionsTask(arithmetics.Operator.TIMES) {

    @org.gradle.api.tasks.TaskAction
    override fun runTask() = super.runTask()

    companion object {
        const val name = "generateArithmeticTimesExtensions"
    }
}

open class GenerateArithmeticDivExtensionsTask : ArithmeticExtensionsTask(arithmetics.Operator.DIV) {

    @org.gradle.api.tasks.TaskAction
    override fun runTask() = super.runTask()

    companion object {
        const val name = "generateArithmeticDivExtensions"
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
