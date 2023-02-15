import java.util.*;

public class Solution {

    final HashMap<Character, String> map = new HashMap<>() {
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() != 0) {
            getChar(result, digits, "");
        }

        return result;
    }

    private void getChar(List<String> result, String digits, String str) {

        if (digits.length() == 0) {
            result.add(str);
        } else {
            String m = map.get(digits.charAt(0));

            for (int i = 0; i < m.length(); i++) {
                getChar(result, digits.substring(1), str + m.charAt(i));
            }
        }
    }
}
