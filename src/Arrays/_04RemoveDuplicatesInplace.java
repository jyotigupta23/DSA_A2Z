package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class _04RemoveDuplicatesInplace {
    public static void main(String[] args){
        int[] nums = {1,2,3,3,3,4,5,5,6,7};
//        removeDuplicatesSet(nums);
        removeDuplicates(nums);

    }

    private static void removeDuplicates(int[] nums) {
        int i =0;
        for(int j=1; j<nums.length;j++){
            if(nums[i]!=nums[j])
                i++;
             nums[i]=nums[j];
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,i+1)));
    }
/*📦 Space Complexity Analysis:

No extra data structures are used (like HashSet or ArrayList).
Only a few integer variables (i, j) are used.
The Arrays.copyOfRange() used in System.out.println() creates a temporary array of size i + 1 just for printing,
but this doesn't affect the algorithm's core space complexity.


🧠 Final Answer:
Space Complexity: O(1) — constant space.
* */
    private static void removeDuplicatesSet(int[] nums) {
        HashSet<Integer> distinctNums = new HashSet<>();
        for (int i : nums){
            distinctNums.add(i);
        }
        int j=0;
        for(int n : distinctNums){
            nums[j++] = n;
        }

        for(int i=j;i<nums.length; i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums) );
    }

}
