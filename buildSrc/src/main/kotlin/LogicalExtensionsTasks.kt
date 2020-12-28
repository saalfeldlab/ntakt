import java.nio.file.Files

open class GenerateLogicalExtensionsTaskContainerEQ : ExtensionsTask("LogicalContainer${Comparison.EQ.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.EQ).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.EQ.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskContainerGE : ExtensionsTask("LogicalContainer${Comparison.GE.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.GE).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.GE.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskContainerLE : ExtensionsTask("LogicalContainer${Comparison.LE.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.LE).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.LE.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskContainerGT : ExtensionsTask("LogicalContainer${Comparison.GT.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.GT).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.GT.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskContainerLT : ExtensionsTask("LogicalContainer${Comparison.LT.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.LT).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.LT.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarEQ : ExtensionsTask("LogicalScalar${Comparison.EQ.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.EQ).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.EQ.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarGE : ExtensionsTask("LogicalScalar${Comparison.GE.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.GE).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.GE.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarLE : ExtensionsTask("LogicalScalar${Comparison.LE.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.LE).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.LE.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarGT : ExtensionsTask("LogicalScalar${Comparison.GT.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.GT).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.GT.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarLT : ExtensionsTask("LogicalScalar${Comparison.LT.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.LT).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.LT.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskChoose : ExtensionsTask("LogicalChoose") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsChoose(`as`, name.first).withHeader.toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsChoose"
    }
}