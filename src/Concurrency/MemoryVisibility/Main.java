package Concurrency.MemoryVisibility;


public class Main {
//    public static volatile int curr=1;
    public static int curr=1;

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(new Worker(5, Thread.currentThread(), lock));
        Thread t2 = new Thread(new Worker(1, Thread.currentThread(), lock));
        Thread t3 = new Thread(new Worker(4, Thread.currentThread(), lock));
        Thread t4 = new Thread(new Worker(3, Thread.currentThread(), lock));
        Thread t5 = new Thread(new Worker(2, Thread.currentThread(), lock));
        Thread t6 = new Thread(new Worker(10, Thread.currentThread(), lock));
        Thread t7 = new Thread(new Worker(9, Thread.currentThread(), lock));
        Thread t8 = new Thread(new Worker(8, Thread.currentThread(), lock));
        Thread t9 = new Thread(new Worker(7, Thread.currentThread(), lock));
        Thread t10 = new Thread(new Worker(6, Thread.currentThread(), lock));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

//        t2.join();
//        t5.join();
//        t4.join();
//        t3.join();
//        t1.join();
    }
}
