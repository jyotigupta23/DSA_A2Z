package BinarySearch.Easy;

public class _02LowerBound {
    public static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length-1, floor=-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                right = mid-1;
            }else {
                floor = mid;
                left = mid+1;
            }
        }
        return floor;
    }

}
