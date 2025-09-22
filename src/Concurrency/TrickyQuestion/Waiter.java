package Concurrency.TrickyQuestion;

public class Waiter implements Runnable{

    String s1 = "abc";
    @Override
    public void run() {
        synchronized (s1){
            try {
                s1.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Waiter is existing...");
        }

    }
}
