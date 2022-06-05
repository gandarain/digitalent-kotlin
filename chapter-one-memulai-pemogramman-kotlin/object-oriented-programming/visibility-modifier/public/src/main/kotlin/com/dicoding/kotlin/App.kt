package com.dicoding.kotlin

fun main() {
    // Visibility Modifier Public
    // Default Visibility Modifier
    val cat = Animal("cat", 3.2, 2, true)
    println("name: ${cat.name}, weight: ${cat.weight}, age: ${cat.age}, isMammal: ${cat.isMammal}")
}

class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
    val isMammal: Boolean
)