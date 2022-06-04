package com.dicoding.kotlin

fun main() {
    // Tail Call Recursion
    // Untuk menghindari tumpukan frame yang mengkonsumsi memori
    val smallNumber = 10
    val largeNumber = 32
    println("small number $smallNumber")
    println("factorial ${factorial(smallNumber)}")

    println()

    println("large number $largeNumber")
    println("factorial ${factorial(largeNumber)}")
}

tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}