package `03function`

fun sayHello(name: String): String{
    return "hello"+ name
}
fun checkAge(age:Int):Boolean{
    if(age>18) return true else return false
}

fun saveLog(logLevel: Int){

}

fun main(args: Array<String>){
//    saveLog(3)
    println(checkAge(3))
}