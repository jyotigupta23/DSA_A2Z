package Arrays;

import java.util.HashMap;
import java.util.Map;

import static Arrays._01largestElementInArray.bruteforce;

public class _11ElementOccuranceGreateThanHalfN {
    public static void main(String[] args){
        int[] nums = {1,2,2,2,4,2,3,6,2,2,5};
        int n = nums.length;
        System.out.println(MoresVotingAlgo(nums, n));
    }

    private static int MoresVotingAlgo(int[] nums, int n) {
        int count=0;
        int element=0;

        for(int i=0; i<n; i++){
            if(count==0){
                element=nums[i];
                count=1;
            }else if(nums[i]==element)
            {count++;
            }else{
                count--;
            }

        }
        int result=0;
        for(int i=0; i<n; i++){
            if(nums[i]==element) result++;
        }
        if(result>(n/2))return element;
        return -1;
    }

    private static int Better(int[] nums, int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<n; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        System.out.println(freq);

        //iterate on value of map
        for(Map.Entry<Integer, Integer> it: freq.entrySet()){
            if(it.getValue()>(n/2))
            return it.getKey();
        }
        return -1;
    }

    private static int bruteforce(int[] nums, int n) {
        int occurance=n/2;

        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(nums[j]==nums[i])count++;
            }
            if(count>=occurance) return nums[i];
        }
        return -1;
    }


}
