package chapter07

fun averageOfEvenNumbers(array: IntArray): Double =
    array.filter { it % 2 == 0 }
        .average()

fun main() {
    val average = averageOfEvenNumbers(intArrayOf(1, 2, 3, 4, 5, 6))
    print(average)
}