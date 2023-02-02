public class Solution {
    public String longestCommonPrefix(String[] strs) {

        /**
         * 以 { "flower", "flow", "flight" } 為例,
         * 以下邏輯會在 i=1 時,
         * 在 while 迴圈中, 不斷將 prefix 從右邊截斷長度1,
         * 即 "flower" -> "flowe" -> "flow"
         * 選出 strs[0] 和 strs[1] 從左至右的字元, 再繼續 i=2... 迴圈
         * 這樣的做法應該是最低限度的暴力破解法
         */

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}