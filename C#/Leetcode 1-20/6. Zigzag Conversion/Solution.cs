using System.Text;

public class Solution
{
    /// <summary>
    /// 給定一字串，將字串依照傳入的 numRows 表示高度,
    /// 轉換成 N(Zigzag) 的排列, 再依照左至右, 上至下的方式回傳字串
    /// 例如
    /// "PAYPALISHIRING", numRows=3
    /// 轉換為高度3 的 N 排列如下
    /// P   A   H   N
    /// A P L S I I G
    /// Y   I   R
    /// 並回傳 PAHNAPLSIIGYIR 
    /// 
    /// "PAYPALISHIRING", numRows=4
    /// P     I    N
    /// A   L S  I G
    /// Y A   H R
    /// P     I
    /// 並回傳 PINALSIGYAHRPI
    /// 
    /// 字串長度限制, 1 <= s.length <= 1000
    /// 字元保證, 英文、','、'.'
    /// 高度保證, 1 <= numRows <= 1000
    /// </summary>
    /// <param name="s"></param>
    /// <param name="numRows"></param>
    /// <returns></returns>
    public string Convert(string s, int numRows)
    {
        // # 思路
        // 沒啥思路, 就是直接把所有排列的位置跟index關係列出來

        // "PAYPALISHIRING", numRows=3
        // 0   4   8     12 -------------間距4、4、4...
        // 1 3 5 7 9  11 13 -------------間距2、2、2...
        // 2   6   10       -------------間距4、4、4...
        // "PAYPALISHIRING", numRows=4
        // 0    6      12   -------------間距6、6
        // 1  5 7   11 13   -------------間距4、2、4、2...
        // 2 4  8 10        -------------間距2、4、2
        // 3    9           -------------間距6
        // "PAYPALISHIRING", numRows=5
        // 0     8          -------------間距8
        // 1   7 9          -------------間距6、2
        // 2  6  10         -------------間距4、4
        // 3 5   11 13      -------------間距2、6
        // 4     12         -------------間距8

        // "用心"觀察後發現此神奇公式: 高度+(高度-2), 套用以下
        // 1. 第一層和最後一層的"每兩個字母"間距固定是: 高度+(高度-2).
        // 2. 中間層的"每三個字母"間距 x+y 固定是: 高度+(高度-2).
        // 3. 上述 x=神奇公式-(第N層的N-1)*2, y=(第N層的N-1)*2

        if (numRows == 1) return s;

        var sb = new StringBuilder();
        var distance = numRows + (numRows - 2);

        // 依照"層"填入字串
        for (int i = 1; i <= numRows; i++)
        {
            // 每層字串起點
            var index = i - 1;

            // 若為第一層or最後一層, 間距為distance
            if (i == 1 || i == numRows)
                while (index < s.Length)
                {
                    sb.Append(s[index]);
                    index += distance;
                }
            // 若為中間層, 兩距總和為distance
            else
                while (index < s.Length)
                {
                    sb.Append(s[index]);

                    // 第一個字母
                    index += distance - (i - 1) * 2;

                    if (index < s.Length) sb.Append(s[index]);

                    // 第二個字母
                    index += (i - 1) * 2;
                }
        }

        return sb.ToString();
    }

}