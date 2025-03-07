package lec02

fun main() {

    val str: String? = "ABC"
//    println(str.length) // error -> null이 올 수있어 . 접근 불가
    println(str?.length) // safe call -> null 아니면 .length

    println(str?.length ?: 0) // elvis 연산자 ?: 사용 null이면 0

//    println(startsWithA4(null)) // NPE !!

    // 코틀린에선 Null이 들어갈 수 있는 타입은 완전히 다르게 인지한다. ex) String, String? 둘은 다른 타입.
    // 코틀린에서 한번 null 체크를 하면 그 뒤에는 non null을 컴파일러가 알 수 있다.
    // null이 아닌 경우에만 실행되는 safe call -> ?.
    // null인 경우에만 실행되는 elvis -> ?:
    // null이 절대 될 수 없을 때 -> !!
    // kotlin에서 자바 코드를 사용할 때 플랫폼 타입 사용 유의
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("str is null")
}

fun startsWithA2(str: String?) : Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?) : Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?) : Boolean {
    // not null 단언 '!!', 아무리 생각해도 null이 아닐 때
    return str!!.startsWith("A")
}
