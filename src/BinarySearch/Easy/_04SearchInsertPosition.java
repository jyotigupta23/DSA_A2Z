package BinarySearch.Easy;

public class _04SearchInsertPosition {

    public static int insertPosition(int[] arr1, int x) {
        int low =0, high = arr1.length-1, ans=arr1.length;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr1[mid]>=x){
                ans =mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
