package com.example.tamrin.arrays.medium
// medium

/*
Given an array of integers, rotate the array to the right by k steps.
 Note that k can be greater than the length of the array, so you need to effectively calculate k using the modulo operator.
 */

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val k = 3
    val result = rotateArray(array, k)
    println(result.joinToString(","))
}

fun rotateArray(array: IntArray, k: Int): IntArray {
    val n = array.size
    val effectiveK = k % n

    fun reverse(start: Int, end: Int) {
        var left = start
        var right = end
        while (left < right) {
            val temp = array[left]
            array[left] = array[right]
            array[right] = temp
            left++
            right--
        }
    }
    // step 1: reverse the whole array
    reverse(0, n - 1)
    // step 2: reverse the first k elements:
    reverse(0, effectiveK - 1)
    // step 3: reverse the rest of the elements after k
    reverse(effectiveK, n - 1)

    return array
}