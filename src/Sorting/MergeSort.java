package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        mergeSort(arr,0,arr.length-1);
        for(int a:arr){
            System.out.print(a + " ,");
        }
    }
    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= r) {
                temp[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                temp[k] = arr[i];
                i++;
                k++;
            }
        }
        k =0;
        while(l<=r){
            arr[l] = temp[k];
            k++;
            l++;
        }
    }
}
