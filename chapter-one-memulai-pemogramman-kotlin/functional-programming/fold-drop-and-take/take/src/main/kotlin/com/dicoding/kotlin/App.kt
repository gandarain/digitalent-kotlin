package com.dicoding.kotlin

fun main() {
    // Take
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val take = numbers.take(3)
    println("numbers $numbers")
    println("take $take")

    println()

    val takeLast = numbers.takeLast(3)
    println("numbers $numbers")
    println("take last $takeLast")
}