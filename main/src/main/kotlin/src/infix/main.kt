package infix

fun main(args: Array<String>) {

    //v3  中缀调用
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

//    public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
    1.to("one")

    infix fun Any.to(other: Any) = Pair(this, other)

//    var lists1 = listOf("买鸡蛋",121,"ewqewq")

    var lists1 = listOf("买鸡蛋",123,"ewqewq")
    var lists2 = listOf("买鸡蛋",123,"e2wqewq")

    val interSection = lists1 n lists2

    println(interSection)

}

infix fun <E> List<E>.n(other: List<E>): List<E> {

    val result = ArrayList<E>()
    forEach {
        if (other.contains(it)) {
            result.add(it)
        }
    }
    return result
}