package designpatterns.singleton.v3

class SingletonDemoK private constructor() {
    companion object {
        private var instance: SingletonDemoK? = null
            get() {
                if (field == null) {
                    field = SingletonDemoK()
                }
                return field
            }
        @Synchronized
        fun get(): SingletonDemoK {
            return instance!!
        }

    }


}
