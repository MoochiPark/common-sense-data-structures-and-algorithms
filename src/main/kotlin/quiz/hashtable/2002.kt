package quiz.hashtable

/*   백준 2002 추월
     문제: https://www.acmicpc.net/problem/2002
     결과: https://www.acmicpc.net/source/59917906
*/

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val entryCars = Array(n) { readLine() }
    val checkedCars = HashSet<String>()
    var index = 0
    var answer = 0

    repeat(n) {
        val exitCar = readLine()
        while (entryCars[index] in checkedCars)
            index++

        if (entryCars[index] != exitCar) {
            checkedCars += exitCar
            answer++
        } else index++
    }
    print(answer)
}

// a b c d
// c b a d