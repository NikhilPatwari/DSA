package Arrays.Easy;
/*
* Given a non-empty array of integers nums, every element appears twice except for one.
* Find that single one.
* You must implement a solution with a linear runtime complexity
* and use only constant extra space.
* Input: nums = [2,2,1]
* Output: 1
*/
public class Single_Number {
    public int singleNumber(int[] nums) {
        int xor = nums[0];
        for(int i = 1; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
