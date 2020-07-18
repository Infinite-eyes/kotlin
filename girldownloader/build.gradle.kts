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
    testCompile("junit", "junit", "4.8.1")

    //gradle 依赖默认最高版本
//    compile group: 'commons-httpclient', name: 'commons-httpclient', version: '3.1'
    compile("commons-httpclient", "commons-httpclient", "3.1") {
//        exclude("commons-logging", "commons-logging")
    }
//    compile group: 'org.springframework', name: 'spring-core', version: '4.3.9.RELEASE'
//    compile("org.springframework", "spring-core", "4.3.9.RELEASE")

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