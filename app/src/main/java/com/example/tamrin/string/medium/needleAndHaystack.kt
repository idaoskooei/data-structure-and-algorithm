package com.example.tamrin.string.medium
// medium
/*
Given two strings needle and haystack,
return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
fun main() {
    println(strStr("needle", "le"))

}

private fun strStr(haystack: String, needle: String): Int {
    if (!haystack.contains(needle)) {
        return -1
    }
    return haystack.indexOf(needle)
}