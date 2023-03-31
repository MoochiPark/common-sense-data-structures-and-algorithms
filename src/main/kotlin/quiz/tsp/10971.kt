package quiz.tsp

import java.io.StreamTokenizer

// TODO: 진행 중

fun main() = StreamTokenizer(System.`in`.bufferedReader()).run {
    fun readInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = readInt()
    val citiesCosts = Array(n) { IntArray(n) { readInt() } }
    val stack = ArrayDeque<IntArray>()
    var totalCost = 0

    citiesCosts.forEachIndexed { i, costs ->
        val arrivals = BooleanArray(n)
        val startIndex = i
        arrivals[startIndex] = true

        costs.forEachIndexed { j, cost ->
            if (cost == costs.min() && !arrivals[j]) {
                totalCost += cost
                arrivals[j] = true
            }
        }
    }
}