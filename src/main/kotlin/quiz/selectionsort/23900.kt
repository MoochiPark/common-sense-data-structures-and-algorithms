package quiz.selectionsort

/*   백준 23900 알고리즘 수업 - 선택 정렬 6
     문제: https://www.acmicpc.net/problem/23900
     결과: (시간 초과)
*/

import java.io.StreamTokenizer

fun main() = StreamTokenizer(System.`in`.bufferedReader()).run {
    fun readInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = readInt()
    val origin = IntArray(n) { readInt() }
    val target = IntArray(n) { readInt() }

    print(isSelectionSorting(origin, target))
}

fun isSelectionSorting(origin: IntArray, target: IntArray): Int {
    if (origin contentEquals target) {
        return 1
    }

    for (last in origin.size - 1 downTo 2) {
        val maxIndex = origin.copyOfRange(0, last + 1).indices.maxBy { origin[it] }

        if (maxIndex != last) {
            origin[last] = origin[maxIndex].also {
                origin[maxIndex] = origin[last]
            }
            if (target[last] == origin[last]) {
                if (origin contentEquals target) {
                    return 1
                }
            }
        }
    }
    return 0
}