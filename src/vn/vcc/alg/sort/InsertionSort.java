package vn.vcc.alg.sort;

/**
 * Created by phuongdv on 5/13/17.
 */
// Java program for implementation of Insertion Sort
class InsertionSort {
    /*Function to sort array using insertion sort*/
//    Bước 1: Kiểm tra nếu phần tử đầu tiên đã được sắp xếp. trả về 1
//    Bước 2: Lấy phần tử kế tiếp
//    Bước 3: So sánh với tất cả phần tử trong danh sách con đã qua sắp xếp
//    Bước 4: Dịch chuyển tất cả phần tử trong danh sách con mà lớn hơn giá trị để được sắp xếp
//    Bước 5: Chèn giá trị đó
//    Bước 6: Lặp lại cho tới khi danh sách được sắp xếp

    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
}