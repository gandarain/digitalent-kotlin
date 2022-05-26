package com.dicoding.kotlin

fun main () {
    // Sequence ==> Lazy evaluations

    // Eager evaluations
    println("Eager evaluations")
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    println()

    // Lazy evaluations
    println("Lazy evaluations")
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    println()

    // Generated Sequence ==> create sequence collection
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).filter { it % 2 == 0 }.map { it * 10 }.forEach { println(it) }
}