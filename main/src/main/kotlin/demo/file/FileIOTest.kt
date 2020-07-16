package demo.file

import java.io.File
import java.nio.charset.Charset

class FileIOTest {


    fun getFileContent(filename: String): String {
        val f = File(filename)
        return ffff(f)

    }

    private fun ffff(f: File): String {
        return f.readText(Charset.forName("UTF-8"))
    }

    fun getFileLines(filename: String): List<String> {
        return File(filename).readLines(Charset.forName("UTF-8"))
    }

    fun getFileString(filename: String): List<String> {
        return File(filename).readLines(Charset.forName("UTF-8"))
    }


}