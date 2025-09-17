package Arrays;

public class _10MaxConsicutiveOnes {
    public static void main(String[] args){
        int[] nums = {1,1,1,0,1,0,1,1,1,1,1};
        int n = nums.length;
        System.out.println(MaxOnes(nums, n));
    }

    private static int MaxOnes(int[] nums, int n) {
        int maxCount=0, count=0;
        for(int i=0; i<n; i++){
            if(nums[i]==1)count++;
            else {
                count=0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
