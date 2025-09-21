package Concurrency.WaitNotify;

public class Notifier implements Runnable{
    private final Object lock;

    public Notifier(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
//            lock.notify(); will only awake 1 thread alone...
            lock.notifyAll();
//            while (true){}//hungs up
        }

    }
}
