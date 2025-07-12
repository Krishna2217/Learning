package multithreading.Threads;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        t1.start();
//        t1.join();
//        MyThread t2 = new MyThread();
//        t2.start();
//        t2.join();
//        Thread t3 = new Thread(()->System.out.println("hi"));  //runnable interface thread
//        t3.start();
//        t3.join();
//        System.out.println("After thread");
        Addition a = new Addition();
        Thread t4 = new Thread(()->{
            for(int i=0; i<10000; i++){
                a.increament();
            }
        });

        Thread t5 = new Thread(()->{

            for(int i=0; i<10000; i++){
                a.increament();
            }
        });
        t4.start();
        t5.start();
        t4.join();
        t5.join();
        System.out.println(a.getNumber());


    }


}
