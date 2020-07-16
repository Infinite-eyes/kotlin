package `10对象`

class  Girl(var chactor:String, var voice:String){
    fun smile(){
        println("smile")
    }

    fun cry(){
        println("cry")
    }


}

fun main(args: Array<String>) {
    var girl = Girl("1","10")
    println("girl的高度:${girl.chactor}")
    println("girl的宽度:${girl.voice}")
}