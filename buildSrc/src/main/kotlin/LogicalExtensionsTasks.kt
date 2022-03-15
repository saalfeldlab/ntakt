import java.nio.file.Files



open class GenerateLogicalExtensionsTask : LogicalExtensionsTask("Logical") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensions(`as`, name.first).withHeader().toByteArray())
        }
    }

    companion object {
        const val name = "generateLogicalExtensions"
    }
}
