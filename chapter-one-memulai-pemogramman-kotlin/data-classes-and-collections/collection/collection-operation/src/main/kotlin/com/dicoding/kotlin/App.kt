package com.dicoding.kotlin

fun main () {
    // Collection Operation

    // filter() & filterNot() => menghasilkan list baru berdasarkan kondisi yg ditentukan
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println("Even list $evenList")
    println("Not even list $notEvenList")

    val setNumber = setOf(1, 2, 3, 4, 5, 6)
    val setNumberEven = setNumber.filter { it % 2 == 0 }
    println("Set number even $setNumberEven")

    println()

    // map() => menghasilkan collection baru dengan perubahan yang akan dilakukan pada collection sebelumnya
    val multipliesBy5 = numberList.map { it * 5 }
    println("multipliesBy5 $multipliesBy5")

    println()

    // count() => menghitung jumlah item yang ada pada collection
    println(numberList.count())
    println(numberList.count { it % 3 == 0 })

    println()

    // find(), firstOrNull() & lastOrNull()
    // mencari item pertama atau terakhir pada sebuah collection
    // jika data tidak di temukan, akan return null
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    val lastOrNullNumber = numberList.lastOrNull { it % 2 == 0 }
    println("firstOddNumber $firstOddNumber")
    println("firstOrNullNumber $firstOrNullNumber")
    println("lastOrNullNumber $lastOrNullNumber")

    println()

    // first() & last()
    // mencari item pertama dan terakhir pada sebuah collection
    // jika data tidak ditemukan, akan return error
    val oddNumber = numberList.first { it % 2 == 0 }
    val lastOddNumber = numberList.last { it % 2 == 0 }
    println("oddNumber $oddNumber")
    println("lastOddNumber $lastOddNumber")

    println()

    // sum()
    // khusus untuk collection bertipe angka
    // menjumlahkan data pada collection
    val total = numberList.count()
    val totalOddNumber = numberList.count { it % 2 == 0 }
    println("total $total")
    println("totalOddNumber $totalOddNumber")

    println()

    // sorted()
    // mengurutkan item pada collection
    val kotlinString = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSortedString = kotlinString.sorted()
    val descendingSortedString = kotlinString.sortedDescending()
    println("ascendingSortedString $ascendingSortedString")
    println("descendingSortedString $descendingSortedString")


}