package com.dicoding.kotlin

fun main() {
    // Nullable receiver
    val num1 = 10
    val nullValue: Int? = null
    val nullVal = null
    println("Num slice 1 ${num1.slice}")
    println("Num slice 2 ${num1.slice2}")
    println("Num slice 3 ${num1.slice3}")
    println()
    println("Null value ${nullValue.slice}")
    println("Null value slice 2 ${nullValue.slice2}")
    println("Null val slice 3 ${nullVal?.slice3}")
}

val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

val Int?.slice2: Int
    get() = this?.div(2) ?: 0

val Int.slice3: Int
    get() = this.div(2)