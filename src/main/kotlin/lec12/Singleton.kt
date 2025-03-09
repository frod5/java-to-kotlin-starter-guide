package lec12

fun main() {
    println(Singleton.name)
    print(Singleton.upper("test"))
}

object Singleton {
    var name: String = "singleton"

    fun upper(str:String): String {
        return str.uppercase()
    }
}
