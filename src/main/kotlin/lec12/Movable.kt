package lec12

import com.lannstark.lec12.Movable

fun main() {
    moveSomething(object : Movable {

        override fun move() {
            println("move move")
        }

        override fun fly() {
            println("fly fly")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
