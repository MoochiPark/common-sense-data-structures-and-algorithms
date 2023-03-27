package chapter06

fun <T : Comparable<T>> insertionSort(array: Array<T>) {
    for (index in 1 until array.size) { // 인덱스 1부터 시작하는 패스스루
        val tempValue = array[index]          // 각 패스스루마다 제거 중인 값을 저장
        var position = index - 1             // 바로 왼쪽 인덱스에서 시작, 비교 대상

        while (position >= 0) {     // position이 계속 왼쪽으로 움직이며 비교
            if (array[position] > tempValue) {  // position에 있는 값이 tempValue보다 큰지 확인
                array[position + 1] = array[position]  // 크다면 왼쪽 값을 오른쪽으로 쉬프트
                position-- // 다음 왼쪽값을 비교할 수 있도록 position 값 1 감소
            } else break  // position 값이 같거나 작으면 tempValue를 공백에 삽입
        }

        array[position + 1] = tempValue // 각 패스스루 마지막에 tempValue를 공백에 삽입
    }
}

fun main() {
    val array = arrayOf(3, 2, 1, 7, 8, 4)
    insertionSort(array)
    array.forEach { print("$it ") }
}