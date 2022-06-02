package com.dicoding.kotlin

fun main() {
    // Distinct
    // menyaring item yang sama
    val numbers = listOf(1, 2, 3, 1, 4, 5, 2, 3, 4, 5)
    val distinct = numbers.distinct()
    println("numbers $numbers")
    println("distinct $distinct")

    println()

    // Distinct By
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )
    val distinctByObject = items.distinctBy {
        it.key
    }
    println("items $items")
    distinctByObject.forEach {
        println("${it.key} with value ${it.value}")
    }

    println()

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctByLength = text.distinctBy {
        it.length
    }
    println("text $text")
    println("distinct by length $distinctByLength")

}

data class Item(val key: String, val value: Any)