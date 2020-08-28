import org.gradle.api.tasks.OutputFile
import java.nio.file.Files

open class GenerateConverterExtensionsTask : ExtensionsTask("Converter") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating converter extensions for $`as` ($name)")
            Files.write(name.second.toPath(), generateConverterExtensions(`as`, name.first).withHeader.toByteArray())
        }
    }

    companion object {
        const val name = "generateConverterExtensions"
    }

}

