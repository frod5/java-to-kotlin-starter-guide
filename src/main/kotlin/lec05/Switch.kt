package lec05

fun getGradeWithSwitch(score: Int): String {
    // kotlin switch
//    return when (score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        6 -> "D"
//        else -> "E"
//    }

    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
    }
}

fun startsWithA(obj: Any): Boolean {

    // when() {
    // 조건문 -> ....
    // 조건문 -> ....
    // 조건문 -> ....
    // else ->
    //}

    return when(obj) {
        is String -> obj.startsWith("A")
        else ->  false
    }
}

fun judgeNumber(number: Int) : Boolean {
    return when(number) {
        -1, 0, 1 -> true
        else -> false
    }
}

fun judgeNumber2(number: Int) {
    //early return
    when {
        number == 0 -> println("zero")
        number % 2 == 0 -> println("even")
        else -> println("odd")
    }
}
