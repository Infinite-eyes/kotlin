package generic01

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun main(args: Array<String>) {

//    parseTypeChachu("aa")

    print(check(ReentrantLock(), { "我是lambda方法体" }))

}


//inline fun <reified T> parseTypeChachu(thing: T) {
//    val name = T::class.java.name
//    println(name)
//}
//
fun <T> check(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
//        return otherCheck( body)//会报错
        return body()
    } finally {
        lock.unlock()
    }
}

 fun <T> otherCheck( body: () -> T) {


}