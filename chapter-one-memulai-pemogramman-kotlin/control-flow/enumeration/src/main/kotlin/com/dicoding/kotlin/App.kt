package com.dicoding.kotlin

fun main() {
    // Enum
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
    println(colorRed)
    println(colorGreen)
    println(colorBlue)

    println()

    // Enum with Anonymous Function
    val redColor = AnonymousColor.RED
    val greenColor = AnonymousColor.GREEN
    val blueColor = AnonymousColor.BLUE
    redColor.printValue()
    greenColor.printValue()
    blueColor.printValue()

    println()

    // values() / enumValues() => mendapatkan daftar objek Enum
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println(color)
    }

    println()

    // valuesOf() / enumValueOf() => mendapatkan nama dari objek Enum
    val colorOfRed = Color.valueOf("RED")
    println(colorOfRed)

    println()

    // ordinal => mendapatkan posisi tiap objek
    val positionOfRed = Color.GREEN.ordinal
    println(positionOfRed)

    println()

    // combine enum with when expression
    val selectedColor = Color.RED
    when(selectedColor) {
        Color.RED -> println("Color is Red")
        Color.GREEN -> println("Color is Green")
        Color.BLUE -> println("Color is Blue")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class AnonymousColor(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE $value")
        }
    };

    abstract fun printValue()
}