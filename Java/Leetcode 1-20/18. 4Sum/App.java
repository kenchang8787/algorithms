class App {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // example 1
        System.out.println(sol.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0));
        // example 2
        System.out.println(sol.fourSum(new int[] { 2, 2, 2, 2, 2 }, 8));
        // example 3
        System.out.println(sol.fourSum(new int[] { 1000000000, 1000000000,
                1000000000, 1000000000 }, -294967296));
        // example 4
        System.out.println(
                sol.fourSum(new int[] { -1000000000, -1000000000, 1000000000, -1000000000, -1000000000 }, 294967296));
    }
}
