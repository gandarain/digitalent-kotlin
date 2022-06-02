package com.dicoding.kotlin

fun main() {
    // chunked
    // memecah string menjadi bagian kecil dalam bentuk array
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println("word $word")
    println("chunked $chunked")

    println()

    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }
    println("word $word")
    println("chunked transform $chunkedTransform")
}