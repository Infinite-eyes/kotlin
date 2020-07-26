fun main(args: Array<String>) {

    val c: Char = 'a'
    //转成ascii
    val value: Int = c.toInt()
    println(value) // 97


    val str = "i love you"

    //v1
    val stringBuilder = StringBuilder()

    val array = str.toCharArray()


//    for (ch in array) {
//        val result = ch.toInt()
//        stringBuilder.append(result.toString() + " ")
//
////        println(result)
//    }

    val result = with(stringBuilder) {
        for (ch in array) {
            val result = ch.toInt()
            append(result.toString() + "")
        }
        toString()
    }



    println(result)


}