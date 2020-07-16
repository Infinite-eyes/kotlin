package src.designpatterns.singleton.v1;


//一、饿汉式实现
public class SingletonDemoJ {

    private static SingletonDemoJ instance = new SingletonDemoJ();

    private SingletonDemoJ() {

    }

    public static SingletonDemoJ getInstance() {
        return instance;
    }

}
