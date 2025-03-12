package lec19

class Person2(var name: String, var age: Int) {

    // componentN 함수를 구현하면 data class가 아니어도 구조 분해 가능.
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {
    val person = Person2("kim", 30)
    val (name, age) = person
    println("$name, $age")
}
