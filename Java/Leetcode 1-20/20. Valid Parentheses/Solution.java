import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        // to store the order of brackets
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char character = s.charAt(i);

            // if is an open brackets, store it into the stake
            if (map.containsKey(character)) {
                stack.add(character);
            }
            // then is a close brackets,
            // we compare if is the corret close brackets from stack
            else if (!stack.isEmpty()) {
                if (!map.get(stack.pop()).equals(character))
                    return false;
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}