package desingpattern.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingletonInstance();
        Singleton singleton1 = Singleton.getSingletonInstance();
        System.out.println(singleton1==singleton);
    }
}
