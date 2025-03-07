package lec02

class Person(name: String) {

    private var name: String = ""

    fun getName() : String {
        return this.name
    }

    fun changeName(name: String) {
        this.name = name
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }
}
