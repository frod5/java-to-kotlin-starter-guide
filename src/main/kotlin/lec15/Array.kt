package lec15

fun main() {
    val array = arrayOf(100,200)

    for (i in array.indices) {
        println(i)
        println(array[i])
    }

    for((idx, value) in array.withIndex()) {
        println("$idx: $value ")
    }

    val plusArray = array.plus(300) // 배열이지만 값추가 기능이 있다.

    for((idx, value) in plusArray.withIndex()) {
        println("$idx: $value ")
    }
}
