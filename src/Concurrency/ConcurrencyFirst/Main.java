package Concurrency.ConcurrencyFirst;

public class Main {
    public static void main(String[] args){
        System.out.println("Starting the main method");
        Thread t1 = new Thread(new Sequence());
        Thread t2 = new Thread(new ReverseSequence());
//        Thread t3 = new Thread(new PrintAge().toString());

        t1.start();
        t2.start();
//        t3.start();

        for(int i=100; i<110; i++){
            System.out.print(i+" ");
        }
    }
}
/*In Java, a Callable cannot be directly passed to the Thread constructor.
The Thread constructor expects a Runnable instance.
However, you can execute a Callable using an ExecutorService.
The ExecutorService provides methods like submit() which accept a Callable and return a Future object.
This Future object can then be used to retrieve the result of the Callable's execution and manage its state (e.g., check if it's done, cancel it).
* */
