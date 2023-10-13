package ntakt

import arithmeticExtensionHelper
import arithmeticExtensions
import arithmeticScalarExtensions
import converterExtensions
import logicalExtensions
import org.gradle.api.DefaultTask
import org.gradle.api.file.Directory
import org.gradle.api.file.ProjectLayout
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import packagePath
import javax.inject.Inject

abstract class GenerateCode : DefaultTask() {

    init {
        group = "build"
        description = "Generate code"
    }

    @get:Inject
    abstract val layout: ProjectLayout

    @get:OutputDirectory
    val targetDir: Directory
        get() = layout.projectDirectory.dir("src/generatedMainKotlin")
    @get:OutputDirectory
    val targetDirJava: Directory
        get() = layout.projectDirectory.dir("src/generatedMainJava")

    @get:Internal
    val license = run {
        val lines = layout.projectDirectory.file("LICENSE").asFile.readLines()
        val postFix = "\n */\n\n// auto-generated, do not modify!\n\n"
        lines.joinToString("\n", "/**\n", postFix) { " * $it" }
    }
    @TaskAction
    fun generate() {

        arithmeticExtensionHelper()
        arithmeticScalarExtensions()
        arithmeticExtensions()
        converterExtensions()
        logicalExtensions()

        addLicense(targetDir)
        addLicense(targetDirJava)
    }

    fun addLicense(dir: Directory) {
        for (file in dir.file(packagePath).asFile.listFiles()!!)
            file.writeText(license + file.readText())
    }
}