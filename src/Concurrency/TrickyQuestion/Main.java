package Concurrency.TrickyQuestion;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread waiter = new Thread(new Waiter());
        Thread notifier = new Thread(new Notifier());

        waiter.start();
        Thread.sleep(5000);
        notifier.start();
    }
}
