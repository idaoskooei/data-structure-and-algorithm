package com.example.tamrin.lists.easy
// easy
/*
You are given a list of integers, where some elements may be duplicated.
The task is to remove all duplicates and return a list of unique elements while maintaining the original order of their first occurrence.
 */

fun main() {
    val list = listOf(1, 2, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5)
    val result = removeDuplicates(list)
    println(result)
}

fun removeDuplicates(nums: List<Int>): List<Int> {
    val seen = mutableSetOf<Int>()
    val result = mutableListOf<Int>()
    for (num in nums) {
        if (num !in seen) {
            result.add(num)
            seen.add(num)
        }
    }
    return result
}