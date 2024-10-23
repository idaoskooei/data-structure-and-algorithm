package com.example.tamrin.lists.easy
// easy

/*
Given a list of integers and a value, remove all instances of that value from the list in place (without using additional space)
and return the new length of the list. The modified list should contain the remaining elements after removal.
 */

/*
two pointer approach
 */
fun main() {
    val value = 3
    val array = intArrayOf(1,2,3,4,5,6,7)
    val result = removeElement(array, value)
    println(result)
}

fun removeElement(nums: IntArray, value: Int): Int {
    var pos = 0
    for (i in nums.indices) {
        if (nums[i] != value) {
            nums[pos] = nums[i]
            pos++
        }
    }
    return pos
}