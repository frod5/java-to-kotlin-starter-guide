package lec10

import lec10.abstract1.Animal

class Cat(species: String) : Animal(species, 4) {

    override fun move() {
        println("고양이가 움직입니다.")
    }
}
