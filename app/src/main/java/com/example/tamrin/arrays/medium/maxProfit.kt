package com.example.tamrin.arrays.medium
// medium
// greedy algorithm approaches
/*
  You are given an array prices where prices[i] is the price of a given stock on the ith day.
  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
   to sell that stock.
   Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
   */
fun main(){
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    println(maxProfit(prices))
}
private fun maxProfit(prices: IntArray): Int {
    if (prices.size < 2) {
        return 0 // If there are less than 2 prices, cannot make a profit
    }

    var minPrice = prices[0] // Initialize minPrice to the first price
    var maxProfit = 0 // Initialize maxProfit to 0

    for (i in 1 until prices.size) {
        val currentPrice = prices[i]
        val profit = currentPrice - minPrice
        maxProfit = maxOf(maxProfit, profit) // Update maxProfit if profit is greater
        minPrice = minOf(minPrice, currentPrice) // Update minPrice if currentPrice is lower
    }

    return maxProfit
}