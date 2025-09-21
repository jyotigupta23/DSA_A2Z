package BinarySearch.Easy;

/*
* arr1[mid]>x --------> upper bound
* arr1[mid]>=x --------> lower bound
* */

public class _03UpperBound {
    public static int upperBound(int[] arr1, int x) {
        int low = 0, high = arr1.length-1, ceil=-1;
        while(low<=high){
            int mid = (low+high)/2;
             if(arr1[mid]>x){ //no need to consider the equal condition...
                ceil = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ceil;
    }
}
