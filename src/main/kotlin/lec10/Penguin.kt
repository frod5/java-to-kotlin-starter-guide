package lec10

import lec10.abstract1.Animal
import lec10.interface1.Flyable
import lec10.interface1.Swimable

class Penguin(val sepecies: String) : Animal(sepecies, 2), Flyable, Swimable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다.")
    }

    override val legCount: Int
        get() = super.legCount + wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}
