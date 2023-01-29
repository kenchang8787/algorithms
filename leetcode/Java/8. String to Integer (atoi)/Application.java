class Application {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // example 1
        System.out.println(sol.myAtoi("42"));

        // example 2
        System.out.println(sol.myAtoi(" -42"));

        // example 3
        System.out.println(sol.myAtoi("4193 with words"));

        // example 4
        System.out.println(sol.myAtoi("-91283472332"));

        // example 5
        System.out.println(sol.myAtoi("-+12"));

        // example 6
        System.out.println(sol.myAtoi("00000-42a1234"));

        // example 7
        System.out.println(sol.myAtoi("20000000000000000000"));
    }
}