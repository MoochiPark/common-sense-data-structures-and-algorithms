package quiz.stack

fun main() {
    val input = readln()
    val stack = ArrayDeque<String>()


    input.split("").forEach { brace ->
        when (brace) {
            ")", "]" -> {
                val matching = if (brace == ")") "(" else "["
                val multi = if (brace == ")") 2 else 3

                when (stack.last()) {
                    matching -> {
                        stack.removeLast()
                        stack.addLast("$multi")
                    }

                    else -> {
                        var sum = 0
                        while (stack.last() != matching) {
                            sum += stack.removeLast().toIntOrNull()
                                ?: run { println(0); return }
                        }
                        stack.removeLast()
                        stack.addLast("${sum * multi}")
                    }
                }
            }

            else -> stack.addLast(brace)
        }
    }
    println(
        stack.filter { it.isNotEmpty() }
            .sumOf { it.toIntOrNull() ?: run { println(0); return } }
    )
}