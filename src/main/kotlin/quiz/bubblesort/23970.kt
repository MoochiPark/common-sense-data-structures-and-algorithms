package quiz.bubblesort

/*   백준 23970 알고리즘 수업 - 버블 정렬 3
     문제: https://www.acmicpc.net/problem/23970
     결과: https://www.acmicpc.net/source/58510240
*/

import java.io.StreamTokenizer

fun main() = StreamTokenizer(System.`in`.bufferedReader()).run {
    fun readInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = readInt()
    val originArray = IntArray(n) { readInt() }
    val targetArray = IntArray(n) { readInt() }

    print(isBubbleSorting(originArray, targetArray))
}

fun isBubbleSorting(originArray: IntArray, targetArray: IntArray): Int {
    if (originArray contentEquals targetArray) {
        return 1
    }
    (originArray.size downTo 2).forEach { last ->
        (0 until last - 1).forEach { i ->
            if (originArray[i] > originArray[i + 1]) {
                originArray[i] = originArray[i + 1].also {
                    originArray[i + 1] = originArray[i]
                }
                if (originArray[i] == targetArray[i]) {
                    if (originArray contentEquals targetArray) {
                        return 1
                    }
                }
            }
        }
    }
    return 0
}
