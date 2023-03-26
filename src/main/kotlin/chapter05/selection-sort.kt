package chapter05

fun <T : Comparable<T>> selectionSort(array: Array<T>): Array<T> {
    for ((i, _) in array.withIndex()) {
        var lowestIndex = i

        var j = i + 1
        while (j < array.size) {
            if (array[j] < array[lowestIndex]) {
                lowestIndex = j
            }
            j++
        }

        if (lowestIndex != i) {
            array[i] = array[lowestIndex].also {
                array[lowestIndex] = array[i]
            }
        }
    }
    return array
}

fun main() {
    selectionSort(arrayOf(4, 2, 7, 1, 3))
        .forEach(::println)
}