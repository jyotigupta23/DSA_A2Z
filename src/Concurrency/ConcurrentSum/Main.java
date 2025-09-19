package Concurrency.ConcurrentSum;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    //Shared variables...
    public static AtomicLong sum = new AtomicLong(0);
    public static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<10000000; i++) {
            Random n = new Random();
            nums.add(n.nextInt());
        }
        long start1 , end1, start2, end2;

        start1 =  System.currentTimeMillis();
        seqSum(nums);
        end1 = System.currentTimeMillis();
        System.out.println("Sequencial time taken : "+(end1-start1));


        start2 =  System.currentTimeMillis();
        concurrentSum(nums);
        end2 = System.currentTimeMillis();
        System.out.println("Concurrent time taken : "+(end2-start2));


    }

    private static void concurrentSum(ArrayList<Integer> nums) {
        int size = nums.size()/4;
        Thread t1 = new Thread(new Summation(nums,0, size-1));
        Thread t2 = new Thread(new Summation(nums, size, 2*size-1));
        Thread t3 = new Thread(new Summation(nums,2*size, 3*size-1));
        Thread t4 = new Thread(new Summation(nums,3*size, 4*size-1));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        while (count.get()<4){};
        System.out.println(sum.get());
    }

    private static void seqSum(ArrayList<Integer> nums) {
        Long ans =0l;
        for(int i=0; i<nums.size(); i++){
           ans+=nums.get(i);
        }
        System.out.println(ans);
    }
}
