package Arrays;
import java.util.*;
public class _09FindMissingNumber {
    public static void main(String[] args){
        int[] nums = {1,3,2,5,4,6,8,9};
        int n = nums.length;
        System.out.println(Xor(nums, n));
    }

    private static int Xor(int[] nums, int n) {
        int elementsXor = 0;
        int numsXor =0 ;

        for(int i=0; i<n-1; i++){
            elementsXor = elementsXor^nums[i];
            numsXor = numsXor^(i+1);

        }
        numsXor=numsXor^n;

        return elementsXor^numsXor;
    }

    private static int summation(int[] nums, int n) {
        int sumOfNNumbers = (n*(n+1))/2;
        int sumOfArrayElements = 0;
        for(int i=0; i<n-1; i++){
            sumOfArrayElements+=nums[i];
        }
        return  sumOfNNumbers-sumOfArrayElements;
    }

    private static int hashing(int[] nums, int n) {
        int[] freq = new int[n+1]; //max value = size of array i.e = 9
        for(int i=0; i<n-1; i++){
            freq[nums[i]]++;
        }
        System.out.println(Arrays.toString(freq));
        for(int i=1; i<freq.length; i++){
            if(freq[i]==0){
                return i;
            }
        }
        return -1;
    }

    private static int iterative(int[] nums, int n) {
        for(int i=1; i<=n; i++){
            int flag = 0;
            for (int num : nums) {
                if (num == i) {
                    //present...
                    flag = 1;
                    break;
                }
            }
            if(flag ==0) return i;
        }
        return -1;
    }

}
