package Concurrency.FizzBuzz;

public class Fizz implements Runnable {
    final Object lock;
    public Fizz(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            while (Main.i <= Main.n){
                while (!((Main.i%3==0) &&(Main.i%5!=0)) && (Main.i <= Main.n)){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(Main.i>Main.n){
                    lock.notifyAll();
                    break;
                }
                System.out.println(Main.i + " - Fizz");
                Main.i++;
                lock.notifyAll();
            }
        }

    }
}
