package lec16

import com.lannstark.lec16.Person

fun main() {
    val str: String = "ABC"
    println(str.lastChar())

    val person: Person = Person("kim","cucu", 10)
    person.nextYearAge() // 확장함수, 기존 멤버함수의 시그니처가 같으면, 멤버함수 우선 호출
}


// 확장 함수
fun String.lastChar(): Char {
    return this[this.length - 1] // this -> 수신 객체
}

fun Person.nextYearAge(): Int {
    println("확장함수")
    return this.age + 1
}
