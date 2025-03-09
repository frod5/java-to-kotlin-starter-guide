package lec11
// 유틸 클래스 생성할떄 그냥 함수만 정의하면 된다.
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}
