package lec15

fun main() {
    val numberSet = setOf(100,200)

    for (set in numberSet) {
        println(set)
    }

    val toMutableSet = numberSet.toMutableSet()
    toMutableSet.add(400)

    for (set in toMutableSet) {
        println(set)
    }
}
