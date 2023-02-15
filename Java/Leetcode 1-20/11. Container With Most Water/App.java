
class App {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // example 1, ans:49
        System.out.println(sol.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));

        // example 2, ans:1
        System.out.println(sol.maxArea(new int[] { 1, 1 }));
    }
}