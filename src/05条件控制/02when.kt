package `05条件控制`


//fun gradeStudent(score: Int) {
//    when (score) {
//        10 -> println(score)
//        9 -> println(score)
//        8 -> println(score)
//        7 -> println(score)
//        6 -> println(score)
//        5 -> println(score)
//        4 -> println(score)
//        else -> println(score)
//    }
//}


fun diaryGenerater(placeName: String): String {
    var temple = """
        gfsdgfdsgdfsgdfsgd,${numToChinese(placeName.length)}
    """
    return temple
}

fun numToChinese(num: Int): String {
//    var result = when (num) {
//        1 -> return "1"
//        2 -> return "2"
//        3 -> return "3"
//        else -> return "else"
//    }
    var result = when (num) {
        1 ->  "1"
        2 ->  "2"
        3 ->  "3"
        else ->  "else"
    }

    return result
}


fun main(args: Array<String>) {
   println(diaryGenerater(""+10))
}