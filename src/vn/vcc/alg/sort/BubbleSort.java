package vn.vcc.alg.sort;

import java.util.Arrays;

/**
 * Created by phuongdv on 5/13/17.
 *
 *
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
       bubbleSort();
    }


    /**
    Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

    Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

    Auxiliary Space: O(1)

    Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.

    Sorting In Place: Yes

    Stable: Yes
    */
    public static void bubbleSort(){
        int arr[] = {3,8,4,2,9,6,1};
        System.out.println(Arrays.toString(arr));
        for(int i=0; i < arr.length;i++){
            System.out.println(i);
            for(int j = 1 ; j < (arr.length -i); j++){
                if(arr[j-1]>arr[j]) {
                    //swap element
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
