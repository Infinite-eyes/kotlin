package `08list`

fun main(args: Array<String>) {
    var lists = listOf("买鸡蛋",121,"ewqewq")
//    for(list in lists.withIndex()){
//        println(list)
//    }
    for((i,e) in lists.withIndex()){
        println("${i} ${e}")
    }

}



