package Sorting;

public class InsertionSort {
    static void insertion_sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
