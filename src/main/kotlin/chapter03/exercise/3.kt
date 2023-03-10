package chapter03.exercise

fun chessboardSpace(numberOfGrains: Int): Int {
    var chessboardSpaces = 1
    var placedGrains = 1

    while (placedGrains < numberOfGrains) {
        placedGrains *= 2
        chessboardSpaces += 1
    }

    return chessboardSpaces
}

fun main() {
    print(chessboardSpace(16))
}