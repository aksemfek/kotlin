package org.example.ex05

import java.util.function.Predicate

fun main() {

    var numberList = listOf(1, 2, 3, 4, 5)

    val pred = Predicate<Int> { t -> t % 2 == 0 }
//    val pred = object : Predicate<Int> {
//        override  fun test(t: Int): Boolean{
//            return t % 2 ==0
//        }
//    }

    numberList.filter { it % 2 == 0 }

    numberList.stream().filter(pred)

    val add = { x: Int, y: Int -> x + y }
    val _add = fun(x: Int, y: Int): Int {
        return x + y
    }

    println(add(2, 3))
    println(_add(3, 4))

    lambda(4,5, _add)
}

fun lambda(x: Int, y:Int,method:(Int, Int) -> Int){
    println(method (x, y))
}