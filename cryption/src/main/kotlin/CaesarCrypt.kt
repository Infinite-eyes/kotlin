fun main(args: Array<String>) {


//    v1
//    val c = 'A'
//    var ascii = c.toInt()
//
//
//    val key = 2
//    ascii += key
//
//    val result = ascii.toChar()
//    println(result)


//v2
//    val command = "i love you"
//    val key = 2
//    val charArray = command.toCharArray()
//    charArray.forEach {
//
//        val c = it
//        var ascii = c.toInt()
//
//        ascii += key
//        val result = ascii.toChar()
//        println(result)
//    }

//    v3

    val input = "i love you"
    val key = 1

    val encrypt = CaesarCrypt().encrypt(input, key)
    println(encrypt)

    val decrypt = CaesarCrypt().decrypt(encrypt, key)
    println(decrypt)

}


class CaesarCrypt {

    fun encrypt(input: String, key: Int): String {
        val charArray = input.toCharArray()
        return with(StringBuffer()) {
            charArray.forEach {
                val c = it
                var ascii = c.toInt()
                ascii += key
                val result = ascii.toChar()
                append(result)
            }
            toString()
        }
    }

    fun decrypt(input: String, key: Int): String {
        val charArray = input.toCharArray()
        return with(StringBuffer()) {
            charArray.forEach {
                val c = it
                var ascii = c.toInt()
                ascii -= key
                val result = ascii.toChar()
                append(result)
            }
            toString()
        }
    }


}
