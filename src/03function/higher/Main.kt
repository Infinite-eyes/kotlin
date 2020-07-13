package `03function`.higher

import java.net.Inet4Address
import kotlin.math.max

fun main(args: Array<String>) {

//    v1
//    var maxAge = 0
//
//    for (girl in list) {
//        maxAge = girl.age
//    }
//
//    println("年龄最大的值是:$maxAge")
//
//    for (girl in list) {
//        if (girl.age == maxAge) {
//            println(girl)
//        }
//    }

    //打印最大年龄的数
//    println(list.maxBy { it.age })
//    println(list.maxBy { it.height })
//    println(list.minBy { it.height })

//    println(list.filter {
//        (it.age > 17) and (it.height > 165)
//    })

    //重新生成list  返回list
//    var result = list.map {
//        "${it.name} : ${it.age}"
//    }
//    //重新生成list
//    println(result)
//
//
//    //是否存在 返回boolean
//    println(list.any {
//        it.age == 48
//    })
//
//    //计算条件记录数量  int
//    println(list.count {
//        it.age < 25
//    })
//
//    //寻找第一个满足条件的   girl
//    println(list.find {
//        it.age == 25
//    })
//
//    //返回分组   map
//    var result2 = list.groupBy {
//        it.address
//    }
//
//    println(result2)
//
//
//    list.groupBy {
//        it.address
//    }.get("hz")?.forEach { println(it) }


//v1
//    list.ageLessThan(24);
//v2 dsl
    list ageLessThan (24)

    list ageLessThan 24

    list from "hz"


}

