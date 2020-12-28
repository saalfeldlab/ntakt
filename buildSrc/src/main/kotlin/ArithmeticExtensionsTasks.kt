import java.nio.file.Files

private val operatorMap = arithmetics.operatorNames.map { it.name to it }.toMap()

open class GenerateArithmeticPlusExtensionsTask : ExtensionsTask("ArithmeticPlus") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating arithmetic plus extensions for $`as` ($name)")
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(
                name.second.toPath(),
                generateArithmeticExtensions(`as`, name.first, operatorMap["plus"]!!).withHeader.toByteArray())
        }
    }

    companion object {
        const val name = "generateArithmeticPlusExtensions"
    }
}

open class GenerateArithmeticMinusExtensionsTask : ExtensionsTask("ArithmeticMinus") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating arithmetic minus extensions for $`as` ($name)")
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(
                name.second.toPath(),
                generateArithmeticExtensions(`as`, name.first, operatorMap["minus"]!!).withHeader.toByteArray())
        }
    }

    companion object {
        const val name = "generateArithmeticMinusExtensions"
    }
}

open class GenerateArithmeticTimesExtensionsTask : ExtensionsTask("ArithmeticTimes") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating arithmetic times extensions for $`as` ($name)")
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(
                name.second.toPath(),
                generateArithmeticExtensions(`as`, name.first, operatorMap["times"]!!).withHeader.toByteArray())
        }
    }

    companion object {
        const val name = "generateArithmeticTimesExtensions"
    }
}

open class GenerateArithmeticDivExtensionsTask : ExtensionsTask("ArithmeticDiv") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((`as`, name) in typeFileMapping) {
            println("generating arithmetic plus extensions for $`as` ($name)")
            Files.createDirectories(name.second.parentFile.toPath())
            Files.write(
                name.second.toPath(),
                generateArithmeticExtensions(`as`, name.first, operatorMap["div"]!!).withHeader.toByteArray())
        }
    }

    companion object {
        const val name = "generateArithmeticDivExtensions"
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
