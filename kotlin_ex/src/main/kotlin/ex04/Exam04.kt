package org.example.ex04

fun main() {
    // java Object == Any
    var map = mapOf<String, Any>(
        Pair("", ""),
        "Key" to "value"
    )

    val mutableMap = mutableMapOf<String, Any>(
        "key" to "value"
    )

    mutableMap["key"] = "value"
    val value = mutableMap["key"]

    val hashMap = hashMapOf<String, Any>()

    var triple = Triple<String, String, String>(
        first = "",
        second = "",
        third = ""
    )
}
