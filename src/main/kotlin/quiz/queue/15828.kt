package quiz.queue

import java.io.*
import java.util.LinkedList
import java.util.StringTokenizer

fun main() = with(StringTokenizer(readln())) {
    val n = nextToken().toInt()
    val buffer = LinkedList<Int>()
    var size = 0
    var current: Int

    while (true) {
        current = nextToken().toInt()
        if (current == 0) {
            buffer.remove()
            size--
        } else if (current != -1 && size < n) {
            buffer.add(current)
            size++
        } else if (current == -1) {
            println(
                buildString {
                    buffer.forEach { append("$it ") }
                    ifEmpty { append("empty") }
                }
            )
            break
        }

    }
}