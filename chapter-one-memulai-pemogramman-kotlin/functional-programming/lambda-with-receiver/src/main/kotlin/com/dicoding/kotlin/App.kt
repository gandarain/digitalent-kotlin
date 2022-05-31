package com.dicoding.kotlin

fun main() {
    // Lambda with Receiver
    val text = buildStringWithoutReceiver()
    println(text)

    val message = buildStringWithReceiver {
        append("Hello")
        append(" From")
        append(" Lambda")
    }
    println(message)
}

fun buildStringWithoutReceiver(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello")
    stringBuilder.append(" From")
    stringBuilder.append(" Kotlin")

    return stringBuilder.toString()
}

fun buildStringWithReceiver(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}