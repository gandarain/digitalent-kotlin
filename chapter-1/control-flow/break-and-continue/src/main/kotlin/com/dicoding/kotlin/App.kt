package com.dicoding.kotlin

fun main() {
    // Break & Continue
    val listOfInt = listOf(1, 2, 3, null, null, 6, 7, null)
    for (i in listOfInt) {
        println(i)
    }

    println()

    // Continue
    for (i in listOfInt) {
        if (i == null) continue
        println(i)
    }

    println()

    // Break
    for (i in listOfInt) {
        if (i == null) break
        println(i)
    }

    println()

    // Break & Continue Label
    loop@ for (i in 1..10) {
        println("Outside loop $i")

        for (j in 1..10) {
            if (j > 5) break@loop
            println("Inside loop $j")
        }
    }
}