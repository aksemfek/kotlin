package org.example.ex10

fun main() {

    val user = ExamUser(name = "abcd")
    exam10(user)
}

fun exam10(examUser: ExamUser?) {
//    examUser?.let {
//        it.name?.let { name ->
//            println(name)
//        }
//    } ?: run {
//
//    }

//    examUser?.let{
//        if(!it.name.isNullOrBlank()){
//            println(it.name)
//        }
//    }

    if (examUser.isNotNull() && examUser?.name.isNotNullOrBlank()) {
        println(examUser?.name)
    }
    // Object == Any
}

data class ExamUser(
    var name: String? = null
)

fun String?.isNotNullOrBlank(): Boolean { // 확장 함수 extensions function
    return !this.isNullOrBlank()
}

fun Any?.isNotNull(): Boolean {
    return this != null
}