package src.extension

//extension 是在不改动原来的类的基础上进行扩展。

//fun MutableList >


fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp

}

fun main(args: Array<String>) {
    val l = mutableListOf(1, 2, 3)
    l.swap(0,2)

}