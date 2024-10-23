package com.example.tamrin
// medium
/*
Given a roman numeral, convert it to an integer.
 */
fun main() {
    println(romanToInt("LVIII"))

}

private fun romanToInt(s: String): Int {
    val romanToIntMap = mapOf(
        'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (i in s.length - 1 downTo 0) {
        val currentCharValue = romanToIntMap[s[i]] ?: 0

        if (currentCharValue >= prevValue) {
            result += currentCharValue
        } else {
            result -= currentCharValue
        }

        prevValue = currentCharValue
    }

    return result
}