package quiz.etc

import kotlin.math.min

class Solution3 {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var zeroCount = 0
        var correctCount = 0

        lottos.forEach {
            if (win_nums.contains(it)) {
                correctCount++
            }
            if (it == 0) {
                zeroCount++
            }
        }
        val maxPrize = 7 - correctCount - zeroCount
        val minPrize = 7 - correctCount
        return intArrayOf(min(maxPrize, 6), min(minPrize, 6))
    }
}

fun main() {
    Solution3().solution(
        intArrayOf(44, 1, 0, 0, 31, 25),
        intArrayOf(31, 10, 45, 1, 6, 19)
    ).forEach {
        print("$it, ")
    }
    println()
    Solution3().solution(
        intArrayOf(0, 0, 0, 0, 0, 0),
        intArrayOf(38, 19, 20, 40, 15, 25)
    ).forEach {
        print("$it, ")
    }
    println()
    Solution3().solution(
        intArrayOf(45, 4, 35, 20, 3, 9),
        intArrayOf(20, 9, 3, 45, 4, 35)
    ).forEach {
        print("$it, ")
    }
    println()
    Solution3().solution(
        intArrayOf(1, 1, 1, 1, 1, 1),
        intArrayOf(20, 9, 3, 45, 4, 35)
    ).forEach {
        print("$it, ")
    }
}