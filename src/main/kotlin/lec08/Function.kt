package lec08

fun main() {
    repeat("hello world", 3, true)
    println()
    repeat("hello world")
    println()
    repeat("hello world", useNewLine = false) // named Argument

    println()

    val array = arrayOf("1", "2", "3")
    printAll(*array) // 배열을 넣을경우 '*'
    println()
    printAll("4","5","6")
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

// default parameter
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for(i in 1..num) {
        if(useNewLine){
            println(str)
        } else {
            print(str)
        }
    }
}

// 가변 인자
fun printAll(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}
