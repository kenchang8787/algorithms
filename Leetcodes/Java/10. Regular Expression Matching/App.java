
class App {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // example 1
        System.out.println(sol.isMatch("aa", "a"));

        // example 2
        System.out.println(sol.isMatch("aa", "a*"));

        // example 3
        System.out.println(sol.isMatch("ab", ".*"));

        // example 4
        System.out.println(sol.isMatch("aab", "c*a*b"));

        // example 5
        System.out.println(sol.isMatch("mississippi", "mis*is*p*."));

        // exameple 6
        System.out.println(sol.isMatch("aaa", "aaaa"));
    }
}