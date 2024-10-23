package com.example.tamrin.lists.easy

// easy
/*
You are given two sorted lists of integers.
The task is to merge them into a single sorted list while maintaining the order.
 */

/*
The two-pointer technique ensures that we only make ONE pass through both lists,
time complexity of O(n + m), where n and m are the lengths of the two lists.
 */
fun main() {
    val l1 = listOf(1, 2, 3, 7)
    val l2 = listOf(4, 5, 6, 8)
    val result = mergeSortedLists(l1, l2)
    println(result)
}

fun mergeSortedLists(l1: List<Int>, l2: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    var i = 0 // for l1
    var j = 0 // for l2

    while (i < l1.size && j < l2.size) {
        if (l1[i] <= l2[j]) {
            result.add(l1[i])
            i++
        } else {
            result.add(l2[j])
            j++
        }
    }

    // add remaining elements in l1
    while (i < l1.size) {
        result.add(l1[i])
        i++
    }
    // add remaining elements in l2
    while (j < l2.size) {
        result.add(l2[j])
        j++
    }

    return result
}
