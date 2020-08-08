import aes.AESCrypt
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    val key = "1234567891234567"

    val json = "哈哈哈哈哈"

    println("服务器= $json")

    val br = BufferedWriter(FileWriter("UserInfo.db"))
    val encrypt = AESCrypt.encrypt(json, key)
    br.write(encrypt)
    br.close()


    val br1 = BufferedReader(FileReader("UserInfo.db"))
    val readLines = br1.readLine()
    println("读取缓存数据=$readLines")


}