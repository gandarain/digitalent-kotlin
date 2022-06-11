package com.dicoding.kotlin

import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        println("Start new job!")
        delay(5000)
        println("Job is finished!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("time is up!"))
    println("Canceling job...")

    if (job.isCancelled) {
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}