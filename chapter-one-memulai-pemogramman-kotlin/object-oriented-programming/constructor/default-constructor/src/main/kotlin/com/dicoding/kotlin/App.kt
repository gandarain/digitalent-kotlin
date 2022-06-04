package com.dicoding.kotlin

fun main() {
    // Default Constructor
    val cat = Animal()
    println("name: ${cat.name}, weight: ${cat.weight}, age: ${cat.age}, isMammal: ${cat.isMammal}")
}

// Class with Default Constructor
class Animal {
    val name: String = "Cat"
    val weight: Double = 3.2
    val age: Int = 2
    val isMammal: Boolean = true
}