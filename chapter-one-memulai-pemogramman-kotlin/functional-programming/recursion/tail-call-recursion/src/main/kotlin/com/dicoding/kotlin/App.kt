package com.dicoding.kotlin

fun main() {
    // Tail Call Recursion
    // Untuk menghindari tumpukan frame yang mengkonsumsi memori
    val smallNumber = 10
    val largeNumber = 32
    val largeLongNumber = 999L
    println("small number $smallNumber")
    println("factorial ${factorial(smallNumber)}")

    println()

    println("large number $largeNumber")
    println("factorial ${factorial(largeNumber)}")

    println()

    println("large number $largeLongNumber")
    println("factorial with long ${factorialWithLong(largeLongNumber)}")
}

tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}

tailrec fun factorialWithLong(value: Long): Long {
    return when (value) {
        1L -> value
        else -> value * factorialWithLong(value - 1)
    }
}