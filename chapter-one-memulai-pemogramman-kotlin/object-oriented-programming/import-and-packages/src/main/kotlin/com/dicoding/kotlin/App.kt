package com.dicoding.kotlin
import kotlin.random.Random
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sqrt

// import kotlin.math.cos as cosinus
// import kotlin.math.*

fun main() {
    val someInt = Random(0).nextInt(1, 10)
    println("some int: $someInt")
    println("PI: $PI")
    println("Cosinus: ${cos(120.0)}")
    println("Sqrt: ${sqrt(9.0)}")
}