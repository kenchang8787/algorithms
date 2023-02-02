class Application {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // example 1, ans: "III"
        System.out.println(sol.intToRoman(3));

        // example 2, ans: "LVIII"
        System.out.println(sol.intToRoman(58));

        // example 3, ans: "MCMXCIV"
        System.out.println(sol.intToRoman(1994));
    }
}