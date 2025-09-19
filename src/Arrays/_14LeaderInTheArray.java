package Arrays;

import java.util.ArrayList;


public class _14LeaderInTheArray {
    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};
        int n = arr.length;
        BruteForce(arr, n);
        Optimal(arr,n);
    }

    private static void Optimal(int[] arr, int n) {
        //Traverse from right end and check the left ones for comparison with maxSoFar;
        int maxSoFar = arr[n-1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[n-1]);

        for(int i=n-2; i>=0;i--){
            if(arr[i]>maxSoFar){
                maxSoFar = arr[i];
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);

    }

    private static void BruteForce(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            boolean flag = true;
            for(int j=i+1; j<n;j++){
                if(arr[j]>arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    }
}
