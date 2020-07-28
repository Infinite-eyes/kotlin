package des

import com.sun.crypto.provider.DESCipher
import java.security.Key
import javax.crypto.Cipher
import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.DESKeySpec


object DesCrypt {

    fun encrypt(input: String, password: String): ByteArray {

//    1.获取cipher 对象
        val cipher = Cipher.getInstance("DES")

//    2.初始化cipher
        val kf = SecretKeyFactory.getInstance("DES")
        val keySpec = DESKeySpec(password.toByteArray())
        val key: Key? = kf.generateSecret(keySpec)
        cipher.init(Cipher.ENCRYPT_MODE, key)

        val encrypt = cipher.doFinal(input.toByteArray())

//        println("des加密密文：$encrypt")
        return encrypt;
    }


    fun decrypt(input: ByteArray, password: String): ByteArray {

//    1.获取cipher 对象
        val cipher = Cipher.getInstance("DES")

//    2.初始化cipher
        val kf = SecretKeyFactory.getInstance("DES")
        val keySpec = DESKeySpec(password.toByteArray())
        val key: Key? = kf.generateSecret(keySpec)
        cipher.init(Cipher.DECRYPT_MODE, key)

        val decrypt = cipher.doFinal(input)

//        println("des解密密文：$decrypt")
        return decrypt;
    }



}

fun main(args: Array<String>) {

    val input = "i love u"
    val password = "12345678"
    val encrypt = DesCrypt.encrypt(input,password)
    val decrypt = DesCrypt.decrypt(encrypt,password)
    println("des加密密文：$encrypt")
    println("des解密密文："+String(decrypt))

}