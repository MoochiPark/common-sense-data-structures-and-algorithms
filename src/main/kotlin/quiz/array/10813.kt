package quiz.array

import java.util.StringTokenizer

/*   백준 10813 공 바꾸기
     문제: https://www.acmicpc.net/problem/10813
     결과: https://www.acmicpc.net/source/56421284
*/


fun main() {
    val n: Int
    val m: Int
    StringTokenizer(readln()).apply {
        n = nextToken().toInt()
        m = nextToken().toInt()
    }
    val array = IntArray(n) { it + 1 }

    var i: Int
    var j: Int
    repeat(m) {
        StringTokenizer(readln()).apply {
            i = nextToken().toInt().dec()
            j = nextToken().toInt().dec()
        }
        array[i] = array[j].also {
            array[j] = array[i]
        }
    }

    print(
        StringBuilder().apply {
            array.forEach {
                append("$it ")
            }
        }
    )
}