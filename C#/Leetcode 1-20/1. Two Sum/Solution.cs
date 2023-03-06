public class Solution
{
    /// <summary>
    /// 給一整數陣列和一目標值，回傳兩個陣列元素相加等於目標值的索引值
    /// 假設每個傳入的陣列只有一組答案，並且不可使用相同的索引值兩次
    /// </summary>
    /// <param name="nums"></param>
    /// <param name="target"></param>
    /// <returns></returns>
    /// <exception cref="Exception"></exception>
    public int[] TwoSum(int[] nums, int target)
    {
        // # 思路
        // 題目要求 nums[a] + nums[b] = target. return a,b. a!=b
        // 
        // 只有一組索引值解答的情況，就很適合用 HashSet, HashMap 做為儲存工具
        // 這邊選用 HashMap, 並 [key, value] = [nums[i], index],
        // 用於記錄我們走訪過的元素和其索引值,
        // 如此就可以在每次迴圈內計算 var diff = target - nums[i]
        // diff值 就去 HashMap 中查找, 是否曾經走訪過此元素

        var dict = new Dictionary<int, int>();

        for (var i = 0; i < nums.Length; i++)
        {
            // 當前元素
            var curr = nums[i];
            // 欲向dict詢問是否已經有此數值
            var complement = target - curr;

            if (dict.ContainsKey(complement))
            {
                return new int[] { i, dict[complement] };
            }

            dict[curr] = i;
        }

        throw new Exception("No two sum solution.");
    }
}
