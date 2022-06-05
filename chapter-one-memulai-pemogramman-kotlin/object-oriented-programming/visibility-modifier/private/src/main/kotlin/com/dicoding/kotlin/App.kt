package com.dicoding.kotlin

fun main() {
    // Private Visibility Modifier
    // Only can access inside the scope (inside the class)
    // Need to create getter and setter by manual, if want to access the property or function private
    val cat = Animal("cat", 3.2, 2, true)
    println("name: ${cat.getName()}")
    cat.setName("catty")
    println("new name: ${cat.getName()}")
}

class Animal(
    private var name: String,
    private var weight: Double,
    private var age: Int,
    private var isMammal: Boolean
) {
    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }
}