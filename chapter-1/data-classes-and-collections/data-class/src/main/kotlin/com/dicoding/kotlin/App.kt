package com.dicoding.kotlin

fun main () {
    // Data Class
    val user = User("Ronaldo", 33)
    val dataUser = DataUser("Messi", 32)
    println(user)
    println(dataUser)

    println()

    // equals on data class
    val dataUser1 = DataUser("Mbappe", 23)
    val dataUser2 = DataUser("Halland", 22)
    val dataUser3 = DataUser("Mbappe", 23)
    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser3))

    println()

    // equals on class
    val user1 = User("Mbappe", 23)
    val user2 = User("Halland", 22)
    val user3 = User("Mbappe", 23)
    println(user1.equals(user2))
    println(user1.equals(user3))

    println()

    // copy data class
    val dataUser4 = dataUser3.copy(age = 18)
    println(dataUser4)
}