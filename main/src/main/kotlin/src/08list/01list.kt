package `08list`

fun main(args: Array<String>) {
    var lists = listOf("买鸡蛋", 121, "ewqewq")
//    for(list in lists.withIndex()){
//        println(list)
//    }
    for ((i, e) in lists.withIndex()) {
        println("${i} ${e}")
    }


    var tbList: MutableList<String> = ArrayList()
    var tb = "A"
    tbList.add(tb)
    tb = "B"
    tbList.add(tb)

    for (d in tbList) {
        println("My name is $d , and my age is $d")
    }


}



