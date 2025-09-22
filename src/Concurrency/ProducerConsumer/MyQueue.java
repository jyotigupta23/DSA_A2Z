package Concurrency.ProducerConsumer;

import java.util.*;

//Shared Resource for producer and consumer...
public class MyQueue {
    private int front, rear;
    private final List<Integer> list;
    private final int capacity;

    MyQueue(int capacity){
        this.front =-1;
        this.rear = 0;
        this.list = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean isFull(){return (front-rear+1 == capacity);}

    public boolean isEmpty(){return rear>front;}

    public void push(Integer val){
        if(isFull()){
            throw new RuntimeException("Queue is full");
        }
        list.add(val);
        front++;
    }

    public Integer pop(){
        if (isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        //*** not remove idiot...
        return list.get(rear++);
    }
}
