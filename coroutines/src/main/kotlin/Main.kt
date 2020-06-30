import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    //v1

//    GlobalScope.launch { // 在后台启动一个新的协程，协程的生命周期和应用程序生命周期绑定
//        delay(1000L) // 非阻塞的等待 1 秒钟（默认时间单位是毫秒）
//        println("World!")
//    }
//    println("Hello,") // 协程已在等待时主线程还在继续
//    Thread.sleep(2000L) //


    println("1")
    test()
    println("2")

}

private fun test() = runBlocking {
    repeat(8){
        delay(1000)
    }
}