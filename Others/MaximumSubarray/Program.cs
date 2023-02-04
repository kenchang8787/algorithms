internal class Program
{
    static void Main(string[] args)
    {
        int[] array = { 1, 7, -70, 30, 30 };

        Console.WriteLine(GetMax(array));
    }

    public static int GetMax(int[] array)
    {
        int sum = 0;

        int max = array[0];

        for (int i = 0; i < array.Length; ++i)
        {
            sum += array[i]; //計算陣列中連續數的總和(0~4 ~ 4~4)

            sum = Math.Max(0, sum); //排除掉負數的加總

            max = Math.Max(sum, max); //判斷當前與上一個加總哪個較大
        }
        return max;
    }
}