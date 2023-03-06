public class Solution
{
    /// <summary>
    /// 給定一字串，尋找最長的不重複字元的字段，返回長度
    /// 
    /// 字串長度限制, 0 <= s.length <= 5 * 10^4
    /// 字串輸入限制, 必定為英文單字、數字、符號或空白鍵
    /// </summary>
    /// <param name="s"></param>
    /// <returns></returns>
    public int LengthOfLongestSubstring(string s)
    {
        // # 思路
        // # 解法1
        // 不重複的值, 又可以想到用 HashSet, HashMap 的使用,
        // 將 i, j 想成兩個指針, 分別指著最長不重複字段的頭和尾
        // 利用一個巢狀迴圈，每次從i字元開始向右尋找不重複的字元
        // 當i==s.Length, 就能夠找出最長不重複的字段
        // 
        // # 解法2, 是解法1的優化
        // 相較於解法1, 我們重複利用 HashSet, 不在每一次i遞增時重新new一個
        // 而是若是遇到重複的字元時, 將重複字元移除, 此時 set.Count 即可表示最長不重複字段長度
        // 這樣就可以節省new HashSet的時間外, 也可以節省重新把j指針讀過的字元加入Set的時間
        // 故 abcabc 字串中
        // i=0, j=3 時會移除 Set 中的[a]字元, 同時i++
        // i=1, j=4 時會移除 Set 中的[b]字元, 同時i++ 

        // 解法1
        // var max = 0;
        // var length = s.Length;
        // HashSet<char> set;

        // for (int i = 0; i < length; i++)
        // {
        //     int longest = 0;
        //     set = new HashSet<char>();

        //     for (int j = i; j < length; j++)
        //     {
        //         if (set.Contains(s[j])) break;

        //         set.Add(s[j]);
        //         longest += 1;
        //         max = Math.Max(max, longest);
        //     }
        // }

        // 解法2
        var len = s.Length;
        var max = 0;
        var set = new HashSet<char>();

        int i = 0, j = 0;

        while (j < len)
        {
            if (!set.Contains(s[j]))
            {
                set.Add(s[j]);
                max = Math.Max(max, set.Count);
                j++;
            }
            else
            {
                set.Remove(s[i]);
                i++;
            }
        }

        return max;
    }
}