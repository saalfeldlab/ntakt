import org.gradle.api.tasks.Input
import java.io.File
import java.nio.file.Files

open class GenerateArithmeticExtensionsTask : ExtensionsTask("Arithmetic") {

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        for ((operator, an) in typeFileMapping2) {
            val (`as`, name) = an
            println("generating arithmetic extensions for $`as` ($name)")
            // TODO for some reason, need to create parent directory to build successfully on Windows@appveyor
            // TODO strangely, this does not affect any of the other extension tasks
            Files.createDirectories(name.second.parentFile.toPath())
            println(name)
            Files.write(
                name.second.toPath(),
                generateArithmeticExtensions(`as`, name.first, operator).withHeader.toByteArray())
        }
    }

    private val typeFileMapping2 = arithmetics
        .operatorNames
        .map { getTypeFileMapping("Arithmetic${it.name.capitalize()}").toList().map { m -> it to m } }
        .reduce { acc, map -> acc + map }

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
