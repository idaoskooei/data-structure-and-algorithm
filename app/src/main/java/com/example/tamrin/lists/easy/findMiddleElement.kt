package com.example.tamrin.lists.easy

// easy
/*
Given a list of integers, your task is to find the middle element. If the list has an odd number of elements,
 return the element at the exact middle. If the list has an even number of elements, return the second middle element.
 */

fun main() {
    val list = listOf(8,7,6,5,4,2,3,4,5,6)
    println(findMiddleElement(list))
}

fun findMiddleElement(nums: List<Int>): Int {
    val n = nums.size
    val middleElement = nums[n / 2]
    return middleElement
}