package com.dicoding.kotlin

fun main() {
    // Protected Visibility Modifier
    // Only can access by kelas turunan nya
    val cat = Cat("cat", 3.2)
    println("name: ${cat.name}")
    // println("weight: ${cat.weight}") ==> will error

}

open class Animal(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double): Animal(pName, pWeight)