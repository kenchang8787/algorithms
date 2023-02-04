
public class App {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // example 1
        int[] result1 = sol.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.format("result1: [%d, %d]\n", result1[0], result1[1]);

        // example 2
        int[] result2 = sol.twoSum(new int[] { 3, 2, 4 }, 6);
        System.out.format("result1: [%d, %d]\n", result2[0], result2[1]);

        // example 3
        int[] result3 = sol.twoSum(new int[] { 3, 3 }, 6);
        System.out.format("result1: [%d, %d]\n", result3[0], result3[1]);
    }
}
