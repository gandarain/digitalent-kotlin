package com.dicoding.kotlin

import java.lang.IllegalArgumentException

fun main() {
    // Function inside Function
    setWord1("Hello Kotlin!")
    setWord2("Hello Dicoding!")
    println(sum1(10, 20, 30))
    println(sum2(10, 20, 30))
    println(sum3(10, 20, 30))
}

// Inner Function
fun setWord1(message: String) {
    fun printMessage(text: String) {
        println(text)
    }

    printMessage(message)
}

// Inner Function
fun setWord2(message: String) {
    // printMessage() ==> will error, need to call after define the function

    fun printMessage() {
        println(message)
    }

    printMessage()
}

// Without Inner Function
fun sum1(valA: Int, valB: Int, valC: Int): Int {
    if (valA == 0) {
        throw IllegalArgumentException("value A must be better than 0")
    }

    if (valC == 0) {
        throw IllegalArgumentException("value B must be better than 0")
    }

    if (valC == 0) {
        throw IllegalArgumentException("value C must be better than 0")
    }

    return valA + valB + valC
}

// Inner Function
fun sum2(valA: Int, valB: Int, valC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valA)
    validateNumber(valB)
    validateNumber(valC)

    return valA + valB + valC
}

// Inner Function with Extension Function
fun sum3(valA: Int, valB: Int, valC: Int): Int {
    fun Int.validateNumber() {
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valA.validateNumber()
    valB.validateNumber()
    valC.validateNumber()

    return valA + valB + valC
}