package com.dicoding.kotlin

fun main () {
    // List
    val listOfNumber: List<Int> = listOf(1, 2, 3, 4, 5)
    val listOfChar = listOf('a', 'b', 'c')
    val listOfAny = listOf(1, 'a', "Kotlin", true, User("Ganda", 25))

    println(listOfNumber)
    println(listOfChar)
    println(listOfAny[4])

    println()

    // Mutable List
    val mutableList = mutableListOf(1, 2, "Kotlin", User("Ganda", 25))
    println("Mutable List Before $mutableList")
    mutableList.add(User("Ronaldo", 31))
    mutableList.add(1, "Dicoding")
    mutableList.removeAt(1)
    mutableList[1] = true
    println("Mutable List After $mutableList")
}