package chapter03.exercise

fun arraySum(array: IntArray): Int {
    var sum = 0

    array.forEach {
        sum += it
    }

    return sum
}