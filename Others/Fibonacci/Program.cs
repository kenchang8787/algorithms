internal class Program
{
    /// <summary>
    /// 費波那契數列:
    /// 
    /// 柵欄中有一對小兔子, 小兔子要成為大兔子需要兩個月
    /// 一對大兔子每個月可以生一對小兔子, 試問 N 月後會有幾對兔子
    /// 
    /// </summary>
    /// <param name="args"></param>
    private static void Main(string[] args)
    {
        Console.WriteLine(Fibonacci(13));
    }

    static int Fibonacci(int num)
    {
        if (num == 0) return 0;

        if (num == 1) return 1;

        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }
}