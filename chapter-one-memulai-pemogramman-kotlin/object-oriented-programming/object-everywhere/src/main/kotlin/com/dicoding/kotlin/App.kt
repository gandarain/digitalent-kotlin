package com.dicoding.kotlin

fun main() {
    // Object Everywhere
    // Object --> Realissai dari sebuah Blueprint
    // Blueprint --> Class yang memiliki property, attribute & behavior.
    // Nilai primitf seperti String, Integer, Char, Boolean merupakan sebuah object

    val someString = "Dicoding"
    println("some string $someString")
    println("reversed ${someString.reversed()}")
    println("upper case ${someString.toUpperCase()}")
    println("lower case ${someString.toLowerCase()}")

    println()

    val someStrings = "123"
    val someInt = someStrings.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()
    println("some string $someStrings")
    println("some int $someInt")
    println("some other string $someOtherString")
    println("some double $someDouble")
}