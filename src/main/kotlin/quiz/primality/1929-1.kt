package quiz.primality

/*   백준 1929 소수 구하기(에라토스테네스의 체)
     문제: https://www.acmicpc.net/problem/1929
     결과: https://www.acmicpc.net/source/57203146
*/

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun readInt(): Int {
        nextToken()
        return nval.toInt()
    }
    eratosthenesSieve(readInt(), readInt())
}

private fun eratosthenesSieve(m: Int, n: Int) {
    val isPrime = BooleanArray(n + 1)
    var p = 2
    while (p * p <= n) {
        var multiple = p * p
        while (multiple <= n) {
            isPrime[multiple] = true
            multiple += p
        }
        p++
    }

    buildString {
        for (i in m..n) {
            if (!isPrime[i] && i != 1) {
                append(i).appendLine()
            }
        }
    }.let(::print)
}
