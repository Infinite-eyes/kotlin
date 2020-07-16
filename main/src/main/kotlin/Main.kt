fun continueDemo() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}


fun sum(a: Int, b: Int) = a + b
fun max(a: Int, b: Int) = if (a > b) a else b

fun returnDemo_1() {
    println(" START " + ::returnDemo_1.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)

    intArray.forEach {
        if (it == 3) return
        println(it)
    }
    println(" END " + ::returnDemo_2.name)

}

fun returnDemo_2() {
    println(" START " + ::returnDemo_2.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach(fun(a: Int) {
        if (a == 3) return  // 跳出方法
        println(a)
    })
    println(" END " + ::returnDemo_2.name)
}


fun returnDemo_3() {

    println(" START " + ::returnDemo_3.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach here@{
        if (it == 3) return@here
        println(it)
    }
    println(" END " + ::returnDemo_3.name)

}

fun returnDemo_4() {

    println(" START " + ::returnDemo_4.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)

    intArray.forEach {
        if (it == 3) return@forEach
        println(it)
    }

    println(" END " + ::returnDemo_4.name)
}


fun breakDemo_1() {
    println("---------------  breakDemo_1 ---------------")
    for (outer in 1..5) {
        println("ounter=" + outer)
        for (inner in 1..10) {
            println("inner=" + inner)
            if (inner % 2 == 0) {
                break
            }
        }
    }
}


fun breakDemo_2() {
    println("---------------  breakDemo_2 ---------------")

    outer@ for (outer in 1..5)
        for (inner in 1..10) {
            println("inner=" + inner)
            println("outer=" + outer)
            if (inner % 2 == 0) {
                break@outer
            }
        }
}


fun breakDemo_3() {

    println("---------------  breakDemo_2 ---------------")

    for (outer in 1..5)
        inner@ for (inner in 1..10) {
            println("inner=" + inner)
            println("outer=" + outer)
            if (inner % 2 == 0) {
                break@inner
            }
        }
}

class Outer {
    val oh = "Oh!"

    inner class Inner {

        fun m() {
            val outer = this@Outer
            val inner = this@Inner
            val pthis = this
            println("outer=" + outer)
            println("inner=" + inner)
            println("pthis=" + pthis)
            println(this@Outer.oh)

            val fun1 = hello@ fun String.() {
                val d1 = this
                println("d1" + d1)
            }

            val fun2 = { s: String ->
                val d2 = this
                println("d2= " + d2)
            }

            "abc".fun1()

            fun2("ccc")


        }
    }

}


open class Father {
    open val firstName = "Chen"
    open val lastName = "Jason"

    fun ff() {
        println("FFF")
    }
}

class Son : Father {

    override var firstName = super.firstName
    override var lastName = "Jack"

    constructor(lastName: String) {
        this.lastName = lastName
    }

    fun love(){
        super.ff()
        println(super.firstName + " " + super.lastName +
         " Love " + this.firstName + " " + this.lastName )
    }
}









