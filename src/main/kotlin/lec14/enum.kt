package lec14

fun main() {
    val country = Country.KOREA
    when(country) {
        Country.KOREA -> println("KOREA")
        Country.USA -> println("USA")
    }

    val findCode = Country.findCode(country)
    println("findCode = ${findCode}")
}

enum class Country(private val code: String) {

    KOREA("한국"),
    USA("미국");

    companion object {
        @JvmStatic
        fun findCode(country: Country): String? {
            return values().find { enums -> enums.name.equals(country.name) }?.code
        }
    }
}
