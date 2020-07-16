package `05条件控制`

fun checkFace(score: Int) {
    if (score > 80) {
        println("大于80")
    } else {
        println("小于等于80")
    }
}
fun returnBig(a: Int, b:Int):Int{
    if(a>b) return a else return b
}


fun main(args: Array<String>) {
    var score = 65
    checkFace(score)

    var a = 8
    var b =5
    //字符串模板 ${}
    println("${a} & ${b} ${returnBig(a,b)}")


}