package quiz.recursion

import java.math.BigInteger


/*   백준 1914 하노이 탑
     문제: https://www.acmicpc.net/problem/1914
     결과: https://www.acmicpc.net/source/
*/

fun main() {
    val n = readln().toInt()
    if (n <= 20) {
        val tower = HanoiTower(n)
        tower.solve()
        tower.print()
    } else {
        print(2.toBigInteger().pow(n).dec())
    }
}

class HanoiTower(
    private val initialN: Int,
) {
    private var count: Long = 0
    private val sb = StringBuilder()
    fun solve(n: Int = initialN, from: Int = 1, to: Int = 3, aux: Int = 2) {
        if (n == 1) {
            move(from, to)
        } else {
            solve(n - 1, from, aux, to)
            move(from, to)
            solve(n - 1, aux, to, from)
        }
    }

    fun print() {
        println(count)
        print(sb)
    }

    private fun move(from: Int, to: Int) {
        count++
        sb.appendLine("$from $to")
    }
}