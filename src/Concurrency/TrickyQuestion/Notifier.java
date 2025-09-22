package Concurrency.TrickyQuestion;

public class Notifier implements Runnable{
    String s2 = "abc";
    @Override
    public void run() {
        synchronized (s2){
            s2.notify();
            System.out.println("Notifier is existing...");
        }

    }
}
