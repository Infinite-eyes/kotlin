package `03function`

fun main(args: Array<String>) {
    var a = 8;
    var b = 2
    println("a+b=" + plus(a,b))
    println("a-b=" + sub(a,b))
    println("a+b=" + mutl(a,b))
    println("a/b=" + devide(a,b))
}

fun plus(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun mutl(a: Int, b: Int):Int {
    return a * b
}

fun devide(a: Int, b: Int):Int{
    return a / b
}

