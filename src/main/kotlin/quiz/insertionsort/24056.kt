package quiz.insertionsort

/*   백준 24056 알고리즘 수업 - 삽입 정렬 6
     문제: https://www.acmicpc.net/problem/24056
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

    print(isInsertionSorting(origin, target))
}

fun isInsertionSorting(origin: IntArray, target: IntArray): Int {
    if (origin contentEquals target) {
        return 1
    }

    for (index in 1 until origin.size) {
        val tempValue = origin[index]
        var position = index - 1

        while (position >= 0) {
            if (origin[position] > tempValue) {
                origin[position + 1] = origin[position]
                if (origin[position + 1] == target[position + 1]) {
                    if (origin contentEquals target) {
                        return 1
                    }
                }
                position--
            } else break
        }
        origin[position + 1] = tempValue
    }
    return 0
}