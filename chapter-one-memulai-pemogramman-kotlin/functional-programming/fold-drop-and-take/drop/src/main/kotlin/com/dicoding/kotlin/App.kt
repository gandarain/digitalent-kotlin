package com.dicoding.kotlin

fun main() {
    // Drop
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val drop = numbers.drop(3)
    println("numbers $numbers")
    println("drop $drop")

    println()

    // dropLast
    val dropLast = numbers.dropLast(3)
    println("numbers $numbers")
    println("drop last $dropLast")
}