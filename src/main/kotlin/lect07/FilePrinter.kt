package lect07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    fun readFile() {

        //Kotlin은 모두 unchecked Exception으로 처리한다.
        val currentFile: File = File(".")
        val file: File = File(currentFile.absolutePath + "/a.txt")
        val reader:BufferedReader = BufferedReader(FileReader(file))
        val content = reader.readLine()
        println(content)
        reader.close()
    }

    fun readFile(path: String) {
        // Kotlin은 try-with-resources가 없다.
        BufferedReader(FileReader(path)).use {
            content -> println(content)
        }
    }
}
