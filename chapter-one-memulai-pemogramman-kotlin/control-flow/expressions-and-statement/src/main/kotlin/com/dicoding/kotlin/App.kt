package com.dicoding.kotlin

fun main() {
    // Statement => not return value
    val openOffice = 7
    val now = 8
    if (now > openOffice) {
        println("Office is open")
    } else {
        println("Office is close")
    }

    println()

    // Expressions => return value
    val officeOpen = 7
    val current = 8
    val isOfficeOpen = if (current > officeOpen) "Office is open" else "Office is closed"
    println(isOfficeOpen)

    println()

    // Multi Expression
    println(sum(1, 1*4))

    println()

    // Expression & Statement
    val value1 = 10
    val value2 = 2
    println(sum(value1, value2))
}

fun sum(val1: Int, val2: Int) = val1 + val2