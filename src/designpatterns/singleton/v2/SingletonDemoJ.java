package designpatterns.singleton.v2;


//二、懒汉式
public class SingletonDemoJ {

    private static SingletonDemoJ instance;

    private SingletonDemoJ() {
    }

    public static SingletonDemoJ getInstance() {
        if (instance == null) {
            instance = new SingletonDemoJ();
        }
        return instance;
    }

}
