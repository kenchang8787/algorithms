public class Solution
{
    /// <summary>
    /// 給定一整數, 判斷它是否左右對稱
    /// 
    /// 整數範圍限制, -2^31 <= x <= 2^31-1
    /// </summary>
    /// <param name="x"></param>
    /// <returns></returns>
    public bool IsPalindrome(int x)
    {
        // # 思路
        // 首先整數的範圍限制都在Int32中，很OK。
        // 再來依照TestCase2的邏輯，只要是負的整數都是不對稱。
        // 剩下大於等於0的整數，我們將其轉為字串
        // 從頭和尾開始比較看是否相同即可

        if (x < 0) return false;

        var s = x.ToString();

        int start = 0;
        int end = s.Length - 1;

        while (start < end)
        {
            if (s[start] != s[end]) return false;

            start++;
            end--;
        }

        return true;
    }
}