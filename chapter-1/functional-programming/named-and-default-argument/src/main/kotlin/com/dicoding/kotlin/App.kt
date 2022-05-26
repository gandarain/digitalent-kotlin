package com.dicoding.kotlin

fun main () {
    // Named Argument
    val user1 = getFullName("Ganda", "Rain", "Panjaitan")
    println(user1)
    val user2 = getFullName(first = "Mintho", middle = "Lamhot", last = "Siagian")
    println(user2)
    val user3 = getFullName(middle = "Wazza", last = "Rooney", first = "Wayne")
    println(user3)

    println()

    val user4 = getFullUser()
    println(user4)
    val user5 = getFullUser(middle = "CR7")
    println(user5)
}

// Function with required parameter
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

// Function with default parameter
fun getFullUser(
    first: String = "First",
    middle: String = "Middle",
    last: String = "Last"): String {
    return "$first $middle $last"
}