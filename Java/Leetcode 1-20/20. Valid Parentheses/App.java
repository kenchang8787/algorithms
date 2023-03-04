
public class App {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // 1, true
        System.out.println(sol.isValid("()"));

        // 2, true
        System.out.println(sol.isValid("()[]{}"));

        // 3, false
        System.out.println(sol.isValid("(]"));
    }
}