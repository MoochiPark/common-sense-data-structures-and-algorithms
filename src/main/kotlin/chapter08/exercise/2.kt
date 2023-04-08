package chapter08.exercise

fun getDuplicate(array: Array<String>): String? {
    val hashSet = hashSetOf<String>()

    for (value in array) {
        if (!hashSet.add(value)) {
            return value
        }
    }

    return null
}

fun main() {
    val array = arrayOf("a", "b", "c", "c", "d", "e")
    val duplicate = getDuplicate(array)
    print(duplicate)
}