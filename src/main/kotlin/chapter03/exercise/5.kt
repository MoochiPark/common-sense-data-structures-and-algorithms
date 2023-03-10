package chapter03.exercise

fun median(array: IntArray): Int {
    val middle = array.size.floorDiv(2)

    return when {
        array.size % 2 == 0 -> (array[middle - 1] + array[middle]) / 2
        else -> array[middle]
    }
}

fun main() {
    print(median(intArrayOf(1, 2, 3)))
}