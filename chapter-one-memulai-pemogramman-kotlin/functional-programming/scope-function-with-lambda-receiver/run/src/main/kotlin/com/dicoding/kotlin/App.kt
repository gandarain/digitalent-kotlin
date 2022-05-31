package com.dicoding.kotlin

fun main() {
    // Scope Function with lambda receiver
    // Run
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text $from to $to"
    }
    println("result : $result")
}