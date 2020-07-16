package `03function`.inline01

fun main(args: Array<String>) {
    fun1("123123")
}

inline fun fun1(arg: String) {
    println("这里是fun1")
    fun2(arg)
}

fun fun2(arg: String) {
    println("这里是fun2")
    println(arg)
}