package `11操作符`

import sun.rmi.runtime.Log
import java.util.*
import kotlin.collections.ArrayList

//?
fun main(args: Array<String>) {

    var myList: ArrayList<String>? = init()//  创建一个null的队列
//    myList = ArrayList()
    myList?.add("1")
//    myList != null ? myList.size() : null;
    println(myList?.size)
//    if (myList == null) { Intrinsics.throwNpe(); }
//    println(myList!!.size)

    println(myList?.size ?: 2)

}


fun init(): ArrayList<String>? {
    return null;
}

fun safeCase(param: Any) {

    val k: Int? = param as Int
    println(" alen param is ${param}" + ",k is " + k)

    val m: Int? = if (param is Int) param else null
    println(" alen param is ${param}" + ",m is " + m)

//    if (!(param instanceof Integer)) { var10000 = null; }
    val n: Int? = param as? Int
    println(" alen param is ${param}" + ",n is " + n)
}


fun nullCheck() {

//定义一个可以为null的变量
//    var name: String? = null
    var name: String? = init2()
//定义一个不可以为null的变量，如果此时赋值为null，则会报异常
    val country: String = "china"

//报错，可能为null的变量不可以直接调用其方法
//        var length: Int = name.length

//如果name为null则pass，如果name不为null则调用count()方法
    var length: Int? = name?.count()

//不管name是否为null都调用count()方法，如果为null，则抛出NullPointerException
    var count: Int = name!!.count()

//由于country不为null，则可以直接调用其count方法
    var countryCount: Int = country.count()


}

fun init2(): String? {
    return null;
}

class A{
    fun  init(): String? {
        return null;
    }
}


