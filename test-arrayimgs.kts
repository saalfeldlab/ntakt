#!/usr/bin/env kscript

@file:MavenRepository("scijava", "https://maven.scijava.org/content/groups/public")
@file:DependsOn("org.ntakt:ntakt:0.1.0-SNAPSHOT")
//COMPILER_OPTS -jvm-target 1.8

import org.ntakt.*

val data1 = ntakt.unsignedShorts(30, 40, 50)
// with initialization:
val data2 = ntakt.doubles(30, 40, 50) { 1.0 / it }

// val data1 = ntakt.uint16s(30, 40, 50)
// // with initialization:
// val data2 = ntakt.float64s(30, 40, 50) { 1.0 / it }

println(data1)
println(data2)
