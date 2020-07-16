package `04字符串`


fun main(args: Array<String>) {
    var str1 = "Andy"
//    var str2 = "Andy"
    var str2 = "andy"

    println(str1.equals(str2))
    println(str1==str2)
    //忽略大小写
    println(str1.equals(str2,true))
    println(str1==str2)
}