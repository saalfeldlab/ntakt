import java.nio.file.Files

open class GenerateArithmeticExtensionsTask : ExtensionsTask("Arithmetic") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating arithmetic extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateArithmeticExtensions(`as`, name.first).withHeader.toByteArray())
        }
    }

    companion object {
        const val name = "generateArithmeticExtensions"
    }

}

open class GenerateArithmeticScalarExtensionsTask : ExtensionsTask("ArithmeticScalar") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating arithmetic scalar extensions for $`as` ($name)")
            Files.write(name.second.toPath(), generateArithmeticScalarExtensions(`as`, name.first).withHeader.toByteArray())
        }
    }

    companion object {
        const val name = "generateArithmeticScalarExtensions"
    }

}
