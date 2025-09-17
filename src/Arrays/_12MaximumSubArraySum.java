package Arrays;

import java.util.Arrays;

public class _12MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, 5, 4};
        int n = arr.length;
        System.out.println(OptimalKadanes(arr, n));
    }

    //Kadane's Algorithm - keep on summing, and as soon as the sum becomes negative drop it!!
    private static int OptimalKadanes(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        int sum=0;
        int start=-1, end=-1;

        for(int i=0; i<n; i++){
            if(sum==0) start = i;
            sum +=arr[i];
            if(sum>maxi){
                maxi = sum;
                end = i;
            }

            if(sum<0){
                sum=0;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,start, end+1)));
        return maxi;

    }

    //avoid the 3rd loop by seeing the intuition - sum of subarray[1,n]= sum of subarray[0,n-1]+nth element
    private static int better(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                maxi= Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    private static int bruteForce(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n;j++){
                int sum=0;
                for(int k=i; k<=j;k++){
                    sum+=arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return  maxi;
    }
}
