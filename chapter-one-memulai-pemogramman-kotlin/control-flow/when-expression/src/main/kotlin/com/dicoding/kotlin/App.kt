package com.dicoding.kotlin

import kotlin.random.Random

fun main() {
    // When Expressions
    val value = 7
    when(value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }

    println()

    // Block / Branch else
    // Will execute when none of the conditions are met
    val value2 = 10
    when(value2) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value can not be reached")
    }

    println()

    // Return value with when expression
    val value3 = 7
    val valueOfString = when(value3) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value can not be reached"
    }
    println(valueOfString)

    println()

    // When expression with multi line
    val value4 = 10
    val stringOfValue = when(value4) {
        6 -> {
            println("value is 6")
            "value is 6"
        }
        7 -> {
            println("value is 7")
            "value is 7"
        }
        8 -> {
            println("value is 8")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value can not be reached"
        }
    }
    println(stringOfValue)

    println()

    // Check instance with type data
    val anyType: Any = 100L
    when(anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("the value has a undefined type")
    }

    println()

    // Check value on the range or collection
    val value5 = 27
    val range = 10..50
    when(value5) {
        in range -> println("value is in the range")
        !in range -> println("value is outside the range")
        else -> println("value undefined")
    }

    println()

    var registerNumber = when(val regis = getRegisterNumber()) {
        in 1..50 -> 50 * regis
        in 1..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)