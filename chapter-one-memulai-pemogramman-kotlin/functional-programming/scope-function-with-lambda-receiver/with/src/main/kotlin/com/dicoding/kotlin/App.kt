package com.dicoding.kotlin

fun main() {
    // Scope Function with Lambda Receiver
    // With
    val message = "Hello Kotlin!"
    val result = with(message) {
        println("value $this")
        println("with length ${this.length}")
    }
    println(result)

    val returnResult = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(returnResult)
}