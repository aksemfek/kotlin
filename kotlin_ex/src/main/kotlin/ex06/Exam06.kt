package org.example.ex06

fun main() {
    val dog = Dog("해피")

    println(dog.age)

    dog.age = 20

    println(dog.age)

    dog.eat()
    dog.bark()
}

interface Bark {
    fun bark()
}

interface Temp {
    fun hi()
}

abstract class Animal(
    private val name: String? = ""
) : Bark {
    // body
    fun eat() {
        println("$name 식사 시작합니다.")
    }
}

class Dog(
    private val name: String? = null,
    var age: Int? = 0
) : Animal(name), Temp {

//    var age: Int? = 0
//        get() = field
//        set(value) {
//            field = value
//        }

    override fun bark() {
        println("$name : 멍멍")
    }

    override fun hi() {
        println("hi")
    }

}