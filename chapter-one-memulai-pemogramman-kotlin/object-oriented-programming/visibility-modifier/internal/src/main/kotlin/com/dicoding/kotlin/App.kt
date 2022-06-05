package com.dicoding.kotlin

fun main() {
    // Internal Visibility Modifier
    // Only can access inside the module / package
    val cat = Animal("cat", 3.2, 2, false)
    println("name: ${cat.name}, weight: ${cat.weight}, age: ${cat.age}, isMammal: ${cat.isMammal}")
}

internal class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
    val isMammal: Boolean
)