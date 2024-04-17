package org.example.ex08

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    Exam08(Store(null))

    println(DateTimeUtil().localDateTimeToString());
}

data class Store(
    var registerAt: LocalDateTime? = null
)

class Exam08(store: Store) {
    init {
        val strLocalDateTime = toLocalDateTimeString(store.registerAt)
        println(strLocalDateTime)

        println(toLocalDateTimeString())
    }

    fun toLocalDateTimeString(localDateTime: LocalDateTime? = LocalDateTime.of(2020, 2, 2, 13, 20)): String {
        val temp = localDateTime ?: LocalDateTime.now()
        return temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    }
}

class DateTimeUtil {
    private val KST_FORMAT = "yyyy년 MM월 dd일 HH시 mm분 ss초"

    fun localDateTimeToString(
        localDateTime: LocalDateTime? = LocalDateTime.now(),
        pattern: String? = KST_FORMAT
    ): String {
        return (localDateTime ?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern(pattern))
    }
}