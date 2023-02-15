public class Solution {

    boolean solution(String inputString) {

        int i = 0;
        int j = inputString.length() - 1;

        // checking the equivalent from the two end
        while (i < j) {

            if (inputString.charAt(i) != inputString.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}
