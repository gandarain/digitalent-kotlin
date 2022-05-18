package com.dicoding.kotlin

fun main () {

    // Constant
    val constant = "3.14"
    println("Constant ${constant}")

    // Variable
    var variable = "Hello"
    variable += " World"
    println("Variable ${variable}")

    println("")

    // String
    val string: String = "Kotlin"
    val length = string.length
    println("Number of word \""+ string + "\" is" + length)

    println("")

    // Array
    val intArray = arrayOf<Int>(1, 2, 3, 4)
    intArray[2] = 11
    println(intArray[2])

    println("")
    // NPE
    // Safe Call Operator
    val text: String? = null
    val textLength = text?.length
    println("Safe Call Operator ${textLength}")

    println("")
    // Elvis Operator
    val text2: String? = null
    val textLength2 = text2?.length ?: 0
    println("Elvis Operator ${textLength2}")

    println("")

    // Operator Aritmatika
    println(8.plus(2))
    println(5.minus(2))
    println(8.times(2))

    println("")

    // Function
    setUser1("Ganda", 25)
    println(setUser2("Ganda", 25))
    println(setUser3("Ganda", 25))

    println("")

    // Data Classes
    val user: User = User("Dicoding", 17)
    println(user)

    println("")

    // Getter & Setter
    var dataUser: User = User("Dicoding", 17)
    dataUser.name = "Dicoding Indonesia"
    dataUser.age = 7

    println("")

    // Destructing Declarations
    val (name, age) = dataUser
    println(name)
    println(age)
}

fun setUser1(name: String, age: Int): Unit {
    println("Name ${name}, age ${age}")
}

fun setUser2(name: String, age: Int): String {
    return "Name ${name}, age ${age}"
}

fun setUser3(name: String, age: Int) = "Name ${name}, age ${age}"

// Data Classes
data class User (
    var name: String,
    var age: Int
)