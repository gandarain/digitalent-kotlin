package com.dicoding.kotlin

fun main() {
    // Extension Functions
    // With Unit
    10.printInt()
    // With return value
    val intPlusThree = 10.plusThree()
    println(intPlusThree)

    println()

    // Extension Properties
    println(10.slice)
}

// Extension Function
fun Int.printInt() {
    println("value $this")
}
// Extension Functions
fun Int.plusThree(): Int {
    return this + 3
}
// Extension Properties
val Int.slice: Int
    get() = this / 2