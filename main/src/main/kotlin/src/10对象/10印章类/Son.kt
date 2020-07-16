package `10对象`.`10印章类`

sealed class Son{

    fun sayHello(){
        println("大家好")
    }

    class 小驴():Son()

    class 骡子():Son()

}