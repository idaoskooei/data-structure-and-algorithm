package com.example.tamrin.arrays.easy
// easy
//  hashing, and algorithmic problem-solving.
/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.You can return the answer in any order.
 */
fun main() {
    println(twoSum(intArrayOf(1, 2, 3, 4), 7))


    println(twoSum1(nums = intArrayOf(1, 2, 5, 6, 14, 3), target = 11))

    val result = twoSum2(nums = intArrayOf(2, 7, 11, 15), target = 9)
    println(result.joinToString(", "))
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    val result = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (result.containsKey(complement)) {
            return intArrayOf(result[complement]!!, i)
        }
        result[nums[i]] = i
    }
    return intArrayOf()
}


fun calculateSum(a: Int, b: Int): Int {
    return a + b
}

private fun twoSum1(nums: IntArray, target: Int): IntArray {

    val ii = nums[0]
    val res: IntArray = intArrayOf(2)

    for (i in 1..nums.lastIndex) {
        if (calculateSum(ii, nums[i]) == target) {
            res[0] = ii
            res[1] = nums[i]
        }
    }
    return res
}

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
private fun twoSum2(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for ((index, num) in (nums.withIndex())) {
        val complement = target - num
        if (map.containsKey(num)) {
            return intArrayOf(map[num]!!, index)
        }
        map[complement] = index
    }
    throw IllegalArgumentException("No solution found") // In case no solution exists
}
