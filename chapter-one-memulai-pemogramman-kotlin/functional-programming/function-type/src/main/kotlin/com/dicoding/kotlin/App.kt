package com.dicoding.kotlin

fun main() {
    // Function Type
    val valueA = 10
    val valueB = 20
    println(sum(valueA, valueB))
    println(sum.invoke(valueA, valueB))

    println()

    println(multiply(valueA, valueB))
    println(multiply.invoke(valueA, valueB))

    println()

    println(sumNull?.invoke(10, 10))
    println(multiplyNull?.invoke(10, 10))

    println()
    println(sumValue(valueA, valueA))
}

typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = {valA, valB -> valA + valB}

val multiply: Arithmetic = {valA, valB -> valA * valB}

fun sumValue(valA: Int, valB: Int): Int {
    return valA + valB
}

typealias ArithmeticNull = ((Int, Int) -> Int)?

val sumNull: ArithmeticNull = {valA, valB -> valA + valB}

val multiplyNull: ArithmeticNull = {valA, valB -> valA * valB}