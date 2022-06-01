package com.dicoding.kotlin

fun main() {
    // Member References
    // Function References
    val numbers = 1.rangeTo(10)
    val evenNumbers1 = numbers.filter(::isEvenNumber)
    println(evenNumbers1)

    val evenNumbers2 = numbers.filter(Int::isEventNumberInt)
    println(evenNumbers2)
}

fun isEvenNumber(number: Int): Boolean = number % 2 == 0

// Function References with Extension Function
fun Int.isEventNumberInt(): Boolean = this % 2 == 0