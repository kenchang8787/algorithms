public class Solution
{
    /// <summary>
    /// 給定一輸入字串和一字串格式，判斷字串是否符合格式
    /// '.' 代表可以輸入任何字元
    /// '*' 代表爾後的字串, 其前綴字元會受到通融，直到不符合通融字元
    /// 
    /// 字串長度限制, 1 <= s.length <= 20
    /// 字串字元限制, s=小寫英文, p=小寫英文, '.', '*'
    /// 保證'*'出現時, 它一定有一個合法的前綴字元
    /// </summary>
    /// <param name="s"></param>
    /// <param name="p"></param>
    /// <returns></returns>
    public bool IsMatch(string s, string p)
    {
        int m = s.Length, n = p.Length;
        bool[] cur = new bool[n + 1];
        cur[0] = true;
        for (int j = 2; j <= n; j += 2)
        {
            cur[j] = cur[j - 2] && p[j - 1] == '*';
        }
        for (int i = 1; i <= m; i++)
        {
            bool pre = cur[0];
            cur[0] = false;
            for (int j = 1; j <= n; j++)
            {
                bool temp = cur[j];
                if (p[j - 1] == '*')
                {
                    cur[j] = cur[j - 2] || (cur[j] && (s[i - 1] == p[j - 2] || p[j - 2] == '.'));
                }
                else
                {
                    cur[j] = pre && (s[i - 1] == p[j - 1] || p[j - 1] == '.');
                }
                pre = temp;
            }
        }
        return cur[n];
    }

}