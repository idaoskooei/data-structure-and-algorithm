package com.example.tamrin

import kotlin.math.abs
// easy
/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 */

fun main() {

    val arr = Array<Array<Int>>(3) { Array<Int>(3) { 0 } }
    println(diagonalDifference(arr))
}

private fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftDiagonalSum = 0
    var rightDiagonalSum = 0
    for (i in arr.indices) {
        leftDiagonalSum += arr[i][i]
        rightDiagonalSum += arr[i][arr.size - 1 - i]
    }

    return abs(leftDiagonalSum - rightDiagonalSum)
}