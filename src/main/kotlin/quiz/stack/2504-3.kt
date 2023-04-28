package quiz.stack

/*   백준 2504 괄호의 값
     문제: https://www.acmicpc.net/problem/2504
     결과: https://www.acmicpc.net/source/59981932
*/

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine()
    val stack = Stack<Char>()
    var answer = 0
    var open: Char
    var multi = 1

    repeat(input.length) { i ->
        when (input[i]) {
            '(', '[' -> {
                stack.push(input[i])
                multi *= if (input[i] == '(') 2 else 3
            }

            else -> {
                open = if (input[i] == ')') '(' else '['

                if (stack.isEmpty() || stack.peek() != open) {
                    print(0)
                    return
                }

                if (input[i - 1] == open) {
                    answer += multi
                }

                stack.pop()
                multi /= if (input[i] == ')') 2 else 3
            }
        }
    }

    if (stack.isNotEmpty()) {
        print(0)
    } else print(answer)
}
