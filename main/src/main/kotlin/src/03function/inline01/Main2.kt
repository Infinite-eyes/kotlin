package `03function`.inline01

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

// v1

//fun main(args: Array<String>) {
//
//    val lock = ReentrantLock()
//
//    check(lock){
//        println()
//    }
//
//}
//
//inline fun <T> check(lock: Lock, body: () -> T): T {
//    lock.lock()
//    try {
//        return body()
//    } finally {
//        lock.unlock()
//    }
//}


fun main(args: Array<String>) {
    val lock = ReentrantLock()

    check(lock) {
        println()
    }

}

inline fun <T> check(lock: Lock,noinline body: () -> T): T {
    lock.lock()
    try {
        otherCheck(body)//会报错,说内联的参数需要被声明为noinline的才可以传给其他函数
        return body()
    } finally {
        lock.unlock()
    }
}

fun <T> otherCheck(body: () -> T) {
    println("check $body")
}


