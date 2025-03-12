package lec19

fun main() {
    val number: Int = -1
    fun getNumberOrNull(): Int? {
        return if (number < 0) null else number
    }
    println(getNumberOrNull())

    // takeIf -> true면 num, 아니면 null
    fun getNumberOrNull2(): Int? {
        return number.takeIf { num -> num > 0 }
    }

    // takeUnless -> false면 값, 아니면 null
    fun getNumberOrNull3(): Int? {
        return number.takeUnless { num -> num < 0 }
    }

    println(getNumberOrNull2())
    println(getNumberOrNull3())
}


