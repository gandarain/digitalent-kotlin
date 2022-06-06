package com.dicoding.kotlin

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String null"
    } finally {
        println(someMustNotNullValue)
    }
}