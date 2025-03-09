package lec14

fun main() {
    val dto1 = PersonDto("name", 10)
    val dto2 = PersonDto("name", 10)
    println(dto1 == dto2)
    println(dto1)

    //구조분해할당 가능
    val (name) = dto1
    println(name)
}

//data class는 equals, hashcode, toString 자동 생성
data class PersonDto(
    val name: String,
    val age: Int) {
}
