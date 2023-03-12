package chapter04

fun <T : Comparable<T>> bubbleSort(array: Array<T>): Array<T> {
    var unsortedUntilIndex = array.size - 1
    var sorted = false
    while (!sorted) {
        sorted = true
        for (i in 0 until unsortedUntilIndex) {
            if (array[i] > array[i + 1]) {
                array[i] = array[i + 1].also {
                    array[i + 1] = array[i]
                }
                sorted = false
            }
        }
        unsortedUntilIndex--
    }
    return array
}

fun main() {
    val intArray = arrayOf(65, 55, 45, 35, 25, 15, 10)
    val sortedIntArray = bubbleSort(intArray)

    val stringArray = arrayOf("C", "D", "B", "A", "E")
    val sortedStringArray = bubbleSort(stringArray)

    sortedIntArray.forEach {
        print("$it ")
    }

    sortedStringArray.forEach {
        print("$it ")
    }
}