package com.dicoding.kotlin

fun main() {
    // Extension Property
    val animal = Animal("cat", 5.0, 2, true)
    println(animal.getAnimalInfo)
}

// Class Animal
class Animal(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

// Extend getAnimalInfo property into class Animal
val Animal.getAnimalInfo: String
    get() = "name: ${this.name}, weight: ${this.weight}, age: ${this.age}, isMammal: ${this.isMammal}"