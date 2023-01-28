
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         * 最簡潔的暴力破解
         */

        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j - i] + nums[j] == target) {
                    return new int[] { j - i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}