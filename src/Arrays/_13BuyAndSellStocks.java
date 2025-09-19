package Arrays;
/**
 * You are given an array of prices where prices[i] is the price of a given stock on an ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class _13BuyAndSellStocks {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
        System.out.println(Optimal(arr, n));
    }

    private static int Optimal(int[] arr, int n) {
        int maxProfit = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            minPrice = Math.min(minPrice,arr[i]);
            maxProfit = Math.max(maxProfit,arr[i]-minPrice );
        }
        return maxProfit;

    }

    private static int BruteForce(int[] arr, int n) {
        int maxSoFar=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
               maxSoFar = Math.max(maxSoFar, (arr[j]-arr[i]));
            }
        }
        return maxSoFar;
    }
}
