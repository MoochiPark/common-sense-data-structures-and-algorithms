package chapter03.exercise

fun selectAStrings(array: List<String>): List<String> {
    val newArray = mutableListOf<String>()

    array.forEach {
        if (it.startsWith("a")) {
            newArray.add(it)
        }
    }

    return newArray
}

fun main() {
    print(selectAStrings(listOf("apple", "banana", "cherry")))
}