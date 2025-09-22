package Concurrency.ProducerConsumer;

public class Producer implements Runnable{
    final MyQueue queue;

    public Producer(MyQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i=0; i<500; i++){
            synchronized (queue){
                while(queue.isFull()){//for multiple producers , if(queue.isFull()) - for single producer
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                queue.push(i);
                queue.notifyAll();
                System.out.println("Produced new Item "+ i);
            }
        }
        synchronized (queue){
            while(queue.isFull()){
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.push(-1);
            queue.notifyAll();
            System.out.println("Produced new Item -1");
        }

    }
}
