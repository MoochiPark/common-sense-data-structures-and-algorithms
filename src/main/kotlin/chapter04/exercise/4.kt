package chapter04.exercise

fun greatestNumber(array: IntArray): Int {
    var greatest = array[0]
    for (i in array) {
        if (i > greatest) {
            greatest = i
        }
    }
    return greatest
}

fun main() {
    print(greatestNumber(intArrayOf(1, 3, 5, 7, 2, 10)))
}