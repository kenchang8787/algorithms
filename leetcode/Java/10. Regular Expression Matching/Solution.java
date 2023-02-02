
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public boolean isMatch(String s, String p) {

        HashSet<Character> set = new HashSet<>();

        int sIndex = s.length() - 1;
        int pIndex = p.length() - 1;

        while (sIndex >= 0) {

            System.out.println();
            System.out.println("sIndex: " + sIndex);
            System.out.println("pIndex: " + pIndex);

            if (pIndex >= 0) {

                if (p.charAt(pIndex) == '.') {
                    sIndex--;
                    pIndex--;
                    System.out.println("遇到'.'");
                    continue;
                }

                if (p.charAt(pIndex) == '*') {
                    set.add(p.charAt(--pIndex));
                    pIndex--;
                    System.out.println("遇到'*': " + Arrays.toString(set.toArray()));
                    continue;
                }
            }

            if (set.contains('.') || set.contains(s.charAt(sIndex))) {
                sIndex--;
                System.out.println("在豁免字元中有找到當前字元");
                continue;
            }

            if (pIndex < 0 || s.charAt(sIndex) != p.charAt(pIndex))
                return false;

            sIndex--;
            pIndex--;
        }

        return true;
    }

}
