package com.dicoding.kotlin

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new Job!")
    }
    job.join()
    println("Other task")
}