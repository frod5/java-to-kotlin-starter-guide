package lec09

fun main() {
    val person: Person = Person("name", 10)
    println("---------")
    val person2: Person = Person("name")
    println("---------")
    val person3: Person = Person()
//    println(person.name)
//    println(person.age)
}

// 코틀린은 getter, setter를 자동생성해준다.
//constructor 생략 (주 생성자)
class Person(val name: String, var age: Int) {

    //생성자 초기화
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    // 추가 생성자
    constructor(name: String) : this(name, 1) {
        println("부 생성자1")
    }

    constructor() : this("defaultName") {
        println("부 생성자2")
    }

    //부생성자 보단 default parameter를 사용하자
    //객체 변환은 정적 팩토리 메소드를 사용하자.

//    fun isAdult(): Boolean {
//        return age > 19
//    }

    //custom getter -> property처럼 사용
    val isAdult: Boolean
        get() = age > 19
}
