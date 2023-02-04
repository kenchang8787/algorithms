internal class Program
{
    private static void Main(string[] args)
    {
        int[] array = { 1, 3, 5, 7, 9 };

        Console.WriteLine(BinarySearch(array, 9));
    }


    /// <summary>
    /// 使用二分搜尋法, 在一整數陣列中, 尋找目標值
    /// </summary>
    /// <param name="array"></param>
    /// <param name="target"></param>
    /// <returns></returns>
    private static int BinarySearch(int[] array, int target)
    {
        var min = 0;

        var max = array.Length - 1;

        while (min <= max)
        {

            var mid = (min + max) / 2;

            if (target == array[mid]) return min;

            if (target < array[mid]) max = mid - 1;

            if (target > array[mid]) min = min + 1;
        }

        return -1;
    }
}