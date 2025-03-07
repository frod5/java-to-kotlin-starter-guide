package lec06

fun main() {
    // 전통 for문
    // java -> for(int i=1; i<=10; i++) {..}
    for(i in 1..10) {
        println(i)
    }

    println("---------------------------------")

    //내려 가는 범위
    //java -> for(int i=10; i>=10; i--) {...}
    for(i in 10 downTo 1) {
        println(i)
    }

    println("---------------------------------")

    //2칸씩 올라가는 경우
    // java -> for(int i=0; i<=10; i+=2) {...}
    for(i in 1..10 step 2) {
        println(i)
    }
}
