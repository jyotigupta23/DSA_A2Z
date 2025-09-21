package BinarySearch;

import static BinarySearch.Easy._01FindXinSortedArray.findX;
import static BinarySearch.Easy._02LowerBound.lowerBound;
import static BinarySearch.Easy._03UpperBound.upperBound;
import static BinarySearch.Easy._04SearchInsertPosition.insertPosition;

public class Main {
    public static void main(String args[]){
        int[] arr  = {3, 4, 6, 7, 9, 12, 16, 17} ;
        int arr1[] = {1,2,2,2,2,2,3}, x = 2;
        int target = 116;

        System.out.println(insertPosition(arr1, x));
    }



}
