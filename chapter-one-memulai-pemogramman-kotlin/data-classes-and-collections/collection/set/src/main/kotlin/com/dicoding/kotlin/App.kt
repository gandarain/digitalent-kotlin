package com.dicoding.kotlin

fun main() {
    // Set
    val setOfInt = setOf(1, 2, 3, 4, 5)
    println(setOfInt)

    println()

    // Remove Same Value
    val setOfAny = setOf(1, 2, 3, 1, 2, true)
    println(setOfAny)

    println()

    // Compare Set
    val setOfNumber1 = setOf(1, 2, 1, 4, 5)
    val setOfNumber2 = setOf(1, 2, 4, 5)
    println(setOfNumber1 == setOfNumber2)

    println()

    // Check Value inside Set
    println(5 in setOfNumber2)

    println()

    // Union => Gabungan
    val setA = setOf(1, 2, 3, 4, 5)
    val setB = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val union = setA.union(setB)
    println(union)

    println()

    // Intersect => Irisan
    val intersect = setA.intersect(setB)
    println(intersect)

    println()

    // Mutable Set
    val mutableSet = mutableSetOf(1, 2, 3, 4, 5, true, false)
    println("Mutable set before $mutableSet")
    mutableSet.add(10)
    mutableSet.remove(true)
    println("Mutable set after $mutableSet")
}