package quiz.primality

/*   백준 1929 소수 구하기(소수 판별 알고리즘)
     문제: https://www.acmicpc.net/problem/1929
     결과: https://www.acmicpc.net/source/57202500
*/

import java.util.StringTokenizer

fun main() = with(StringTokenizer(readln())) {
    fun readInt(): Int = nextToken().toInt()
    buildString {
        for (i in readInt()..readInt()) {
            if (isPrime(i) && i != 1) {
                append(i).appendLine()
            }
        }
    }.let(::print)
}

private fun isPrime(number: Int): Boolean {
    var p = 2
    while (p * p <= number) {
        if (number % p == 0) return false
        p++
    }
    return true
}