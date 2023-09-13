package Arrays.Easy;

/*
* Given an integer array a, move all 0's to the end of it while maintaining
* the relative order of the non-zero elements.
* Note that you must do this in-place without making a copy of the array.
*/
public class Move_Zeros_to_end {
    // Solution using two pointers approach
    public void moveZeroes(int[] a) {
        int p1 = -1;
        int p2 = 0;
        int len = a.length;
        while(p2 < len) {
            if(a[p2] != 0) {
                p1++;
                if(p1!= p2) swap(a, p1, p2);
            }
            p2++;
        }
    }
    public void swap(int[] a, int p1, int p2) {
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }
}
