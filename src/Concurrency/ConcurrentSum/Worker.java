package Concurrency.ConcurrentSum;

public class Worker implements Runnable{

    private final NumberStore numStr;
    private final Object o;

    public Worker(NumberStore numStr, Object o) {
        this.numStr = numStr;
        this.o = o;
    }

    @Override
    public void run() {
        synchronized (numStr) {
            for (int i = 0; i < 10000; i++) {
                numStr.incremeant(o);
            }
        }
    }
}
