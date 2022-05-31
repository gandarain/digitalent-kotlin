package com.dicoding.kotlin

fun main() {
    // Scope function with Lambda Argument
    // Also
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }
    println("text -> $result")
}