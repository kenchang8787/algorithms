public class Solution {
    public boolean isMatch(String s, String p) {

        if (s.equals(p))
            return true;

        // 先把所有的 * 的符號改成 .
        for (int i = 1; i < p.length(); i++) {

            if (p.charAt(i) != '*')
                continue;

            s = s.
        }

        for (int i = 0; i < s.length(); i++) {

            if (i >= p.length())
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
