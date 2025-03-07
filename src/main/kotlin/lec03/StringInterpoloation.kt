package lec03

import com.lannstark.lec03.Person

/**
 * String Interpolation
 * 문자열 보간
 */

fun main() {
    var person : Person = Person("name",20)
    val str : String = "사람의 이름:${person.name} 나이 : ${person.age}"
    val str2 : String = "사람의 이름:$person.name 나이 : $person.age" // {} 생략 가능
}
