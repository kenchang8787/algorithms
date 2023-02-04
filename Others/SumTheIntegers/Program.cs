internal class Program
{

    private static void Main(string[] args)
    {
        Console.WriteLine(Sum(5));
    }

    /// <summary>
    /// 1x2+2x3+3x4+...(n-1)xn
    /// </summary>
    /// <param name="n"></param>
    /// <returns></returns>
    static int Sum(int n)
    {
        int sum = 0;

        for (int i = 2; i < n; i++)
        {
            sum += (i - 1) * i;
        }

        return sum;
    }

}