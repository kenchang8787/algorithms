public class Solution {
    public boolean isPalindrome(int x) {

        /**
         * 判斷傳入的整數是否左右對稱
         * 首先負數皆不對稱
         * 利用 x%10 將數字從右至左依序存入 result 中
         * 比較 result 是否和 x 相等
         */

        if (x < 0) {
            return false;
        }

        int temp = x;
        int result = 0;

        while (temp != 0) {
            result = (result * 10) + (temp % 10);
            temp = temp / 10;
        }
        return result == x;
    }
}