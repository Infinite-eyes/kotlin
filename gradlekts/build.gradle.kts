//cd gradlekts
//./gradlew helloworld
//task("helloworld", {
//    println("hello i am gradle helloworld")
//})
//
//task("helloworld2", {
//    println("hello i am gradle helloworld2")
//})
//
//
////v2
//task("opendoor", {
//    //    println("开冰箱门")
//    doFirst {
//        println("开冰箱门")
//    }
//
//})
//task("putelephant", {
//    //    println("放入大象")
//    doFirst {
//        println("放入大象")
//    }
//}).dependsOn("opendoor")
//
//task("closedoor", {
//    //    println("关冰箱门")
//    doFirst {
//        println("关冰箱门")
//    }
//}).dependsOn("putelephant")
//
//task("haha", {
//    var haha = "afdaf" //扫描时执行
//    doFirst {}//在运行时执行
//    doLast {}//在运行时执行
//})


//v3
//统计main  文件数
task("getsrcname", {

    //增量更新
    inputs.dir("src") //输入
    outputs.file("info.txt") //输出

    doFirst {
        var srcdir = fileTree("src")

        var infotxt = file("info.txt")
        srcdir.forEach {
            if (it.isFile) {
//                Thread.sleep(1000)
                infotxt.appendText(it.absolutePath)
                infotxt.appendText("\r\n")
            }
        }
    }


})







plugins {
    application
    kotlin("jvm") version "1.3.11"

//    java
    war
}
//application {
//    //gradle 视图对应类
//    mainClassName = "Test"
////    mainClassName = "Main"
//}


dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}