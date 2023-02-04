import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; ++i) {
            int s = i + 1;
            int t = n - 1;
            while (s < t) {
                int sum = nums[i] + nums[s] + nums[t];
                if (sum == target)
                    return target;
                int diff = Math.abs(sum - target);
                if (diff < d) {
                    d = diff;
                    ans = sum;
                }
                if (sum > target)
                    --t;
                else
                    ++s;
            }
        }
        return ans;
    }

    public int threeSumClosest2(int[] nums, int target) {

        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                // 加總
                int curSum = nums[i] + nums[j] + nums[k];

                // 若是達到目標
                if (curSum == target)
                    return curSum;

                // 計算當前差異
                int curDif = Math.abs(curSum - target);

                if (curDif < diff) {
                    diff = curDif;
                    result = curSum;
                }

                // 若是需要總和更大
                if (curSum < target)
                    j++;
                // 若是需要總和更小
                else
                    k--;
            }
        }

        return result;
    }
}
