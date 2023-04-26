package chapter09.exercise
fun main() {
    println(readln().reverse())
}

fun String.reverse(): String {
    val stack = ArrayDeque<Char>()
    this.forEach { stack.addLast(it) }
    var string = ""
    while (stack.isNotEmpty()) {
        string += stack.removeLast()
    }
    return string
}