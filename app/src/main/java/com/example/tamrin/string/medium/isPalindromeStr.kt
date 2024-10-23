package com.example.tamrin.string.medium
// medium
/*
    A phrase is a palindrome if, after converting all
     uppercase letters into lowercase letters and removing all non-alphanumeric characters,
     it reads the same forward and backward. Alphanumeric characters include letters and numbers.
     */

fun main(){

        val result = "A man, a plan, a canal: Panama"
    println(isPalindrome1(result))
}
fun isPalindrome1(s: String): Boolean {
    val normalStr = s.filter { it.isLetterOrDigit() }.lowercase()
    var left = 0
    var right = normalStr.length - 1
    while (left < right) {
        if (normalStr[left] != normalStr[right]) {
            return false
        }
        left++
        right--
    }
    return true
}
