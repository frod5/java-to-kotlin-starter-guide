package lec01

import com.lannstark.lec01.Person

fun main() {

    var number1 = 10L // java -> long number1 = 10; (타입 추론)
    val number2 = 10L // java -> final long number2 = 10; (타입 추론)

    var number3 : Long = 10L // 타입 명시
    val number4 : Long = 10L // 타입 명시


    // primitive type , reference type
    val number5 : Long = 10L // 코틀린에선 모두 Long으로 표현, 하지만 단순 연산만 필요한 경우 코틀린이 자동으로 long 타입으로 컴파일함.

    // 코틀린은 기본으로 null을 할당할 수 없다. Null을 할당하려면 '?' 사용.
    val number6 : Long? = null


    // 객체 생성
    var person : Person = Person("name") // new keyword 생략
}
