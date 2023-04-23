package quiz.etc

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer = 0
        var n = score.size

        score.sort()

        while (n >= m) {
            answer += score[n - m] * m
            n -= m
        }

        return answer
    }
}

fun main() {
    println(Solution().solution(3, 4, intArrayOf(1, 2, 3, 1, 2, 3, 1)))
    println(Solution().solution(4, 3, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2)))
}