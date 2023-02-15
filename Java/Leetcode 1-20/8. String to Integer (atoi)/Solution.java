
public class Solution {

    public int myAtoi(String s) {

        /**
         * 1. 將傳入字串的前綴空白字元去除
         * 2. 若是第一個字元為正負符號則先將 sign 賦值
         * 3. 走訪字元, 若字元不在 ASCII 中的 0->9 之間, 則回傳值
         * ps. 在走訪途中, 需時刻判斷 result 值是否超出 int 最大最小值
         */

        int sign = 1;
        long result = 0;

        s = s.trim();

        if (s == null || s.length() == 0)
            return 0;

        if (s.charAt(0) == '-') {
            sign = -1;

            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                result = result * 10 + (s.charAt(i) - '0');

                if (result * sign > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if (result * sign < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
            //
            else {
                break;
            }
        }

        return (int) result * sign;
    }
}
