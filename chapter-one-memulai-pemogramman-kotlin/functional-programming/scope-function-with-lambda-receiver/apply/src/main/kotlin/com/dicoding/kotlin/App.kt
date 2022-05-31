package com.dicoding.kotlin

fun main() {
    // Scope Function with Lambda Receiver
    // apply
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")
    println(builder.toString())

    val message = java.lang.StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }
    println(message.toString())
}