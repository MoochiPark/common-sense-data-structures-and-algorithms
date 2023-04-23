package quiz.etc

class Solution2 {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var index1 = 0
        var index2 = 0

        for (word in goal) {
            if (cards1.size > index1 && cards1[index1] == word) {
                index1++
            } else if (cards2.size > index2 && cards2[index2] == word) {
                index2++
            } else {
                return "No"
            }
        }
        return "Yes"
    }
}

fun main() {
    println(Solution2().solution(
        arrayOf("i", "drink", "water"),
        arrayOf("want", "to"),
        arrayOf("i", "want", "to", "drink", "water"),
    ))

    println(Solution2().solution(
        arrayOf("i", "water", "drink"),
        arrayOf("want", "to"),
        arrayOf("i", "want", "to", "drink", "water"),
    ))
}