package com.dicoding.kotlin

fun main() {
    // While => check the case first then execute the looping
    var counter = 1
    while (counter <= 7) {
        println("Hello, World!")
        counter++
    }

    println("----------------")

    var counter2 = 8
    while (counter2 <= 7) {
        println("Hello, World!")
        counter2++
    }

    println("----------------")

    // Do while => execute the loop first then check the case
    var counter3 = 1
    do {
        println("Hello, World!")
        counter3++
    } while (counter3 <= 7)

    println("----------------")

    var counter4 = 8
    do {
        println("Hello, World!")
        counter4++
    } while (counter4 <= 7)
}