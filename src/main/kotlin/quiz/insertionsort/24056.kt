package quiz.insertionsort

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