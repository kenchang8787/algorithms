import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    int[] solution(int[] a) {

        // to store the count of each digit
        HashMap<Integer, Integer> digitCounts = new HashMap<>();

        for (int num : a) {
            // convert integer to string
            String numString = Integer.toString(num);

            // get each num's digit and put to the map
            for (int i = 0; i < numString.length(); i++) {
                int digit = numString.charAt(i) - '0';

                digitCounts.put(digit, digitCounts.getOrDefault(digit, 0) + 1);
            }
        }

        // find the maximun count
        int max = Collections.max(digitCounts.values());

        ArrayList<Integer> mostCommon = new ArrayList<>();

        for (int digit : digitCounts.keySet()) {
            if (digitCounts.get(digit) == max) {
                mostCommon.add(digit);
            }
        }

        // sort in ascending
        Collections.sort(mostCommon);

        return mostCommon.stream().mapToInt(i -> i).toArray();
    }
}