package `10对象`

class Rect(var height:Int , var width:Int)


fun main(args: Array<String>) {
    var rect01 = Rect(20,10)
    println("矩形的高度:${rect01.height}")
    println("矩形的宽度:${rect01.width}")

}