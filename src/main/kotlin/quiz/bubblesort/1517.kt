package quiz.bubblesort

import java.io.StreamTokenizer

/*   백준 1517 버블 소트
     문제: https://www.acmicpc.net/problem/1517
     결과: https://www.acmicpc.net/source/58170835
*/

fun main() = StreamTokenizer(System.`in`.bufferedReader()).run {
    fun readInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = readInt()
    val array = IntArray(n) { readInt() }

    val counter = SwapCounter()
    print(counter.sortAndCount(array))
}

class SwapCounter {
    private var count = 0L

    fun sortAndCount(array: IntArray): Long {
        mergeSort(array)
        return count
    }

    private fun mergeSort(target: IntArray) {
        if (target.size < 2) return

        val mid = target.size / 2
        val left = target.copyOf(mid)
        val right = target.copyOfRange(mid, target.size)

        mergeSort(left)
        mergeSort(right)

        merge(left, right, target)
    }

    private fun merge(left: IntArray, right: IntArray, target: IntArray) {
        var leftIndex = 0
        var rightIndex = 0
        var targetIndex = 0

        while (leftIndex < left.size && rightIndex < right.size) {
            if (left[leftIndex] <= right[rightIndex]) {
                target[targetIndex++] = left[leftIndex++]
            } else {
                target[targetIndex++] = right[rightIndex++]
                count += left.size - leftIndex
            }
        }

        while (leftIndex < left.size) {
            target[targetIndex++] = left[leftIndex++]
        }

        while (rightIndex < right.size) {
            target[targetIndex++] = right[rightIndex++]
        }
    }
}