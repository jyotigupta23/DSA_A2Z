package Concurrency.ConcurrentSum;

public class SynchronizedExample {
    public static void main(String[] args ) throws InterruptedException {
        NumberStore numStr = new NumberStore();
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new Thread(new Worker(numStr, o1));
        Thread t2 = new Thread(new Worker(numStr, o2));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(numStr.getX());

    }
}


