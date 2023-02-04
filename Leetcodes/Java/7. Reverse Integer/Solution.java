public class Solution {
    public int reverse(int x) {

        /**
         * 想法是將 x 持續對10取餘數, 直到於數為0
         * 就可以將數字 123456, 在迴圈內依序取得
         * 6, 5, 4, 3, 2, 1
         * 另每次回圈都將結果值*10 並加上餘數, 即可得
         * 0*10+6=6
         * 6*10+5=65
         * 65*10+4=654
         * .....
         * 65432*10+1=654321
         * 再將 x 值/10 取整數, 最後即可在x為0時停止回圈
         * 最後依照限制若超出int32則返回0
         */

        // 用來儲存反轉的結果
        // (因為反轉int32整數可能會超過int32的變數可儲存的範圍, 故宣告為long)
        long result = 0;

        int digit;

        while (x != 0) {
            digit = x % 10;

            result = result * 10 + digit;
            x = x / 10;

        }
        if (result > 2147483647 || result < -2147483648)
            return 0;

        return (int) result;
    }
}