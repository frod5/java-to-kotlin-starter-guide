package lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) { // if -> java와 같음
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    // java와 다르게 if-else가 Expression이기 때문에 값으로 사용가능.
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else if (score > 60) {
        "D"
    } else {
        "F"
    }
}

fun validateScoreRange(score: Int) : Boolean {
    return score in 0..100
}
