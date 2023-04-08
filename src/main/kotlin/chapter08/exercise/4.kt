package chapter08.exercise

fun getNotDuplicate(word: String): Char? {
    val hashMap = hashMapOf<Char, Int>()

    word.forEach {
        hashMap[it] = hashMap[it]?.inc() ?: 1
    }

    word.forEach {
        if (hashMap[it] == 1) {
            return it
        }
    }
    return null
}

fun main() {
    val notDuplicate = getNotDuplicate("minimum")
    println(notDuplicate)
}