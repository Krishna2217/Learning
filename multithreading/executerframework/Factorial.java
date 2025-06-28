package multithreading.executerframework;

public class Factorial {
//ctrl alt L 
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread[] t = new Thread[9];
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            t[i - 1] = new Thread(() -> {
                long fact = factorial(finalI);
                System.out.println(fact);
            });
            t[i - 1].start();
        }
        for (Thread thread : t) {
            thread.join();
        }
        System.out.println("Total time " + (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long fact = 1;
        for (int j = 1; j <= i; j++) {
            fact *= j;
        }
        return fact;
    }
}
