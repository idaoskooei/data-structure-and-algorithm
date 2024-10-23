package com.example.tamrin
// easy
/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */
fun main() {
    val arr = arrayOf(0, 1, 2, 3, 4, 5)
    miniMaxSum(arr)
}


fun miniMaxSum(arr: Array<Int>) {

    var minSum = Long.MIN_VALUE
    var maxSum = Long.MAX_VALUE

    for (i in arr.indices) {
        var sum = 0L
        for (j in arr.indices) {
            if (i != j) {
                sum += arr[j]
            }
        }
        minSum = minOf(minSum, sum)
        maxSum = maxOf(maxSum, sum)
    }

    println("$minSum $maxSum")
}
