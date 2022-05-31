package com.dicoding.kotlin

fun main() {
    // Lambda Receiver (this)
    // run, with, & apply
    val buildStringApply = StringBuilder().apply {
        append("Hello ")
        append("Kotlin")
    }
    println(buildStringApply)

    val buildStringRun = StringBuilder().run {
        this.append("Hello ")
        this.append("Kotlin")
    }
    println(buildStringRun)

    val buildStringWith = StringBuilder().run {
        this.append("Hello ")
        this.append("Kotlin ")
    }
    println(buildStringWith)

    println()

    // Lambda Argument (it)
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    text.also {
        val message = "$it Kotlin"
        println(message)
    }
}