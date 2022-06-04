package com.dicoding.kotlin

import kotlin.reflect.KProperty

fun main() {
    // Property Delegate
    val animal = Animal()
    animal.name = "Cat"
    println("animal name ${animal.name}")

    println()

    val person = Person()
    person.name = "Ganda"
    println("person name ${person.name}")

    println()

    val hero = Hero()
    hero.name = "Batman"
    println("hero name ${hero.name}")

    println()

    val secondAnimal = AnimalWithGenericDelegate()
    secondAnimal.name = "Mouse"
    secondAnimal.weight = 10.5
    secondAnimal.age = 5

    println("animal name ${secondAnimal.name}")
    println("animal weight ${secondAnimal.weight}")
    println("animal age ${secondAnimal.age}")
}

// Property Delegate with String type
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("function getter")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("function setter")
        value = newValue
    }
}

class Animal {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

// Property Delegate with Any type
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any {
        println("function getter")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
        println("function setter")
        value = newValue
    }
}

class AnimalWithGenericDelegate {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}