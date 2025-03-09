package lec11

fun main() {
    val car = Car("bmw", "me", 1000)

}

class Car(
    internal val name: String, // name의 getter internal
    private var owner: String, // owner의 getter, setter 모두 private
    _price: Int
) {
    var price = _price
        private set  // setter private
}


// java와 코틀린을 함께 사용시
// 코틀린의 internal은 컴파일시 public이기 때문에 자바에서 internal코드를 가져올 수 있다.
// protected -> 코틀린에선 선언된클래스,하위클래스에서 접근가능하지만, 자바와 함께사용시 패키지만 같다면 코틀린 protected 접근 가능.
