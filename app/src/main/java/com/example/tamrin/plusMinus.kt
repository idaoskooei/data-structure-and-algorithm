package com.example.tamrin
/*
    Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
    Print the decimal value of each fraction on a new line with  places after the decimal.
     */

fun main() {
    val arr = arrayOf(0, 0, 0, 0, 0, 0)
    plusMinus(arr)
}

fun plusMinus(arr: Array<Int>) {
    var negativeCount = 0
    var positiveCount = 0
    var zeroCount = 0

    for (num in arr) {
        when {
            num > 0 -> positiveCount++
            num < 0 -> negativeCount++
            else -> zeroCount++
        }
    }
    val arraySize = arr.size.toDouble()
    val positiveRatio = positiveCount / arraySize
    val negativeRatio = negativeCount / arraySize
    val zeroRatio = zeroCount / arraySize

    println("%.6f".format(positiveRatio))
    println("%.6f".format(negativeRatio))
    println("%.6f".format(zeroRatio))
}
