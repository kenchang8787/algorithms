import java.util.*;

public class Solution {

    final HashMap<Character, String> map = new HashMap<>() {
        {
            put('2',"abc");put('3',"def");put('4',"ghi");put('5',"jkl");put('6',"mno");put('7',"pqrs");put('8',"tuv");put('9',"wxyz");}};

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {
            //
        }

        return result;

    }

    private void getCharByIndex(int index,)

    private List<String> backtrack(String digits, StringBuilder sb) {

        if (digits.length() == 0)
            return new ArrayList<>() {
                {
                    add(sb.toString());
                }
            };

        String s = map.get(digits.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));

            return backtrack(digits, sb);
        }
    }
}
