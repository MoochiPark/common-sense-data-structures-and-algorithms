package quiz.stack

fun main() {
    val input = readln()
    val stack = ArrayDeque<String>()

    input.split("").forEach { brace ->
        when (brace) {
            ")" -> when (stack.last()) {
                "(" -> {
                    stack.removeLast()
                    stack.addLast("2")
                }

                else -> {
                    var sum = 0
                    while (stack.last() != "(") {
                        sum += stack.removeLast().toInt()
                    }
                    stack.removeLast()
                    stack.addLast("${sum * 2}")
                }
            }

            "]" -> when (stack.last()) {
                "[" -> {
                    stack.removeLast()
                    stack.addLast("3")
                }

                else -> {
                    var sum = 0
                    while (stack.last() != "[") {
                        sum += stack.removeLast().toInt()
                    }
                    stack.removeLast()
                    stack.addLast("${sum * 3}")
                }
            }

            else -> stack.addLast(brace)
        }
    }

    println(
        stack
        .filter { it.isNotEmpty() }
        .sumOf { it.toInt() }
        )
}