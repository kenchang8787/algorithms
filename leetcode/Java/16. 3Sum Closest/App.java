class App {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // example 1
        System.out.println(sol.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
        // example 2
        System.out.println(sol.threeSumClosest(new int[] { 0, 0, 0 }, 1));
        // example 3
        System.out.println(sol.threeSumClosest(new int[] { 1, 1, 1, 0 }, 100));
        // example 4
        System.out.println(sol.threeSumClosest(new int[] { -1000, -5, -5, -5, -5, -5, -5, -1, -1, -1 }, -14));
    }
}