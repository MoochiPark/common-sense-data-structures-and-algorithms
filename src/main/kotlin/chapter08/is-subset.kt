package chapter08

import kotlin.system.measureNanoTime

fun isSubset(array1: Array<String>, array2: Array<String>): Boolean {
    val largerArray: Array<String>
    val smallerArray: Array<String>

    if (array1.size > array2.size) {
        largerArray = array1
        smallerArray = array2
    } else {
        largerArray = array2
        smallerArray = array1
    }


    for (s in smallerArray) {
        var foundMatch = false
        for (l in largerArray) {
            if (s == l) {
                foundMatch = true
                break
            }
        }
        if (!foundMatch) {
            return false
        }
    }
    return true
}

fun isSubsetHash(array1: Array<String>, array2: Array<String>): Boolean {
    val largerArray: Array<String>
    val smallerArray: Array<String>

    if (array1.size > array2.size) {
        largerArray = array1
        smallerArray = array2
    } else {
        largerArray = array2
        smallerArray = array1
    }

    val hashTable: HashMap<String, Boolean> = hashMapOf()

    for (value in largerArray) {
        hashTable[value] = true
    }

    for (value in smallerArray) {
        if (hashTable[value] == null) {
            return false
        }
    }
    return true
}

fun main() {
    val array1 = arrayOf("a", "b", "c", "d", "e", "f")
    val array2 = arrayOf("b", "d", "f", "h")

    val time1 = measureNanoTime {
        isSubset(array1, array2)
    }
    val time2 = measureNanoTime {
        isSubsetHash(array1, array2)
    }
    print("$time1, $time2")
}