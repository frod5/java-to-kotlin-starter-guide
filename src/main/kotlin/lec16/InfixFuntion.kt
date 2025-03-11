package lec16

//중위 함수
//변수 함수이름 args
fun main () {
    // 중위 함수 호풀
    3.add2(4) // (1)
    3 add2 4  // (2)
}

fun Int.add(other: Int): Int = this + other

infix fun Int.add2(ohter: Int): Int = this + ohter
