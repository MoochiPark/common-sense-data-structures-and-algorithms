package chapter04

fun <T : Comparable<T>> hasDuplicateValueV1(array: Array<T>): Boolean {
    var steps = 0
    for ((iIndex, i) in array.withIndex()) {
        for ((jIndex, j) in array.withIndex()) {
            steps++
            if (iIndex != jIndex && i == j) {
                return true
            }
        }
    }
    println(steps)
    return false
}

fun <T : Comparable<T>> hasDuplicateValueV2(array: Array<T>): Boolean {
    var steps = 0
    val existingNumbers = mutableSetOf<T>()
    for (element in array) {
        steps++
        if (!existingNumbers.add(element)) {
            return true
        }
    }
    println(steps)
    return false
}

fun main() {
    println(hasDuplicateValueV1(arrayOf(1, 5, 3, 9, 2, 4)))
    println(hasDuplicateValueV2(arrayOf(1, 5, 3, 9, 1, 4)))
}