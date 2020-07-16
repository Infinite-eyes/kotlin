package `03function`

//fun main(args: Array<String>) {
//    print(ollAdd(10000))
//}
//
//fun ollAdd(num: Int): Int {
//    if (num == 1) {
//        return 1
//    } else {
//        return num + ollAdd(num - 1)
//    }
//}


fun main(args: Array<String>) {
    var result = 0
    println(ollAdd(1000000, result))
}

tailrec fun ollAdd(num: Int, result: Int):Int {
    println("${num} result=${result}")
    if (num == 1) {
        return 1
    } else {
        return ollAdd(num - 1, result+num)
    }
}