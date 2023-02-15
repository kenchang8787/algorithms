import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        /*
         * 想法是用一個HashMap, 來儲存 [key,value] = [(target - numbers[i]), i]
         * 用 目標值-當前走訪的整數 作為key, 即為當前整數需配對成target的整數
         * 如此一來, 在接下來的走訪過程中, 只要HashMap中有存在當前值, 那即是正解
         */

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index;
                result[1] = i;
                return result;
            }

            map.put(target - numbers[i], i);
        }
        return result;
    }
}