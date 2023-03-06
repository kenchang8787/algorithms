using System.Text;

public class Solution
{
    /// <summary>
    /// 給定一字串，尋找最長的對稱字段
    /// 
    /// 字串長度限制, 1 <= s.length <= 1000
    /// 字元限制, 保證只會有英文和數字
    /// </summary>
    /// <param name="s"></param>
    /// <returns></returns>
    public string LongestPalindrome(string s)
    {
        // # 思路
        // 想法是從第一個字元開始, 每次向左向右延伸一字元, 檢查是否對稱
        // 但又因為有奇數、偶數對稱的問題, 例如 aba, aaaa
        // 故每次都要檢查 i向左右延伸的對稱 和 i,i+1向左右延伸的對稱 

        var len = s.Length;
        var longest = "";

        for (var i = 0; i < len; i++)
        {
            // 檢查奇數對稱
            var x = i;
            var y = i;

            while (x >= 0 && y < len)
            {
                if (s[x] != s[y])
                    break;

                x--;
                y++;
            }

            x++;
            y--;

            var palindromic = s.Substring(x, y - x + 1);

            longest = longest.Length > palindromic.Length ? longest : palindromic;

            // 檢查偶數對稱
            x = i;
            y = i + 1;

            if (y > len - 1) continue;

            while (x >= 0 && y < len)
            {
                if (s[x] != s[y])
                    break;

                x--;
                y++;
            }

            x++;
            y--;

            palindromic = s.Substring(x, y - x + 1);

            longest = longest.Length > palindromic.Length ? longest : palindromic;
        }

        return longest;
    }
}