package Concurrency.WaitNotify;

public class Main {
    public  static void main(String[] args) throws InterruptedException {
        Object o = new Object();
//        o.wait();  throws exception...
//        synchronized (o){
//            o.wait();
//        }

        Thread t1 = new Thread(new Waiter(o));
        Thread t2 = new Thread(new Waiter(o));
        Thread t3 = new Thread(new Notifier(o));
        t1.start();
        t2.start();
        Thread.sleep(1000);
        t3.start();

    }
}
