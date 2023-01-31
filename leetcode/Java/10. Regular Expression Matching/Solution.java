import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isMatch(String s, String p) {

        if (s.equals(p))
            return true;

        Map<Character, Integer> maps = new HashMap<Character, Integer>();

        // 先把有 * 的字元和位置給記錄起來
        for (int i = 1; i < p.length(); i++) {

            if (p.charAt(i) != '*')
                continue;

            maps[Character.valueOf(p.charAt(i))] = i;

            char c = p.charAt(i);

            maps[c] = 1;
        }

        for (int sIndex = 0, pIndex = 0; sIndex < s.length(); sIndex++) {

            if (sIndex >= p.length())
                return false;

            if (p.charAt(pIndex) == '.') {
                pIndex++;
                continue;
            }

            if (p.charAt(i) == '*')
                return true;

            if (s.charAt(i) != p.charAt(i))
                return false;

            pIndex++;
        }

        return true;
    }
}
