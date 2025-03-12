package lec19

fun main() {

    //label
    abc@ for (i in 1..10) {
        for (j in 1..10) {
            if(j == 2) break@abc
            println("${i} ${j}")
        }
    }

    //Label은 사용 지양
}
