package `11操作符`

class ElvisTest() {

    var a: String = "hello"  // non-null

//    var b: String? = "world"

//    val bLength: Int ? = b?.length  //nullabale

//    val bLength: Int? = if (b != null) b?.length else -1

//    val bLength = b?.length?: -1  //elvis操作符 ?: 返回右侧

//    val bLength = b!!.length  // !!  NPE 异常：


    val aInt: Int? = a as? Int  // as? 不是类型null


    val nullableList: List<Int?> = listOf(1,2,null,4)
    val intList:List<Int> = nullableList.filterNotNull()
}




