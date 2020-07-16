package designpatterns.singleton.v4

class SingletonDemoK private constructor() {

   private var a: String?= null

    companion object {
        val instance: SingletonDemoK by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonDemoK()
        }
    }
}

fun main(args: Array<String>) {

    SingletonDemoK.instance
}