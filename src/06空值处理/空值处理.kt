package `06空值处理`
//str: String? 可以为空
fun heat(str: String?): String{
    return "热" + str
}

fun main(args: Array<String>) {
    var result1 = heat("水")
    println(result1)

    heat(null);
}