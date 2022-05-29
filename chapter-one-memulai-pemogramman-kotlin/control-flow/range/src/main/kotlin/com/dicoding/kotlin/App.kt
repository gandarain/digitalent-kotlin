package com.dicoding.kotlin

fun main() {
    // Range
    val rangeInt = 1..10
    println(rangeInt)

    println()

    // Step
    val rangeInt2 = 1..10 step 2
    rangeInt2.forEach {
        println("$it")
    }
    println(rangeInt2)
    println("Step ${rangeInt2.step}")

    println()

    // Range To (rangeTo())
    val rangeToVar = 1.rangeTo(10)
    println(rangeToVar)

    println()

    // Down To (downTo())
    val downToVar = 10.downTo(1)
    println(downToVar)

    println()

    // in (memeriksa apakah suatu nilai ada pada cakupan nilai Range )
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 is in the range")
    }

    println()

    // !in (is not in range)
    val oneToTen = 1.rangeTo(10)
    if (11 !in oneToTen) {
        println("Value 11 is not in the range")
    }

    println()

    // Range Char
    val rangeChar = 'A'.rangeTo('F')
    rangeChar.forEach {
        println("$it")
    }
}