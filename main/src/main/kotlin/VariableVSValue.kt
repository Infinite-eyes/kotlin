import java.util.*

class VariableVSValue {

    fun declareVar() {
        var a = 1
        a = 2
        println(a)
        println(a::class)

        var x = 5
        x += 1

        println("x = $x")
    }

    fun declareVal() {

        val b = "a"
//        a

        println(b)
//        class java.lang.String (Kotlin reflection is not available)
        println(b::class)
//        class java.lang.String

        println(b::class.java)

        val c: Int = 1
        val d = 2
        val e: Int
        e = 3
//        c = 1, d = 2, e = 3
        println("c = $c, d = $d, e = $e")

    }


    fun typeInference() {

        val str = "abc"
        println(str)
        println(str is String)
        println(str::class)
        println(str::class.java)
//        abc
//        true
//        class java.lang.String (Kotlin reflection is not available)
//        class java.lang.String

        val d = Date()
        println(d)
        println(d is Date)
        println(d::class)
        println(d::class.java)
//        Fri Jun 09 00:06:33 CST 2017
//        true
//        class java.util.Date (Kotlin reflection is not available)
//        class java.util.Date


        val bool = true
        println(bool)
        println(bool::class)
        println(bool::class.java)

        //        true
//        boolean (Kotlin reflection is not available)
//        boolean


        val array = arrayOf(1, 2, 3)
        println(array)
        println(array is Array)
        println(array::class)
        println(array::class.java)
        //        [Ljava.lang.Integer;@7b5eadd8
//        true
//        class [Ljava.lang.Integer; (Kotlin reflection is not available)
//        class [Ljava.lang.Integer;
    }

    fun Int2Long() {
        val x: Int = 10
        // Type mismatch
//        val y:Long = x
        val y: Long = x.toLong()
    }

    fun getLength(obj: Any): Int? {

        var result = 0
        if (obj is String) {
            println(obj::class)
            result = obj.length
            println(result)
        }
        println(obj::class)
        return result
    }


}