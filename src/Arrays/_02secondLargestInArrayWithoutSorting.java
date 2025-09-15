package Arrays;

public class _02secondLargestInArrayWithoutSorting {
    public static void main(String[] args) {
        int[] nums = {1,2,6,4,9,6,7};

        System.out.println(findSecondLargest(nums));
    }

    private static int findSecondLargest(int[] nums) {
        int max=0, secondMax = 0, n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>max){
                secondMax = max;
            max=nums[i];
            }else if(nums[i]>secondMax && nums[i]!=max){ //most important and tricky
                secondMax = nums[i];
            }
        }
        return secondMax;
    }

    


}
