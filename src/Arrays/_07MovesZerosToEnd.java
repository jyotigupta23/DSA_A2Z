package Arrays;
import java.util.*;
public class _07MovesZerosToEnd {
    public static void main(String[] args){
        int[] nums = {1,0,2,0,4,7,0,3,0};
        moveZeroToEnd(nums);
    }

    private static void moveZeroToEnd(int[] nums) {
        int i=0, n = nums.length;
        for(int j=0; j<n; j++){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
        }
        while(i<n){
            nums[i++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
