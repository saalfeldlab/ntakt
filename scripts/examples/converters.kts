#!/usr/bin/env kscript

@file:MavenRepository("scijava", "https://maven.scijava.org/content/groups/public")
@file:DependsOn("net.imglib2:imklib2:0.1.0-SNAPSHOT")

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sqrt
import kotlin.random.Random
import net.imglib2.imklib.*

val rai = imklib.doubles(1L, 2L, 3L) { Random.nextDouble(0.0, 1.0) }
val scaledAndQuantizedRai = rai.convert(imklib.types.unsignedByte) { s, t -> t.setInteger(round(255.0 * s.realDouble).toInt()) }

val rra1 = imklib.function(2, { imklib.types.float }) { p, t -> t.setReal(abs(p.getDoublePosition(0)) + abs(p.getDoublePosition(1))) }
val rra2 = imklib.function(2, { imklib.types.double }) { p, t -> t.setReal(sqrt(p.getDoublePosition(0).pow(2.0) + p.getDoublePosition(1).pow(2.0))) }
val meanRra = rra1.convert(rra2, imklib.types.double) { s, t, u -> u.setReal(s.realDouble); u.add(t); u.mul(0.5) }


println(rai.flatStringRepresentation)
println(scaledAndQuantizedRai.flatStringRepresentation)


