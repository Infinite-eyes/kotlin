import kotlinx.coroutines.*
import java.lang.Runnable


// print 无效
fun main(args: Array<String>) {
    //v1

//    GlobalScope.launch { // 在后台启动一个新的协程，协程的生命周期和应用程序生命周期绑定
//        delay(1000L) // 非阻塞的等待 1 秒钟（默认时间单位是毫秒）
//        println("World!")
//    }
//    println("Hello,") // 协程已在等待时主线程还在继续
//    Thread.sleep(2000L) //


    //v2
//    println("1")
//    test()
//    println("2")


//    v3 base
//    GlobalScope.launch(Dispatchers.Default) {
//        //后台耗时
//    }
//
//    GlobalScope.launch(newSingleThreadContext("MyThread")) {
//
//    }
//
//    val job = GlobalScope.launch(Dispatchers.Default) {
//
//    }
//    job.cancel()
//

    //v4

//    GlobalScope.launch {
//        val result = async {
//            function()
//        }
//    }

    //v5

//    val job = GlobalScope.launch {
//        delay(6000)
//    }
//
//    job.isActive
//    job.isCancelled
//    job.cancel()
////    job.join()


    //v6
//    GlobalScope.launch {
//        val token = getToken()
//        val userInfo = getUserInfo(token)
//        setUserInfo(userInfo)
//    }
//    repeat(8) {
//        print("主线程执行$it")
//    }


//    v7

    GlobalScope.launch {
        print("1111")
        val result1 = GlobalScope.async {
           getResult1()
        }
        val result2 = GlobalScope.async {
            getResult2()
        }
        val result = result1.await() + result2.await()
        print("2222")
        print(result)
        print("33333")
    }


}

private suspend fun getResult1(): Int {
    delay(3000)
    return 1
}

private suspend fun getResult2(): Int {
    delay(4000)
    return 2
}


private fun setUserInfo(userInfo: String) {
    print(userInfo)
}

private suspend fun getToken(): String {
    delay(2000)
    return "token"
}

private suspend fun getUserInfo(token: String): String {
    delay(2000)
    return "$token - userInfo"
}


fun function(): Int {
    return 666
}


private fun test() = runBlocking {
    repeat(8) {
        delay(1000)
    }
}


class MyThread constructor(callback: String) : Runnable {

    override fun run() {
//       callback
    }
}