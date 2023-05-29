package quiz.recursion

import java.io.BufferedWriter

/*   백준 1914 하노이 탑
     문제: https://www.acmicpc.net/problem/1914
     결과: https://www.acmicpc.net/source/61452539
*/

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    appendLine("${2.toBigInteger().pow(n).dec()}")
    if (n <= 20) {
        hanoiTower(n, 1, 3, 2, this)
    }
    flush()
}

fun hanoiTower(
    n: Int, from: Int, to: Int, aux: Int, bw: BufferedWriter,
) {
    if (n == 0) return
    hanoiTower(n - 1, from, aux, to, bw)
    bw.appendLine("$from $to")
    hanoiTower(n - 1, aux, to, from, bw)
}
