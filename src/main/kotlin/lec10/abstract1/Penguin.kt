package lec10.abstract1

class Penguin(val sepecies: String) : Animal(sepecies, 2) {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다.")
    }

    override val legCount: Int
        get() = super.legCount + wingCount
}
