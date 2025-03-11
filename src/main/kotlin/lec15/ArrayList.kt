package lec15

fun main() {
    val numbers = listOf(100, 200) // 불변 List
    val emptyList = emptyList<Int>()

    val getFirstIndex = numbers.get(0) // java처럼 get()
    val getFirstIndex2 = numbers[0] // 코틀린은 배열처럶 접근도 가능

    for (number in numbers) {
        println(number)
    }

    for ((idx, number) in numbers.withIndex()) {
        println("$idx: $number")
    }


    val mutableList = mutableListOf(100, 200) // 가변 List
    mutableList.add(300)

    for (mutableVal in mutableList) {
        println(mutableVal)
    }

    // 불변 리스트 -> 가변 리스트
    val toMutableList = numbers.toMutableList()
    toMutableList.add(400)
}
