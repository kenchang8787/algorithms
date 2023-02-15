class App {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // example 1, ans: 3
        System.out.println(sol.romanToInt("III"));

        // example 2, ans: 58
        System.out.println(sol.romanToInt("LVIII"));

        // example 3, ans: 1994
        System.out.println(sol.romanToInt("MCMXCIV"));
    }
}
