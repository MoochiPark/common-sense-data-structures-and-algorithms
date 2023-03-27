package chapter06.exercise

fun containsX(string: String): Boolean {
    string.forEach {
        if (it == 'X') {
            return true
        }
    }
    return false
}

fun main() {
    print(containsX("Hello"))
    print(containsX("XOXO"))
}