package src.`03vararg`


//class Main {

fun main(args: Array<String>) {
    invokMsg("AAA", "BBB", "CCC", "DDD")
}

fun invokMsg(vararg value: Any?) {
    printlnMsg(value)
//    printlnMsg(*value)
}

fun printlnMsg(vararg msg: Any?) {
    println(msg.joinToString(" "))
//    println(msg.joinToString { " " })
}
//}
