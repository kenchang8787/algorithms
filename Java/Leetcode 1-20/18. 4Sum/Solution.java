import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        long ltarget = (long) target;

        Arrays.sort(nums);

        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int a = 0; a < nums.length - 3; a++) {

            for (int b = a + 1; b < nums.length - 2; b++) {
                int c = b + 1;
                int d = nums.length - 1;

                long sub = ltarget - nums[a] - nums[b];

                while (c < d) {
                    // 若相加等於目標值
                    if (nums[c] + nums[d] == sub) {
                        result.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));

                        // 若 nums[c] 的右邊仍是相同的數字
                        while (c < d && nums[c] == nums[c + 1]) {
                            c++;
                        }
                        // 若 nums[d] 的左邊仍是相同的數字
                        while (c < d && nums[d] == nums[d - 1]) {
                            d--;
                        }

                        c++;
                        d--;
                    }
                    // 若是相加比目標值小
                    else if (nums[c] + nums[d] < sub) {
                        c++;
                    }
                    // 若是相加比目標值大
                    else {
                        d--;
                    }
                }

                // 若是 nums[b] 的右邊仍是相同的數字
                while (b < nums.length - 2 && nums[b] == nums[b + 1]) {
                    b++;
                }
                // 若是 nums[a] 的右邊仍是相同的數字
                while (a < nums.length - 3 && nums[a] == nums[a + 1]) {
                    a++;
                }
            }

        }

        return result;
    }
}