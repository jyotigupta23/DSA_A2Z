package Concurrency.WaitNotify;

public class Waiter implements Runnable{
    private final Object lock;

    public Waiter(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println("Hello from Waiter...");
        try {
            synchronized (lock){
                lock.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye from Waiter...");
    }
}
