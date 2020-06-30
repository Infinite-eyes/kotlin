package designpatterns.singleton.v4;


//四、双重校验锁式（Double Check)
public class SingletonDemoJ {

    private volatile static SingletonDemoJ instance;

    private SingletonDemoJ() {
    }

    public static SingletonDemoJ getInstance() {
        if (instance == null) {
            synchronized (SingletonDemoJ.class) {
                if (instance == null) {
                    instance = new SingletonDemoJ();
                }
            }
        }
        return instance;
    }

}
