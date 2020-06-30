package designpatterns.singleton.v5;


//五、静态内部类式
public class SingletonDemoJ {

    private static class SingletonHolder{
        private static SingletonDemoJ instance = new SingletonDemoJ();
    }

    private SingletonDemoJ(){
        System.out.println("Singleton has loaded");
    }

    public static SingletonDemoJ getInstance(){
        return SingletonHolder.instance;
    }

}
