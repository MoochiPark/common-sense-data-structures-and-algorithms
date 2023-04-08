package chapter08.exercise

fun getMissingAlphabet(sentence: String): Char? {
    val hashSet = hashSetOf<Char>()

    sentence.toCharArray()
        .filter { it.isLetter() }
        .forEach {
            hashSet.add(it)
        }

    for (alphabet in 'a'..'z') {
        if (hashSet.add(alphabet)) {
            return alphabet
        }
    }
    return null
}

fun main() {
    val alphabet = getMissingAlphabet("the quick brown jumps over a lazy dog")
    println(alphabet)
}