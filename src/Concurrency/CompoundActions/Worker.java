package Concurrency.CompoundActions;

public class Worker implements Runnable {
    private final Number num;

    public Worker(Number num) {
        this.num = num;
    }

    @Override
    public void run() {
        num.increament();
    }

//    @Override
//    public synchronized void run() {
//        int oldValue = num.getX();
////        try {
////            Thread.sleep(2000);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//        num.setX(oldValue+1);
//    }
}
