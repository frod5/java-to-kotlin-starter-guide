package lec01

class Person(name: String) {
    private var name: String = ""

    fun changeName(name: String) {
        this.name = name
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }
}
