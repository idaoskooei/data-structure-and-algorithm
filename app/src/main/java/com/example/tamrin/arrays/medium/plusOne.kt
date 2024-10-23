package com.example.tamrin.arrays.medium
// medium
// mathematical operations
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 */
fun main() {

    val intArray = intArrayOf(1, 2, 3)
    println(plusOne(intArray))
}

private fun plusOne(digits: IntArray): IntArray {

    val n = digits.size
    val resultArray = IntArray(n + 1)
    var carry = 1

    for (i in n - 1 downTo 0) {
        val sum = digits[i] + carry
        resultArray[i + 1] = sum % 10
        carry = sum / 10
    }
    resultArray[0] = carry

    return if (resultArray[0] == 0) {
        resultArray.copyOfRange(1, n + 1)
    } else {
        return resultArray
    }
}