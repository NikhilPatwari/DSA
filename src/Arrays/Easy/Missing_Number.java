package Arrays.Easy;

/*
* Given an array nums containing n distinct numbers in the range [0, n],
* return the only number in the range that is missing from the array.
* Input: nums = [3,0,1]
* Output: 2
* Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
* 2 is the missing number in the range since it does not appear in nums.
*/
public class Missing_Number {
    // Using Bit manipulation
    // Can also be done using sum
    // Can also be done using multiplication
    // Can also be done using sorting
    public int missingNumber(int[] a) {
        int xor_arr = a[0];
        int xor_n = 0;
        for (int i = 1; i < a.length; i++) {
            xor_n = xor_n ^ i;
            xor_arr = xor_arr ^ a[i];
        }
        xor_n = xor_n ^ a.length;
        return xor_n ^ xor_arr;
    }
}
