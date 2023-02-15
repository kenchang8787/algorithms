public class Solution {
    public int romanToInt(String s) {
        /**
         * 原本的想法因為做了第12題,
         * 所以也很單純的把每個字串依序加到結果上, 也算是蠻暴力的解
         * 
         * 但是其實這邊要注意到羅馬數字有一個特色,
         * 4(IV), 40(XL), 400(CD) 和 9(IX), 90(XC), 900(CM)
         * 上述數值其實是當 'I' 比 'V' 還小時, 須拿 'V' - 'I' 得值,
         * 故可以得到以下解法
         * 
         * I = 1
         * V = 5
         * X = 10
         * L = 50
         * C = 100
         * D = 500
         * M = 1000
         * 
         */

        /** 回傳值 */
        int result = 0;
        /** 紀錄前一個讀取的值 */
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int num = pairToRoman(s.charAt(i));

            // 若當前讀取的值 比 先前讀取的值還小
            if (num < prev)
                result -= num;
            else
                result += num;

            prev = num;

        }

        return result;
    }

    public int pairToRoman(char current) {
        switch (current) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            // 不會走到這步
            default:
                return 0;
        }
    }
}
