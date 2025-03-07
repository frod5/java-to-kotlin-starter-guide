package lec03

import com.lannstark.lec03.Person

fun main() {

}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { // java -> instanceOf
        val person = obj as Person // 타입 캐스팅 java -> (Person) obj. 생략 가능 -> if문에서 한번 체크 했기 때문에.
        println(person.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person // null이 아니면 캐스팅 아니면 null
    println(person?.age)
}


// Any -> java에서 Object

// Unit -> java에서 void

// Noting -> 함수가 정상적으로 끝나지 않았다는 사실 표현하는 역할. ex) 무한 루프, 무조건 예외를 반환하는 함수.
