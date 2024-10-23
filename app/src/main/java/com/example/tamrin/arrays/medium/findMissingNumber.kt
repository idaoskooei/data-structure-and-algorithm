package com.example.tamrin.arrays.medium
// medium

/*
You are given an array that contains n distinct numbers taken from the range 0, 1, 2, ..., n.
One number is missing from the array. Your task is to find the missing number.
 */

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13)
    val result = findMissingNumbers(arr)
    println(result)
}

fun findMissingNumbers(nums: IntArray): Int {
    val n = nums.size
    // The range of numbers should include the missing number, which means it goes from 1 to n+1
    val expectedSum = ((n + 1) * (n + 2)) / 2
    val actualSum = nums.sum()
    val missingNumber = expectedSum - actualSum
    if (expectedSum == actualSum) {
        throw IllegalArgumentException("there are no numbers missing")
    } else {
        return missingNumber
    }
}