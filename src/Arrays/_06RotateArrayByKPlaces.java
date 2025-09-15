package Arrays;


import java.util.Arrays;

public class _06RotateArrayByKPlaces {
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6};
        rotateByLeft(nums, 3);
        rotateByRight(nums, 4);
    }

    private static void rotateByRight(int[] nums, int k) {
        int n = nums.length;
        reverse(nums,0,n-k-1);
        reverse(nums, n-k,n-1);
        reverse(nums,0, n-1);

        System.out.println(Arrays.toString(nums));
    }

    private static void rotateByLeft(int[] nums, int k) {
        int n = nums.length;
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);

        System.out.println(Arrays.toString(nums));

    }

    private static void reverse(int[] nums, int i, int i1) {
        while(i<i1) {
            int temp = nums[i];
            nums[i++] = nums[i1];
            nums[i1--] = temp;

        }
    }
}
