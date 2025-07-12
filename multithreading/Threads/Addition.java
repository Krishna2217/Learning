package multithreading.Threads;

public class Addition {
    static volatile   int number=0;


    synchronized void increament(){  //without synchronized it will give addition result minimum mostly
        number++;
    }
    int getNumber(){
        return number;
    }
}
