package com.dicoding.kotlin

fun main() {
    // For Loop
    val ranges = 1..15
    for (i in ranges) {
        println("Value is $i!")
    }

    println()

    // For loop with range to
    val oneToFifteen = 1.rangeTo(15)
    for (i in oneToFifteen) {
        println("Value is $i!")
    }

    println()

    // For loop with range to and step
    val oneToTen = 1.rangeTo(10) step 2
    for (i in oneToTen) {
        println("Value is $i!")
    }

    println()

    // withIndex() => mengakses indeks untuk setiap elemen yang ada pada Ranges
    val oneToEight = 1..8
    for ((index, value) in oneToEight.withIndex()) {
        println("Value $value with index $index")
    }

    println()

    // forEach => lambda expression with 1 parameter (value)
    oneToEight.forEach {
        println("Value is $it")
    }

    println()

    // forEachIndexed => lambda expression with 2 parameter (index, value)
    oneToEight.forEachIndexed { index, value ->
        println("Value $value with index $index")
    }
    
    println()

    oneToEight.forEachIndexed { index, _ ->
        println("Index $index")
    }
}