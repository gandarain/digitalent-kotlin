package com.dicoding.kotlin

fun main() {
    val cat = Animal("Cat", 4.2, 10, true)
    println("animal name ${cat.name}")
    println("animal weight ${cat.weight}")
    println("animal age ${cat.age}")
    println("animal isMammal ${cat.isMammal}")
    cat.eat()
    cat.sleep()
}

class Animal(val name: String,
             val weight: Double,
             val age: Int,
             val isMammal: Boolean
) {
    fun eat() {
        println("$name eat!")
    }

    fun sleep() {
        println("$name sleep!")
    }
}