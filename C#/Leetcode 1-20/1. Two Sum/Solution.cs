public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        // [key, value] = [nums[index], index]
        var dic = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++)
        {
            var complement = target - nums[i];

            if (dic.ContainsKey(complement))
            {
                return new int[] { dic[complement], i };
            }

            dic[nums[i]] = i;
        }

        throw new Exception("No two sum solution.");
    }
}
