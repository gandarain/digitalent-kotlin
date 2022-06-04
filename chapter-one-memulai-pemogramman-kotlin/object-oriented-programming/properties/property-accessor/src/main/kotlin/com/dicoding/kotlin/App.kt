package com.dicoding.kotlin

fun main() {
    val animal1 = AnimalWithOutAccessor()
    println("name ${animal1.name}")
    animal1.name = "Goose"
    println("name ${animal1.name}")

    println()

    val animal2 = AnimalWithAccess()
    println("name ${animal2.name}")
    animal2.name = "Goose"
    println("name ${animal2.name}")
}

class AnimalWithOutAccessor {
    var name: String = "Cat"
}

class AnimalWithAccess {
    var name: String = "Cat"

    get() {
        println("function getter")
        return field
    }

    set(value) {
        println("function setter")
        field = value
    }
}