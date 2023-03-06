package chapter02

fun main() {
    print(
        linearSearch(
            intArrayOf(3, 17, 75, 80, 202), 22
        )
    )
}

fun linearSearch(array: IntArray, searchValue: Int): Int? {
    for ((index, element) in array.withIndex()) {
        if (element == searchValue) {
            return index
        } else if (element > searchValue) {
            break
        }
    }
    return null
}