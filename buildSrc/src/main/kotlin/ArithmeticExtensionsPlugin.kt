import java.nio.file.Files

open class GenerateArithmeticExtensionsTask : ExtensionsTask("Arithmetic") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating arithmetic extensions for $`as` ($name)")
            Files.write(name.second.toPath(), generateArithmeticExtensions(`as`, name.first).toByteArray())
        }
    }

    companion object {
        const val name = "generateArithmeticExtensions"
    }

}
