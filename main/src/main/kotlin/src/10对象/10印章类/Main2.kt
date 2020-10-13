package src.`10对象`.`10印章类`

sealed class SealedClass {

    class SealedClass1() : SealedClass()
    class SealedClass2() : SealedClass()
    object SealedClass3 : SealedClass()

    fun hello() {
        println("Hello World...")
    }

}

fun main(args:Array<String>){
//    var sc:SealedClass = SealedClass()//错误

    var sc:SealedClass = SealedClass.SealedClass1()
    sc.hello()


}
