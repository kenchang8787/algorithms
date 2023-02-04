internal class Program
{
    private static void Main(string[] args)
    {
        int[] array = { 3, 1, 7, 2, 4, 9 };

        array = BubbleSort(array);

        foreach (var a in array) Console.Write(a + " ");
    }

    public static int[] BubbleSort(int[] array)
    {
        var length = array.Length;

        while (length > 1)
        {

            length--;

            int temp;

            // 如果前面的元素比後面的元素要大，則交換元素位置
            for (var i = 0; i < length; i++)
            {
                if (array[i] > array[i + 1])
                {
                    temp = array[i];

                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        }

        return array;
    }
}