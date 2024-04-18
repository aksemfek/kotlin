package org.example.ex11

import java.time.LocalDateTime

fun main() {
    // let
    val now = LocalDateTime.now()
    val localDateTime: LocalDateTime? = null

    val kst = now?.let { localDateTime ->
        println("let scope $localDateTime")
        "let scope"
    } ?: LocalDateTime.now()
    println("result $kst")

    UserDto(name = "홍길동").let{
        logic(it)
    }
}

fun logic(userDto: UserDto): UserResponse? {
    return userDto?.let { userDto ->
        println("dto $userDto")

        UserEntity(
            name = userDto.name
        )?.let {
            println("entity $it")

            UserResponse(
                userName = it.name
            )
        }
    }
}

data class UserDto(
    var name: String? = null,
)

data class UserEntity(
    var name: String? = null,
)

data class UserResponse(
    var userName: String? = null,
)