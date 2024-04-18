package org.example.ex11

fun main() {
    // also / 또한
    // let 과 달리 내부에서만 작동

    var userDto = UserDto(
        name = "홍길동"
    ).also { dto: UserDto ->
        println(dto)

//        UserDto(
//            "유관순"
//        )
        dto.name = "유관순"
    }

    println("result $userDto")

}