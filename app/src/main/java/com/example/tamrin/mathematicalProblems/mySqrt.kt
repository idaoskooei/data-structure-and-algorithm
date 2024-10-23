package com.example.tamrin.mathematicalProblems

import kotlin.math.sqrt
// easy
/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.
 */
fun main() {
    println(mySqrt(4))

}

fun mySqrt(x: Int): Int {
    val a = x.toDouble()
    return sqrt(a).toInt()
}