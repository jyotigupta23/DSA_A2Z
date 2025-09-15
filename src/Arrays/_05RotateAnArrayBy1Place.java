package Arrays;

import java.util.Arrays;

public class _05RotateAnArrayBy1Place {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        int n = nums.length;
//        rotateArrayRight(nums, n);
        rotateArrayLeft(nums,n);
    }

    private static void rotateArrayLeft(int[] nums, int n) {
        int end = nums[0];
        for(int i=0;i<n-1; i++){
           nums[i] = nums[i+1];
        }
        nums[n-1]=end;
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArrayRight(int[] nums, int n) {
        int temp = nums[n-1];
        for(int i = n-1; i>0; i--){
            nums[i]= nums[i-1];
        }
        nums[0]=temp;
        System.out.println(Arrays.toString(nums));
    }
}
