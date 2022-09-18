package com.dicoding.widgethomepage

import java.util.*

// internal object => class helper
internal object NumberGenerator {
    fun generate(max: Int): Int {
        val random = Random()
        return random.nextInt(max)
    }
}