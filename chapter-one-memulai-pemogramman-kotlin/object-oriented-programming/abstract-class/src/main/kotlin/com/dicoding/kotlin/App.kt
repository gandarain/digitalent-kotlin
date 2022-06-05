package com.dicoding.kotlin

fun main() {
    // Abstract Class
    // Gambaran umum dari sebuah kelas
    // Kita tidak bisa membuat sebuah objek dari abstract class
    val cat = Cat("cat", 3.2, 2, false, "red", 4)
    println("name: ${cat.name}, weight: ${cat.weight}, age: ${cat.age}, isCarnivore: ${cat.isCarnivore}, fur color: ${cat.furColor}, number of feet: ${cat.numberOfFeet}")
    cat.eat()
    cat.sleep()
    cat.playWithHuman()

    // this code below will be error
    // val animal = Animal("bird", 3.2, 2, false)
}

abstract class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
    val isCarnivore: Boolean
) {
    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur!")
    }
}

class Cat(
    name: String,
    weight: Double,
    age: Int,
    isCarnivore: Boolean,
    val furColor: String,
    val numberOfFeet: Int
): Animal(name, weight, age, isCarnivore) {
    override fun eat() {
        println("$name sedang makan ikan!")
    }

    fun playWithHuman() {
        println("$name sedang bermain dengan Budi!")
    }
}