package com.example.tamrin.string.medium
// medium
/*
  Write a function to find the longest common prefix string amongst an array of strings.
  If there is no common prefix, return an empty string "".
   */
fun main() {

    val arr = arrayOf("flower", "flow", "fly")
    println(longestCommonPrefix(arr))
}

private fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }
    val firstElement = strs[0]
    for (i in firstElement.indices) {
        val charToMatch = firstElement[i]
        for (j in 1 until strs.size) {
            if (i >= strs[j].length || strs[j][i] != charToMatch) {
                return firstElement.substring(0, i)
            }
        }
    }
    return firstElement
}