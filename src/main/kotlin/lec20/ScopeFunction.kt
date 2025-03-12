package lec20

import lec09.Person

/**.
 * scope Function
 * 1. let
 * 2. run
 * 3. also
 * 4. apply
 * 5. with
 *
 * let, run -> 람다의 결과 반환
 * also, apply -> 객체 그 자체 반환
 */

fun main() {
    printPerson(Person("kim", 20))
}

fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }

//    when {
//        person != null -> {
//            println(person.name)
//            println(person.age)
//        }
//    }
}
