package desingpattern.singleton;

public class Singleton {
    private static volatile Singleton singleton;  //volatile for double locking mechanism
    private Singleton(){

    }
    public static  Singleton getSingletonInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }


        return singleton;
    }

}
