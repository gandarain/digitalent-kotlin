package com.dicoding.kotlin

fun main() {
    // Generic Class
    // Sebuah konsep yang memungkinkan suatu kelas atau interface menjadi tipe parameter yang dapat digunakan
    // untuk berbagai macam tipe data.
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
    val longList = LongList()
    println("long list ${longList.get(0)}")
    println("first long $firstLong")
}

// Generic Class
interface List<T> {
    operator fun get(index: Int): T
}

class LongList: List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}