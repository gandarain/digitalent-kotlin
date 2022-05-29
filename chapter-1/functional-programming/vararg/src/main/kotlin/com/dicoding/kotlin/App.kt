package com.dicoding.kotlin

fun main () {
    // Vararg (Variable Argument)
    val sumOfNumbers = sumNumbers(10, 20, 30, 40, 50)
    println(sumOfNumbers)

    println()

    // Generic
    val numbers = asList(10, 20, 30, 40, 50)
    val chars = asList('k', 'o', 't', 'l', 'i', 'n')
    println(numbers)
    println(chars)

    println()

    // Vararg ==> array
    val sizeOfNumbers = getSize(10, 20, 30, 40, 50)
    println(sizeOfNumbers)

    println()

    // One vararg and other parameter
    // If first param is vararg, use the named argument
    printSomething(10, 20, 30, 40, 50, name = "Ganda Rain Panjaitan")
    // Best tips, you Have to put vararg as the last param
    consoleSomething("Ganda Rain Panjaitan", 10, 20, 30, 40, 50)

    println()

    // Vararg vs Array<T>
    val arrayOfInt = arrayOf(10, 20, 30, 40, 50)
    // Need an array to use param Array<T>
    println(sumOfArray(arrayOfInt))
    // Vararg is not need an array, vararg param will be considered as array
    val intOfNumbers = intArrayOf(10, 20, 30, 40, 50)
    val numbersOfInt = sumOfVararg(10, 20, 30, 40, 50, *intOfNumbers)
    println(numbersOfInt)
}

fun sumNumbers(vararg numbers: Int): Int {
    return numbers.sum()
}

// Generic
fun <T> asList(vararg input: T): List<T> {
    var result = ArrayList<T>()
    for (item in input) {
        result.add(item)
    }
    return result
}

// Vararg ==> array
fun getSize(vararg numbers: Int): Int {
    return numbers.size
}

// One vararg and other parameter
// If first param is vararg, use the named argument
fun printSomething(vararg numbers: Int, name: String): Unit {
    println("$name ${numbers.sum()}")
}

// Best tips, you Have to put vararg as the last param
fun consoleSomething(name: String, vararg numbers: Int): Unit {
    println("$name ${numbers.sum()}")
}

// Vararg vs Array<T>
fun sumOfArray(numbers: Array<Int>): Int {
    return numbers.sum()
}
fun sumOfVararg(vararg numbers: Int): Int {
    return numbers.sum()
}