internal class Program
{
    /// <summary>
    /// 有一個人下樓梯
    /// 一次可以走一階或兩階
    /// 假設總共有N階樓梯, 共有幾總走法？
    /// 
    /// N=1, 1
    /// N=2, 1+1、2
    /// N=3, 1+1+1、1+2、2+1
    /// N=4, 1+1+1+1、1+1+2、1+2+1、2+1+1, 2+2
    /// N=5, 1+1+1+1+1、1+1+1+2、1+1+2+1、1+2+1+1、2+1+1+1、1+2+2、2+1+2、2+2+1
    /// </summary>
    /// <param name="args"></param>
    private static void Main(string[] args)
    {
        Console.WriteLine(DownStairs(4));
    }

    public static long DownStairs(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else if (n == 2)
        {
            return 2;
        }
        else
        {
            return DownStairs(n - 2) + DownStairs(n - 1);
        }
    }
}