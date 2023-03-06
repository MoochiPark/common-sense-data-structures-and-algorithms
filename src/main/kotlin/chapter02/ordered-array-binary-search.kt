package chapter02

fun main() {
    print(
        binarySearch(intArrayOf(3, 17, 75, 80, 202), 22)
    )
}

fun binarySearch(array: IntArray, searchValue: Int): Int? {
    // 찾으려는 값이 있을 수 있는 상한선과 하한선을 정한다.
    var lowerBound = 0
    var upperBound = array.size - 1

    // 상한선과 하한선 사이의 가운데 값을 계속해서 확인하는 루프를 시작한다.
    while (lowerBound <= upperBound) {
        // 상한선과 하한선 사이에 중간 지점을 찾는다.
        val midPoint = (upperBound + lowerBound) / 2

        // 중간 지점의 값을 확인한다.
        val valueAtMidPoint = array[midPoint]

        // 중간 지점의 값이 찾고 있던 값이면 검색을 끝낸다.
        // 그렇지 않으면 추측한 바에 따라 상한선이나 하한선을 바꾼다.
        if (searchValue == valueAtMidPoint) {
            return midPoint
        } else if (searchValue < valueAtMidPoint) {
            upperBound = midPoint - 1
        } else {
            lowerBound = midPoint + 1
        }
    }
    // 상한선과 하한선이 같아질 때까지 경계값을 줄였다면
    // 찾고 있는 값이 이 배열에 없다는 의미다.
    return null
}
