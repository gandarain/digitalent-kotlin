package com.dicoding.kotlin

fun main() {
    // Primary Constructor
    val animal = Animal("cat", 4.2, 2, true)
    println("first animal")
    println("name: ${animal.name}, weight: ${animal.weight}, age: ${animal.age}, mammal: ${animal.isMammal}")

    println()

    val secondAnimal = AnimalWithDefaultValueConstructor("cat", 4.3, isMammal = true)
    println("second animal")
    println("name: ${secondAnimal.name}, weight: ${secondAnimal.weight}, age: ${secondAnimal.age}, mammal: ${secondAnimal.isMammal}")

    println()

    val thirdAnimal = AnimalWithInitBlock("cat", 4.4, -1, true)
    println("third animal")
    println("name: ${thirdAnimal.name}, weight: ${thirdAnimal.weight}, age: ${thirdAnimal.age}, mammal: ${thirdAnimal.isMammal}")

    println()

    val fourthAnimal = AnimalWithInitBlockSameParam("cat", 4.4, -1, true)
    println("fourth animal")
    println("name: ${fourthAnimal.name}, weight: ${fourthAnimal.weight}, age: ${fourthAnimal.age}, mammal: ${fourthAnimal.isMammal}")
}

// Class with Primary Constructor
class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)

// Primary Constructor with Default Value
class AnimalWithDefaultValueConstructor(
    val name: String,
    val weight: Double,
    val age: Int = 0,
    val isMammal: Boolean = false
)

// Init Block
// Initialize primary constructor
// Validation the property value before initialize
class AnimalWithInitBlock(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if (pWeight < 0) 0.1 else pWeight
        age = if (pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

// Init Block
// With same parameter
class AnimalWithInitBlockSameParam(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }
}