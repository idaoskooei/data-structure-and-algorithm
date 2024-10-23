package com.example.tamrin
// easy
/*
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     */
fun main() {

    val s = "07:55:04PM"
    println(timeConversion(s))
}

private fun timeConversion(s: String): String {
    val parts = s.split(":")
    val hour = parts[0].toInt()
    val minutes = parts[1]
    val seconds = parts[2].substring(0, 2)
    val period = parts[2].substring(2)

    val militaryHour = when {
        hour == 12 && period.equals("AM", ignoreCase = true) -> "00"
        hour == 12 && period.equals("PM", ignoreCase = true) -> "12"
        period.equals("PM", ignoreCase = true) -> (hour + 12).toString()
        else -> hour.toString().padStart(2, '0')
    }
    return "$militaryHour:$minutes:$seconds"
}
