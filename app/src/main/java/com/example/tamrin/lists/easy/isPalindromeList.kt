package com.example.tamrin.lists.easy
// easy
/*
You are given a list of integers.
 Your task is to determine if the list is a palindrome. A palindrome reads the same forward and backward.
 */

/*
Two-pointer approach:
One pointer will start from the beginning of the list (left),
and another pointer will start from the end of the list (right).
Compare the elements at both pointers.
If they are equal, move the pointers closer to the center (increment left and decrement right).
If at any point the elements are not equal, return false since the list is not a palindrome.

 */

fun main() {
    val l1 = listOf(1, 2, 3, 2, 1)
    val result = isPalindromeList(l1)
    println(result)
}

fun isPalindromeList(nums: List<Int>): Boolean {
    var left = 0
    var right = nums.size - 1

    while (left < right) {
        if (nums[left] != nums[right]) {
            return false
        }
        left++
        right--
    }
    return true
}