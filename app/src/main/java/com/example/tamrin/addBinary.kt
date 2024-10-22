package com.example.tamrin

// Given two binary strings a and b, return their sum as a binary string.

fun main() {
    println(addBinary("11", "1"))
}

private fun addBinary(a: String, b: String): String {
    var i = a.length - 1
    var j = b.length - 1
    var carry = 0
    val result = StringBuilder()

    while (i >= 0 || j >= 0 || carry > 0) {
        val sum = (if (i >= 0) a[i--] - '0' else 0) + (if (j >= 0) b[j--] - '0' else 0) + carry
        result.insert(0, sum % 2)
        carry = sum / 2
    }
    return result.toString()
}