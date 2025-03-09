package lec10.abstract1

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int  // 추상프로퍼티가 아니라면, 상속받을떄 open 키워드를 넣어야한다.
) {
    abstract fun move()
}
