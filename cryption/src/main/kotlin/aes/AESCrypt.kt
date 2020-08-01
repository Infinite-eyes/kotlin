package aes

import des.Base64
import java.security.Key
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.SecretKeySpec


object AESCrypt {

    fun encrypt(input: String, password: String): String {

        val cipher = Cipher.getInstance("AES")

        val keySpec: SecretKeySpec = SecretKeySpec(password.toByteArray(), "AES")

        cipher.init(Cipher.ENCRYPT_MODE, keySpec)

        val encrypt = cipher.doFinal(input.toByteArray())

        val result = Base64.encode(encrypt)


        return result

    }


    fun decrypt(input: String, password: String): String {

        val cipher = Cipher.getInstance("AES")

        val keySpec: SecretKeySpec = SecretKeySpec(password.toByteArray(), "AES")

        cipher.init(Cipher.DECRYPT_MODE, keySpec)

        val encrypt = cipher.doFinal(Base64.decode(input))
        val result = String(encrypt)

        println("AES解密=" + result)

        return result
    }

}


fun main(args: Array<String>) {


    val password = "1234567812345678"//16密钥
    val input = "黑马"


    val encrypt = AESCrypt.encrypt(input, password)
    val decrypt = AESCrypt.decrypt(encrypt, password)

    println("加密$encrypt")
    println("解密$decrypt")

}