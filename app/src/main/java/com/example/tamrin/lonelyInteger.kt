package com.example.tamrin
// medium
/*
Given an array of integers, where all elements but one occur twice, find the unique element.
 */

fun main() {
    val a = arrayOf(1, 2, 3, 4, 3, 2, 1)
    println(lonelyInteger(a))
}

private fun lonelyInteger(a: Array<Int>): Int {
    var uniqueNumber: Int? = null

    for (num in a) {
        if (a.count { it == num } == 1) {
            uniqueNumber = num
            break
        }
    }
    return uniqueNumber!!
}