public class Solution
{
    /// <summary>
    /// 給定一有符號整數Int32, 回傳此整數的位數顛倒
    /// 若此位數顛倒造成它超過Int32的範圍時, 回傳0, 並假設此環境不允許儲存Int64
    /// 
    /// 整數限制, -2^31 <= x <= 2^31-1
    /// </summary>
    /// <param name="x"></param>
    /// <returns></returns>
    public int Reverse(int x)
    {
        // # 思路
        //
        // # 解法1
        // 依照題目的意思, 反轉過後必定會超出32位的整數值
        // 故我們用long型別的變數儲存反轉結果
        // 反轉的具體作法是用取餘數的方式進行
        // 
        // # 解法2
        // 將傳入整數取決對值後，轉為字元陣列
        // 直接用陣列提供的反轉方法
        // 最後再用 Int32.TryParse 以及把正負符號加上

        // long l = 0;

        // while (x != 0)
        // {
        //     // 依序取得位數數字
        //     var digit = x % 10;

        //     l = l * 10 + digit;
        //     x = x / 10;
        // }

        // Int32.TryParse(l.ToString(), out var result);

        // return result;

        if (x == 0) return 0;
        var temp = x;
        if (temp < 0) temp = -temp;

        var numberArray = temp.ToString().ToCharArray();
        Array.Reverse(numberArray);
        var result = 0;
        if (int.TryParse(new string(numberArray), out result))
        {
            return result * (x / temp);
        }
        return result;
    }
}