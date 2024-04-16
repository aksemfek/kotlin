package org.example.ex07

fun main() {
//    var user = User(null, 10, null)
    var user = User()
    user.name = "홍길동"
    user.age = 12
    user.email = "gmail"

    val user2 = user.copy(name = "이순신") // named argument

    val user3 = User(
        age = 10,
        email = "gmail",
        name = "유관순"
    )

    println(user)
    println(user2)
    println(user3)
}