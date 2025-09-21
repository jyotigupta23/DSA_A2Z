import java.util.*;

import static java.util.Collections.reverseOrder;

public class testCollections {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(Collections.binarySearch(arr,2));
        System.out.println(Collections.min(arr));
        System.out.println(Collections.max(arr));
//        System.out.print(Collections.rotate(arr,2));
        Collections.reverse(arr);
        System.out.println(arr);
        Collections.reverseOrder();
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);


    }
}
