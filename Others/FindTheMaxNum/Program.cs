internal class Program
{
    /// <summary>
    /// 尋找未排序的整數陣列中, 最大的數字
    /// </summary>
    /// <param name="args"></param>
    private static void Main(string[] args)
    {
        int[] array = new int[] { 1, 5, 7, 11, 2, 4, 9, 20, 23, 8, 13, 30, 6 };

        Console.WriteLine(FindMax(array));
    }

    static int FindMax(int[] array)
    {
        int max = 0;

        for (int i = 0; i < array.Length; i++)
        {
            if (array[i] > max) max = array[i];
        }

        return max;
    }
}