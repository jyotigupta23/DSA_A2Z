package Arrays;

public class _03CheckIfTheArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = {7,8,9,4,5,6,7};

        System.out.println(check(nums));
    }

    private static boolean check(int[] nums) {
        int count=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>nums[(i+1)%n]) {
                count ++;
            }
        }
        return count<=1;
    }
}
