package `10对象`.`09枚举`

enum class Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
}

fun main(args: Array<String>) {
    Week.星期一
    println(Week.星期一)
    println(Week.星期一.ordinal)
    println(Week.星期日.ordinal)
}