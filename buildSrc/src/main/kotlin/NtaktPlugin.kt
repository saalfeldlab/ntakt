import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.internal.AbstractTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskContainer
import org.gradle.kotlin.dsl.get
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

abstract class NtaktPlugin(
    private val generateAllName: String,
    private val pluginClass: Class<out Task>,
    vararg val pluginTasks: Pair<String, Class<out Task>>
) : Plugin<Project> {
    val licenseFilePath = Paths.get("LICENSE")
    var licenseString: String? = if (Files.exists(licenseFilePath)) Files.readAllLines(licenseFilePath).joinToString("\n") else null
    val licenseCommented = licenseString
        ?.split("\n")
        ?.joinToString("\n") { if (it.isEmpty()) " *" else " * $it" }
        ?.let { "/**\n$it\n */" }
        ?: error("No license file found at `$licenseFilePath'.")
    val headerString = listOfNotNull(licenseCommented, "// auto-generated, do not modify!\n\n").joinToString("\n\n")

    override fun apply(project: Project): Unit = project.run {
        tasks.register(generateAllName, pluginClass)
        tasks["compileKotlin"].dependsOn(tasks[generateAllName])
        pluginTasks.forEach { (name, clazz) -> tasks.registerExtension(name, clazz) }
    }

    private fun <T: Task> TaskContainer.registerExtension(name: String, type: Class<T>) {
        register(name, type)
        this[generateAllName].dependsOn(this[name])
        this[name].let { it as? WithHeader }?.let { it.header = headerString }
    }

}

abstract class GenerateAllExtensionsBase(group: String): DefaultTask() {

    init {
        this.group = group
    }

}

interface WithHeader {
    var header: String?
    fun String.withHeader() = "${header ?: ""}${this}"
}

abstract class NtaktExtensionsTask(group: String) : DefaultTask(), WithHeader {

	init {
        this.group = group
    }

	@Input
	override var header: String? = null
}