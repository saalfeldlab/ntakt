#!/usr/bin/env kscript

@file:MavenRepository("scijava", "https://maven.scijava.org/content/groups/public")
@file:DependsOn("org.ntakt:ntakt:0.1.0-SNAPSHOT")

import org.ntakt.*

val bt = ""

val names = ntakt.types.realTypes.map { it::class.simpleName!! }
val maxLength = names.map { it.length }.max()!! + 2
val headers = listOf("T$bt/${bt}U") + names
val heading = headers.map { "$bt$it$bt".padStart(maxLength) }.joinToString(" | ", "| ", " |")
val separator = headers.map { "-".repeat(maxLength) }.joinToString(" | ", "| ", " |")
println(heading)
println(separator)

for (t in ntakt.types.realTypes) {
    val z = ntakt.zeros(t, 1)
    val fields = ntakt.types.realTypes.map { (z + ntakt.zeros(it, 1)).type::class.simpleName!! }
    val names = listOf(t::class.simpleName!!) + fields
    val row = names.map { "$bt$it$bt".padStart(maxLength) }.joinToString(" | ", "| ", " |")
    println(row)
}
