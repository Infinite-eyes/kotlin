package extension

fun lastChar3(str: String): Char = str.get(str.length - 1)
//扩展函数
fun String.lastChar1(): Char = this.get(this.length - 1)

fun String.lastChar2(): Char = get(length - 1)

val c = "Kotlin".lastChar1()


//扩展属性 区别 扩展方法 没有()   有  get() set() val没有set  var有set

//扩展属性
val String.lastChar: Char get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1) //属性getter
    set(value: Char) {
        this.setCharAt(length - 1, value) //属性setter
    }


fun main(args: Array<String>) {

    val b = "Kotlin".lastChar
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

}











// 扩展函数被静态地解析

//open class View {
//    open fun click() = println("View clicked")
//}
//
//class Button : View() {
//    override fun click() = println("Button clicked")
//}
//
//fun View.showOff() = println("I'm a view!")
//fun Button.showOff() = println("I'm a button!")
//
//
//val view: View = Button()
//
//
//
//
//fun main(args: Array<String>) {
//    view.showOff() //扩展函数被静态地解析
//}