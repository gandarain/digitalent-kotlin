package com.dicoding.kotlin

var message = "Kotlin"
val msg = "Kotlin"

fun main() {
    // Member References
    // Property References

    // Mutable
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")
    println(::message.get())

    println()

    // Immutable
    println(::msg.name)
    println(::msg.get())

    // ::msg.set() ==> will errro
}