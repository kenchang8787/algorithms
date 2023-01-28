import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Integer lengthOfLongestSubstring(String s) {

        /**
         * ans = 當前最長長度
         * map = 用來記錄每一個字元最後的位置
         * i = 代表現在讀取到哪一字元的位置
         * j = 字串中不重複字的起點位置
         * 
         * ps.其中+1是作為若傳入字串為 " " 時
         */

        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0, j = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }

            ans = Math.max(ans, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }

        return ans;
    }
}