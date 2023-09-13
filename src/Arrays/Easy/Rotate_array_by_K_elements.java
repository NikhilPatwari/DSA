package Arrays.Easy;

/*
 * DESCRIPTION
 * Given an integer array a, rotate the array to the right by k steps, where k is non-negative.
 * Input: a = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 */
public class Rotate_array_by_K_elements {
//   Optimal Solution  T = O(N) ExtraSpace = O(K)
    public void rotate_Optimal(int[] a, int k) {
        int n = a.length;
        k = k % n;
        if (k == 0) return;
        int[] temp = new int[k];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            temp[j] = a[i];
            j++;
        }
        j = n - 1;
        for (int i = n - k - 1; i >= 0; i--) {
            a[j] = a[i];
            j--;
        }
        System.arraycopy(temp, 0, a, 0, temp.length);
    }

    // Best Solution T = O(N) Extra Space = O(1)
    public void rotate_Best(int[] a, int k) {
        int len = a.length;
        k = k % len;
        if(k == 0) return;
        reverse(a,len - k, len-1);
        reverse(a,0,len-k-1);
        reverse(a,0,len -1);
    }
    public void reverse(int[] a, int start, int end) {
        int temp;
        while(start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end --;
        }
    }
}
