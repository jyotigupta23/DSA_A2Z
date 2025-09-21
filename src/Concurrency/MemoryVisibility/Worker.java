package Concurrency.MemoryVisibility;

import javax.sound.midi.MidiChannel;
import java.io.PrintStream;

public class Worker implements Runnable{
    private final int n;
    private final String str;
    private final Object lock;
    Worker(int n, Thread thread, Object lock){
        this.n = n;
        this.str = thread.getId() + " " + thread.getName();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            while (Main.curr<n) {
                try {
                    System.out.println(n+" needs to wait...");
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
                System.out.println(str + " " + n);

                Main.curr++;
                lock.notifyAll();

            }
        }
    }


//    prints in sequential manner...
  /*  @Override
    public void run() {
        while(Main.curr < n){}
            System.out.println(str + " " + n);
            Main.curr++;

    }
    @Override
    public void run() {
        while(compare()){};//busy-waiting
        System.out.println(str + " " + n);
        synchronized (lock){
            Main.curr++;
        }
    }

    private boolean compare(){
        boolean ans=false ;
        synchronized (lock){
            if(Main.curr < n){
                ans = true;
            }
        }
        return ans;
    }
    */

