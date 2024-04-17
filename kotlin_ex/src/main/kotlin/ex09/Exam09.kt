package org.example.ex09

fun main() {
    val result = when ("") {
        "" -> {
            ""
        }

        "MASTER", "ADMIN" -> {
            "master"
        }


        "USER" -> {
            "user"
        }

        else -> {
            "default"
        }
    }

//    var any: Any = "";
//
//    when(any){
//        is String ->{
//            any.
//        }
//        is Int ->{
//            any.
//        }
//        is Boolean ->{
//            any.
//        }
//    }

    var any: Any = "";
    var exception = RuntimeException()
    when (exception) {
        is NullPointerException -> {

        }

        is RuntimeException -> {

        }
    }

    var number = 10

    when (val n = number % 2) {
        0 -> {
            println(n)
        }

        else -> {
            println(n)
        }
    }

    val r = when{
        number % 2 == 0 ->{
            100
        }
        else ->{
            200
        }
    }
    println(r)
}