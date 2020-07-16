plugins {
    application
    kotlin("jvm") version "1.3.11"
}
application {
    //gradle 视图对应类
    mainClassName = "Test"
//    mainClassName = "Main"
}


dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}