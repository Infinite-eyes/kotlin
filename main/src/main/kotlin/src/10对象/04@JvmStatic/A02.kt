package `10对象`.`03@JvmField`

class A02 {

    //    @JvmStatic  //错误 object类或者伴生对象companion object中使用
    fun xx() {

    }
}

class A {
    companion object {
        //        @JvmStatic // 使A中增加   public static final void xx() { Companion.xx();}
        fun xx() {

        }

        //        @JvmStatic // 使A中增加 a get set 静态方法
        var a: String = ""
    }
}

object B {
//    @JvmStatic //使xxx静态方法
    fun xxx() {

    }
//    @JvmStatic //使 get set 静态方法
    var a: String = ""

}


fun main(args: Array<String>) {

    A.xx();

}

