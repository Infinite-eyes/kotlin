package `03function`

val Pi = 3.14159f

fun 获取长方形面积(长: Int, 宽: Float): Float {
    return 长 * 宽
}
//默认值
fun 获取圆周长(PI: Float = Pi, 半径: Float): Float {
    return 2* PI * 半径
}
fun 获取圆周长2(PI: Float = Pi, 直径: Float): Float {
    return  PI * 直径
}

fun 获取圆柱体体积(PI: Float= Pi, 半径: Float, 高: Float): Float {
    return PI * 半径 * 半径 * 4
}


fun 获取球体的表面积(PI: Float= Pi, 半径: Float): Float {
    return PI * 半径 * 半径 * 4
}

fun main(args: Array<String>) {
//    var area = 获取长方形面积(3,2.0f)
//    println(area)

//    var area = 获取圆周长 (半径=2.0f)
//    println(area)

//    var area = 获取圆周长2 (直径=2.0f)
//    println(area)

//    var area = 获取圆柱体体积 (半径=2.0f,高=3.0f)
//    println(area)

    var area = 获取球体的表面积 (半径=2.0f)
    println(area)



}