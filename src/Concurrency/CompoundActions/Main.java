package Concurrency.CompoundActions;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Number num = new Number();
        Thread t1 = new Thread(new Worker(num));
        Thread t2 = new Thread(new Worker(num));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(num.getX());
    }
}
