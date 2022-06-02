package com.dicoding.kotlin

fun main() {
    // Fold
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("numbers $numbers")
    println("fold result = $fold")

    println()

    // foldRight
    val foldRight = numbers.foldRight(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("numbers $numbers")
    println("fold right result = $foldRight")
}