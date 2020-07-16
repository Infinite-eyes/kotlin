package designpatterns.singleton.v2


class SingletonDemoK private constructor() {

    companion object {
        private var instance: SingletonDemoK? = null
            get() {
                if (field == null) {
                    field = SingletonDemoK()
                }
                return field
            }

        fun get(): SingletonDemoK {
            return instance!!
        }
    }
}