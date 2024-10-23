package com.example.tamrin.arrays.easy
// easy
/*
Write a function that reverses the elements of an array in place.
In-place means you should modify the input array itself and not use any additional data structures (no extra arrays).
 */
/*
 two pointer technique:
 This approach uses two indices (or pointers) that move toward each other from opposite ends of a data structure (like an array)
  to perform operations efficiently. In this case, we use two pointers (start and end) to swap elements until they meet in the middle,
   effectively reversing the array in place.
 */

/*
You should consider using the two-pointer technique when:

1)In-place modification is required: In this problem, the array needs to be reversed without using extra memory.
2)Symmetrical problem: Reversing an array is symmetrical, meaning you can approach it from both ends simultaneously,
which is where the two-pointer technique shines.
3)Efficiency matters: This method achieves linear time complexity (O(n)) while only using constant extra space (O(1)),
making it optimal for problems where you need to modify a list or array in place.
 */
fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    println("original array: ${arr.joinToString(",")}")
    reverseArray(arr)
    println("reversed array: ${arr.joinToString(",")}")

}

fun reverseArray(array: IntArray): IntArray {
    var start = 0
    var end = array.size - 1
    while (start < end) {
        val temp = array[start]
        array[start] = array[end]
        array[end] = temp
        start++
        end--
    }
    return array
}