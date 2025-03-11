package lec15

fun main() {

    // List<Int?> -> list null X, list element null O
    val list1: List<Int?> = listOf(null)
//    val list2: List<Int?> = null // error

    // List<Int>? -> list null O, list element null X
    val list3: List<Int>? = null
//    val list4: List<Int>? = listOf(null) //error

    // List<Int?>? -> list null O, list element null O
    val list5: List<Int?>? = null
    val list6: List<Int?>? = listOf(null)
}
