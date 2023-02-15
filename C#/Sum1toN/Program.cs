internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine(Sum(100));
    }

    static int Sum(int last)
    {
        int first = 1;

        return (first + last) * last / 2;
    }
}