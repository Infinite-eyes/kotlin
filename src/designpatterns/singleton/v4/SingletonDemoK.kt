package designpatterns.singleton.v4

class SingletonDemoK private constructor() {
    companion object {
        val instance: SingletonDemoK by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonDemoK()
        }
    }
}

