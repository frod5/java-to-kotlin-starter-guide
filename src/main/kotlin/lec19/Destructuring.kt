package lec19

// data class는 기본적으로 field에 대해서 componentN 함수를 만들어준다.
// person.component1 -> 1번쨰 필드 (name)
// person.component2 -> 2번쨰 필드 (age)
data class Person(var name: String, var age: Int)

/**
 * 구조 분해
 */
fun main() {
    val person = Person("kim", 30)
    val (name, age) = person
    println("$name, $age")
}
