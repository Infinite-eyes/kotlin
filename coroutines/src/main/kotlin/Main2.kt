import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.system.measureTimeMillis


//v1
//fun main(args: Array<String>) {
//
//    foo().forEach { value -> println(value) }
//
//}
//
//fun foo(): List<Int> = listOf(1, 2, 3)


//v2
//fun main(args: Array<String>) {
//    foo().forEach { value -> println(value) }
//}
//
//fun foo(): Sequence<Int> = sequence {
//    for (i in 1..3) {
//        Thread.sleep(1000)
//        yield(i)
//    }
//}


//v3
//suspend fun foo(): List<Int> {
//    delay(2000)
//    return listOf(1, 2, 3)
//}
//
//fun main() = runBlocking<Unit> {
//    foo().forEach { value ->
//        println(value)
//    }
//}

//// v4
//fun foo(): Flow<Int> = flow {
//    for (i in 1..3) {
//        delay(100)
//        emit(i)
//    }
//}
//
//
//fun main() = runBlocking<Unit> {
//
//
//    launch {
//        for (k in 1..3) {
//            delay(100)
//            println("I'm not blocked $k")
//        }
//    }
//
//    foo().collect { value -> println(value) }
//
//}


//v5

//fun foo(): Flow<Int> = flow {
//    println("Flow started")
//    for (i in 1..3) {
//        delay(100)
//        emit(i)
//    }
//}
//
//fun main() = runBlocking<Unit> {
//    println("Calling foo...")
//    val flow = foo()
//    println("Calling collect...")
//    flow.collect { value -> println(value) }
//    println("Calling collect again...")
//    flow.collect { value -> println(value) }
//}
//


//v6
//fun foo(): Flow<Int> = flow {
//    for (i in 1..3) {
//        printThreadName()
//        delay(100)
//        println("Emitting $i")
//        emit(i)
//    }
//}
//
//fun main() = runBlocking<Unit> {
//    withTimeoutOrNull(250) {
//        foo().collect { value ->
//            println(value)
//            printThreadName()
//        }
//    }
//    println("Done")
//}

//v7
//suspend fun main(args: Array<String>) {
////    (1..3).asFlow().collect{ value -> println(value) }
//    (1..3).asFlow().collect { value -> println(value) }
//}


//v8
//suspend fun main(args: Array<String>) {
//    flow {
//        for (i in 1..5) {
//            delay(100)
//            emit(i)
//        }
//    }.collect {
//        println(it)
//    }
//}

//v9
//suspend fun main(args: Array<String>) {
//    flowOf(1, 2, 3, 4, 5)
//        .onEach {
//            delay(100)
//        }.collect {
//            println(it)
//        }
//
//}

//v10
//suspend fun main(args: Array<String>) {
//
//    listOf(1, 2, 3, 4, 5).asFlow()
//        .onEach {
//            delay(100)
//        }.collect {
//            println(it)
//        }
//
//}

//v11
//suspend fun main(args: Array<String>) {
//
//    channelFlow {
//        for (i in 1..5) {
//            delay(100)
//            send(i)
//        }
//    }.collect {
//        println(it)
//    }
//}


//v12 ??
//fun main() = runBlocking {
//
//    val time = measureTimeMillis {
//        flow {
//            for (i in 1..5) {
//                delay(100)
//                emit(i)
//            }
//        }.collect {
//            delay(100)
//            println(it)
//        }
//    }
//    print("cost $time")
//}

//v13 ??
//fun main() = runBlocking {
//
//    val time = measureTimeMillis {
//        channelFlow {
//            for (i in 1..5) {
//                delay(100)
//                send(i)
//            }
//        }.collect {
//            delay(100)
//            println(it)
//        }
//    }
//
//    print("cost $time")
//
//}

//v14
//suspend fun main(args: Array<String>) {
//
//    flow {
//        for (i in 1..5) {
//            delay(100)
//            emit(i)
//            println("a")
//            printThreadName()
//        }
//
//    }.map {
//        it * it
//    }.flowOn(Dispatchers.IO).collect {
//        println("b")
//        printThreadName()
//        println(it)
//    }
//}


fun main() = runBlocking {

    flow {
        for (i in 1..5) {
            delay(100)
            emit(i)
            println("a")
            printThreadName()
        }
    }.map {
        it * it
    }.flowOn(Dispatchers.IO)
        .collect {
            println("${Thread.currentThread().name}: $it")
        }

}


fun printThreadName() {
    val t = Thread.currentThread();
    val name = t.name;
    System.out.println("name=$name");
}







