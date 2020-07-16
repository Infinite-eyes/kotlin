package `04字符串`

fun diaryGenerater(placeName: String): String{
    var temple= """
        gfsdgfdsgdfsgdfsgd,${placeName}${placeName.length}
    """
    return temple
}

fun main(args: Array<String>) {
    var diary = diaryGenerater("中山公园")
    println(diary)
}