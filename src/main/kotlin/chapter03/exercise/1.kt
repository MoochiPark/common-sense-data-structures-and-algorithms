package chapter03.exercise

fun isLeapYear(year: Int) = when {
    year % 100 == 0 -> year % 400 == 0
    else -> year % 4 == 0
}

fun main() {
    print(isLeapYear(2023))
}