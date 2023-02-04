import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        /**
         * 這題比較重要的部分是要 "先排序傳入的陣列",
         * 因為這樣可以透過大小關係, 減少迴圈的次數
         * 以範例1為例
         * 排序後 = [-4, -1, -1, 0, 1, 2]
         * 假定 a + b + c = 0;
         * 在迴圈中固定 nums[i] = a 值後, a = -4, b + c = 4 (target)
         * 再從 固定值a 的右邊(j=i+1)與陣列末端(k)兩點求 target
         */

        Arrays.sort(nums);

        LinkedList<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // (因為有排序過) 若是相同的數, 則不再重複尋找
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = nums.length - 1;
            // nums[i] + b + c = 0, b + c = 0 - nums[i]
            int target = 0 - nums[i];

            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // (因為有排序過) 若是相同的數, 則不再重複尋找
                    while (j < k && nums[j] == nums[j + 1])
                        j++;
                    while (j < k && nums[k] == nums[k - 1])
                        k--;

                    j++;
                    k--;
                }
                // j++ 是希望 b+c 總和更大
                else if (nums[j] + nums[k] < target)
                    j++;
                // k-- 是希望 b+c 總和更小
                else
                    k--;
            }
        }

        return result;
    }
}
