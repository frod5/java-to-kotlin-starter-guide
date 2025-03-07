package lec03

fun main() {

    // 1. 기본 타입
    val number1 = 3 // Int 타입
//    val number2 : Long = number1 // error -> 자바와 다르게 암시적으로 형변환을 해주지 않는다.
    val number2 : Long = number1.toLong() // 명시적 형변환을 해주어야한다.

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L // null처리 해야함

    // 2. 타입 캐스팅



}
