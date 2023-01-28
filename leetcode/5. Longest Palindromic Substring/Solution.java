public class Solution {

    public String longestPalindrome(String s) {

        /**
         * 尋找最長的左右對稱的字串
         * 想法是從第一個字元開始迴圈,
         * 每次向左右延伸1字元, 直到左右不對稱後,
         * 又因為對稱字串長度可能為奇數或偶數, 例如 abbba, bbbb,
         * 故每個i值都需檢查 i 向左右延伸的對稱, 以及 i,i+1 向左右延伸的對稱
         * 計算總長度, 最長者為其解
         */

        if (s == null || s.length() < 1)
            return "";

        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            // 檢查奇數對稱
            int len = checkBetweenUtilDiff(s, i, i);
            // 若對稱字串比當前的還長
            if (len > endIndex - startIndex) {
                startIndex = i - (len - 1) / 2;
                endIndex = i + len / 2;
            }
            // 檢查偶數對稱
            len = checkBetweenUtilDiff(s, i, i + 1);
            // 若對稱字串比當前的還長
            if (len > endIndex - startIndex) {
                startIndex = i - (len - 1) / 2;
                endIndex = i + len / 2;
            }
        }

        return s.substring(startIndex, endIndex + 1);
    }

    private int checkBetweenUtilDiff(String s, int start, int end) {
        while (start >= 0 && end < s.length()) {
            if (s.charAt(start) != s.charAt(end))
                break;
            else {
                start--;
                end++;
            }
        }

        return end - start - 1;
    }
}
