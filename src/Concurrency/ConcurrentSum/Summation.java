package Concurrency.ConcurrentSum;

import java.util.ArrayList;

public class Summation implements Runnable {
    int l = 0, r=0;
    ArrayList<Integer> nums;
    public Summation(ArrayList<Integer> nums, int i, int i1) {
        this.l = i;
        this.r = i1;
        this.nums = nums;
    }

    @Override
    public void run() {
        long s =0;
        for(int i=l; i<=r; i++){
            s+=nums.get(i);
        }
        Main.sum.addAndGet(s);
        Main.count.incrementAndGet();
    }
}
