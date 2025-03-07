package lec04

import com.lannstark.lec04.JavaMoney

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(1_000L)

    println(money1 == money2) // java -> money1.equals(money2) --> 동등성 (equals를 구현하여 값이 같다면 같다고하면)
    println(money1 === money2) // java -> money1 == money2 -> 동일성 (주소값이 같아야함)

    // 논리연산 (&&, ||) -> 자바와 동일.
}
