package com.dicoding.kotlin
import kotlinx.coroutines.*


fun main() = runBlocking {
    val job = launch(context = Dispatchers.IO, start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new Job!")
    }

    job.start()
    println("Other Task!")
}