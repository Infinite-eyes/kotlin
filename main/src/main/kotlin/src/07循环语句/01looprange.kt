package `07循环语句`

//fun main(args: Array<String>) {
//    var nums = 1..100  //[1,100]
//    var result = 0
//    for (num in nums) {
//        result = result+num
//        println("${num}")
//    }
////    println(result)
//
//}



fun main(args: Array<String>) {
//    var nums = 1 until 100  //[1,100)
//    for (num in nums) {
//        println("${num}")
//    }

    var nums2 = 1..15
//    for(a in nums2 step 2){
//        println(a)
//    }
    var nums3 = nums2.reversed()
    for(a in nums3){
        println(a)
    }
    println(nums3.count())



}