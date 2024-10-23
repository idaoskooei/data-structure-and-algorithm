package com.example.tamrin.arrays.easy
// easy

/*
Given an array of integers where every element appears once except for one element that appears twice, find the duplicate number.
 */

/*
solution:
 Floyd’s Tortoise and Hare (Cycle Detection) algorithm.
 The time complexity is O(n)
 The space complexity is O(1) (constant space)
 */

/*
For Floyd's Tortoise and Hare algorithm, the array must meet specific conditions for it to work correctly:

Conditions:
The array must contain n+1 integers, where the integers are in the range 1 to n (inclusive).
There must be exactly one duplicate number in the array, but it can appear more than once.
The integers should be positive and not include values outside the range of 1 to n.
 */

fun main() {
    val arr = intArrayOf(4,5,1,2,3,6,4)
    val result = findDuplicate(arr)
    println(result)
}

fun findDuplicate(nums: IntArray): Int {
    var tortoise = nums[0]
    var hare = nums[0]
    // phase one: move tortoise one step at a time , move hare 2 step at a time!
    do {
        tortoise = nums[tortoise]
        hare = nums[nums[hare]]
    } while (tortoise != hare)

    // phase two:
    // after finding the intersection , reset either hare or tortoise:
    tortoise = nums[0]

    // move both tortoise and hare one step at a time in this part to find the duplicate number:
    while (tortoise != hare) {
        tortoise = nums[tortoise]
        hare = nums[hare]
    }
    return hare
}