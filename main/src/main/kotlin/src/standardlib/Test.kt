package src.standardlib

import java.util.*
import kotlin.collections.ArrayList

//fun testLet(): Int {
//
////    默认当前这个对象作为闭包的it参数，返回值是函数里面最后一行，或者指定return
//    "testLet".let {
//        println(it)
//        println(it)
//        println(it)
//        return 1
//    }
//}

fun testLet(): Int {

    "testLet".let {
        if (Random().nextBoolean()) {
            println(it)
            return 1
        } else {
            println(it)
            return 2
        }
    }
}

//apply函数是这样的，调用某对象的apply函数，在函数范围内，可以任意调用该对象的任意方法，并返回该对象
fun testApply() {
    ArrayList<String>().apply {
        add("testApply")
        add("testApply")
        add("testApply")
        println("this = " + this)

    }.let {
        println(it)
    }
}


//返回是最后一行，然后可以直接调用对象的方法，感觉像是let和apply的结合。
fun testWith() {
    with(ArrayList<String>()) {
        add("testWith")
        add("testWith")
        add("testWith")
//        println("this = " + this)
        "bafdads"
    }.let { print(it) }
}

//run函数和apply函数很像，只不过run函数是使用最后一行的返回
fun testRun() {
    "testRun".run {
        println("this = " + this)
        "runnn"
    }.let { println(it) }
}


fun main(args: Array<String>) {
//    testWith()
    testRun()
}





//
//函数名	  定义	                                  	                    参数                     返回值	extension	其他
//let	  fun <T, R> T.let(f: (T) -> R): R = f(this)	                it	                    闭包返回	是
//apply	  fun <T> T.apply(f: T.() -> Unit): T { f();return this }	    无，可以使用this	        this	是
//with	  fun <T, R> with(receiver: T, f: T.() -> R): R = receiver.f()	无，可以使用this	        闭包返回	否	         调用方式与其他不同
//run	  fun <T, R> T.run(f: T.() -> R): R = f()	                    无，可以使用this	        闭包返回	是
