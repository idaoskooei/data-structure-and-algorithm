package com.example.tamrin.arrays.easy
// easy

/*
Given an array of integers, write a function to find the maximum and minimum element in the array.
 */

fun main() {
    val array = intArrayOf(1, 4, 23, 90, 2)
    val (max, min) = findMaxMin(array)
    println("max: $max and min: $min")
}

fun findMaxMin(array: IntArray): Pair<Int, Int> {
    if (array.isEmpty()) {
        throw IllegalArgumentException("array can not be empty")
    }
    var min = array[0]
    var max = array[0]
    for (num in array) {
        if (num < min) min = num
        if (num > max) max = num
    }
    return Pair(max, min)
}