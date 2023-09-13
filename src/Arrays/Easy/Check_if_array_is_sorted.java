package Arrays.Easy;
/*
    DESCRIPTION
    Given an array nums, return true if the array was originally sorted in non-decreasing order,
    then rotated some number of positions (including zero). Otherwise, return false.
    There may be duplicates in the original array.
    Note: An array A rotated by x positions results in an array B of the same length such that
    A[i] == B[(i+x) % A.length], where % is the modulo operation.
 */
public class Check_if_array_is_sorted {
    public static void main(String[] args) {
        Check_if_array_is_sorted c = new Check_if_array_is_sorted();
        System.out.println(c.check(new int[]{3,4,5,1,2}));
    }
    public boolean check(int[] a) {
        int pivot_index = -1;
        for(int i = 1; i<a.length;i++) {
            if(a[i] < a[i-1]){
                pivot_index = i;
                break;
            }
        }
        if(pivot_index != -1){
            for(int i = pivot_index + 1; i < a.length+pivot_index; i++) {
                int prev = getActualIndex(i-1,a.length);
                int next = getActualIndex(i,a.length);
                if(a[next] < a[prev]){
                    return false;
                }
            }
        }

        return true;
    }
    public int getActualIndex(int index, int length){
        if(index >= length){
            return index - length;
        }
        return index;
    }
}
