package Arrays.Easy;
/*
* Given a binary array nums, return the maximum number of consecutive 1's in the array.
* Input: nums = [1,1,0,1,1,1]
* Output: 3
* Explanation: The first two digits or the last three digits are consecutive 1s.
* The maximum number of consecutive 1s is 3.
*/
public class Find_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] a) {
        int msf = 0;
        int max = 0;
        int prev = -1;
        for (int j : a) {
            if (prev == 1 && j == 1) {
                max++;
            } else if (j == 1) {
                max = 1;
            } else {
                if (msf < max) {
                    msf = max;
                }
                max = 0;
            }
            prev = j;
        }
        if (msf < max) msf = max;
        return msf;
    }
}
