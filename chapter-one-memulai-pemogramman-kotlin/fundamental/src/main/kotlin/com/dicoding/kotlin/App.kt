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

    // Char
    var vocal: Char = 'A'
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

    println("")

    // String
    val string: String = "Kotlin"
    val length = string.length
    val firstChar = string[0]
    println("Number of word \"$string\" is $length")
    println("First character of $string is $firstChar")

    val string2 = "Kotlin"
    for (char in string2) {
        println("Char $char")
    }

    val statement = "Kotlin is \"Awesome!\""
    println("Escape String $statement")

    val unicode = "Unicode test: \u00A9"
    println("Unicode $unicode")

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

    println("")

    // If Expressions
    val openHours = 7
    val now = 7
    val office: String
    if (now > openHours) {
        office = "Office already open"
    } else if (now == openHours) {
        office = "Wait a minute, office will be open"
    } else {
        office = "Office is closed"
    }
    println(office)

    println("")

    // Boolean
    // 1. Conjunction atau AND (&&)
    val officeHour2 = 7
    val officeClosed = 16
    val currentHour = 20
    val isOpen = currentHour >= officeHour2 && currentHour <= officeClosed
    println("Office is open $isOpen")

    // 2. Disjunction atau OR (||)
    val officeOpen = 7
    val closedOffice = 16
    val current = 20
    val isClosed = current < officeOpen || current > closedOffice
    println("Office is close $isClosed")

    // 3. Negation atau NOT (!)
    val openOfficeTime = 7
    val currentNow = 10
    val isOpenOffice = now > currentNow

    if (!isOpenOffice) {
        println("Office is close")
    } else {
        println("Office is open")
    }

    println("")

    // Array
    val intArray = arrayOf<Int>(1, 2, 3, 4)
    intArray[2] = 11
    println(intArray[2])
    val intArray2 = Array(4, { i -> i * i })  // Array(size, lambda)
    println(intArray2[3])

    println("")

    // NPE
    // 1. Safe Call Operator
    val text: String? = null
    val textLength = text?.length
    println("Safe Call Operator ${textLength}")
    println("")

    // 2. Elvis Operator
    val text2: String? = null
    val textLength2 = text2?.length ?: 0
    println("Elvis Operator ${textLength2}")
    println("")

    // String Template
    val codeName = "Kotlin"
    val old = 3
    println("My name is $codeName, im $old years old")

    val hour = 7
    println("Office ${if (hour > 7) "already close" else "is open"}")

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