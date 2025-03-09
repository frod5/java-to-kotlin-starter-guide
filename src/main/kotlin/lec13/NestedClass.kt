package lec13

fun main() {

}

// 중첩클래스 (static한 중첩클래스 -> 상위 클래스 직접 참조 불가능)
class JavaHouse(
    var address: String,
    var livingRoom: LivingRoom = LivingRoom(10.0),) {

    class LivingRoom(private val area: Double)
}

// 중첩클래스 (static 하지 않음 -> 상위 클래스를 직접 접근 가능)
// 내부 클래스
class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address // 상위 클래스 직접 접근.
    }
}

// 중첩 클래스를 사용할 때는 static한 중첩클래스 사용 권장.
