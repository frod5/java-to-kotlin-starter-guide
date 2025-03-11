package lec17

import com.lannstark.lec17.Fruit

//Java에선 함수가 2급 시민
//코틀린은 1급 시민 -> 변수에 함수 할당 가능, 파라미터에 함수 가능.

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    // 람다를 만드는 방법 1
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name.equals("사과")
    }

    // 람다를 만드는 방법 2
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name.equals("사과") }

    // 람다를 직접 호출하는방법 1
    isApple(fruits[0])

    // 람다를 직접 호출하는방법 2
    isApple.invoke(fruits[1])

    filterFruits(fruits, isApple)
    filterFruits(fruits, isApple2)
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if(filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}
