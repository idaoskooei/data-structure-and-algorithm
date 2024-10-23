package com.example.tamrin.arrays.medium
// medium

/*
Given an array of integers, write a function to move all the zeroes to the end of the array
 while maintaining the relative order of the non-zero elements.
 You must modify the array in place without using extra space for another array.
 */

// two pointer approach

fun main() {
    val arr = intArrayOf(0,0,0,0,1,2,3)
    println("the original array is: ${arr.joinToString(",")}")
    moveZeros(arr)
    println("the modified array is: ${arr.joinToString(",")}")
}

fun moveZeros(array: IntArray): IntArray {
    var nonZeroElement = 0
    for (i in array.indices) {
        if (array[i] != 0) {
            array[nonZeroElement] = array[i]
            nonZeroElement++
        }
    }
    for (i in nonZeroElement until array.size) {
        array[i] = 0
    }

    return array
}