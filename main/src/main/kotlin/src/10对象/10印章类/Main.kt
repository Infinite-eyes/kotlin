package `10对象`.`10印章类`

fun main(args: Array<String>) {

    var s1: Son = Son.骡子()
    s1.sayHello()

    var s2: Son = Son.小驴()
    s2.sayHello()

    var list = listOf<Son>(s1,s2);

    for(v in list){
        if(v is Son.骡子){
            v.sayHello()
        }
    }

}