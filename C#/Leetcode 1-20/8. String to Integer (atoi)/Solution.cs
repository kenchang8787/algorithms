using System.Text;

public class Solution
{
    /// <summary>
    /// 給定一字串, 將之依照指定步驟轉為整數回傳
    /// 1. 要忽略字串前綴的所有空格
    /// 2. 如果有 '-', '+' 也要讀取, 若是沒有符號則判斷為 '+'
    /// 3. 持續讀取至字串結尾或出現非整數字元則將忽略後段所有文字
    /// 4. 若沒有讀到任何整數字元，則回傳 0
    /// 5. 若讀取出來的整數超出int32的範圍, 若小於則=-2^31, 大於=2^31-1
    /// 
    /// 字串長度限制, 0 <= s.length <= 200
    /// 字串字元限制, 英文字母, 數字(0-9),' ','+', '-', and '.'.
    /// </summary>
    /// <param name="s"></param>
    /// <returns></returns>
    public int MyAtoi(string s)
    {
        // # 思路
        // 基本上就依照指定的步驟去執行
        // 需要注意的是, 字串長度最大為200, 所以 

        // 1.
        s = s.TrimStart();
        if (s.Length == 0) return 0;

        // 2.
        int negative = 1;

        if (s[0] == '-') negative = -1;
        if (s[0] == '-' || s[0] == '+') s = s.Substring(1);

        // 3.
        var sb = new StringBuilder();

        foreach (char c in s.ToCharArray())
        {
            // '0'~'9' char range 48~57 
            var charValue = Convert.ToInt32(c);

            if (charValue < 48 || charValue > 57) break;

            sb.Append(c);
        }

        // 4.
        if (sb.Length == 0) return 0;

        // 5.
        int result = 0;

        if (!int.TryParse(sb.ToString(), out result))
            return negative == 1 ? int.MaxValue : int.MinValue;

        return result * negative;
    }
}