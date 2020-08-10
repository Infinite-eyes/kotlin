package rsa

import des.Base64
import java.security.Key
import java.security.KeyPairGenerator
import java.security.PrivateKey
import java.security.PublicKey
import javax.crypto.Cipher


object RsaCrypt {


    val transformation = "RSA"


    fun encryptByPrivateKey(input: String, privateKey: PrivateKey): String {

        val cipher = Cipher.getInstance(transformation)
        cipher.init(Cipher.ENCRYPT_MODE, privateKey)

        val encrypt = cipher.doFinal(input.toByteArray())
        return Base64.encode(encrypt)
    }

    fun encryptByPublicKey(input: String, publicKey: PublicKey):String {

        val cipher = Cipher.getInstance(transformation)
        cipher.init(Cipher.ENCRYPT_MODE, publicKey)

        val encrypt = cipher.doFinal(input.toByteArray())
        return Base64.encode(encrypt)
    }

}


fun main(args: Array<String>) {

    val generator = KeyPairGenerator.getInstance("RSA")
    val keyPair = generator.genKeyPair()
    val publicKey = keyPair.public
    val privateKey = keyPair.private


    println("publicKey= " + Base64.encode(publicKey.encoded))
    println("privateKey= " + Base64.encode(privateKey.encoded))

    val input = "黑马"

    val encrypt1 = RsaCrypt.encryptByPrivateKey(input, privateKey)
    println("私钥加密=$encrypt1")


    val encrypt2 = RsaCrypt.encryptByPublicKey(input, publicKey)
    println("公钥加密=$encrypt2")


}