#!/usr/bin/env kscript

@file:MavenRepository("scijava", "https://maven.scijava.org/content/groups/public")
@file:DependsOn("net.imglib2:imklib2:0.1.0-SNAPSHOT")

import net.imglib2.imklib.*

val names = imklib.types.realTypes.map { it::class.simpleName!! }
val maxLength = names.map { it.length }.max()!!
val headers = listOf(" `T` / `U` ") + names
val heading = headers.map { it.padStart(maxLength) }.joinToString(" | ", "| ", " |")
val separator = headers.map { "-".repeat(maxLength) }.joinToString(" | ", "| ", " |")
println(heading)
println(separator)

for (t in imklib.types.realTypes) {
    val z = imklib.zeros(t, 1)
    val fields = imklib.types.realTypes.map { (z + imklib.zeros(it, 1)).type::class.simpleName!! }
    val names = listOf(t::class.simpleName!!) + fields
    val row = names.map { it.padStart(maxLength) }.joinToString(" | ", "| ", " |")
    println(row)
}
