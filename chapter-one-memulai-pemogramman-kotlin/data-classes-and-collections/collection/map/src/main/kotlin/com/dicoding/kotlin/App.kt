package com.dicoding.kotlin

fun main () {
    // Map
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "Paris" to "France"
    )
    println(capital)

    println()

    // Get Value
    println(capital["Jakarta"])
    println(capital.getValue("Paris"))

    println()

    // keys => Show all the keys
    println(capital.keys)

    println()

    // values => show all the values
    println(capital.values)

    println()

    // mutable map
    // toMutableMap() or mutableMapOf()
    val mutableMap = mutableMapOf(
        "Aerox" to "Yamaha",
        "NMAX" to "Yamaha",
        "PCX" to "Honda",
        "KLX" to "Kawasaki",
        "Vario" to "Honda"
    )
    println("Map before $mutableMap")
    mutableMap.put("Ninja 150", "Kawasaki")
    mutableMap.put("GSX", "Suzuki")
    println("Map after $mutableMap")
}