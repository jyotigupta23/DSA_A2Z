package Concurrency.ConcurrentSum;

public class NumberStore{
    int x;
    Object lock ;
    
    NumberStore(){
        this.x = 0;
//        this.lock = new Object();
    }

    void incremeant(Object o){ //    void syncronized incremeant(){

        synchronized(o){ //        synchronized(lock)
            x++;
        }

    }

    int getX(){
        return x;
    }
}
