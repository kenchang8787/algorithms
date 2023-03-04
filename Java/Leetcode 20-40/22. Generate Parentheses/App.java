import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // 1, ["((()))","(()())","(())()","()(())","()()()"]
        System.out.println(Arrays.toString(sol.generateParenthesis(3).toArray()));
        // 2, ["()"]
        System.out.println(Arrays.toString(sol.generateParenthesis(1).toArray()));
    }
}