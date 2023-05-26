package quiz.queue

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val buffer = LinkedList<Int>()
    var size = 0

    while (true) {
        val current = readLine().toInt()
        when {
            current == 0 -> {
                buffer.poll()
                size--
            }
            current == -1 -> break
            size < n -> {
                buffer.offer(current)
                size++
            }
        }
    }

    print(
        if (buffer.isEmpty()) "empty" else buffer.joinToString(" ")
    )
}