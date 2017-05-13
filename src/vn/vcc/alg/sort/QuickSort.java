package vn.vcc.alg.sort;

import java.util.Arrays;

/**
 * Created by phuongdv on 5/13/17.
 *
 *   In practice, the Quicksort algorithm becomes very slow when the array passed to it is already
 close to being sorted. Because there is no efficient way for the computer to find the median
 element to use as the pivot, the first element of the array is used as the pivot. So when
 the array is almost sorted, Quicksort doesn't partition it equally. Instead, the partitions
 are lopsided like in Figure 2. This means that one of the recursion branches is much deeper
 than the other, and causes execution time to go up. Thus, it is said that the more random
 the arrangement of the array, the faster the Quicksort Algorithm finishes.
 */
// Java program for implementation of QuickSort
class QuickSort {
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot
       Bước 1: Chọn phần tử chốt là phần tử có chỉ mục cao nhất (phần tử ở cuối danh sách)
       Bước 2: Khai báo hai biến để trỏ tới bên trái và bên phải của danh sách, ngoại trừ phần tử chốt
       Bước 3: Biến bên trái trỏ tới mảng con bên trái
       Bước 4: Biến bên phải trỏ tới mảng con bên phải
       Bước 5: Khi giá trị tại biến bên trái là nhỏ hơn phần tử chốt thì di chuyển sang phải
       Bước 6: Khi giá trị tại biến bên phải là lớn hơn phần tử chốt thì di chuyển sang trái
       Bước 7: Nếu không trong trường hợp cả bước 5 và bước 6 thì tráo đổi giá trị biến trái và phải
       Bước 8: Nếu left ≥ right, thì đây chính là giá trị chốt mới

       */
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */

//    Bước 1: Lấy phần tử chốt là phần tử ở cuối danh sách
//    Bước 2: Chia mảng bởi sử dụng phần tử chốt
//    Bước 3: Sử dụng sắp xếp nhanh một cách đệ qui với mảng con bên trái
//    Bước 4: Sử dụng sắp xếp nhanh một cách đệ qui với mảng con bên phải

    void sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {0, 7, 8, 9, 1, 5, 6};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("sorted array");
        printArray(arr);
    }


    /**
     * QUICKSORT VERSION 2 MEDIAN
     * @param array
     */


//    public void quickSortMedian(int array[])
//// pre: array is full, all elements are non-null integers
//// post: the array is sorted in ascending order
//    {
//        quickSort(array, 0, array.length - 1);              // quicksort all the elements in the array
//    }
//
//
//    public void quickSort(int array[], int start, int end)
//    {
//        int i = start;                          // index of left-to-right scan
//        int k = end;                            // index of right-to-left scan
//
//        if (end - start >= 1)                   // check that there are at least two elements to sort
//        {
//            int pivot = array[start];       // set the pivot as the first element in the partition
//
//            while (k > i)                   // while the scan indices from left and right have not met,
//            {
//                while (array[i] <= pivot && i <= end && k > i)  // from the left, look for the first
//                    i++;                                    // element greater than the pivot
//                while (array[k] > pivot && k >= start && k >= i) // from the right, look for the first
//                    k--;                                        // element not greater than the pivot
//                if (k > i)                                       // if the left seekindex is still smaller than
//                    swap(array, i, k);                      // the right index, swap the corresponding elements
//            }
//            swap(array, start, k);          // after the indices have crossed, swap the last element in
//            // the left partition with the pivot
//            quickSort(array, start, k - 1); // quicksort the left partition
//            quickSort(array, k + 1, end);   // quicksort the right partition
//        }
//        else    // if there is only one element in the partition, do not do any sorting
//        {
//            return;                     // the array is sorted, so exit
//        }
//    }
//
//    public void swap(int array[], int index1, int index2)
//// pre: array is full and index1, index2 < array.length
//// post: the values at indices 1 and 2 have been swapped
//    {
//        int temp = array[index1];           // store the first value in a temp
//        array[index1] = array[index2];      // copy the value of the second into the first
//        array[index2] = temp;               // copy the value of the temp into the second
//    }

}
