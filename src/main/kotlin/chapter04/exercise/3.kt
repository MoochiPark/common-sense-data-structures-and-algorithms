package chapter04.exercise

fun greatestProduct(array: IntArray): Int {
    var greatestProductSoFar = array[0] * array[1]

    for ((iIndex, i) in array.withIndex()) {
        for ((jIndex, j) in array.withIndex()) {
            if (i != j && i * j > greatestProductSoFar) {
                greatestProductSoFar = i * j
            }
        }
    }
    return greatestProductSoFar
}
