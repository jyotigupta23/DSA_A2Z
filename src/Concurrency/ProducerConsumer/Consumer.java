package Concurrency.ProducerConsumer;

public class Consumer implements Runnable{
    final MyQueue queue;

    public Consumer(MyQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (queue) {
                while (queue.isEmpty() && Main.count>0) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

                if(Main.count == 0){
                    queue.notifyAll();
                    break;
                }

                int val = queue.pop();
                queue.notifyAll();
                System.out.println("Consumed item " + val);

                if (val == -1) {
                    Main.count--;
                    System.out.println("No more items to Consume");
                    break;
                }
            }
        }

    }
}
