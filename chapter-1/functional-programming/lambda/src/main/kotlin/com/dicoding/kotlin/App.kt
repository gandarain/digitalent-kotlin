package com.dicoding.kotlin

fun main () {
    // Lambda
    message()
    println(messageLength("Hello from Lambda"))

    println()

    println("Lambda Expression ${sum(10, 20)}")
    println("Normal Function ${sumValue(10, 20)}")
}

val message = { println("Hello from Lambda") }

val messageLength = { message: String -> message.length }

val sum = { valueA: Int, valueB: Int -> valueA + valueB }

fun sumValue(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}