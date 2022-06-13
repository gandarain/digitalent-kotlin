package com.dicoding.kotlin

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(context = Dispatchers.Default, start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start()
    println("Other task!")
}