package lec12

fun main() {
//    Person.Companion.newBaby("baby") // Companion 객체 이름이 없는 경우 default -> Companion
//    val newBaby = Person.Factory.newBaby("baby2") //이름이 있는 경우 객체 이름으로 접근
    val newBaby = Person.newBaby("baby3")
}

class Person private constructor(var name: String, var age: Int) {

    //동행 객체 -> java static 대신
    //동반 객체도 하나의 객체로 간주
    //네이밍도 할 수 있고, interface를 구현할 수도있다.

    companion object Factory : Log{
        private const val MIN_AGE : Int = 1  // const 선언 시 컴파일시 값 할당, 없으면 런타임 시

        @JvmStatic // 선언된 함수는 자바처럼 Person.newBaby()로 호출
        fun newBaby(name:String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person.companion.object.log()")
        }
    }

}
