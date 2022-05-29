package com.dicoding.kotlin

fun main () {
    val a = 10;
    val b = 20;
    val result = sum(a, b)
    println(result)
}

private fun sum(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}