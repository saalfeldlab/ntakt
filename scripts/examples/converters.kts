#!/usr/bin/env kscript

@file:MavenRepository("scijava", "https://maven.scijava.org/content/groups/public")
@file:DependsOn("org.ntakt:ntakt:0.1.0-SNAPSHOT")

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sqrt
import kotlin.random.Random
import org.ntakt.*

val rai = ntakt.doubles(1L, 2L, 3L) { Random.nextDouble(0.0, 1.0) }
val scaledAndQuantizedRai = rai.convert(ntakt.types.unsignedByte) { s, t -> t.setInteger(round(255.0 * s.realDouble).toInt()) }

val rra1 = ntakt.function(2, { ntakt.types.float }) { p, t -> t.setReal(abs(p.getDoublePosition(0)) + abs(p.getDoublePosition(1))) }
val rra2 = ntakt.function(2, { ntakt.types.double }) { p, t -> t.setReal(sqrt(p.getDoublePosition(0).pow(2.0) + p.getDoublePosition(1).pow(2.0))) }
val meanRra = rra1.convert(rra2, ntakt.types.double) { s, t, u -> u.setReal(s.realDouble); u.add(t); u.mul(0.5) }


println(rai.flatStringRepresentation)
println(scaledAndQuantizedRai.flatStringRepresentation)


