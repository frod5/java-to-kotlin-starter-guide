package lec15


fun main() {
    val map = mapOf(1 to "one", 2 to "two")
    map.plus(3 to "three")

    for (entry in map) {
        println(entry.key)
        println(entry.value)
    }

    for ((key, value) in map.entries) {
        println("$key: $value")
    }

    for (key in map.keys) {
        println("$key: value: ${map.get(key)}")
        println(map[key])
    }
}
