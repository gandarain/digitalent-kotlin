package com.dicoding.kotlin

fun main() {
    // Scope Function with Lambda Argument
    // Let
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }

    println()

    // Without Let
    val length = message?.length ?: 0 * 2
    val text = "text length $length"
    println(text)

    println()

    // Combination between let & run
    // use run to execute false condition
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }
}