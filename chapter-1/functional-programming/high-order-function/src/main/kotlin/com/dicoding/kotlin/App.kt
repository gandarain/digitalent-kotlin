package com.dicoding.kotlin

fun main() {
    // High Order Function
    // Function with other function (Lambda)
    val value = 10
    printResultSum(value, sum)
    printResultSum(value){ value -> value + value}
}

fun printResultSum(value: Int, lambdaFunction: (Int) -> Int) {
    val result = lambdaFunction(value)
    println(result)
}

val sum: (Int) -> Int = { value -> value + value }