import java.nio.file.Files

open class GenerateLogicalExtensionsTaskContainerEQ : LogicalExtensionsTask("LogicalContainer${Comparison.EQ.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.EQ).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.EQ.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskContainerGE : LogicalExtensionsTask("LogicalContainer${Comparison.GE.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.GE).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.GE.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskContainerLE : LogicalExtensionsTask("LogicalContainer${Comparison.LE.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.LE).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.LE.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskContainerGT : LogicalExtensionsTask("LogicalContainer${Comparison.GT.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.GT).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.GT.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskContainerLT : LogicalExtensionsTask("LogicalContainer${Comparison.LT.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsContainer(`as`, name.first, Comparison.LT).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsContainer${Comparison.LT.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarEQ : LogicalExtensionsTask("LogicalScalar${Comparison.EQ.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.EQ).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.EQ.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarGE : LogicalExtensionsTask("LogicalScalar${Comparison.GE.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.GE).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.GE.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarLE : LogicalExtensionsTask("LogicalScalar${Comparison.LE.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.LE).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.LE.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarGT : LogicalExtensionsTask("LogicalScalar${Comparison.GT.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.GT).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.GT.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskScalarLT : LogicalExtensionsTask("LogicalScalar${Comparison.LT.infixName.capitalize()}") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsScalar(`as`, name.first, Comparison.LT).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsScalar${Comparison.LT.infixName.toUpperCase()}"
    }
}

open class GenerateLogicalExtensionsTaskChoose : LogicalExtensionsTask("LogicalChoose") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating logical extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(name.second.toPath(), generateLogicalExtensionsChoose(`as`, name.first).withHeader().toByteArray())
        }
    }

    companion object {
        val name = "generateLogicalExtensionsChoose"
    }
}