package lec19

// import alias
import com.lannstark.lec17.Fruit as FruitKt

// type alias
typealias FruitFilter = (FruitKt) -> Boolean

fun filterFruits(fruits: List<FruitKt>, filter: FruitFilter): List<FruitKt> {
   return fruits.filter(filter)
}




