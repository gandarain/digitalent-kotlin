package com.dicoding.kotlin

fun main() {
    // Secondary Constructor
    val cat = Animal("Cat", 3.2, 1, true)
    val bird = Animal("Bird", 2.1, 2)
    println("name: ${cat.name}, weight: ${cat.weight}, age: ${cat.age}, isMammal: ${cat.isMammal}")
    println()
    println("name: ${bird.name}, weight: ${bird.weight}, age: ${bird.age}, isMammal: ${bird.isMammal}")
}

class Animal(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = false
    }

    // this constructor will be called if there is an isMammal value during when define a animal object
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        println("secondary constructor called")
        this.isMammal = isMammal
    }
}