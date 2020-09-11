package src.backquote


//在Kotlin中可以用反引号解决关键字冲突的问题，可以强行将一个不合法的字符变为合法。
fun `123`() {
    println("this is message")
}

fun main(args: Array<String>) {
    `123`();
}