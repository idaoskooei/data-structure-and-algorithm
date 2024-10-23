package com.example.tamrin
// medium
fun main() {
    println(getWrongAnswers(n = 3, "aba"))

}

fun getWrongAnswers(n: Int, c: String): String {
    val result = StringBuilder()
    for (i in 0 until n) {
        val charIndex = c[i]
        if (charIndex == 'a') {
            result.append('b')
        } else if (charIndex == 'b') {
            result.append('a')
        }
    }
    return result.toString()
}