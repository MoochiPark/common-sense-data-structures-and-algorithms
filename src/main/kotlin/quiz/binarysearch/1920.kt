package quiz.binarysearch

import java.io.StreamTokenizer
import java.util.Arrays

/*   백준 1920 수 찾기
     문제: https://www.acmicpc.net/problem/1920
     결과: https://www.acmicpc.net/source/56952739
*/

private fun binarySearch(array: IntArray, value: Int): Int {
    var lower = 0
    var upper = array.size - 1

    while (lower <= upper) {
        val mid = (upper + lower) / 2

        if (value == array[mid]) {
            return 1
        } else if (value < array[mid]) {
            upper = mid - 1
        } else {
            lower = mid + 1
        }
    }
    return 0
}

fun main() = StreamTokenizer(System.`in`.bufferedReader()).run {
    fun readInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = readInt()
    val array = IntArray(n) { readInt() }
        .apply(Arrays::sort)

    val m = readInt()
    buildString {
        repeat(m) {
            append(binarySearch(array, readInt()))
            appendLine()
        }
    }.let(::print)
}