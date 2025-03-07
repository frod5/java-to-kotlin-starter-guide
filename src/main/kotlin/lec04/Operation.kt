package lec04

import com.lannstark.lec04.JavaMoney

fun main() {
    // 단항 연산자 (++, --), 산술 연산자 (+,-,*,/,%), 산술 대입 연산자 (+=. -=, *=, /=, %=) => 모두 Java와 동일
    // 비교 연산자 (<,>, >=, <=) Java와 모두 동일

    // 자바와 다르게 comparable을 구현한 객체는 compareTo()로 비교하지 않아도 코틀린이 비교해준다.
    val money1 : JavaMoney = JavaMoney(2_000L)
    val money2 : JavaMoney = JavaMoney(1_000L)

    if(money1 > money2) {
        println("money1 > money2")
    }
}
