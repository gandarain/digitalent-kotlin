package com.dicoding.kotlin

fun main() {
    // Overloading
    // Multiple fun with same name, but different parameter
    val cat = Animal("cat")
    cat.eat()
    cat.eat("fish")
    cat.eat("fish", 3)
    cat.sleep()

    println()

    val calc = Calculator()
    println(calc.add(10, 20))
    println(calc.add(10, 20, 30))
    println(calc.add(10.2, 11.5))
    println(calc.add(6f, 7f))
    println(calc.min(10, 30))
    println(calc.min(17.2, 15.9))
}

class Animal(private var name: String) {
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood")
    }

    fun eat(typeFood: String, quantity: Int) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

class Calculator() {
    fun add(value1: Int, value2: Int): Int = value1 + value2
    fun add(value1: Int, value2: Int, value3: Int): Int = value1 + value2 + value3
    fun add(value1: Double, value2: Double): Double = value1 + value2
    fun add(value1: Float, value2: Float): Float = value1 + value2

    fun min(value1: Int, value2: Int): Int = if (value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double): Double = if (value1 < value2) value1 else value2
}