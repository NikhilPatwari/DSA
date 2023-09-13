package Arrays.Easy;
/*
* DESCRIPTION
* Given an integer array a, rotate the array to the right by k steps, where k is non-negative.
* Input: a = [1,2,3,4,5,6,7], k = 3
* Output: [5,6,7,1,2,3,4]
*/
public class Rotate_array_by_K_elements {
    public void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
        if(k == 0) return;
        int[] temp = new int[k];
        int j = 0;
        for(int i = n-k; i < n; i++){
            temp[j] = a[i];
            j++;
        }
        j = n-1;
        for(int i = n-k-1; i >= 0; i--){
            a[j] = a[i];
            j--;
        }

        for(int i = 0;i < temp.length; i++) {
            a[i] = temp[i];
        }
    }
}
