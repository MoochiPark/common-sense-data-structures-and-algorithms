package chapter06.exercise

fun twoSum(array: IntArray): Boolean {
    for ((i, iValue) in array.withIndex()) {
        for ((j, jValue) in array.withIndex()) {
            if (i != j && iValue + jValue == 10) {
                return true
            }
        }
    }
    return false
}

fun main() {
    print(twoSum(intArrayOf(1, 2, 3 ,4, 5, 6)))
    print(twoSum(intArrayOf(1, 2, 3 ,4, 5)))
}