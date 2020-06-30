package designpatterns.singleton.v5

class SingletonDemoK private constructor() {

    companion object {
        val instance = SingletonHolder.holder
    }


    private object SingletonHolder {
        val holder = SingletonDemoK()
    }

}

