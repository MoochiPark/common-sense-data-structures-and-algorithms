package quiz.etc

import kotlin.math.min

fun main() {
    println(solution("5525", "1255"))
    println(solution("100", "2345"))
    println(solution("100", "203045"))
    println(solution("100", "123450"))
    println(solution("12321", "42531"))
}

fun solution(X: String, Y: String): String {
    val count1 = IntArray(10)
    val count2 = IntArray(10)

    X.forEach { x ->
        count1[x.digitToInt()]++
    }
    Y.forEach { y ->
        count2[y.digitToInt()]++
    }

    return buildString {
        (9 downTo 0).forEach { i ->
            repeat(min(count1[i], count2[i])) {
                append(i)
            }
        }
        when {
            isEmpty() -> return "-1"
            startsWith("0") -> return "0"
        }
    }
}
