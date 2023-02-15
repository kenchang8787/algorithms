import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 給定一個正整數陣列, 將陣列中出現最多的數字依照ASC順序回傳
 * 
 * 例如 a = [25, 2, 3, 57, 38, 41], ans = [2, 3, 5] 
 
 * 以下為每個數字出現的次數
 * 0 -> 0
 * 1 -> 1
 * 2 -> 2
 * 3 -> 2
 * 4 -> 1
 * 5 -> 2
 * 6 -> 0
 * 7 -> 1
 * 8 -> 1
 * 最多出現數字的次數為2次, 故答案為 [2, 3, 5] (按照ASC排列)
 * 
 * 條件:
 * 1 ≤ a.length ≤ 103,
 * 1 ≤ a[i] < 100.
 * 
 */
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