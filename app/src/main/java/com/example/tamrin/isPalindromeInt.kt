package com.example.tamrin

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */
fun main() {
    println(isPalindrome(112211))

}

private fun isPalindrome(x: Int): Boolean {
    val string = x.toString()
    val reversedString = string.reversed()
    if (x < 0) return false
    return reversedString == string
}