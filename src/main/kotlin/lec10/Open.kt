package lec10

fun main() {
    val derived = Derived(300)
}

//추상클래스가 아닌 일반 클래스에서 상속이 가능하기위해서는 open으로 열어 주어야한다.
open class Base(open val number: Int = 100) {
    init {
        println("Base Init")
//        println(number) // 상위 클래스에서 하위 클래스의 값을 호출하면 안된다.
    }
}

class Derived(override val number: Int) : Base(number) {
    init {
        println("Derived Init")
        println(number)
    }
}
