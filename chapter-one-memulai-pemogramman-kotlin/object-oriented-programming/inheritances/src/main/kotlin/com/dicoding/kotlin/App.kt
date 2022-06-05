package com.dicoding.kotlin

fun main() {
    // Inheritance
    val cat = Cat("cat", 3.2, 2, false, "red", 4)
    println("name: ${cat.name}, weight: ${cat.weight}, age: ${cat.age}, isCarnivore: ${cat.isCarnivore}, fur color: ${cat.furColor}, number of feet: ${cat.numberOfFeet}")
    cat.sleep()
    cat.eat()
    cat.playWithHuman()

    println()

    val fish = Fish("fish", 3.3, 4, false, "red", 1)
    println("name: ${fish.name}, weight: ${fish.weight}, age: ${fish.age}, isCarnivore: ${fish.isCarnivore}, scale color: ${fish.scaleColor}, number of fin: ${fish.numberOfFin}")
    fish.sleep()
    fish.eat()
    fish.swim()

    println()

    val snake = Snake("snake", 10.5, 9, true, "green", true)
    println("name: ${snake.name}, weight: ${snake.weight}, age: ${snake.age}, isCarnivore: ${snake.isCarnivore}, skin color: ${snake.skinColor}, is toxic: ${snake.isToxic}")
    snake.sleep()
    snake.eat()
    snake.bite()
}

open class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
    val isCarnivore: Boolean
) {
    open fun eat() {
        println("$name sedang makan")
    }

    open fun sleep() {
        println("$name sedang tidur")
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
        println("$name sedang memakan ikan!")
    }

    fun playWithHuman() {
        println("$name sedang bermain dengan manusia")
    }
}

class Fish(
    name: String,
    weight: Double,
    age: Int,
    isCarnivore: Boolean,
    val scaleColor: String,
    val numberOfFin: Int
): Animal(name, weight, age, isCarnivore) {
    override fun eat() {
        println("$name sedang makan jelly fish!")
    }

    fun swim() {
        println("$name sedang berenang")
    }
}

class Snake(
    name: String,
    weight: Double,
    age: Int,
    isCarnivore: Boolean,
    val skinColor: String,
    val isToxic: Boolean
): Animal(name, weight, age, isCarnivore) {
    override fun eat() {
        println("$name sedang makan kucing")
    }

    fun bite() {
        println("$name sedang nge-bite")
    }
}