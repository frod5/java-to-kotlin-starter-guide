package lec11

// Java와 코틀린의 접근제어자 비교
//   java           kotlin
// 1. public        public          -> 자바, 코틀린 같다.
// 2. protected     protected       -> 자바는 같은 패키지, 하위클래스에서 접근가능, 코틀린은 선언된 클래스, 하위클래스에서 접근가능.
// 3. default        없음             -> 코틀리은 default 명령어가 없다.
// 4. 없음            internal        -> internal은 같은 모듈안에서만 접근가능.
// 5. private        private        -> 자바, 코틀린 같다.

// java의 기본 접근제어자는 default, 코틀린은 public

// 코틀린은 .kt 파일에 변수, 함수, 클래스 여러개를 바로 만들 수 있다.

// 파일에서의 접근제어
// protected는 사용불가 -> 선언된 클래스, 하위클래스에서 접근가능하기 때문
// public -> 모두 접근가능
// internal -> 같은 모듈에서 접근가능
// private -> 같은 파일에서만 접근
val a = 3

fun test() {
    println()
}

class A {}
