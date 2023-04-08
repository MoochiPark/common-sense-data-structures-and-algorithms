package chapter07

fun wordBuilder(array: Array<String>): MutableList<String> {
    val collection = mutableListOf<String>()

    array.forEachIndexed { i, iValue ->
        array.forEachIndexed { j, jValue ->
            array.forEachIndexed { k, kValue ->
                if (i != j && j != k && i != k) {
                    collection.add(iValue + jValue + kValue)
                }
            }
        }
    }
    return collection
}

fun main() {
    wordBuilder(arrayOf("a", "b", "c", "d"))
        .forEach { print("$it ") }
}