package com.dicoding.kotlin

fun main() {
    // Recursive
    val number = 10
    println("number $number")
    println("factorial without recursive ${factorialWithoutRecursive(number)}")

    println()

    println("number $number")
    println("factorial with recursive ${factorialWithRecursive(number)}")
}

fun factorialWithoutRecursive(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}

fun factorialWithRecursive(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorialWithRecursive(n-1)
    }
}