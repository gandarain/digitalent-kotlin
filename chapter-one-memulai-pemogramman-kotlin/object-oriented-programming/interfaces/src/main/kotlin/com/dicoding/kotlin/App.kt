package com.dicoding.kotlin

fun main() {
    // Interface
    // Class without property declaration and empty function
    // Need to override the property and function if we want to extend interface class
    val bird = Bird(2)
    bird.fly()
}

interface IFly {
    val numberOfWings: Int
    fun fly()
}

class Bird(override val numberOfWings: Int): IFly {
    override fun fly() {
        if (numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("Flying without wings")
    }
}