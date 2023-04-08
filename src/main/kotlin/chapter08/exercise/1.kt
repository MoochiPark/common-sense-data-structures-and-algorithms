package chapter08.exercise

fun intersect(array1: IntArray, array2: IntArray): List<Int> {
    val hashTable = hashMapOf<Int, Boolean>()
    val result = mutableListOf<Int>()
    array1.forEach {
        hashTable[it] = true
    }

    array2.forEach {
        if (hashTable[it] != null) {
            result.add(it)
        }
    }

    return result
}

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(0, 2, 4, 6, 8)
    val intersect = intersect(array1, array2)
    println(intersect)
}