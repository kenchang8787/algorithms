import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {

        /**
         * 
         */

        final HashMap<Character, List<Character>> map = new HashMap<>() {
            {
                put('2', Arrays.asList('a', 'b', 'c'));
                put('3', Arrays.asList('d', 'e', 'f'));
                put('4', Arrays.asList('g', 'h', 'i'));
                put('5', Arrays.asList('j', 'k', 'l'));
                put('6', Arrays.asList('m', 'n', 'o'));
                put('7', Arrays.asList('p', 'q', 'r', 's'));
                put('8', Arrays.asList('t', 'u', 'v'));
                put('9', Arrays.asList('w', 'x', 'y', 'z'));
            }
        };

        List<String> result = new LinkedList<>();

        for (int i = 0; i < digits.length(); i++) {

        }

        return result;
    }
}
