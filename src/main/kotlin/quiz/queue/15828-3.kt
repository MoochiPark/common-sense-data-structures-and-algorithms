package quiz.queue

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val queue = IntArray(n)
    var front = 0
    var rear = -1
    var current: Int

    while (true) {
        current = readLine().toInt()
        when {
            current == 0 -> front++
            current == -1 -> break
            front + n - 1 > rear -> {
                rear++
                queue[rear % n] = current
            }
        }
    }

    print(
        if (front > rear) "empty"
        else buildString {
            for (i in front..rear) {
                append(queue[i % n]).append(" ")
            }
        }
    )
}