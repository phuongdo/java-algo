package vn.vcc.alg;

import java.util.Arrays;

/**
 * Created by Minh Thu on 5/13/2017.
 */
public class Sort {

    public static void main(String[] args) {
        quickSort();

    }

    /**
     * QuickSort O(n^2)
     */
    public static void quickSort(){
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
