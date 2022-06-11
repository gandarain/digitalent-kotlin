package com.dicoding.kotlin

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello, ")
    delay(2000L)
    println("Finish")
}