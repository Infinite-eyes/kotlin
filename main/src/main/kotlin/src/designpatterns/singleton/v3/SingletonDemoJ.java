package src.designpatterns.singleton.v3;


//三、线程安全的懒汉式
public class SingletonDemoJ {

    private static SingletonDemoJ instance;

    private SingletonDemoJ() {

    }

    public static synchronized SingletonDemoJ getInstance() {
        if (instance == null) {
            instance = new SingletonDemoJ();
        }
        return instance;
    }

}
