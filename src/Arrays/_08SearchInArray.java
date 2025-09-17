package Arrays;

public class _08SearchInArray {
    public static void main(String[] args){
        int[] nums = {1,0,2,0,4,7,0,3,0};
        System.out.println(searchK(nums,7));
    }

    private static int searchK(int[] nums, int K) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==K){
                return i;
            }
        }
        return -1;
    }
}
