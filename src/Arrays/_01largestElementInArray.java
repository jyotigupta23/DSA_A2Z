package Arrays;

import java.util.Arrays;

public class _01largestElementInArray {
    public static void main(String[] args) {
        int[] nums = {10,4,9,8,2,15};

        System.out.println(bruteforce(nums));

        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]);
    }

    private static int bruteforce(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max) max= nums[i];
        }
        return max;
    }


}
