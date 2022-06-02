package com.dicoding.kotlin

fun main() {
    // Slice
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = numbers.slice(3..6)
    println("total $numbers")
    println("slice $slice")

    println()

    val sliceWithStep = numbers.slice(3..6 step 2)
    println("numbers $numbers")
    println("slice with step $sliceWithStep")

    println()

    val index = listOf(2, 3, 5, 8)
    val sliceWithList = numbers.slice(index)
    println("numbers $numbers")
    println("slice with list $sliceWithList")
}