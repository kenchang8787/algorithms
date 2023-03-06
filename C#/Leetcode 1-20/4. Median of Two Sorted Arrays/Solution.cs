public class Solution
{
    /// <summary>
    /// 給定兩個由小->大排序的整數陣列, 求兩陣列合併後的中間值, 期望時間複雜度為 O(log(len1+len2))
    /// 例如, [1, 2] , [3, 4] 合併後 [1, 2, 3, 4], 則中間值為 (2+3)/2=2.5
    /// 例如, [1, 2], [3] 合併後 [1, 2, 3], 則中間值為 2
    /// 
    /// 陣列長度限制 0 <= len <= 1000, 1 <= len1 + len2 <= 2000
    /// 陣列整數限制 -10^6 <= nums[i] <= 10^6
    /// </summary>
    /// <param name="nums1"></param>
    /// <param name="nums2"></param>
    /// <returns></returns>
    public double FindMedianSortedArrays(int[] nums1, int[] nums2)
    {
        // # 思路
        // 依照題目給的限制, 我們知道兩個陣列合併後最小長度至少是1
        // 除了整數有負數之外, (nums[i] + nums[j])/2 也不會超過 int 限制
        // 另外要注意合併後的陣列，對於奇數、偶數的處理方式並不同

        // # 解法
        // 直接合併兩個數組, 並求其中間值
        // 用Java解過之後, 覺得C#真心很強大...

        // Java 的作法也是合併->找中間值
        // 但 Java 的合併要利用 "傳入已排序的陣列" 特點, 來快速的排序陣列

        var combination = nums1.Concat(nums2).ToArray();

        Array.Sort(combination);

        int middle = combination.Length / 2;

        // 合併後為奇數時
        if (combination.Length % 2 == 1) return combination[middle];

        // 合併後為偶數時
        return (combination[middle - 1] + combination[middle]) / 2d;
    }
}