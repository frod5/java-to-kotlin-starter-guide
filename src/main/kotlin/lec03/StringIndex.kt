package lec03

fun main() {
    val str : String = """
        ABC
        123
        456
    """.trimIndent()

    println(str)

    val str2 : String = "ABC"
    println(str2[0]) // java ->  str2.charAt(0)
    println(str2[1])
    println(str2[2])
}
