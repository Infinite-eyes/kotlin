plugins {
    application
    kotlin("jvm") version "1.3.11"
}

apply {
    plugin("kotlin")
}

application {
    mainClassName = "MainKt"
}



dependencies {
    compile(kotlin("stdlib"))
//    compile group: 'commons-httpclient', name: 'commons-httpclient', version: '3.1'
    compile("commons-httpclient", "commons-httpclient", "3.1")

    testCompile("junit","junit","4.8.1")

}
repositories {
    mavenCentral()
    jcenter()
}


//TDD 测试驱动开发


//
//val compileKotlin: KotlinCompile by tasks
//compileKotlin.kotlinOptions {
//    jvmTarget = "1.8"
//}
//val compileTestKotlin: KotlinCompile by tasks
//compileTestKotlin.kotlinOptions {
//    jvmTarget = "1.8"
//}