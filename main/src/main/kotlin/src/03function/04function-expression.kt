package `03function`

fun main(args: Array<String>) {

    var result = add(3, 5)
    println(result)

    //函数表达式
    var i = { x: Int, y: Int -> x + y }
    var result2 = i(3, 5)
    print(result2)

    var j: (Int, Int) -> Int = { x, y -> x + y }
    var result3 = j(3,5)
    print(result3)


}

//fun add(x: Int, y: Int):Int{
//    return x+y
//}

fun add(x: Int, y: Int): Int = x + y