package com.dicoding.kotlin

fun main() {
    val someValue = 6
    // println(someValue / 0) ==> ArithmeticException

    val someStringValue = "18.0"
    // println(someStringValue.toInt()) ==> NumberFormatException

    val someNullValue: String? = null
    // NullPointerException
    // val someMustNotNullValue: String = someNullValue!!
    // println(someMustNotNullValue)
}