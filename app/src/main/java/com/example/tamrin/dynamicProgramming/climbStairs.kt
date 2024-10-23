package com.example.tamrin.dynamicProgramming
// medium
/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps.
In how many distinct ways can you climb to the top?
 */
fun main() {
    println(climbStairs(10))

}

private fun climbStairs(n: Int): Int {
    if (n <= 2) return n

    var prev1 = 1
    var prev2 = 2

    for (i in 3..n) {
        val current = prev1 + prev2
        prev1 = prev2
        prev2 = current
    }

    return prev2
}