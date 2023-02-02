
class App {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // exmaple 1
        System.out.println(sol.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));

        // exmaple 2
        System.out.println(sol.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));

        // example 3
        System.out.println(sol.longestCommonPrefix(new String[] { "ab", "a" }));

    }
}